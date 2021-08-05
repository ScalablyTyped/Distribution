package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnHstoreOptionsMod {
  
  trait ColumnHstoreOptions extends StObject {
    
    /**
      * Return type of HSTORE column.
      * Returns value as string or as object.
      */
    var hstoreType: js.UndefOr[String] = js.undefined
  }
  object ColumnHstoreOptions {
    
    inline def apply(): ColumnHstoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnHstoreOptions]
    }
    
    extension [Self <: ColumnHstoreOptions](x: Self) {
      
      inline def setHstoreType(value: String): Self = StObject.set(x, "hstoreType", value.asInstanceOf[js.Any])
      
      inline def setHstoreTypeUndefined: Self = StObject.set(x, "hstoreType", js.undefined)
    }
  }
}
