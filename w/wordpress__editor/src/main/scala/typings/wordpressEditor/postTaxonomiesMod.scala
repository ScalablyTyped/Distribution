package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressApiFetch.mod.Schema.Taxonomy
import typings.wordpressEditor.postTaxonomiesMod.PostTaxonomies.Props
import typings.wordpressEditor.wordpressEditorStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postTaxonomiesMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-taxonomies", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostTaxonomies {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var taxonomyWrapper: js.UndefOr[js.Function2[/* content */ ReactNode, /* taxonomy */ Taxonomy[edit], Element]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTaxonomyWrapper(value: (/* content */ ReactNode, /* taxonomy */ Taxonomy[edit]) => Element): Self = StObject.set(x, "taxonomyWrapper", js.Any.fromFunction2(value))
        
        @scala.inline
        def setTaxonomyWrapperUndefined: Self = StObject.set(x, "taxonomyWrapper", js.undefined)
      }
    }
  }
}
