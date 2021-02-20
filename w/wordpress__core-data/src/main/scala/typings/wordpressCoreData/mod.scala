package typings.wordpressCoreData

import typings.wordpressCoreData.anon.TypeofimportedActions
import typings.wordpressCoreData.anon.TypeofimportedSelectors
import typings.wordpressCoreData.wordpressCoreDataStrings.core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", "dispatch")
    @js.native
    def dispatch_core(key: core): TypeofimportedActions = js.native
    
    @JSImport("@wordpress/data", "select")
    @js.native
    def select_core(key: core): TypeofimportedSelectors = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'edit' extends 'embed' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.PostRevision> : 'edit' extends 'view' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.PostRevision> : @wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePostRevision<'edit'> */ @js.native
  trait Autosave extends StObject {
    
    var preview_link: String = js.native
  }
  object Autosave {
    
    @scala.inline
    def apply(preview_link: String): Autosave = {
      val __obj = js.Dynamic.literal(preview_link = preview_link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autosave]
    }
    
    @scala.inline
    implicit class AutosaveMutableBuilder[Self <: Autosave] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreview_link(value: String): Self = StObject.set(x, "preview_link", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entity extends StObject {
    
    var baseURL: String = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    var plural: js.UndefOr[String] = js.native
  }
  object Entity {
    
    @scala.inline
    def apply(baseURL: String, kind: String, name: String): Entity = {
      val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    @scala.inline
    implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    }
  }
}
