package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSourceMod {
  
  @js.native
  trait SelectSource extends StObject {
    
    /**
      * Classes to add to the dropdown-entries.
      */
    var `data-class`: js.UndefOr[String] = js.native
    
    /**
      * The display-name of the filter source.
      */
    var text: String = js.native
    
    /**
      * The filter-value.
      */
    var value: js.UndefOr[String] = js.native
  }
  object SelectSource {
    
    @scala.inline
    def apply(text: String): SelectSource = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectSource]
    }
    
    @scala.inline
    implicit class SelectSourceMutableBuilder[Self <: SelectSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setData-class`(value: String): Self = StObject.set(x, "data-class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-classUndefined`: Self = StObject.set(x, "data-class", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
