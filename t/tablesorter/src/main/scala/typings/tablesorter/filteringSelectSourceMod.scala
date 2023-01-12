package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringSelectSourceMod {
  
  trait SelectSource extends StObject {
    
    /**
      * Classes to add to the dropdown-entries.
      */
    var `data-class`: js.UndefOr[String] = js.undefined
    
    /**
      * The display-name of the filter source.
      */
    var text: String
    
    /**
      * The filter-value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectSource {
    
    inline def apply(text: String): SelectSource = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectSource] (val x: Self) extends AnyVal {
      
      inline def `setData-class`(value: String): Self = StObject.set(x, "data-class", value.asInstanceOf[js.Any])
      
      inline def `setData-classUndefined`: Self = StObject.set(x, "data-class", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
