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

