package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/tern", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Server: ternLib.libTernMod.TernConstructor = js.native
  val version: java.lang.String = js.native
  def defineQueryType[T /* <: js.Any */](name: T, desc: ternLib.libTernMod.Desc[T]): scala.Unit = js.native
  def registerPlugin(
    name: java.lang.String,
    init: js.Function2[
      /* server */ ternLib.libTernMod.Server, 
      /* options */ js.UndefOr[ternLib.libTernMod.ConstructorOptions], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

