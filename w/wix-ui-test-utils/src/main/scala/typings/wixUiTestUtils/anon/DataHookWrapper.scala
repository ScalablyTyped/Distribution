package typings.wixUiTestUtils.anon

import typings.protractor.mod.ElementFinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookWrapper extends StObject {
  
  var dataHook: String
  
  var wrapper: js.UndefOr[ElementFinder] = js.undefined
}
object DataHookWrapper {
  
  inline def apply(dataHook: String): DataHookWrapper = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookWrapper]
  }
  
  extension [Self <: DataHookWrapper](x: Self) {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: ElementFinder): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
