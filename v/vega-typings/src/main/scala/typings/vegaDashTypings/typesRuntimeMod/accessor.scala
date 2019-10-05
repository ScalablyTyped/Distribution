package typings.vegaDashTypings.typesRuntimeMod

import typings.vegaDashUtil.vegaDashUtilMod.AccessorFn
import typings.vegaDashUtil.vegaDashUtilMod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "accessor")
@js.native
object accessor extends js.Object {
  def apply[R](fn: Fn[R]): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
}

