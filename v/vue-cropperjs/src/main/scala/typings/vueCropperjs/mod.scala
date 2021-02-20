package typings.vueCropperjs

import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.NodeList
import typings.std.Record
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueCropperjs.anon.Default
import typings.vueCropperjs.anon.Type
import typings.vueCropperjs.vueCropperjsStrings.high
import typings.vueCropperjs.vueCropperjsStrings.low
import typings.vueCropperjs.vueCropperjsStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-cropperjs", JSImport.Default)
  @js.native
  val default: VueCropperJsConstructor = js.native
  
  @JSImport("vue-cropperjs", "VueCropperJs")
  @js.native
  val VueCropperJs: VueCropperJsConstructor = js.native
  
  @js.native
  trait CanvasData extends StObject {
    
    /**
      * the height of the canvas
      */
    var height: Double = js.native
    
    /**
      * the offset left of the canvas
      */
    var left: Double = js.native
    
    /**
      * the natural height of the canvas (read only)
      */
    var naturalHeight: Double = js.native
    
    /**
      * the natural width of the canvas (read only)
      */
    var naturalWidth: Double = js.native
    
    /**
      * the offset top of the canvas
      */
    var top: Double = js.native
    
    /**
      * the width of the canvas
      */
    var width: Double = js.native
  }
  object CanvasData {
    
    @scala.inline
    def apply(
      height: Double,
      left: Double,
      naturalHeight: Double,
      naturalWidth: Double,
      top: Double,
      width: Double
    ): CanvasData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasData]
    }
    
    @scala.inline
    implicit class CanvasDataMutableBuilder[Self <: CanvasData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContainerData extends StObject {
    
    /**
      * the current height of the container
      */
    var height: Double = js.native
    
    /**
      * the current width of the container
      */
    var width: Double = js.native
  }
  object ContainerData {
    
    @scala.inline
    def apply(height: Double, width: Double): ContainerData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerData]
    }
    
    @scala.inline
    implicit class ContainerDataMutableBuilder[Self <: ContainerData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropBoxData extends StObject {
    
    /**
      * the height of the crop box
      */
    var height: Double = js.native
    
    /**
      * the offset left of the crop box
      */
    var left: Double = js.native
    
    /**
      * the offset top of the crop box
      */
    var top: Double = js.native
    
    /**
      * the width of the crop box
      */
    var width: Double = js.native
  }
  object CropBoxData {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): CropBoxData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropBoxData]
    }
    
    @scala.inline
    implicit class CropBoxDataMutableBuilder[Self <: CropBoxData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CroppedCanvasOptions extends StObject {
    
    /**
      * a color to fill any alpha values in the output canvas, the default value is transparent.
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /**
      *  the destination height of the output canvas.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * set to change if images are smoothed (true, default) or not (false).
      */
    var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * set the quality of image smoothing, one of "low" (default), "medium", or "high".
      */
    var imageSmoothingQuality: js.UndefOr[low | medium | high] = js.native
    
    /**
      * the maximum destination height of the output canvas, the default value is Infinity.
      */
    var maxHeight: js.UndefOr[Double] = js.native
    
    /**
      * the maximum destination width of the output canvas, the default value is Infinity.
      */
    var maxWidth: js.UndefOr[Double] = js.native
    
    /**
      * the minimum destination height of the output canvas, the default value is 0.
      */
    var minHeight: js.UndefOr[Double] = js.native
    
    /**
      * the minimum destination width of the output canvas, the default value is 0.
      */
    var minWidth: js.UndefOr[Double] = js.native
    
    /**
      * the destination width of the output canvas.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CroppedCanvasOptions {
    
    @scala.inline
    def apply(): CroppedCanvasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CroppedCanvasOptions]
    }
    
    @scala.inline
    implicit class CroppedCanvasOptionsMutableBuilder[Self <: CroppedCanvasOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
      
      @scala.inline
      def setImageSmoothingQuality(value: low | medium | high): Self = StObject.set(x, "imageSmoothingQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingQualityUndefined: Self = StObject.set(x, "imageSmoothingQuality", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CropperData extends StObject {
    
    /**
      * the height of the cropped area
      */
    var height: Double = js.native
    
    /**
      * the rotated degrees of the image
      */
    var rotate: Double = js.native
    
    /**
      * the scaling factor to apply on the abscissa of the image
      */
    var scaleX: Double = js.native
    
    /**
      * the scaling factor to apply on the ordinate of the image
      */
    var scaleY: Double = js.native
    
    /**
      * the width of the cropped area
      */
    var width: Double = js.native
    
    /**
      * the offset left of the cropped area
      */
    var x: Double = js.native
    
    /**
      * the offset top of the cropped area
      */
    var y: Double = js.native
  }
  object CropperData {
    
    @scala.inline
    def apply(
      height: Double,
      rotate: Double,
      scaleX: Double,
      scaleY: Double,
      width: Double,
      x: Double,
      y: Double
    ): CropperData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropperData]
    }
    
    @scala.inline
    implicit class CropperDataMutableBuilder[Self <: CropperData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueCropperjs.vueCropperjsStrings.none
    - typings.vueCropperjs.vueCropperjsStrings.crop
    - typings.vueCropperjs.vueCropperjsStrings.move
  */
  trait DragMode extends StObject
  object DragMode {
    
    @scala.inline
    def crop: typings.vueCropperjs.vueCropperjsStrings.crop = "crop".asInstanceOf[typings.vueCropperjs.vueCropperjsStrings.crop]
    
    @scala.inline
    def move: typings.vueCropperjs.vueCropperjsStrings.move = "move".asInstanceOf[typings.vueCropperjs.vueCropperjsStrings.move]
    
    @scala.inline
    def none: typings.vueCropperjs.vueCropperjsStrings.none = "none".asInstanceOf[typings.vueCropperjs.vueCropperjsStrings.none]
  }
  
  @js.native
  trait ImageData extends StObject {
    
    /**
      * the aspect ratio of the image
      */
    var aspectRatio: Double = js.native
    
    /**
      * the height of the image
      */
    var height: Double = js.native
    
    /**
      * the offset left of the image
      */
    var left: Double = js.native
    
    /**
      * the natural height of the image
      */
    var naturalHeight: Double = js.native
    
    /**
      * the natural width of the image
      */
    var naturalWidth: Double = js.native
    
    /**
      * the rotated degrees of the image if rotated
      */
    var rotate: Double = js.native
    
    /**
      * the scaling factor to apply on the abscissa of the image if scaled
      */
    var scaleX: Double = js.native
    
    /**
      * the scaling factor to apply on the ordinate of the image if scaled
      */
    var scaleY: Double = js.native
    
    /**
      * the offset top of the image
      */
    var top: Double = js.native
    
    /**
      * the width of the image
      */
    var width: Double = js.native
  }
  object ImageData {
    
    @scala.inline
    def apply(
      aspectRatio: Double,
      height: Double,
      left: Double,
      naturalHeight: Double,
      naturalWidth: Double,
      rotate: Double,
      scaleX: Double,
      scaleY: Double,
      top: Double,
      width: Double
    ): ImageData = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageData]
    }
    
    @scala.inline
    implicit class ImageDataMutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VueCropperJsConstructor extends VueConstructor[Vue] {
    
    def data(): Unit = js.native
    
    var methods: VueCropperMethods = js.native
    
    var props: VueCropperProps = js.native
  }
  
  @js.native
  trait VueCropperMethods extends StObject {
    
    /**
      * Clear image from the cropper
      */
    def clear(): Unit = js.native
    
    /**
      * Destroy the cropper and remove the instance from the image.
      */
    def destroy(): Unit = js.native
    
    /**
      * Disable (freeze) the cropper.
      */
    def disable(): Unit = js.native
    
    /**
      * Enable (unfreeze) the cropper.
      */
    def enable(): Unit = js.native
    
    /**
      * Output the canvas (image wrapper) position and size data.
      */
    def getCanvasData(): CanvasData = js.native
    
    /**
      * Output the container size data.
      */
    def getContainerData(): ContainerData = js.native
    
    /**
      * Output the crop box position and size data.
      */
    def getCropBoxData(): CropBoxData = js.native
    
    /**
      * Get a canvas drawn the cropped image (lossy compression). If it is not cropped, then returns a canvas drawn the whole image.
      * Avoid to get a blank (or black) output image, you might need to set the maxWidth and maxHeight properties to limited numbers, because of the size limits of a canvas element.
      * Also, you should limit them maximum zoom ratio (in the zoom event) as the same reason.
      * @param options
      */
    def getCroppedCanvas(): HTMLCanvasElement = js.native
    def getCroppedCanvas(options: CroppedCanvasOptions): HTMLCanvasElement = js.native
    
    /**
      * Output the final cropped area position and size data (base on the natural size of the original image).
      */
    def getData(): CropperData = js.native
    def getData(rounded: Boolean): CropperData = js.native
    
    /**
      * Output the image position, size, and other related data.
      */
    def getImageData(): ImageData = js.native
    
    /**
      * Initialize the cropper
      */
    def initCrop(): Unit = js.native
    
    /**
      * Move the canvas (image wrapper) with relative offsets.
      * @param offsetX Moving size (px) in the horizontal direction.
      * @param offsetY Moving size (px) in the vertical direction. If not present, its default value is offsetX.
      */
    def move(offsetX: Double): Unit = js.native
    def move(offsetX: Double, offsetY: Double): Unit = js.native
    
    /**
      * Move the canvas (image wrapper) to an absolute point.
      * @param x The left value of the canvas
      * @param y The top value of the canvas. If not present, its default value is x.
      */
    def moveTo(x: Double): Unit = js.native
    def moveTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Zoom the canvas (image wrapper) with a relative ratio.
      * @param ratio Zoom in: requires a positive number (ratio > 0) Zoom out: requires a negative number (ratio < 0)
      * @param _originalEvent
      */
    def relativeZoom(ratio: Double): Unit = js.native
    def relativeZoom(ratio: Double, _originalEvent: Event): Unit = js.native
    
    /**
      * Replace the image's src and rebuild the cropper.
      * @param url A new image url.
      * @param hasSameSize Default false If the new image has the same size as the old one,
      * then it will not rebuild the cropper and only update the URLs of all related images. This can be used for applying filters.
      */
    def replace(url: String): Unit = js.native
    def replace(url: String, hasSameSize: Boolean): Unit = js.native
    
    /**
      * Reset cropper to original state
      */
    def reset(): Unit = js.native
    
    /**
      * Rotate the image with a relative degree.
      * @param degree Rotate right: requires a positive number (degree > 0) Rotate left: requires a negative number (degree < 0)
      */
    def rotate(degree: Double): Unit = js.native
    
    /**
      * Rotate the image to an absolute degree.
      * @param degree Amount to rotate image
      */
    def rotateTo(degree: Double): Unit = js.native
    
    /**
      * Scale the image.
      * Requires CSS3 2D Transforms support (IE 9+).
      * @param scaleX The scaling factor to apply to the abscissa of the image. When equal to 1 it does nothing
      * @param scaleY The scaling factor to apply to the ordinate of the image. When equal to 1 it does nothing
      */
    def scale(scaleX: Double): Unit = js.native
    def scale(scaleX: Double, scaleY: Double): Unit = js.native
    
    /**
      * @param _scaleX The scaling factor to apply to the abscissa of the image. When equal to 1 it does nothing
      */
    def scaleX(_scaleX: Double): Unit = js.native
    
    /**
      * @param _scaleY The scaling factor to apply to the ordinate of the image. When equal to 1 it does nothing
      */
    def scaleY(_scaleY: Double): Unit = js.native
    
    /**
      * Change the aspect ratio of the crop box.
      * @param aspectRatio
      */
    def setAspectRatio(aspectRatio: Double): Unit = js.native
    
    /**
      * Change the canvas (image wrapper) position and size with new data.
      * @param data Canvas Data to be set
      */
    def setCanvasData(data: CanvasData): Unit = js.native
    
    /**
      * Change the crop box position and size with new data.
      * @param data Crop Box Data
      */
    def setCropBoxData(data: CropBoxData): Unit = js.native
    
    /**
      * Change the cropped area position and size with new data (base on the original image).
      * Note: This method only available when the value of the viewMode option is greater than or equal to 1.
      * @param data The cropper data to set with. You may need to round the data properties before passing them in.
      */
    def setData(data: CropperData): Unit = js.native
    
    /**
      * Change the drag mode.
      * Tips: You can toggle the "crop" and "move" mode by double click on the cropper.
      * @param mode
      */
    def setDragMode(mode: DragMode): Unit = js.native
    
    /**
      * Zoom the canvas (image wrapper) to an absolute ratio.
      * @param ratio Requires a positive number (ratio > 0)
      * @param _originalEvent
      */
    def zoomTo(ratio: Double): Unit = js.native
    def zoomTo(ratio: Double, _originalEvent: Event): Unit = js.native
  }
  
  @js.native
  trait VueCropperProps extends StObject {
    
    var alt: String = js.native
    
    var aspectRatio: Double = js.native
    
    var autoCrop: Type = js.native
    
    var autoCropArea: Double = js.native
    
    var background: Type = js.native
    
    var center: Type = js.native
    
    var checkCrossOrigin: Type = js.native
    
    var checkOrientation: Type = js.native
    
    var containerStyle: Record[String, _] = js.native
    
    def crop(): Unit = js.native
    
    var cropBoxMovable: Type = js.native
    
    var cropBoxResizable: Type = js.native
    
    def cropend(): Unit = js.native
    
    def cropmove(): Unit = js.native
    
    def cropstart(): Unit = js.native
    
    var data: Record[String, _] = js.native
    
    var dragMode: String = js.native
    
    var guides: Type = js.native
    
    var highlight: Type = js.native
    
    var imgStyle: Record[String, _] = js.native
    
    var initialAspectRatio: Double = js.native
    
    var minCanvasHeight: Double = js.native
    
    var minCanvasWidth: Double = js.native
    
    var minContainerHeight: Double = js.native
    
    var minContainerWidth: Double = js.native
    
    var minCropBoxHeight: Double = js.native
    
    var minCropBoxWidth: Double = js.native
    
    var modal: Type = js.native
    
    var movable: Type = js.native
    
    var preview: previewPropType = js.native
    
    def ready(): Unit = js.native
    
    var responsive: Type = js.native
    
    var restore: Type = js.native
    
    var rotatable: Type = js.native
    
    var scalable: Type = js.native
    
    var src: Default = js.native
    
    var toggleDragModeOnDblclick: Type = js.native
    
    var viewMode: Double = js.native
    
    var wheelZoomRatio: Double = js.native
    
    def zoom(): Unit = js.native
    
    var zoomOnTouch: Type = js.native
    
    var zoomOnWheel: Type = js.native
    
    var zoomable: Type = js.native
  }
  object VueCropperProps {
    
    @scala.inline
    def apply(
      alt: String,
      aspectRatio: Double,
      autoCrop: Type,
      autoCropArea: Double,
      background: Type,
      center: Type,
      checkCrossOrigin: Type,
      checkOrientation: Type,
      containerStyle: Record[String, _],
      crop: () => Unit,
      cropBoxMovable: Type,
      cropBoxResizable: Type,
      cropend: () => Unit,
      cropmove: () => Unit,
      cropstart: () => Unit,
      data: Record[String, _],
      dragMode: String,
      guides: Type,
      highlight: Type,
      imgStyle: Record[String, _],
      initialAspectRatio: Double,
      minCanvasHeight: Double,
      minCanvasWidth: Double,
      minContainerHeight: Double,
      minContainerWidth: Double,
      minCropBoxHeight: Double,
      minCropBoxWidth: Double,
      modal: Type,
      movable: Type,
      preview: previewPropType,
      ready: () => Unit,
      responsive: Type,
      restore: Type,
      rotatable: Type,
      scalable: Type,
      src: Default,
      toggleDragModeOnDblclick: Type,
      viewMode: Double,
      wheelZoomRatio: Double,
      zoom: () => Unit,
      zoomOnTouch: Type,
      zoomOnWheel: Type,
      zoomable: Type
    ): VueCropperProps = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], aspectRatio = aspectRatio.asInstanceOf[js.Any], autoCrop = autoCrop.asInstanceOf[js.Any], autoCropArea = autoCropArea.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], checkCrossOrigin = checkCrossOrigin.asInstanceOf[js.Any], checkOrientation = checkOrientation.asInstanceOf[js.Any], containerStyle = containerStyle.asInstanceOf[js.Any], crop = js.Any.fromFunction0(crop), cropBoxMovable = cropBoxMovable.asInstanceOf[js.Any], cropBoxResizable = cropBoxResizable.asInstanceOf[js.Any], cropend = js.Any.fromFunction0(cropend), cropmove = js.Any.fromFunction0(cropmove), cropstart = js.Any.fromFunction0(cropstart), data = data.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], imgStyle = imgStyle.asInstanceOf[js.Any], initialAspectRatio = initialAspectRatio.asInstanceOf[js.Any], minCanvasHeight = minCanvasHeight.asInstanceOf[js.Any], minCanvasWidth = minCanvasWidth.asInstanceOf[js.Any], minContainerHeight = minContainerHeight.asInstanceOf[js.Any], minContainerWidth = minContainerWidth.asInstanceOf[js.Any], minCropBoxHeight = minCropBoxHeight.asInstanceOf[js.Any], minCropBoxWidth = minCropBoxWidth.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], movable = movable.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready), responsive = responsive.asInstanceOf[js.Any], restore = restore.asInstanceOf[js.Any], rotatable = rotatable.asInstanceOf[js.Any], scalable = scalable.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], toggleDragModeOnDblclick = toggleDragModeOnDblclick.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], wheelZoomRatio = wheelZoomRatio.asInstanceOf[js.Any], zoom = js.Any.fromFunction0(zoom), zoomOnTouch = zoomOnTouch.asInstanceOf[js.Any], zoomOnWheel = zoomOnWheel.asInstanceOf[js.Any], zoomable = zoomable.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueCropperProps]
    }
    
    @scala.inline
    implicit class VueCropperPropsMutableBuilder[Self <: VueCropperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCrop(value: Type): Self = StObject.set(x, "autoCrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCropArea(value: Double): Self = StObject.set(x, "autoCropArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackground(value: Type): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter(value: Type): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCrossOrigin(value: Type): Self = StObject.set(x, "checkCrossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckOrientation(value: Type): Self = StObject.set(x, "checkOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyle(value: Record[String, _]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrop(value: () => Unit): Self = StObject.set(x, "crop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCropBoxMovable(value: Type): Self = StObject.set(x, "cropBoxMovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropBoxResizable(value: Type): Self = StObject.set(x, "cropBoxResizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropend(value: () => Unit): Self = StObject.set(x, "cropend", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCropmove(value: () => Unit): Self = StObject.set(x, "cropmove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCropstart(value: () => Unit): Self = StObject.set(x, "cropstart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragMode(value: String): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuides(value: Type): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight(value: Type): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgStyle(value: Record[String, _]): Self = StObject.set(x, "imgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialAspectRatio(value: Double): Self = StObject.set(x, "initialAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCanvasHeight(value: Double): Self = StObject.set(x, "minCanvasHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCanvasWidth(value: Double): Self = StObject.set(x, "minCanvasWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinContainerHeight(value: Double): Self = StObject.set(x, "minContainerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinContainerWidth(value: Double): Self = StObject.set(x, "minContainerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCropBoxHeight(value: Double): Self = StObject.set(x, "minCropBoxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCropBoxWidth(value: Double): Self = StObject.set(x, "minCropBoxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: Type): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovable(value: Type): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: previewPropType): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewVarargs(value: String*): Self = StObject.set(x, "preview", js.Array(value :_*))
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResponsive(value: Type): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestore(value: Type): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotatable(value: Type): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalable(value: Type): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: Default): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleDragModeOnDblclick(value: Type): Self = StObject.set(x, "toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(value: Double): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelZoomRatio(value: Double): Self = StObject.set(x, "wheelZoomRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: () => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomOnTouch(value: Type): Self = StObject.set(x, "zoomOnTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOnWheel(value: Type): Self = StObject.set(x, "zoomOnWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomable(value: Type): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = VueCropperJsConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueCropperJsConstructor = default
  
  type previewPropType = String | js.Array[String] | Element | NodeList
}
