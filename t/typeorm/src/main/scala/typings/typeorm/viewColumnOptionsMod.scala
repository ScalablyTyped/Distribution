package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewColumnOptionsMod {
  
  trait ViewColumnOptions extends StObject {
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object ViewColumnOptions {
    
    inline def apply(): ViewColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewColumnOptions]
    }
    
    extension [Self <: ViewColumnOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
