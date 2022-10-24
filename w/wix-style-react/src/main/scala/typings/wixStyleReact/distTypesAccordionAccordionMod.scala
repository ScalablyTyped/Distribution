package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.ButtonType
import typings.wixStyleReact.anon.OpenIndexes
import typings.wixStyleReact.anon.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAccordionAccordionMod {
  
  @JSImport("wix-style-react/dist/types/Accordion/Accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/Accordion/Accordion", JSImport.Default)
  @js.native
  open class default protected () extends Accordion {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Accordion/Accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps.hideShadow")
      @js.native
      def hideShadow: Boolean = js.native
      inline def hideShadow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideShadow")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps.horizontalPadding")
      @js.native
      def horizontalPadding: String = js.native
      inline def horizontalPadding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontalPadding")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps.items")
      @js.native
      def items: js.Array[scala.Nothing] = js.native
      inline def items_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps.multiple")
      @js.native
      def multiple: Boolean = js.native
      inline def multiple_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.defaultProps.transitionSpeed")
      @js.native
      def transitionSpeed: String = js.native
      inline def transitionSpeed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applied as data-hook HTML attribute that can be used to create driver in testing */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Hide Accordion shadow effect */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.hideShadow")
      @js.native
      def hideShadow: Requireable[Boolean] = js.native
      inline def hideShadow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideShadow")(x.asInstanceOf[js.Any])
      
      /** Change horizontal padding */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.horizontalPadding")
      @js.native
      def horizontalPadding: Requireable[String] = js.native
      inline def horizontalPadding_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontalPadding")(x.asInstanceOf[js.Any])
      
      /** Provide items  */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.items")
      @js.native
      def items: Requireable[js.Array[js.UndefOr[(InferProps[ButtonType | Render]) | Null]]] = js.native
      inline def items_=(x: Requireable[js.Array[js.UndefOr[(InferProps[ButtonType | Render]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      /** allow multiple rows to be opened simultaneously */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.multiple")
      @js.native
      def multiple: Requireable[Boolean] = js.native
      inline def multiple_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      /** Callback fired immediately after the animation is started */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.onAnimationEnter")
      @js.native
      def onAnimationEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onAnimationEnter_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnter")(x.asInstanceOf[js.Any])
      
      /** Callback fired immediately after the animation is ended */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.onAnimationExit")
      @js.native
      def onAnimationExit: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onAnimationExit_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAnimationExit")(x.asInstanceOf[js.Any])
      
      /** Change items size */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Accordion skin color */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Change expand and collapse animation speed */
      @JSImport("wix-style-react/dist/types/Accordion/Accordion", "default.propTypes.transitionSpeed")
      @js.native
      def transitionSpeed: Requireable[String] = js.native
      inline def transitionSpeed_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def accordionItemBuilder(item: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("accordionItemBuilder")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def accordionSectionItemBuilder(item: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("accordionSectionItemBuilder")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  trait Accordion extends Component[Any, Any, Any] {
    
    def _compareOpenItems(currentItems: Any, prevItems: Any): Boolean = js.native
    
    def _findOpenIndexes(items: Any, initial: Any): Any = js.native
    
    def _toggle(index: Any): js.Function0[Unit] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAccordion(prevProps: Any): Unit = js.native
    
    @JSName("state")
    var state_Accordion: OpenIndexes = js.native
  }
}
