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
    
    inline def apply(): ColumnEmbeddedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnEmbeddedOptions]
    }
    
    extension [Self <: ColumnEmbeddedOptions](x: Self) {
      
      inline def setPrefix(value: String | Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
