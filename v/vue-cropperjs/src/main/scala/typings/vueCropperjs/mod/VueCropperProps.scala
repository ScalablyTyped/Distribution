package typings.vueCropperjs.mod

import typings.std.Record
import typings.vueCropperjs.anon.Default
import typings.vueCropperjs.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueCropperProps extends js.Object {
  
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
  implicit class VueCropperPropsOps[Self <: VueCropperProps] (val x: Self) extends AnyVal {
    
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCrop(value: Type): Self = this.set("autoCrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCropArea(value: Double): Self = this.set("autoCropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: Type): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: Type): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckCrossOrigin(value: Type): Self = this.set("checkCrossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOrientation(value: Type): Self = this.set("checkOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyle(value: Record[String, _]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop(value: () => Unit): Self = this.set("crop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCropBoxMovable(value: Type): Self = this.set("cropBoxMovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropBoxResizable(value: Type): Self = this.set("cropBoxResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropend(value: () => Unit): Self = this.set("cropend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCropmove(value: () => Unit): Self = this.set("cropmove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCropstart(value: () => Unit): Self = this.set("cropstart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragMode(value: String): Self = this.set("dragMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuides(value: Type): Self = this.set("guides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: Type): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgStyle(value: Record[String, _]): Self = this.set("imgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialAspectRatio(value: Double): Self = this.set("initialAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCanvasHeight(value: Double): Self = this.set("minCanvasHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCanvasWidth(value: Double): Self = this.set("minCanvasWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinContainerHeight(value: Double): Self = this.set("minContainerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinContainerWidth(value: Double): Self = this.set("minContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCropBoxHeight(value: Double): Self = this.set("minCropBoxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCropBoxWidth(value: Double): Self = this.set("minCropBoxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModal(value: Type): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovable(value: Type): Self = this.set("movable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewVarargs(value: String*): Self = this.set("preview", js.Array(value :_*))
    
    @scala.inline
    def setPreview(value: previewPropType): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponsive(value: Type): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestore(value: Type): Self = this.set("restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatable(value: Type): Self = this.set("rotatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalable(value: Type): Self = this.set("scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: Default): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleDragModeOnDblclick(value: Type): Self = this.set("toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: Double): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelZoomRatio(value: Double): Self = this.set("wheelZoomRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: () => Unit): Self = this.set("zoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZoomOnTouch(value: Type): Self = this.set("zoomOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOnWheel(value: Type): Self = this.set("zoomOnWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomable(value: Type): Self = this.set("zoomable", value.asInstanceOf[js.Any])
  }
}
