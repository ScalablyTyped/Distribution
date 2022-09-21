package typings.tsModel

import typings.tsModel.mod.NameFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GenerateImplementation extends StObject {
    
    var generateImplementation: Boolean
    
    var generateInterface: Boolean
    
    var generateSchemas: Boolean
    
    def schemaNameFilter(schemaName: String): Boolean
    @JSName("schemaNameFilter")
    var schemaNameFilter_Original: NameFilter
  }
  object GenerateImplementation {
    
    inline def apply(
      generateImplementation: Boolean,
      generateInterface: Boolean,
      generateSchemas: Boolean,
      schemaNameFilter: /* schemaName */ String => Boolean
    ): GenerateImplementation = {
      val __obj = js.Dynamic.literal(generateImplementation = generateImplementation.asInstanceOf[js.Any], generateInterface = generateInterface.asInstanceOf[js.Any], generateSchemas = generateSchemas.asInstanceOf[js.Any], schemaNameFilter = js.Any.fromFunction1(schemaNameFilter))
      __obj.asInstanceOf[GenerateImplementation]
    }
    
    extension [Self <: GenerateImplementation](x: Self) {
      
      inline def setGenerateImplementation(value: Boolean): Self = StObject.set(x, "generateImplementation", value.asInstanceOf[js.Any])
      
      inline def setGenerateInterface(value: Boolean): Self = StObject.set(x, "generateInterface", value.asInstanceOf[js.Any])
      
      inline def setGenerateSchemas(value: Boolean): Self = StObject.set(x, "generateSchemas", value.asInstanceOf[js.Any])
      
      inline def setSchemaNameFilter(value: /* schemaName */ String => Boolean): Self = StObject.set(x, "schemaNameFilter", js.Any.fromFunction1(value))
    }
  }
}
