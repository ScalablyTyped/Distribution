package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingPagerClassesMod {
  
  trait PagerClasses extends StObject {
    
    /**
      * A set of css-classes to apply to the container.
      */
    var container: js.UndefOr[String] = js.undefined
    
    /**
      * The css-class to apply to disabled pager-controls.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
      */
    var errorRow: js.UndefOr[String] = js.undefined
  }
  object PagerClasses {
    
    inline def apply(): PagerClasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerClasses]
    }
    
    extension [Self <: PagerClasses](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setErrorRow(value: String): Self = StObject.set(x, "errorRow", value.asInstanceOf[js.Any])
      
      inline def setErrorRowUndefined: Self = StObject.set(x, "errorRow", js.undefined)
    }
  }
}
