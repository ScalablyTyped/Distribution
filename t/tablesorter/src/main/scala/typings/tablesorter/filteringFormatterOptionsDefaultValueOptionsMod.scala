package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsDefaultValueOptionsMod {
  
  trait DefaultValueOptions[T] extends StObject {
    
    /**
      * The default value of the control.
      */
    var value: js.UndefOr[T] = js.undefined
  }
  object DefaultValueOptions {
    
    inline def apply[T](): DefaultValueOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValueOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultValueOptions[?], T] (val x: Self & DefaultValueOptions[T]) extends AnyVal {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
