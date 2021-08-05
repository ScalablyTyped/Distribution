package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.tslint.anon.Content
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typings.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/tagExclusion", "TagExclusion")
  @js.native
  class TagExclusion () extends Exclusion[ITagExclusionDescriptor] {
    def this(descriptor: Partial[ITagExclusionDescriptor]) = this()
    
    /* private */ val contentTags: js.Any = js.native
    
    /* private */ val existenceTags: js.Any = js.native
    
    /* private */ var getDocumentationNode: js.Any = js.native
    
    /* private */ var parseTagsWithContents: js.Any = js.native
  }
  
  type IContentTags = StringDictionary[String]
  
  trait ITagExclusionDescriptor
    extends StObject
       with ExclusionDescriptor {
    
    var tags: js.UndefOr[Content] = js.undefined
  }
  object ITagExclusionDescriptor {
    
    inline def apply(): ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITagExclusionDescriptor]
    }
    
    extension [Self <: ITagExclusionDescriptor](x: Self) {
      
      inline def setTags(value: Content): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
