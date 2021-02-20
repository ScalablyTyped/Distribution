package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultValueOptionsMod {
  
  @js.native
  trait DefaultValueOptions[T] extends StObject {
    
    /**
      * The default value of the control.
      */
    var value: js.UndefOr[T] = js.native
  }
  object DefaultValueOptions {
    
    @scala.inline
    def apply[T](): DefaultValueOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValueOptions[T]]
    }
    
    @scala.inline
    implicit class DefaultValueOptionsMutableBuilder[Self <: DefaultValueOptions[_], T] (val x: Self with DefaultValueOptions[T]) extends AnyVal {
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
