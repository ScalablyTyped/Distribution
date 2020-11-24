package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 2D texture material used in the 3D model. */
@js.native
trait Printing3DTexture2CoordMaterial extends js.Object {
  
  /** Gets or sets the texture used in the 2D texture material. */
  var texture: Printing3DModelTexture = js.native
  
  /** Gets or sets the U-coordinate within the texture, horizontally right from the origin in the upper left of the texture. */
  var u: Double = js.native
  
  /** Gets or sets the V-coordinate within the texture, vertically down from the origin in the upper left of the texture. */
  var v: Double = js.native
}
object Printing3DTexture2CoordMaterial {
  
  @scala.inline
  def apply(texture: Printing3DModelTexture, u: Double, v: Double): Printing3DTexture2CoordMaterial = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTexture2CoordMaterial]
  }
  
  @scala.inline
  implicit class Printing3DTexture2CoordMaterialOps[Self <: Printing3DTexture2CoordMaterial] (val x: Self) extends AnyVal {
    
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
    def setTexture(value: Printing3DModelTexture): Self = this.set("texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: Double): Self = this.set("u", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
