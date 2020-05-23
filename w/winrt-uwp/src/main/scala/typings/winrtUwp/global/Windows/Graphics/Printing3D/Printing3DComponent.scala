package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DComponent")
@js.native
/** Creates an instance of the Printing3DComponent class. */
class Printing3DComponent ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent {
  /** Gets the other components contained within the component. */
  /* CompleteClass */
  override var components: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponentWithMatrix] = js.native
  /** Gets or sets the 3D mesh of the component. */
  /* CompleteClass */
  override var mesh: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMesh = js.native
  /** Gets or sets the name of the 3D Manufacturing Format (3MF) component. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets or sets the part number of the 3D Manufacturing Format (3MF) component. */
  /* CompleteClass */
  override var partNumber: String = js.native
  /** Gets or sets the thumbnail image of the 3D Manufacturing Format (3MF) component. */
  /* CompleteClass */
  override var thumbnail: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTextureResource = js.native
  /** Gets or sets the type of the 3D Manufacturing Format (3MF) component. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DObjectType = js.native
}

