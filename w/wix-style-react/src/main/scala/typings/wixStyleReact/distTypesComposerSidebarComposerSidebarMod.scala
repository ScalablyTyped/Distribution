package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DisabledIcon
import typings.wixStyleReact.anon.ItemsSectionTitle
import typings.wixStyleReact.anon.Section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComposerSidebarComposerSidebarMod {
  
  /** ComposerSidebar */
  @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", JSImport.Default)
  @js.native
  open class default protected () extends ComposerSidebar {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.defaultProps.items_1")
      @js.native
      val items1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.defaultProps.labelPlacement_1")
      @js.native
      val labelPlacement1: String = js.native
      
      object labelTooltipProps1 {
        
        @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.defaultProps.labelTooltipProps_1.placement")
        @js.native
        val placement: String = js.native
      }
      
      inline def onClick1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClick_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.defaultProps.selectedId_1")
      @js.native
      val selectedId1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.items")
      @js.native
      val items: Requireable[js.Array[js.UndefOr[InferProps[DisabledIcon] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.labelPlacement")
      @js.native
      val labelPlacement: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.labelTooltipProps")
      @js.native
      val labelTooltipProps: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.selectedId")
      @js.native
      val selectedId: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerSidebar/ComposerSidebar", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
    }
  }
  
  /** ComposerSidebar */
  @js.native
  trait ComposerSidebar extends PureComponent[Any, Any, Any] {
    
    def _renderItem(item: Any): Element = js.native
    
    def _renderSection(param0: Section): Element = js.native
    
    def _renderSections(sections: Any): Element = js.native
    
    def _separateToSections(items: Any): js.Array[ItemsSectionTitle] = js.native
  }
}
