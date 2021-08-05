package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinColumnOptionsMod {
  
  trait JoinColumnOptions extends StObject {
    
    /**
      * Name of the column.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the column in the entity to which this column is referenced.
      */
    var referencedColumnName: js.UndefOr[String] = js.undefined
  }
  object JoinColumnOptions {
    
    inline def apply(): JoinColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinColumnOptions]
    }
    
    extension [Self <: JoinColumnOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReferencedColumnName(value: String): Self = StObject.set(x, "referencedColumnName", value.asInstanceOf[js.Any])
      
      inline def setReferencedColumnNameUndefined: Self = StObject.set(x, "referencedColumnName", js.undefined)
    }
  }
}
