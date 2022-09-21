package typings.urlTemplate

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseTemplate(template: String): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[Template]
  
  type PrimitiveValue = String | Double | Boolean | Null
  
  trait Template extends StObject {
    
    def expand(
      context: Record[
          String, 
          PrimitiveValue | js.Array[PrimitiveValue] | (Record[String, PrimitiveValue])
        ]
    ): String
  }
  object Template {
    
    inline def apply(
      expand: Record[
          String, 
          PrimitiveValue | js.Array[PrimitiveValue] | (Record[String, PrimitiveValue])
        ] => String
    ): Template = {
      val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
      __obj.asInstanceOf[Template]
    }
    
    extension [Self <: Template](x: Self) {
      
      inline def setExpand(
        value: Record[
              String, 
              PrimitiveValue | js.Array[PrimitiveValue] | (Record[String, PrimitiveValue])
            ] => String
      ): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    }
  }
}
