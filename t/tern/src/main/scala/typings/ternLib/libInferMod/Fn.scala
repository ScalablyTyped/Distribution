package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn extends Obj {
  val argNames: js.UndefOr[js.Array[java.lang.String]] = js.native
  val args: js.UndefOr[js.Array[AVal]] = js.native
  val retval: AVal = js.native
  var self: js.UndefOr[Type] = js.native
  def isArrowFn(): scala.Boolean = js.native
}

@JSImport("tern/lib/infer", "Fn")
@js.native
class FnCls protected () extends Fn {
  def this(name: java.lang.String, self: AVal, args: js.Array[AVal], argNames: js.Array[java.lang.String], retval: AVal) = this()
  def this(name: js.UndefOr[scala.Nothing], self: AVal, args: js.Array[AVal], argNames: js.Array[java.lang.String], retval: AVal) = this()
}

