package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the texture resource used in a 2D texture material. */
@js.native
trait Printing3DTextureResource extends js.Object {
  
  /** Gets or sets the name of the texture resource. */
  var name: String = js.native
  
  /** Gets or sets the image stream of the texture resource. */
  var textureData: IRandomAccessStreamWithContentType = js.native
}
object Printing3DTextureResource {
  
  @scala.inline
  def apply(name: String, textureData: IRandomAccessStreamWithContentType): Printing3DTextureResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], textureData = textureData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTextureResource]
  }
  
  @scala.inline
  implicit class Printing3DTextureResourceOps[Self <: Printing3DTextureResource] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureData(value: IRandomAccessStreamWithContentType): Self = this.set("textureData", value.asInstanceOf[js.Any])
  }
}
