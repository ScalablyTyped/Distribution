package typings.vegaUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-util", "accessor")
@js.native
object accessor extends js.Object {
  
  def apply[R](fn: Fn[R]): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.UndefOr[scala.Nothing], name: String): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  def apply[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
}
