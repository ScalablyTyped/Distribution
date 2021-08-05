package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnEnumOptionsMod {
  
  trait ColumnEnumOptions extends StObject {
    
    /**
      * Array of possible enumerated values.
      */
    var `enum`: js.UndefOr[js.Array[js.Any] | js.Object] = js.undefined
    
    /**
      * Exact name of enum
      */
    var enumName: js.UndefOr[String] = js.undefined
  }
  object ColumnEnumOptions {
    
    inline def apply(): ColumnEnumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnEnumOptions]
    }
    
    extension [Self <: ColumnEnumOptions](x: Self) {
      
      inline def setEnum(value: js.Array[js.Any] | js.Object): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumName(value: String): Self = StObject.set(x, "enumName", value.asInstanceOf[js.Any])
      
      inline def setEnumNameUndefined: Self = StObject.set(x, "enumName", js.undefined)
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
    }
  }
}
