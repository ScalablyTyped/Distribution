package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoObjectOptions extends ICircleOptions {
  
  var iconCaptionMaxWidth: js.UndefOr[Double] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  
  var iconContentOffset: js.UndefOr[js.Array[Double]] = js.native
  
  var iconContentPadding: js.UndefOr[js.Array[Double]] = js.native
  
  var iconContentSize: js.UndefOr[js.Array[Double]] = js.native
  
  var iconImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var iconImageHref: js.UndefOr[String] = js.native
  
  var iconImageOffset: js.UndefOr[js.Array[Double]] = js.native
  
  var iconImageShape: js.UndefOr[IShape | Null] = js.native
  
  var iconImageSize: js.UndefOr[js.Array[Double]] = js.native
  
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  
  var iconMaxHeight: js.UndefOr[Double] = js.native
  
  var iconMaxWidth: js.UndefOr[Double] = js.native
  
  var iconOffset: js.UndefOr[js.Array[Double]] = js.native
  
  var iconShadow: js.UndefOr[Boolean] = js.native
  
  var iconShadowImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var iconShadowImageHref: js.UndefOr[String] = js.native
  
  var iconShadowImageOffset: js.UndefOr[js.Array[Double]] = js.native
  
  var iconShadowImageSize: js.UndefOr[js.Array[Double]] = js.native
  
  var iconShadowLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  
  var iconShadowOffset: js.UndefOr[js.Array[Double]] = js.native
  
  var lineStringOverlay: js.UndefOr[OverlayKey] = js.native
  
  var pointOverlay: js.UndefOr[OverlayKey] = js.native
  
  var polygonOverlay: js.UndefOr[OverlayKey] = js.native
  
  var preset: js.UndefOr[String] = js.native
  
  var rectangleOverlay: js.UndefOr[OverlayKey] = js.native
  
  var setMapCursorInDragging: js.UndefOr[Boolean] = js.native
}
object IGeoObjectOptions {
  
