package typings.yandexMaps.mod

import typings.yandexMaps.mod.layout.templateBased.Base
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  @JSImport("yandex-maps", "layout.Image")
  @js.native
  open class Image ()
    extends StObject
       with ILayout {
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
  }
  
  @JSImport("yandex-maps", "layout.ImageWithContent")
  @js.native
  open class ImageWithContent () extends Image
  
  @JSImport("yandex-maps", "layout.PieChart")
  @js.native
  open class PieChart protected () extends Base {
    def this(data: js.Object) = this()
  }
  
  @JSImport("yandex-maps", "layout.storage")
  @js.native
  val storage: Storage = js.native
  
  object templateBased {
    
    @JSImport("yandex-maps", "layout.templateBased.Base")
    @js.native
    open class Base protected ()
      extends StObject
         with ILayout {
      def this(data: js.Object) = this()
      
      def build(): Unit = js.native
      
      def clear(): Unit = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      def onSublayoutSizeChange(sublayoutInfo: js.Object, nodeSizeByContent: js.Object): Unit = js.native
      
      def rebuild(): Unit = js.native
    }
  }
  
  trait IImageOptionsWithIconPrefix extends StObject {
    
    var iconImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    var iconImageHref: js.UndefOr[String] = js.undefined
    
    var iconImageOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var iconImageSize: js.UndefOr[js.Array[Double]] = js.undefined
    
    var iconShape: js.UndefOr[IShape | js.Object | Null] = js.undefined
  }
  object IImageOptionsWithIconPrefix {
    
    inline def apply(): IImageOptionsWithIconPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageOptionsWithIconPrefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImageOptionsWithIconPrefix] (val x: Self) extends AnyVal {
      
      inline def setIconImageClipRect(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "iconImageClipRect", value.asInstanceOf[js.Any])
      
      inline def setIconImageClipRectUndefined: Self = StObject.set(x, "iconImageClipRect", js.undefined)
      
      inline def setIconImageClipRectVarargs(value: js.Array[Double]*): Self = StObject.set(x, "iconImageClipRect", js.Array(value*))
      
      inline def setIconImageHref(value: String): Self = StObject.set(x, "iconImageHref", value.asInstanceOf[js.Any])
      
      inline def setIconImageHrefUndefined: Self = StObject.set(x, "iconImageHref", js.undefined)
      
      inline def setIconImageOffset(value: js.Array[Double]): Self = StObject.set(x, "iconImageOffset", value.asInstanceOf[js.Any])
      
      inline def setIconImageOffsetUndefined: Self = StObject.set(x, "iconImageOffset", js.undefined)
      
      inline def setIconImageOffsetVarargs(value: Double*): Self = StObject.set(x, "iconImageOffset", js.Array(value*))
      
      inline def setIconImageSize(value: js.Array[Double]): Self = StObject.set(x, "iconImageSize", value.asInstanceOf[js.Any])
      
      inline def setIconImageSizeUndefined: Self = StObject.set(x, "iconImageSize", js.undefined)
      
      inline def setIconImageSizeVarargs(value: Double*): Self = StObject.set(x, "iconImageSize", js.Array(value*))
      
      inline def setIconShape(value: IShape | js.Object): Self = StObject.set(x, "iconShape", value.asInstanceOf[js.Any])
      
      inline def setIconShapeNull: Self = StObject.set(x, "iconShape", null)
      
      inline def setIconShapeUndefined: Self = StObject.set(x, "iconShape", js.undefined)
    }
  }
  
  trait IImageWithContentOptionsWithIconPrefix
    extends StObject
       with IImageOptionsWithIconPrefix {
    
    var iconContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
    
    var iconContentOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var iconContentSize: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object IImageWithContentOptionsWithIconPrefix {
    
    inline def apply(): IImageWithContentOptionsWithIconPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageWithContentOptionsWithIconPrefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImageWithContentOptionsWithIconPrefix] (val x: Self) extends AnyVal {
      
      inline def setIconContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "iconContentLayout", value.asInstanceOf[js.Any])
      
      inline def setIconContentLayoutUndefined: Self = StObject.set(x, "iconContentLayout", js.undefined)
      
      inline def setIconContentOffset(value: js.Array[Double]): Self = StObject.set(x, "iconContentOffset", value.asInstanceOf[js.Any])
      
      inline def setIconContentOffsetUndefined: Self = StObject.set(x, "iconContentOffset", js.undefined)
      
      inline def setIconContentOffsetVarargs(value: Double*): Self = StObject.set(x, "iconContentOffset", js.Array(value*))
      
      inline def setIconContentSize(value: js.Array[Double]): Self = StObject.set(x, "iconContentSize", value.asInstanceOf[js.Any])
      
      inline def setIconContentSizeUndefined: Self = StObject.set(x, "iconContentSize", js.undefined)
      
      inline def setIconContentSizeVarargs(value: Double*): Self = StObject.set(x, "iconContentSize", js.Array(value*))
    }
  }
  
  trait IPieChartOptionsWithIconPrefix extends StObject {
    
    var iconPieChartCaptionMaxWidth: js.UndefOr[Double] = js.undefined
    
    var iconPieChartCoreFillStyle: js.UndefOr[String] = js.undefined
    
    var iconPieChartCoreRadius: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var iconPieChartStrokeStyle: js.UndefOr[String] = js.undefined
    
    var iconPieChartStrokeWidth: js.UndefOr[Double] = js.undefined
  }
  object IPieChartOptionsWithIconPrefix {
    
    inline def apply(): IPieChartOptionsWithIconPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPieChartOptionsWithIconPrefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPieChartOptionsWithIconPrefix] (val x: Self) extends AnyVal {
      
      inline def setIconPieChartCaptionMaxWidth(value: Double): Self = StObject.set(x, "iconPieChartCaptionMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setIconPieChartCaptionMaxWidthUndefined: Self = StObject.set(x, "iconPieChartCaptionMaxWidth", js.undefined)
      
      inline def setIconPieChartCoreFillStyle(value: String): Self = StObject.set(x, "iconPieChartCoreFillStyle", value.asInstanceOf[js.Any])
      
      inline def setIconPieChartCoreFillStyleUndefined: Self = StObject.set(x, "iconPieChartCoreFillStyle", js.undefined)
      
      inline def setIconPieChartCoreRadius(value: Double | js.Function0[Double]): Self = StObject.set(x, "iconPieChartCoreRadius", value.asInstanceOf[js.Any])
      
      inline def setIconPieChartCoreRadiusFunction0(value: () => Double): Self = StObject.set(x, "iconPieChartCoreRadius", js.Any.fromFunction0(value))
      
      inline def setIconPieChartCoreRadiusUndefined: Self = StObject.set(x, "iconPieChartCoreRadius", js.undefined)
      
      inline def setIconPieChartStrokeStyle(value: String): Self = StObject.set(x, "iconPieChartStrokeStyle", value.asInstanceOf[js.Any])
      
      inline def setIconPieChartStrokeStyleUndefined: Self = StObject.set(x, "iconPieChartStrokeStyle", js.undefined)
      
      inline def setIconPieChartStrokeWidth(value: Double): Self = StObject.set(x, "iconPieChartStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setIconPieChartStrokeWidthUndefined: Self = StObject.set(x, "iconPieChartStrokeWidth", js.undefined)
    }
  }
}
