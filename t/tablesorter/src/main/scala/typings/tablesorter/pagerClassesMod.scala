package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerClassesMod {
  
  @js.native
  trait PagerClasses extends StObject {
    
    /**
      * A set of css-classes to apply to the container.
      */
    var container: js.UndefOr[String] = js.native
    
    /**
      * The css-class to apply to disabled pager-controls.
      */
    var disabled: js.UndefOr[String] = js.native
    
    /**
      * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
      */
    var errorRow: js.UndefOr[String] = js.native
  }
  object PagerClasses {
    
    @scala.inline
    def apply(): PagerClasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerClasses]
    }
    
    @scala.inline
    implicit class PagerClassesMutableBuilder[Self <: PagerClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setErrorRow(value: String): Self = StObject.set(x, "errorRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRowUndefined: Self = StObject.set(x, "errorRow", js.undefined)
    }
  }
}
