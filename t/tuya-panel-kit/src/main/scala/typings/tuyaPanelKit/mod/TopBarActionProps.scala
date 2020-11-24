package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import typings.tuyaPanelKit.tuyaPanelKitStrings.bevel
import typings.tuyaPanelKit.tuyaPanelKitStrings.butt
import typings.tuyaPanelKit.tuyaPanelKitStrings.miter
import typings.tuyaPanelKit.tuyaPanelKitStrings.round
import typings.tuyaPanelKit.tuyaPanelKitStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tuyaPanelKit.mod.IconFontProps because var conflicts: color, style. Inlined viewBox, useART, ascent, descent, unitsPerEm, x, y, scaleX, scaleY, scale, spaceOffset, size, hFlip, vFlip, name, width, height, fill, stroke, strokeWidth, strokeJoin, strokeCap, strokeDash, d, opacity */ @js.native
trait TopBarActionProps extends TopBarProps {
  
  var ascent: js.UndefOr[Double] = js.native
  
  var d: js.UndefOr[String] = js.native
  
  var descent: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var hFlip: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[String | Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var scaleX: js.UndefOr[Double] = js.native
  
  var scaleY: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[ImageSourcePropType] = js.native
  
  var spaceOffset: js.UndefOr[Double] = js.native
  
  var spacing: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeCap: js.UndefOr[round | butt | square] = js.native
  
  var strokeDash: js.UndefOr[js.Array[Double]] = js.native
  
  var strokeJoin: js.UndefOr[round | miter | bevel] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
  
  var unitsPerEm: js.UndefOr[Double] = js.native
  
  var useART: js.UndefOr[`true`] = js.native
  
  var vFlip: js.UndefOr[Boolean] = js.native
  
  var viewBox: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object TopBarActionProps {
  
  @scala.inline
  def apply(): TopBarActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarActionProps]
  }
  
  @scala.inline
  implicit class TopBarActionPropsOps[Self <: TopBarActionProps] (val x: Self) extends AnyVal {
    
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
    def setAscent(value: Double): Self = this.set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscent: Self = this.set("ascent", js.undefined)
    
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setDescent(value: Double): Self = this.set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescent: Self = this.set("descent", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setHFlip(value: Boolean): Self = this.set("hFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHFlip: Self = this.set("hFlip", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: ImageURISource*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSpaceOffset(value: Double): Self = this.set("spaceOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceOffset: Self = this.set("spaceOffset", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeCap(value: round | butt | square): Self = this.set("strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeCap: Self = this.set("strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = this.set("strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDash(value: js.Array[Double]): Self = this.set("strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDash: Self = this.set("strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeJoin(value: round | miter | bevel): Self = this.set("strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeJoin: Self = this.set("strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setUnitsPerEm(value: Double): Self = this.set("unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitsPerEm: Self = this.set("unitsPerEm", js.undefined)
    
    @scala.inline
    def setUseART(value: `true`): Self = this.set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseART: Self = this.set("useART", js.undefined)
    
    @scala.inline
    def setVFlip(value: Boolean): Self = this.set("vFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVFlip: Self = this.set("vFlip", js.undefined)
    
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
