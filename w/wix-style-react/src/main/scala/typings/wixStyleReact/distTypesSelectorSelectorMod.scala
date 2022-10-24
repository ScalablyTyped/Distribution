package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorSelectorMod {
  
  @JSImport("wix-style-react/dist/types/Selector/Selector", JSImport.Default)
  @js.native
  open class default protected () extends Selector {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.defaultProps.imageShape")
      @js.native
      def imageShape: String = js.native
      inline def imageShape_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageShape")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.defaultProps.imageSize")
      @js.native
      def imageSize: String = js.native
      inline def imageSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.defaultProps.isDisabled")
      @js.native
      def isDisabled: Boolean = js.native
      inline def isDisabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.defaultProps.isSelected")
      @js.native
      def isSelected: Boolean = js.native
      inline def isSelected_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
      
      inline def onToggle(i: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onToggle")(i.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.defaultProps.showBelowNodeOnSelect")
      @js.native
      def showBelowNodeOnSelect: Boolean = js.native
      inline def showBelowNodeOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showBelowNodeOnSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.defaultProps.toggleType")
      @js.native
      def toggleType: String = js.native
      inline def toggleType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleType")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.belowNode")
      @js.native
      def belowNode: Requireable[ReactNodeLike] = js.native
      inline def belowNode_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("belowNode")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.extraNode")
      @js.native
      def extraNode: Requireable[ReactNodeLike] = js.native
      inline def extraNode_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraNode")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.id")
      @js.native
      def id: Validator[String | Double] = js.native
      inline def id_=(x: Validator[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.image")
      @js.native
      def image: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.imageShape")
      @js.native
      def imageShape: Requireable[String] = js.native
      inline def imageShape_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageShape")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.imageSize")
      @js.native
      def imageSize: Requireable[String] = js.native
      inline def imageSize_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(x.asInstanceOf[js.Any])
      
      inline def image_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.indeterminate")
      @js.native
      def indeterminate: Requireable[Boolean] = js.native
      inline def indeterminate_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.isDisabled")
      @js.native
      def isDisabled: Requireable[Boolean] = js.native
      inline def isDisabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.isSelected")
      @js.native
      def isSelected: Requireable[Boolean] = js.native
      inline def isSelected_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.onToggle")
      @js.native
      def onToggle: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onToggle_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.showBelowNodeOnSelect")
      @js.native
      def showBelowNodeOnSelect: Requireable[Boolean] = js.native
      inline def showBelowNodeOnSelect_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showBelowNodeOnSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.subtitle")
      @js.native
      def subtitle: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.subtitleNode")
      @js.native
      def subtitleNode: Requireable[ReactNodeLike] = js.native
      inline def subtitleNode_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitleNode")(x.asInstanceOf[js.Any])
      
      inline def subtitle_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.title")
      @js.native
      def title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def title_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/Selector", "default.propTypes.toggleType")
      @js.native
      def toggleType: Requireable[String] = js.native
      inline def toggleType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleType")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Selector extends PureComponent[Any, Any, Any] {
    
    def _onClick(): Any = js.native
  }
}
