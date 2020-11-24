package typings.uirouterCore.coreservicesMod

import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.commonCommonMod.Obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectorLike extends js.Object {
  
  def annotate(fn: IInjectable): js.Array[_] = js.native
  def annotate(fn: IInjectable, strictDi: Boolean): js.Array[_] = js.native
  
  def get(token: js.Any): js.Any = js.native
  @JSName("get")
  def get_T_T[T](token: js.Any): T = js.native
  
  def has(token: js.Any): Boolean = js.native
  
  def invoke(fn: IInjectable): js.Any = js.native
  def invoke(fn: IInjectable, context: js.UndefOr[scala.Nothing], locals: Obj): js.Any = js.native
  def invoke(fn: IInjectable, context: js.Any): js.Any = js.native
  def invoke(fn: IInjectable, context: js.Any, locals: Obj): js.Any = js.native
  
  var strictDi: js.UndefOr[Boolean] = js.native
}
