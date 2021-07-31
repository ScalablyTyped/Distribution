package typings.wixUiCore.anon

import typings.protractor.elementMod.ElementFinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wrapper extends StObject {
  
  var dataHook: String
  
  var wrapper: js.UndefOr[ElementFinder] = js.undefined
}
object Wrapper {
  
  @scala.inline
  def apply(dataHook: String): Wrapper = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  
  @scala.inline
  implicit class WrapperMutableBuilder[Self <: Wrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: ElementFinder): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
