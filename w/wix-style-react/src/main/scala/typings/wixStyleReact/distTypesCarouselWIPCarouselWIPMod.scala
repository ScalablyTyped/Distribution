package typings.wixStyleReact

import typings.node.timersMod.global.NodeJS.Timeout
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AlignTo
import typings.wixStyleReact.anon.IsAnimating
import typings.wixStyleReact.wixStyleReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselWIPCarouselWIPMod {
  
  /** The carousel component creates a slideshow for cycling through a series of content. */
  @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", JSImport.Default)
  @js.native
  open class default protected () extends CarouselWIP {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.autoplay")
      @js.native
      def autoplay: Boolean = js.native
      inline def autoplay_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.children")
      @js.native
      def children: js.Array[scala.Nothing] = js.native
      inline def children_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.controlsPosition")
      @js.native
      def controlsPosition: String = js.native
      inline def controlsPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.controlsSize")
      @js.native
      def controlsSize: String = js.native
      inline def controlsSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsSize")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.controlsSkin")
      @js.native
      def controlsSkin: String = js.native
      inline def controlsSkin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsSkin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.controlsStartEnd")
      @js.native
      def controlsStartEnd: String = js.native
      inline def controlsStartEnd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsStartEnd")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.gutter")
      @js.native
      def gutter: Double = js.native
      inline def gutter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gutter")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.hideDots")
      @js.native
      def hideDots: Boolean = js.native
      inline def hideDots_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideDots")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.images")
      @js.native
      def images: js.Array[scala.Nothing] = js.native
      inline def images_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.infinite")
      @js.native
      def infinite: Boolean = js.native
      inline def infinite_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infinite")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.initialSlideIndex")
      @js.native
      def initialSlideIndex: Double = js.native
      inline def initialSlideIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialSlideIndex")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.showControlsShadow")
      @js.native
      def showControlsShadow: Boolean = js.native
      inline def showControlsShadow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showControlsShadow")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.slidingType")
      @js.native
      def slidingType: String = js.native
      inline def slidingType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slidingType")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.defaultProps.startEndOffset")
      @js.native
      def startEndOffset: Double = js.native
      inline def startEndOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startEndOffset")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Index change callback. `index => ...` */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.afterChange")
      @js.native
      def afterChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def afterChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(x.asInstanceOf[js.Any])
      
      /** Auto-playing of images */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.autoplay")
      @js.native
      def autoplay: Requireable[Boolean] = js.native
      inline def autoplay_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(x.asInstanceOf[js.Any])
      
      /** Index change callback. `(oldIndex, newIndex) => ...` */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.beforeChange")
      @js.native
      def beforeChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def beforeChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(x.asInstanceOf[js.Any])
      
      /** Any element to render inside */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** A css class to be applied to the component's root element */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Sets the arrows position */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.controlsPosition")
      @js.native
      def controlsPosition: Requireable[String] = js.native
      inline def controlsPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsPosition")(x.asInstanceOf[js.Any])
      
      /** Sets the arrows position */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.controlsSize")
      @js.native
      def controlsSize: Requireable[String] = js.native
      inline def controlsSize_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsSize")(x.asInstanceOf[js.Any])
      
      /** Sets the skin of the arrow buttons */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.controlsSkin")
      @js.native
      def controlsSkin: Requireable[String] = js.native
      inline def controlsSkin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsSkin")(x.asInstanceOf[js.Any])
      
      /** Configure the start and end controls to be shown disabled or hidden. Relevant when infinite prop is set to false. */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.controlsStartEnd")
      @js.native
      def controlsStartEnd: Requireable[String] = js.native
      inline def controlsStartEnd_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlsStartEnd")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Number of pixels dividing between slides */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.gutter")
      @js.native
      def gutter: Requireable[Double] = js.native
      inline def gutter_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gutter")(x.asInstanceOf[js.Any])
      
      /** Hide dots */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.hideDots")
      @js.native
      def hideDots: Requireable[Boolean] = js.native
      inline def hideDots_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideDots")(x.asInstanceOf[js.Any])
      
      /** Array of objects where each contains the `src` of an image (in \<img src="your_src" /\>) */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.images")
      @js.native
      def images: Requireable[js.Array[Any]] = js.native
      
      /** Sets the images fit */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.imagesFit")
      @js.native
      def imagesFit: Requireable[String] = js.native
      inline def imagesFit_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesFit")(x.asInstanceOf[js.Any])
      
      /** Sets the images position */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.imagesPosition")
      @js.native
      def imagesPosition: Requireable[String] = js.native
      inline def imagesPosition_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesPosition")(x.asInstanceOf[js.Any])
      
      inline def images_=(x: Requireable[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
      
      /** Images loop endlessly */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.infinite")
      @js.native
      def infinite: Requireable[Boolean] = js.native
      inline def infinite_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infinite")(x.asInstanceOf[js.Any])
      
      /** An index of the slide to start on */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.initialSlideIndex")
      @js.native
      def initialSlideIndex: Requireable[Double] = js.native
      inline def initialSlideIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialSlideIndex")(x.asInstanceOf[js.Any])
      
      /** Show a shadow for the carousel controls */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.showControlsShadow")
      @js.native
      def showControlsShadow: Requireable[Boolean] = js.native
      inline def showControlsShadow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showControlsShadow")(x.asInstanceOf[js.Any])
      
      /** Color for the gradients on the sides of the carousel */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.sidesGradientColor")
      @js.native
      def sidesGradientColor: Requireable[String] = js.native
      inline def sidesGradientColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sidesGradientColor")(x.asInstanceOf[js.Any])
      
      /** Sliding behaviour type for the carousel */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.slidingType")
      @js.native
      def slidingType: Requireable[String] = js.native
      inline def slidingType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slidingType")(x.asInstanceOf[js.Any])
      
      /** Number of pixels for showing "peeking" cards on the edges of the carousel */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.startEndOffset")
      @js.native
      def startEndOffset: Requireable[Double] = js.native
      inline def startEndOffset_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startEndOffset")(x.asInstanceOf[js.Any])
      
      /** 🚧 Variable width of children */
      @JSImport("wix-style-react/dist/types/CarouselWIP/CarouselWIP", "default.propTypes.variableWidth")
      @js.native
      def variableWidth: Requireable[Boolean] = js.native
      inline def variableWidth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("variableWidth")(x.asInstanceOf[js.Any])
    }
  }
  
  /** The carousel component creates a slideshow for cycling through a series of content. */
  @js.native
  trait CarouselWIP extends PureComponent[Any, Any, Any] {
    
    def _next(): js.Promise[Any] = js.native
    
    def _onImageLoad(): Unit = js.native
    
    def _prev(): js.Promise[Any] = js.native
    
    def _renderDots(): Element = js.native
    
    def _renderEndGradient(): Element = js.native
    
    def _renderLeftControl(): `false` | Element = js.native
    
    def _renderLoader(): Element = js.native
    
    def _renderRightControl(): `false` | Element = js.native
    
    def _renderSlides(): Element = js.native
    
    def _renderStartGradient(): Element = js.native
    
    def _setAutoplayTimer(active: Any): Unit = js.native
    
    def _setImagesOnLoadHandlers(): Unit = js.native
    
    def _setRef(r: Any): Unit = js.native
    
    def _setVisibleSlides(): Unit = js.native
    
    def _slideTo(): js.Promise[Any] = js.native
    def _slideTo(param0: AlignTo): js.Promise[Any] = js.native
    
    def _updateChildCount(): Unit = js.native
    
    var autoplayTimer: js.UndefOr[Timeout] = js.native
    
    var carousel: Any = js.native
    
    var childCount: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCarouselWIP(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCarouselWIP(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCarouselWIP(): Unit = js.native
    
    var loadingImagesCount: Double = js.native
    
    @JSName("state")
    var state_CarouselWIP: IsAnimating = js.native
  }
}
