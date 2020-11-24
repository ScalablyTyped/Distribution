package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph2dDataAxisOption extends js.Object {
  
  var alignZeros: js.UndefOr[Boolean] = js.native
  
  var iconWidth: js.UndefOr[Double] = js.native
  
  var icons: js.UndefOr[Boolean] = js.native
  
  var labelOffsetX: js.UndefOr[Double] = js.native
  
  var labelOffsetY: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[DataAxisSideOption] = js.native
  
  var majorLinesOffset: js.UndefOr[Double] = js.native
  
  var minorLinesOffset: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.native
  
  var right: js.UndefOr[DataAxisSideOption] = js.native
  
  var showMajorLabels: js.UndefOr[Boolean] = js.native
  
  var showMinorLabels: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object Graph2dDataAxisOption {
  
  @scala.inline
  def apply(): Graph2dDataAxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dDataAxisOption]
  }
  
  @scala.inline
  implicit class Graph2dDataAxisOptionOps[Self <: Graph2dDataAxisOption] (val x: Self) extends AnyVal {
    
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
    def setAlignZeros(value: Boolean): Self = this.set("alignZeros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignZeros: Self = this.set("alignZeros", js.undefined)
    
    @scala.inline
    def setIconWidth(value: Double): Self = this.set("iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconWidth: Self = this.set("iconWidth", js.undefined)
    
    @scala.inline
    def setIcons(value: Boolean): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setLabelOffsetX(value: Double): Self = this.set("labelOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOffsetX: Self = this.set("labelOffsetX", js.undefined)
    
    @scala.inline
    def setLabelOffsetY(value: Double): Self = this.set("labelOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOffsetY: Self = this.set("labelOffsetY", js.undefined)
    
    @scala.inline
    def setLeft(value: DataAxisSideOption): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMajorLinesOffset(value: Double): Self = this.set("majorLinesOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorLinesOffset: Self = this.set("majorLinesOffset", js.undefined)
    
    @scala.inline
    def setMinorLinesOffset(value: Double): Self = this.set("minorLinesOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorLinesOffset: Self = this.set("minorLinesOffset", js.undefined)
    
    @scala.inline
    def setOrientation(value: TimelineOptionsOrientationType): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setRight(value: DataAxisSideOption): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setShowMajorLabels(value: Boolean): Self = this.set("showMajorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMajorLabels: Self = this.set("showMajorLabels", js.undefined)
    
    @scala.inline
    def setShowMinorLabels(value: Boolean): Self = this.set("showMinorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinorLabels: Self = this.set("showMinorLabels", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
