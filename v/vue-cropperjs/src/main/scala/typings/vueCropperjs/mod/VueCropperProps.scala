package typings.vueCropperjs.mod

import typings.std.Record
import typings.vueCropperjs.anon.Default
import typings.vueCropperjs.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueCropperProps extends js.Object {
  var alt: String
  var aspectRatio: Double
  var autoCrop: Type
  var autoCropArea: Double
  var background: Type
  var center: Type
  var checkCrossOrigin: Type
  var checkOrientation: Type
  var containerStyle: Record[String, _]
  var cropBoxMovable: Type
  var cropBoxResizable: Type
  var data: Record[String, _]
  var dragMode: String
  var guides: Type
  var highlight: Type
  var imgStyle: Record[String, _]
  var initialAspectRatio: Double
  var minCanvasHeight: Double
  var minCanvasWidth: Double
  var minContainerHeight: Double
  var minContainerWidth: Double
  var minCropBoxHeight: Double
  var minCropBoxWidth: Double
  var modal: Type
  var movable: Type
  var preview: previewPropType
  var responsive: Type
  var restore: Type
  var rotatable: Type
  var scalable: Type
  var src: Default
  var toggleDragModeOnDblclick: Type
  var viewMode: Double
  var wheelZoomRatio: Double
  var zoomOnTouch: Type
  var zoomOnWheel: Type
  var zoomable: Type
  def crop(): Unit
  def cropend(): Unit
  def cropmove(): Unit
  def cropstart(): Unit
  def ready(): Unit
  def zoom(): Unit
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
}

