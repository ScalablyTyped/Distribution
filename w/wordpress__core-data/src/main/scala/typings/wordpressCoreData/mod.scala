package typings.wordpressCoreData

import typings.wordpressCoreData.anon.TypeofimportedActions
import typings.wordpressCoreData.anon.TypeofimportedSelectors
import typings.wordpressCoreData.wordpressCoreDataStrings.core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch_core(key: core): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    inline def select_core(key: core): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'edit' extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<'edit'>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.PostRevision> : 'edit' extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<'edit'>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.PostRevision> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<'edit'> */ trait Autosave extends StObject {
    
    var preview_link: String
  }
  object Autosave {
    
    inline def apply(preview_link: String): Autosave = {
      val __obj = js.Dynamic.literal(preview_link = preview_link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autosave]
    }
    
    extension [Self <: Autosave](x: Self) {
      
      inline def setPreview_link(value: String): Self = StObject.set(x, "preview_link", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entity extends StObject {
    
    var baseURL: String
    
    var key: js.UndefOr[String] = js.undefined
    
    var kind: String
    
    var name: String
    
    var plural: js.UndefOr[String] = js.undefined
  }
  object Entity {
    
    inline def apply(baseURL: String, kind: String, name: String): Entity = {
      val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    extension [Self <: Entity](x: Self) {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    }
  }
}
