package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
trait Printing3DComponent extends js.Object {
  /** Gets the other components contained within the component. */
  var components: IVector[Printing3DComponentWithMatrix]
  /** Gets or sets the 3D mesh of the component. */
  var mesh: Printing3DMesh
  /** Gets or sets the name of the 3D Manufacturing Format (3MF) component. */
  var name: String
  /** Gets or sets the part number of the 3D Manufacturing Format (3MF) component. */
  var partNumber: String
  /** Gets or sets the thumbnail image of the 3D Manufacturing Format (3MF) component. */
  var thumbnail: Printing3DTextureResource
  /** Gets or sets the type of the 3D Manufacturing Format (3MF) component. */
  var `type`: Printing3DObjectType
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
}

