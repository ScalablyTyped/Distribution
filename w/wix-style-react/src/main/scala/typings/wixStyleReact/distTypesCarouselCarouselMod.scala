package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AfterChange
import typings.wixStyleReact.anon.Autoplay
import typings.wixStyleReact.anon.LoadedImages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselCarouselMod {
  
  @JSImport("wix-style-react/dist/types/Carousel/Carousel", JSImport.Default)
  @js.native
  open class default protected () extends Carousel {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Carousel/Carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.buttonSkin")
      @js.native
      def buttonSkin: String = js.native
      inline def buttonSkin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buttonSkin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.controlsPosition")
      @js.native
      def controlsPosition: String = js.native
      inline def controlsPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.controlsSize")
      @js.native
      def controlsSize: String = js.native
      inline def controlsSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsSize")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.controlsStartEnd")
      @js.native
      def controlsStartEnd: String = js.native
      inline def controlsStartEnd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsStartEnd")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.dots")
      @js.native
      def dots: Boolean = js.native
      inline def dots_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dots")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.images")
      @js.native
      def images: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.imagesFit")
      @js.native
      def imagesFit: String = js.native
      inline def imagesFit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesFit")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.imagesPosition")
      @js.native
      def imagesPosition: String = js.native
      inline def imagesPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesPosition")(x.asInstanceOf[js.Any])
      
      inline def images_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.infinite")
      @js.native
      def infinite: Boolean = js.native
      inline def infinite_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infinite")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.initialSlideIndex")
      @js.native
      def initialSlideIndex: Double = js.native
      inline def initialSlideIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialSlideIndex")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.showControlsShadow")
      @js.native
      def showControlsShadow: Boolean = js.native
      inline def showControlsShadow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showControlsShadow")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.defaultProps.variableWidth")
      @js.native
      def variableWidth: Boolean = js.native
      inline def variableWidth_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("variableWidth")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Index change callback. `index => ...` */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.afterChange")
      @js.native
      def afterChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def afterChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(x.asInstanceOf[js.Any])
      
      /** Auto-plays images */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.autoplay")
      @js.native
      def autoplay: Requireable[Boolean] = js.native
      inline def autoplay_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(x.asInstanceOf[js.Any])
      
      /** Index change callback. `(oldIndex, newIndex) => ...` */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.beforeChange")
      @js.native
      def beforeChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def beforeChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(x.asInstanceOf[js.Any])
      
      /** Sets the skin of the control (next / previous) buttons */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.buttonSkin")
      @js.native
      def buttonSkin: Requireable[String] = js.native
      inline def buttonSkin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buttonSkin")(x.asInstanceOf[js.Any])
      
      /** Accepts any component as a child item. Most commonly used to display `<Card/>`,  `<Image/>` or video files. */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Specifies a CSS class name to be appended to the component’s root element */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Sets the control buttons’ position */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.controlsPosition")
      @js.native
      def controlsPosition: Requireable[String] = js.native
      inline def controlsPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsPosition")(x.asInstanceOf[js.Any])
      
      /** Sets the control buttons’ size */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.controlsSize")
      @js.native
      def controlsSize: Requireable[String] = js.native
      inline def controlsSize_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsSize")(x.asInstanceOf[js.Any])
      
      /** Controls if the next / previous control buttons are visible, hidden or disabled at the start and end of the slideshow */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.controlsStartEnd")
      @js.native
      def controlsStartEnd: Requireable[String] = js.native
      inline def controlsStartEnd_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsStartEnd")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Controls if the bottom dots are visible or hidden */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.dots")
      @js.native
      def dots: Requireable[Boolean] = js.native
      inline def dots_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dots")(x.asInstanceOf[js.Any])
      
      /** Defines an array of objects where each contains the `src` of an image (in `<img src="your_src" />`) */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.images")
      @js.native
      def images: Requireable[js.Array[Any]] = js.native
      
      /** Sets the image’s fit */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.imagesFit")
      @js.native
      def imagesFit: Requireable[String] = js.native
      inline def imagesFit_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesFit")(x.asInstanceOf[js.Any])
      
      /** Sets the image's position */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.imagesPosition")
      @js.native
      def imagesPosition: Requireable[String] = js.native
      inline def imagesPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesPosition")(x.asInstanceOf[js.Any])
      
      inline def images_=(x: Requireable[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
      
      /** Loops images endlessly */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.infinite")
      @js.native
      def infinite: Requireable[Boolean] = js.native
      inline def infinite_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infinite")(x.asInstanceOf[js.Any])
      
      /** Sets the slide to start a presentation with */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.initialSlideIndex")
      @js.native
      def initialSlideIndex: Requireable[Double] = js.native
      inline def initialSlideIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialSlideIndex")(x.asInstanceOf[js.Any])
      
      /** Drops a shadow below the control buttons */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.showControlsShadow")
      @js.native
      def showControlsShadow: Requireable[Boolean] = js.native
      inline def showControlsShadow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showControlsShadow")(x.asInstanceOf[js.Any])
      
      /** Shows one slide at a time (default) or stacks one slide after another horizontally */
      @JSImport("wix-style-react/dist/types/Carousel/Carousel", "default.propTypes.variableWidth")
      @js.native
      def variableWidth: Requireable[Boolean] = js.native
      inline def variableWidth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("variableWidth")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Carousel extends Component[Any, Any, Any] {
    
    def _isLoading(src: Any): Boolean = js.native
    
    def _onImageLoad(src: Any): Unit = js.native
    
    def _renderImages(images: Any): Any = js.native
    
    def _resolveSliderSettings(param0: Autoplay): AfterChange = js.native
    
    def leftIconByControlSize(controlSize: Any): Element = js.native
    
    def rightIconByControlSize(controlSize: Any): Element = js.native
    
    @JSName("state")
    var state_Carousel: LoadedImages = js.native
  }
}
