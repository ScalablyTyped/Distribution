package typings.vis.mod

import typings.vis.anon.BorderDashes
import typings.vis.anon.Bottom
import typings.vis.anon.Code
import typings.vis.anon.Maximum
import typings.vis.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeOptions extends js.Object {
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var borderWidthSelected: js.UndefOr[Double] = js.native
  
  var brokenImage: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String | Color] = js.native
  
  var fixed: js.UndefOr[Boolean | X] = js.native
  
  var font: js.UndefOr[String | Font] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[Code] = js.native
  
  var image: js.UndefOr[String | Image] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelHighlightBold: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Bottom] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var physics: js.UndefOr[Boolean] = js.native
  
  var scaling: js.UndefOr[OptionsScaling] = js.native
  
  var shadow: js.UndefOr[Boolean | OptionsShadow] = js.native
  
  var shape: js.UndefOr[String] = js.native
  
  var shapeProperties: js.UndefOr[BorderDashes] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  /**
    * If false, no widthConstraint is applied. If a number is specified, the minimum and maximum widths of the node are set to the value.
    * The node's label's lines will be broken on spaces to stay below the maximum and the node's width
    * will be set to the minimum if less than the value.
    */
  var widthConstraint: js.UndefOr[Double | Boolean | Maximum] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object NodeOptions {
  
  @scala.inline
  def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions] (val x: Self) extends AnyVal {
    
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
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBorderWidthSelected(value: Double): Self = this.set("borderWidthSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidthSelected: Self = this.set("borderWidthSelected", js.undefined)
    
    @scala.inline
    def setBrokenImage(value: String): Self = this.set("brokenImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokenImage: Self = this.set("brokenImage", js.undefined)
    
    @scala.inline
    def setColor(value: String | Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean | X): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setFont(value: String | Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIcon(value: Code): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setImage(value: String | Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelHighlightBold(value: Boolean): Self = this.set("labelHighlightBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHighlightBold: Self = this.set("labelHighlightBold", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    
    @scala.inline
    def setPhysics(value: Boolean): Self = this.set("physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysics: Self = this.set("physics", js.undefined)
    
    @scala.inline
    def setScaling(value: OptionsScaling): Self = this.set("scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | OptionsShadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setShapeProperties(value: BorderDashes): Self = this.set("shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeProperties: Self = this.set("shapeProperties", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidthConstraint(value: Double | Boolean | Maximum): Self = this.set("widthConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthConstraint: Self = this.set("widthConstraint", js.undefined)
    
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
