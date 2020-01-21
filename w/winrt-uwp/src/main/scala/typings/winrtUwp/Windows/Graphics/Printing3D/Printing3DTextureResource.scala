package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the texture resource used in a 2D texture material. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DTextureResource")
@js.native
/** Creates an instance of the Printing3DTextureResource class. */
class Printing3DTextureResource () extends js.Object {
  /** Gets or sets the name of the texture resource. */
  var name: String = js.native
  /** Gets or sets the image stream of the texture resource. */
  var textureData: IRandomAccessStreamWithContentType = js.native
}

