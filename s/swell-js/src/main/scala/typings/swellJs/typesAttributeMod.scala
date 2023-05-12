package typings.swellJs

import typings.swellJs.typesAttributeCamelMod.AttributeCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributeMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.mod.BaseModel because var conflicts: date_created, date_updated, id. Inlined 
  - typings.swellJs.typesAttributeSnakeMod.AttributeSnake because var conflicts: date_created, date_updated, default, filterable, id, localized, multi, name, products, required, searchable, `type`, values, variant, visible. Inlined  */ trait Attribute
    extends StObject
       with AttributeCamel
  object Attribute {
    
    inline def apply(): Attribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attribute]
    }
  }
}
