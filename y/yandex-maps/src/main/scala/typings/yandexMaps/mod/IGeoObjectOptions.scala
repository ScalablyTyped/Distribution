package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoObjectOptions
  extends StObject
     with ICircleOptions
     with IBalloonOptionsWithBalloonPrefix {
  
  var iconCaptionMaxWidth: js.UndefOr[Double] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var iconContentOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconContentPadding: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconContentSize: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var iconImageHref: js.UndefOr[String] = js.undefined
  
  var iconImageOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconImageShape: js.UndefOr[IShape | Null] = js.undefined
  
  var iconImageSize: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var iconMaxHeight: js.UndefOr[Double] = js.undefined
  
  var iconMaxWidth: js.UndefOr[Double] = js.undefined
  
  var iconOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconShadow: js.UndefOr[Boolean] = js.undefined
  
  var iconShadowImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var iconShadowImageHref: js.UndefOr[String] = js.undefined
  
  var iconShadowImageOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconShadowImageSize: js.UndefOr[js.Array[Double]] = js.undefined
  
  var iconShadowLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var iconShadowOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineStringOverlay: js.UndefOr[OverlayKey] = js.undefined
  
  var pointOverlay: js.UndefOr[OverlayKey] = js.undefined
  
  var polygonOverlay: js.UndefOr[OverlayKey] = js.undefined
  
  var preset: js.UndefOr[PresetKey] = js.undefined
  
  var rectangleOverlay: js.UndefOr[OverlayKey] = js.undefined
  
  var setMapCursorInDragging: js.UndefOr[Boolean] = js.undefined
}
object IGeoObjectOptions {
  
  inline def apply(): IGeoObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeoObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setIconCaptionMaxWidth(value: Double): Self = StObject.set(x, "iconCaptionMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setIconCaptionMaxWidthUndefined: Self = StObject.set(x, "iconCaptionMaxWidth", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconContentLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "iconContentLayout", value.asInstanceOf[js.Any])
    
    inline def setIconContentLayoutUndefined: Self = StObject.set(x, "iconContentLayout", js.undefined)
    
    inline def setIconContentOffset(value: js.Array[Double]): Self = StObject.set(x, "iconContentOffset", value.asInstanceOf[js.Any])
    
    inline def setIconContentOffsetUndefined: Self = StObject.set(x, "iconContentOffset", js.undefined)
    
    inline def setIconContentOffsetVarargs(value: Double*): Self = StObject.set(x, "iconContentOffset", js.Array(value*))
    
    inline def setIconContentPadding(value: js.Array[Double]): Self = StObject.set(x, "iconContentPadding", value.asInstanceOf[js.Any])
    
    inline def setIconContentPaddingUndefined: Self = StObject.set(x, "iconContentPadding", js.undefined)
    
    inline def setIconContentPaddingVarargs(value: Double*): Self = StObject.set(x, "iconContentPadding", js.Array(value*))
    
    inline def setIconContentSize(value: js.Array[Double]): Self = StObject.set(x, "iconContentSize", value.asInstanceOf[js.Any])
    
    inline def setIconContentSizeUndefined: Self = StObject.set(x, "iconContentSize", js.undefined)
    
    inline def setIconContentSizeVarargs(value: Double*): Self = StObject.set(x, "iconContentSize", js.Array(value*))
    
    inline def setIconImageClipRect(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "iconImageClipRect", value.asInstanceOf[js.Any])
    
    inline def setIconImageClipRectUndefined: Self = StObject.set(x, "iconImageClipRect", js.undefined)
    
    inline def setIconImageClipRectVarargs(value: js.Array[Double]*): Self = StObject.set(x, "iconImageClipRect", js.Array(value*))
    
    inline def setIconImageHref(value: String): Self = StObject.set(x, "iconImageHref", value.asInstanceOf[js.Any])
    
    inline def setIconImageHrefUndefined: Self = StObject.set(x, "iconImageHref", js.undefined)
    
    inline def setIconImageOffset(value: js.Array[Double]): Self = StObject.set(x, "iconImageOffset", value.asInstanceOf[js.Any])
    
    inline def setIconImageOffsetUndefined: Self = StObject.set(x, "iconImageOffset", js.undefined)
    
    inline def setIconImageOffsetVarargs(value: Double*): Self = StObject.set(x, "iconImageOffset", js.Array(value*))
    
    inline def setIconImageShape(value: IShape): Self = StObject.set(x, "iconImageShape", value.asInstanceOf[js.Any])
    
    inline def setIconImageShapeNull: Self = StObject.set(x, "iconImageShape", null)
    
    inline def setIconImageShapeUndefined: Self = StObject.set(x, "iconImageShape", js.undefined)
    
    inline def setIconImageSize(value: js.Array[Double]): Self = StObject.set(x, "iconImageSize", value.asInstanceOf[js.Any])
    
    inline def setIconImageSizeUndefined: Self = StObject.set(x, "iconImageSize", js.undefined)
    
    inline def setIconImageSizeVarargs(value: Double*): Self = StObject.set(x, "iconImageSize", js.Array(value*))
    
    inline def setIconLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "iconLayout", value.asInstanceOf[js.Any])
    
