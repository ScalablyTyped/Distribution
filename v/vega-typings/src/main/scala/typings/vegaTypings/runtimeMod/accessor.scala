package typings.vegaTypings.runtimeMod

import typings.vegaUtil.mod.AccessorFn
import typings.vegaUtil.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/runtime", "accessor")
@js.native
object accessor extends js.Object {
  
  def apply[R](fn: Fn[R]): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.UndefOr[scala.Nothing], name: String): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
}
