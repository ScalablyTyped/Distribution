package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
@js.native
trait Printing3DComponent extends js.Object {
  
  /** Gets the other components contained within the component. */
  var components: IVector[Printing3DComponentWithMatrix] = js.native
  
  /** Gets or sets the 3D mesh of the component. */
  var mesh: Printing3DMesh = js.native
  
  /** Gets or sets the name of the 3D Manufacturing Format (3MF) component. */
  var name: String = js.native
  
  /** Gets or sets the part number of the 3D Manufacturing Format (3MF) component. */
  var partNumber: String = js.native
  
  /** Gets or sets the thumbnail image of the 3D Manufacturing Format (3MF) component. */
  var thumbnail: Printing3DTextureResource = js.native
  
  /** Gets or sets the type of the 3D Manufacturing Format (3MF) component. */
  var `type`: Printing3DObjectType = js.native
}
object Printing3DComponent {
  
  @scala.inline
  def apply(
    components: IVector[Printing3DComponentWithMatrix],
    mesh: Printing3DMesh,
    name: String,
    partNumber: String,
    thumbnail: Printing3DTextureResource,
    `type`: Printing3DObjectType
  ): Printing3DComponent = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DComponent]
  }
  
  @scala.inline
  implicit class Printing3DComponentOps[Self <: Printing3DComponent] (val x: Self) extends AnyVal {
    
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
    def setComponents(value: IVector[Printing3DComponentWithMatrix]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: Printing3DMesh): Self = this.set("mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumber(value: String): Self = this.set("partNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Printing3DTextureResource): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Printing3DObjectType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
