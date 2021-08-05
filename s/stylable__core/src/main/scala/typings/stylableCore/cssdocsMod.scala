package typings.stylableCore

import typings.std.Record
import typings.stylableCore.stylableMetaMod.StylableMeta
import typings.stylableCore.stylableMetaMod.StylableSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssdocsMod {
  
  @JSImport("@stylable/core/cjs/cssdocs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCssDocsForSymbol(meta: StylableMeta, symbol: StylableSymbol): CssDoc | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCssDocsForSymbol")(meta.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[CssDoc | Null]
  
  trait CssDoc extends StObject {
    
    var description: String
    
    var tags: Record[String, String]
  }
  object CssDoc {
    
    inline def apply(description: String, tags: Record[String, String]): CssDoc = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssDoc]
    }
    
    extension [Self <: CssDoc](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Record[String, String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
