package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.InitiallyOpen
import typings.wixStyleReact.anon.ItemsAny
import typings.wixStyleReact.anon.OpenIndices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectableAccordionSelectableAccordionMod {
  
  /** SelectableAccordion */
  @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", JSImport.Default)
  @js.native
  open class default protected () extends SelectableAccordion {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.defaultProps.items")
      @js.native
      def items: js.Array[scala.Nothing] = js.native
      inline def items_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.defaultProps.type")
      @js.native
      val `type`: String = js.native
      
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.defaultProps.verticalPadding")
      @js.native
      def verticalPadding: String = js.native
      inline def verticalPadding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verticalPadding")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getDerivedStateFromProps(param0: ItemsAny, state: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(param0.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** A css class to be applied to the component's root element */
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** An array of Accordion items:
        * - `title`: A title of the item
        * - `subtitle`: An optional second row of the header
        * - `content`: A content of the item
        * - `initiallyOpen`: Whether the item is initially open
        * - `open`: Whether the item is open
        * - `disabled`: Whether the item is disabled
        * */
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.propTypes.items")
      @js.native
      def items: Requireable[js.Array[js.UndefOr[InferProps[InitiallyOpen] | Null]]] = js.native
      inline def items_=(x: Requireable[js.Array[js.UndefOr[InferProps[InitiallyOpen] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      /** A callback which is invoked every time the selection is changed */
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.propTypes.onSelectionChanged")
      @js.native
      def onSelectionChanged: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onSelectionChanged_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(x.asInstanceOf[js.Any])
      
      /** A type can be ether radio, checkbox, or toggle, which will effect the way an accordion item is selected */
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      /** Extra space on top and bottom of selectable accordion item */
      @JSImport("wix-style-react/dist/types/SelectableAccordion/SelectableAccordion", "default.propTypes.verticalPadding")
      @js.native
      def verticalPadding: Requireable[String] = js.native
      inline def verticalPadding_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verticalPadding")(x.asInstanceOf[js.Any])
    }
  }
  
  /** SelectableAccordion */
  @js.native
  trait SelectableAccordion extends PureComponent[Any, Any, Any] {
    
    def _onItemChanged(idx: Any, open: Any): Unit = js.native
    
    def _populateInitiallyOpenIndices(): Any = js.native
    
    @JSName("state")
    var state_SelectableAccordion: OpenIndices = js.native
  }
}
