package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableListItemTableListItemDotuniDotdriverMod {
  
  trait TableListItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getColumnTextAt(columnIndex: Double): js.Promise[String]
    
    def isCheckboxChecked(): js.Promise[Boolean]
    
    def isCheckboxExists(): js.Promise[Boolean]
    
    def toggleCheckbox(): js.Promise[Unit]
  }
  object TableListItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getColumnTextAt: Double => js.Promise[String],
      isCheckboxChecked: () => js.Promise[Boolean],
      isCheckboxExists: () => js.Promise[Boolean],
      toggleCheckbox: () => js.Promise[Unit]
    ): TableListItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getColumnTextAt = js.Any.fromFunction1(getColumnTextAt), isCheckboxChecked = js.Any.fromFunction0(isCheckboxChecked), isCheckboxExists = js.Any.fromFunction0(isCheckboxExists), toggleCheckbox = js.Any.fromFunction0(toggleCheckbox))
      __obj.asInstanceOf[TableListItemUniDriver]
    }
    
    extension [Self <: TableListItemUniDriver](x: Self) {
      
      inline def setGetColumnTextAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getColumnTextAt", js.Any.fromFunction1(value))
      
      inline def setIsCheckboxChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCheckboxChecked", js.Any.fromFunction0(value))
      
      inline def setIsCheckboxExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCheckboxExists", js.Any.fromFunction0(value))
      
      inline def setToggleCheckbox(value: () => js.Promise[Unit]): Self = StObject.set(x, "toggleCheckbox", js.Any.fromFunction0(value))
    }
  }
}