    inline def setIconLayoutUndefined: Self = StObject.set(x, "iconLayout", js.undefined)
    
    inline def setIconMaxHeight(value: Double): Self = StObject.set(x, "iconMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setIconMaxHeightUndefined: Self = StObject.set(x, "iconMaxHeight", js.undefined)
    
    inline def setIconMaxWidth(value: Double): Self = StObject.set(x, "iconMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setIconMaxWidthUndefined: Self = StObject.set(x, "iconMaxWidth", js.undefined)
    
    inline def setIconOffset(value: js.Array[Double]): Self = StObject.set(x, "iconOffset", value.asInstanceOf[js.Any])
    
    inline def setIconOffsetUndefined: Self = StObject.set(x, "iconOffset", js.undefined)
    
    inline def setIconOffsetVarargs(value: Double*): Self = StObject.set(x, "iconOffset", js.Array(value*))
    
    inline def setIconShadow(value: Boolean): Self = StObject.set(x, "iconShadow", value.asInstanceOf[js.Any])
    
    inline def setIconShadowImageClipRect(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "iconShadowImageClipRect", value.asInstanceOf[js.Any])
    
    inline def setIconShadowImageClipRectUndefined: Self = StObject.set(x, "iconShadowImageClipRect", js.undefined)
    
    inline def setIconShadowImageClipRectVarargs(value: js.Array[Double]*): Self = StObject.set(x, "iconShadowImageClipRect", js.Array(value*))
    
    inline def setIconShadowImageHref(value: String): Self = StObject.set(x, "iconShadowImageHref", value.asInstanceOf[js.Any])
    
    inline def setIconShadowImageHrefUndefined: Self = StObject.set(x, "iconShadowImageHref", js.undefined)
    
    inline def setIconShadowImageOffset(value: js.Array[Double]): Self = StObject.set(x, "iconShadowImageOffset", value.asInstanceOf[js.Any])
    
    inline def setIconShadowImageOffsetUndefined: Self = StObject.set(x, "iconShadowImageOffset", js.undefined)
    
    inline def setIconShadowImageOffsetVarargs(value: Double*): Self = StObject.set(x, "iconShadowImageOffset", js.Array(value*))
    
    inline def setIconShadowImageSize(value: js.Array[Double]): Self = StObject.set(x, "iconShadowImageSize", value.asInstanceOf[js.Any])
    
    inline def setIconShadowImageSizeUndefined: Self = StObject.set(x, "iconShadowImageSize", js.undefined)
    
    inline def setIconShadowImageSizeVarargs(value: Double*): Self = StObject.set(x, "iconShadowImageSize", js.Array(value*))
    
    inline def setIconShadowLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "iconShadowLayout", value.asInstanceOf[js.Any])
    
    inline def setIconShadowLayoutUndefined: Self = StObject.set(x, "iconShadowLayout", js.undefined)
    
    inline def setIconShadowOffset(value: js.Array[Double]): Self = StObject.set(x, "iconShadowOffset", value.asInstanceOf[js.Any])
    
    inline def setIconShadowOffsetUndefined: Self = StObject.set(x, "iconShadowOffset", js.undefined)
    
    inline def setIconShadowOffsetVarargs(value: Double*): Self = StObject.set(x, "iconShadowOffset", js.Array(value*))
    
    inline def setIconShadowUndefined: Self = StObject.set(x, "iconShadow", js.undefined)
    
    inline def setLineStringOverlay(value: OverlayKey): Self = StObject.set(x, "lineStringOverlay", value.asInstanceOf[js.Any])
    
    inline def setLineStringOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = StObject.set(x, "lineStringOverlay", js.Any.fromFunction3(value))
    
    inline def setLineStringOverlayUndefined: Self = StObject.set(x, "lineStringOverlay", js.undefined)
    
    inline def setPointOverlay(value: OverlayKey): Self = StObject.set(x, "pointOverlay", value.asInstanceOf[js.Any])
    
    inline def setPointOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = StObject.set(x, "pointOverlay", js.Any.fromFunction3(value))
    
    inline def setPointOverlayUndefined: Self = StObject.set(x, "pointOverlay", js.undefined)
    
    inline def setPolygonOverlay(value: OverlayKey): Self = StObject.set(x, "polygonOverlay", value.asInstanceOf[js.Any])
    
    inline def setPolygonOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = StObject.set(x, "polygonOverlay", js.Any.fromFunction3(value))
    
    inline def setPolygonOverlayUndefined: Self = StObject.set(x, "polygonOverlay", js.undefined)
    
    inline def setPreset(value: PresetKey): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setRectangleOverlay(value: OverlayKey): Self = StObject.set(x, "rectangleOverlay", value.asInstanceOf[js.Any])
    
    inline def setRectangleOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = StObject.set(x, "rectangleOverlay", js.Any.fromFunction3(value))
    
    inline def setRectangleOverlayUndefined: Self = StObject.set(x, "rectangleOverlay", js.undefined)
    
    inline def setSetMapCursorInDragging(value: Boolean): Self = StObject.set(x, "setMapCursorInDragging", value.asInstanceOf[js.Any])
    
    inline def setSetMapCursorInDraggingUndefined: Self = StObject.set(x, "setMapCursorInDragging", js.undefined)
  }
}
