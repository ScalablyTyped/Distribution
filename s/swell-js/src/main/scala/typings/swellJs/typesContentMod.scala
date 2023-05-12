package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesContentCamelMod.ContentCamel because var conflicts: content, date_created, date_updated, id, meta_description, name, published, redirect, sections, slug. Inlined  */ trait Content
    extends StObject
       with ContentSnake
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesContentCamelMod.ContentSectionCamel because var conflicts: id, `type`. Inlined  */ trait ContentSection
    extends StObject
       with ContentSectionSnake
  object ContentSection {
    
    inline def apply(id: String, `type`: String): ContentSection = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSection]
    }
  }
}
