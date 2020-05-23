package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the texture resource used in a 2D texture material. */
trait Printing3DTextureResource extends js.Object {
  /** Gets or sets the name of the texture resource. */
  var name: String
  /** Gets or sets the image stream of the texture resource. */
  var textureData: IRandomAccessStreamWithContentType
}

object Printing3DTextureResource {
  @scala.inline
  def apply(name: String, textureData: IRandomAccessStreamWithContentType): Printing3DTextureResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], textureData = textureData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTextureResource]
  }
}

