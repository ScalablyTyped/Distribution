package typings.uirouterCore.anon

import typings.uirouterCore.paramsInterfaceMod.RawParams
import typings.uirouterCore.stateInterfaceMod._RedirectToResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params
  extends StObject
     with _RedirectToResult {
  
  var params: js.UndefOr[RawParams] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: RawParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
