package typings.tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imported extends StObject {
    
    var imported: Boolean
  }
  object Imported {
    
    inline def apply(imported: Boolean): Imported = {
      val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imported]
    }
    
    extension [Self <: Imported](x: Self) {
      
      inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mimetype extends StObject {
    
    var mimetype: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Mimetype {
    
    inline def apply(): Mimetype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mimetype]
    }
    
    extension [Self <: Mimetype](x: Self) {
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
