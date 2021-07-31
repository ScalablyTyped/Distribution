package typings.wixUiCore

import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLImageElement
import typings.wixUiCore.anon.ScaleMediaImageScaling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMediaImageMediaImageMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/media-image/media-image", "MediaImage")
  @js.native
  class MediaImage protected ()
    extends Component[MediaProps, js.Object, js.Any] {
    def this(props: MediaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MediaProps, context: js.Any) = this()
    
    var getImageSource: js.Any = js.native
  }
  /* static members */
  object MediaImage {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/media-image/media-image", "MediaImage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/media-image/media-image", "MediaImage.defaultProps")
    @js.native
    def defaultProps: ScaleMediaImageScaling = js.native
    @scala.inline
    def defaultProps_=(x: ScaleMediaImageScaling): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/media-image/media-image", "MediaImage.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait MediaImageScaling extends StObject
  @JSImport("wix-ui-core/dist/standalone/src/components/media-image/media-image", "MediaImageScaling")
  @js.native
  object MediaImageScaling extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaImageScaling & String] = js.native
    
    @js.native
    sealed trait FILL
      extends StObject
         with MediaImageScaling
    /* "fill" */ val FILL: typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageScaling.FILL & String = js.native
    
    @js.native
    sealed trait FIT
      extends StObject
         with MediaImageScaling
    /* "fit" */ val FIT: typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageScaling.FIT & String = js.native
  }
  
  @js.native
  sealed trait MediaImageUpscaleMethod extends StObject
  @JSImport("wix-ui-core/dist/standalone/src/components/media-image/media-image", "MediaImageUpscaleMethod")
  @js.native
  object MediaImageUpscaleMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaImageUpscaleMethod & String] = js.native
    
    @js.native
    sealed trait AUTO
      extends StObject
         with MediaImageUpscaleMethod
    /* "auto" */ val AUTO: typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageUpscaleMethod.AUTO & String = js.native
    
    @js.native
    sealed trait CLASSIC
      extends StObject
         with MediaImageUpscaleMethod
    /* "classic" */ val CLASSIC: typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageUpscaleMethod.CLASSIC & String = js.native
    
    @js.native
    sealed trait SUPER
      extends StObject
         with MediaImageUpscaleMethod
    /* "super" */ val SUPER: typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageUpscaleMethod.SUPER & String = js.native
  }
  
  trait FocalPoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object FocalPoint {
    
    @scala.inline
    def apply(x: Double, y: Double): FocalPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocalPoint]
    }
    
    @scala.inline
    implicit class FocalPointMutableBuilder[Self <: FocalPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaItemFilters extends StObject {
    
    var blur: js.UndefOr[Double] = js.undefined
  }
  object MediaItemFilters {
    
    @scala.inline
    def apply(): MediaItemFilters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaItemFilters]
    }
    
    @scala.inline
    implicit class MediaItemFiltersMutableBuilder[Self <: MediaItemFilters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    }
  }
  
  trait MediaItemOptions extends StObject {
    
    var filters: js.UndefOr[MediaItemFilters] = js.undefined
    
    var focalPoint: js.UndefOr[FocalPoint] = js.undefined
    
    var isSEOBot: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var unsharpMask: js.UndefOr[UnsharpMaskOptions] = js.undefined
    
    var upscaleMethod: js.UndefOr[MediaImageUpscaleMethod] = js.undefined
    
    var watermark: js.UndefOr[String] = js.undefined
  }
  object MediaItemOptions {
    
    @scala.inline
    def apply(): MediaItemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaItemOptions]
    }
    
    @scala.inline
    implicit class MediaItemOptionsMutableBuilder[Self <: MediaItemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: MediaItemFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFocalPoint(value: FocalPoint): Self = StObject.set(x, "focalPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocalPointUndefined: Self = StObject.set(x, "focalPoint", js.undefined)
      
      @scala.inline
      def setIsSEOBot(value: Boolean): Self = StObject.set(x, "isSEOBot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSEOBotUndefined: Self = StObject.set(x, "isSEOBot", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setUnsharpMask(value: UnsharpMaskOptions): Self = StObject.set(x, "unsharpMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpMaskUndefined: Self = StObject.set(x, "unsharpMask", js.undefined)
      
      @scala.inline
      def setUpscaleMethod(value: MediaImageUpscaleMethod): Self = StObject.set(x, "upscaleMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpscaleMethodUndefined: Self = StObject.set(x, "upscaleMethod", js.undefined)
      
      @scala.inline
      def setWatermark(value: String): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
    }
  }
  
  trait MediaPlatformItem extends StObject {
    
    var height: Double
    
    var options: js.UndefOr[MediaItemOptions] = js.undefined
    
    var uri: String
    
    var width: Double
  }
  object MediaPlatformItem {
    
    @scala.inline
    def apply(height: Double, uri: String, width: Double): MediaPlatformItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaPlatformItem]
    }
    
    @scala.inline
    implicit class MediaPlatformItemMutableBuilder[Self <: MediaPlatformItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: MediaItemOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var errorMediaPlatformItem: js.UndefOr[MediaPlatformItem] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var mediaPlatformItem: js.UndefOr[MediaPlatformItem] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
    
    var scale: js.UndefOr[MediaImageScaling] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object MediaProps {
    
    @scala.inline
    def apply(): MediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProps]
    }
    
    @scala.inline
    implicit class MediaPropsMutableBuilder[Self <: MediaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setErrorMediaPlatformItem(value: MediaPlatformItem): Self = StObject.set(x, "errorMediaPlatformItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMediaPlatformItemUndefined: Self = StObject.set(x, "errorMediaPlatformItem", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMediaPlatformItem(value: MediaPlatformItem): Self = StObject.set(x, "mediaPlatformItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaPlatformItemUndefined: Self = StObject.set(x, "mediaPlatformItem", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setScale(value: MediaImageScaling): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait UnsharpMaskOptions extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object UnsharpMaskOptions {
    
    @scala.inline
    def apply(): UnsharpMaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsharpMaskOptions]
    }
    
    @scala.inline
    implicit class UnsharpMaskOptionsMutableBuilder[Self <: UnsharpMaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
