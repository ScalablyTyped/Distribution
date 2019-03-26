package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/tern", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Server: TernConstructor = js.native
  val version: java.lang.String = js.native
  def defineQueryType[T /* <: scala.Nothing */](name: T, desc: Desc[T]): scala.Unit = js.native
  def registerPlugin(
    name: java.lang.String,
    init: js.Function2[/* server */ Server, /* options */ js.UndefOr[ConstructorOptions], scala.Unit]
  ): scala.Unit = js.native
}

