package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.HoveredBoolean
import typings.wixStyleReact.anon.OnChangeType
import typings.wixStyleReact.anon.Subtitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectableAccordionItemItemMod {
  
  @JSImport("wix-style-react/dist/types/SelectableAccordion/Item/Item", JSImport.Default)
  @js.native
  open class default protected () extends SelectableAccordionItem {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/SelectableAccordion/Item/Item", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/SelectableAccordion/Item/Item", "default.defaultProps")
    @js.native
    def defaultProps: OnChangeType = js.native
    inline def defaultProps_=(x: OnChangeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SelectableAccordion/Item/Item", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SelectableAccordion/Item/Item", "default.propTypes")
    @js.native
    def propTypes: Subtitle = js.native
    inline def propTypes_=(x: Subtitle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SelectableAccordionItem extends PureComponent[Any, Any, Any] {
    
    def _onChange(event: Any): Unit = js.native
    
    def _onMouseEnter(): Unit = js.native
    
    def _onMouseLeave(): Unit = js.native
    
    def _renderContent(): Any = js.native
    
    def _renderSelector(): Element = js.native
    
    def _renderSubtitle(): Any = js.native
    
    def _renderTitle(): Any = js.native
    
    @JSName("state")
    var state_SelectableAccordionItem: HoveredBoolean = js.native
  }
}