  @scala.inline
  def apply(): IGeoObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoObjectOptions]
  }
  
  @scala.inline
  implicit class IGeoObjectOptionsOps[Self <: IGeoObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIconCaptionMaxWidth(value: Double): Self = this.set("iconCaptionMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconCaptionMaxWidth: Self = this.set("iconCaptionMaxWidth", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setIconContentLayout(value: String | IClassConstructor[ILayout]): Self = this.set("iconContentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContentLayout: Self = this.set("iconContentLayout", js.undefined)
    
    @scala.inline
    def setIconContentOffsetVarargs(value: Double*): Self = this.set("iconContentOffset", js.Array(value :_*))
    
    @scala.inline
    def setIconContentOffset(value: js.Array[Double]): Self = this.set("iconContentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContentOffset: Self = this.set("iconContentOffset", js.undefined)
    
    @scala.inline
    def setIconContentPaddingVarargs(value: Double*): Self = this.set("iconContentPadding", js.Array(value :_*))
    
    @scala.inline
    def setIconContentPadding(value: js.Array[Double]): Self = this.set("iconContentPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContentPadding: Self = this.set("iconContentPadding", js.undefined)
    
    @scala.inline
    def setIconContentSizeVarargs(value: Double*): Self = this.set("iconContentSize", js.Array(value :_*))
    
    @scala.inline
    def setIconContentSize(value: js.Array[Double]): Self = this.set("iconContentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContentSize: Self = this.set("iconContentSize", js.undefined)
    
    @scala.inline
    def setIconImageClipRectVarargs(value: js.Array[Double]*): Self = this.set("iconImageClipRect", js.Array(value :_*))
    
    @scala.inline
    def setIconImageClipRect(value: js.Array[js.Array[Double]]): Self = this.set("iconImageClipRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconImageClipRect: Self = this.set("iconImageClipRect", js.undefined)
    
    @scala.inline
    def setIconImageHref(value: String): Self = this.set("iconImageHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconImageHref: Self = this.set("iconImageHref", js.undefined)
    
    @scala.inline
    def setIconImageOffsetVarargs(value: Double*): Self = this.set("iconImageOffset", js.Array(value :_*))
    
    @scala.inline
    def setIconImageOffset(value: js.Array[Double]): Self = this.set("iconImageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconImageOffset: Self = this.set("iconImageOffset", js.undefined)
    
    @scala.inline
    def setIconImageShape(value: IShape): Self = this.set("iconImageShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconImageShape: Self = this.set("iconImageShape", js.undefined)
    
    @scala.inline
    def setIconImageShapeNull: Self = this.set("iconImageShape", null)
    
    @scala.inline
    def setIconImageSizeVarargs(value: Double*): Self = this.set("iconImageSize", js.Array(value :_*))
    
    @scala.inline
    def setIconImageSize(value: js.Array[Double]): Self = this.set("iconImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconImageSize: Self = this.set("iconImageSize", js.undefined)
    
    @scala.inline
    def setIconLayout(value: String | IClassConstructor[ILayout]): Self = this.set("iconLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLayout: Self = this.set("iconLayout", js.undefined)
    
    @scala.inline
    def setIconMaxHeight(value: Double): Self = this.set("iconMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconMaxHeight: Self = this.set("iconMaxHeight", js.undefined)
    
    @scala.inline
    def setIconMaxWidth(value: Double): Self = this.set("iconMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconMaxWidth: Self = this.set("iconMaxWidth", js.undefined)
    
    @scala.inline
    def setIconOffsetVarargs(value: Double*): Self = this.set("iconOffset", js.Array(value :_*))
    
    @scala.inline
    def setIconOffset(value: js.Array[Double]): Self = this.set("iconOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconOffset: Self = this.set("iconOffset", js.undefined)
    
    @scala.inline
    def setIconShadow(value: Boolean): Self = this.set("iconShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconShadow: Self = this.set("iconShadow", js.undefined)
    
    @scala.inline
    def setIconShadowImageClipRectVarargs(value: js.Array[Double]*): Self = this.set("iconShadowImageClipRect", js.Array(value :_*))
    
    @scala.inline
    def setIconShadowImageClipRect(value: js.Array[js.Array[Double]]): Self = this.set("iconShadowImageClipRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconShadowImageClipRect: Self = this.set("iconShadowImageClipRect", js.undefined)
    
    @scala.inline
    def setIconShadowImageHref(value: String): Self = this.set("iconShadowImageHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconShadowImageHref: Self = this.set("iconShadowImageHref", js.undefined)
    
    @scala.inline
    def setIconShadowImageOffsetVarargs(value: Double*): Self = this.set("iconShadowImageOffset", js.Array(value :_*))
    
    @scala.inline
    def setIconShadowImageOffset(value: js.Array[Double]): Self = this.set("iconShadowImageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconShadowImageOffset: Self = this.set("iconShadowImageOffset", js.undefined)
    
    @scala.inline
    def setIconShadowImageSizeVarargs(value: Double*): Self = this.set("iconShadowImageSize", js.Array(value :_*))
    
    @scala.inline
    def setIconShadowImageSize(value: js.Array[Double]): Self = this.set("iconShadowImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconShadowImageSize: Self = this.set("iconShadowImageSize", js.undefined)
    
    @scala.inline
    def setIconShadowLayout(value: String | IClassConstructor[ILayout]): Self = this.set("iconShadowLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconShadowLayout: Self = this.set("iconShadowLayout", js.undefined)
    
    @scala.inline
    def setIconShadowOffsetVarargs(value: Double*): Self = this.set("iconShadowOffset", js.Array(value :_*))
    
    @scala.inline
    def setIconShadowOffset(value: js.Array[Double]): Self = this.set("iconShadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconShadowOffset: Self = this.set("iconShadowOffset", js.undefined)
    
    @scala.inline
    def setLineStringOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = this.set("lineStringOverlay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLineStringOverlay(value: OverlayKey): Self = this.set("lineStringOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStringOverlay: Self = this.set("lineStringOverlay", js.undefined)
    
    @scala.inline
    def setPointOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = this.set("pointOverlay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPointOverlay(value: OverlayKey): Self = this.set("pointOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointOverlay: Self = this.set("pointOverlay", js.undefined)
    
    @scala.inline
    def setPolygonOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = this.set("polygonOverlay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPolygonOverlay(value: OverlayKey): Self = this.set("polygonOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOverlay: Self = this.set("polygonOverlay", js.undefined)
    
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setRectangleOverlayFunction3(
      value: (/* geometry */ IPixelLineStringGeometry, /* data */ IDataManager | js.Object, /* options */ js.Object) => js.Promise[String | IClassConstructor[IOverlay]]
    ): Self = this.set("rectangleOverlay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRectangleOverlay(value: OverlayKey): Self = this.set("rectangleOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangleOverlay: Self = this.set("rectangleOverlay", js.undefined)
    
    @scala.inline
    def setSetMapCursorInDragging(value: Boolean): Self = this.set("setMapCursorInDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetMapCursorInDragging: Self = this.set("setMapCursorInDragging", js.undefined)
  }
}
