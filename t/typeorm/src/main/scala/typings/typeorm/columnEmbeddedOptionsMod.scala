package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnEmbeddedOptionsMod {
  
  trait ColumnEmbeddedOptions extends StObject {
    
    /**
      * Embedded column prefix.
      * If set to empty string or false, then prefix is not set at all.
      */
    var prefix: js.UndefOr[String | Boolean] = js.undefined
  }
  object ColumnEmbeddedOptions {
    
    @scala.inline
    def apply(): ColumnEmbeddedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnEmbeddedOptions]
    }
    
    @scala.inline
    implicit class ColumnEmbeddedOptionsMutableBuilder[Self <: ColumnEmbeddedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String | Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
