package typings.wixStyleReact

import typings.wixStyleReact.distTypesCheckboxCheckboxDotuniDotdriverMod.CheckboxUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableListHeaderTableListHeaderDotuniDotdriverMod {
  
  trait TableListHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getCheckbox(): CheckboxUniDriver
    
    def getColumnTextAt(columnIndex: Double): js.Promise[String]
    
    def toggleColumnSortAt(index: Double): js.Promise[Unit]
  }
  object TableListHeaderUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getCheckbox: () => CheckboxUniDriver,
      getColumnTextAt: Double => js.Promise[String],
      toggleColumnSortAt: Double => js.Promise[Unit]
    ): TableListHeaderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCheckbox = js.Any.fromFunction0(getCheckbox), getColumnTextAt = js.Any.fromFunction1(getColumnTextAt), toggleColumnSortAt = js.Any.fromFunction1(toggleColumnSortAt))
      __obj.asInstanceOf[TableListHeaderUniDriver]
    }
    
    extension [Self <: TableListHeaderUniDriver](x: Self) {
      
      inline def setGetCheckbox(value: () => CheckboxUniDriver): Self = StObject.set(x, "getCheckbox", js.Any.fromFunction0(value))
      
      inline def setGetColumnTextAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getColumnTextAt", js.Any.fromFunction1(value))
      
      inline def setToggleColumnSortAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "toggleColumnSortAt", js.Any.fromFunction1(value))
    }
  }
}
