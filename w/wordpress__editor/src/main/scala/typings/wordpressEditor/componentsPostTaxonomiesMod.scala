package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressCoreData.schemaMod.Schema.Taxonomy
import typings.wordpressEditor.componentsPostTaxonomiesMod.PostTaxonomies.Props
import typings.wordpressEditor.wordpressEditorStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPostTaxonomiesMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-taxonomies", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostTaxonomies {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var taxonomyWrapper: js.UndefOr[js.Function2[/* content */ ReactNode, /* taxonomy */ Taxonomy[edit], Element]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setTaxonomyWrapper(value: (/* content */ ReactNode, /* taxonomy */ Taxonomy[edit]) => Element): Self = StObject.set(x, "taxonomyWrapper", js.Any.fromFunction2(value))
        
        inline def setTaxonomyWrapperUndefined: Self = StObject.set(x, "taxonomyWrapper", js.undefined)
      }
    }
  }
}
