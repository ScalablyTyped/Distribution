package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.HeightWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProportionProportionMod {
  
  @JSImport("wix-style-react/dist/types/Proportion/Proportion", JSImport.Default)
  @js.native
  open class default protected () extends Proportion {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Proportion/Proportion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object PREDEFINED_RATIOS {
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.PREDEFINED_RATIOS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.PREDEFINED_RATIOS.cinema")
      @js.native
      def cinema: Double = js.native
      inline def cinema_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cinema")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.PREDEFINED_RATIOS.landscape")
      @js.native
      def landscape: Double = js.native
      inline def landscape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("landscape")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.PREDEFINED_RATIOS.none")
      @js.native
      def none: String = js.native
      inline def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.PREDEFINED_RATIOS.portrait")
      @js.native
      def portrait: Double = js.native
      inline def portrait_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portrait")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.PREDEFINED_RATIOS.square")
      @js.native
      def square: Double = js.native
      inline def square_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("square")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.defaultProps.aspectRatio")
      @js.native
      def aspectRatio: Double = js.native
      inline def aspectRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Condition for wrapping content with Proportion or return original  */
      /** Predefined Proportion.square (1), Proportion.portrait (3/4), Proportion.cinema (16/9), Proportion.landscape (4/3), or a custom number (width / height) or 'none' for original size */
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.propTypes.aspectRatio")
      @js.native
      def aspectRatio: Requireable[String | Double] = js.native
      inline def aspectRatio_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])
      
      /** Children to render. */
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.propTypes.children")
      @js.native
      def children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def children_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** A css class to be applied to the component's root element */
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Proportion/Proportion", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Proportion extends PureComponent[Any, Any, Any] {
    
    /**
      * This is based on Noam Rosenthal's (noamr@wix.com) solution
      * which can be found here: https://codeburst.io/keeping-aspect-ratio-with-html-and-no-padding-tricks-40705656808b
      *
      * The solution uses the fact that SVGs can maintain aspect ratio's natively.
      * In addition we use an img element for this solution to work correctly in IE
      * */
    def _getAspectRatioHolder(): Element = js.native
    
    def _getContent(disabled: Any): ReactNode = js.native
    
    def _getRatio(): HeightWidth = js.native
  }
}
