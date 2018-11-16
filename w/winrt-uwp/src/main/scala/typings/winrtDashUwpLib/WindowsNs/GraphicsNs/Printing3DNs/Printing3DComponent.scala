package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DComponent")
@js.native
class Printing3DComponent () extends js.Object {
  /** Gets the other components contained within the component. */
  var components: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DComponentWithMatrix] = js.native
  /** Gets or sets the 3D mesh of the component. */
  var mesh: Printing3DMesh = js.native
  /** Gets or sets the name of the 3D Manufacturing Format (3MF) component. */
  var name: java.lang.String = js.native
  /** Gets or sets the part number of the 3D Manufacturing Format (3MF) component. */
  var partNumber: java.lang.String = js.native
  /** Gets or sets the thumbnail image of the 3D Manufacturing Format (3MF) component. */
  var thumbnail: Printing3DTextureResource = js.native
  /** Gets or sets the type of the 3D Manufacturing Format (3MF) component. */
  var `type`: Printing3DObjectType = js.native
}

