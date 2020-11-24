package typings.three.anon

import typings.three.fontMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BevelEnabled extends js.Object {
  
  /**
  		 * @default false
  		 */
  var bevelEnabled: Boolean = js.native
  
  var bevelOffset: Double = js.native
  
  var bevelSegments: Double = js.native
  
  /**
  		 * @default 8
  		 */
  var bevelSize: Double = js.native
  
  /**
  		 * @default 10
  		 */
  var bevelThickness: Double = js.native
  
  var curveSegments: Double = js.native
  
  var font: Font = js.native
  
  /**
  		 * @default 50
  		 */
  var height: Double = js.native
  
  var size: Double = js.native
}
object BevelEnabled {
  
  @scala.inline
  def apply(
    bevelEnabled: Boolean,
    bevelOffset: Double,
    bevelSegments: Double,
    bevelSize: Double,
    bevelThickness: Double,
    curveSegments: Double,
    font: Font,
    height: Double,
    size: Double
  ): BevelEnabled = {
    val __obj = js.Dynamic.literal(bevelEnabled = bevelEnabled.asInstanceOf[js.Any], bevelOffset = bevelOffset.asInstanceOf[js.Any], bevelSegments = bevelSegments.asInstanceOf[js.Any], bevelSize = bevelSize.asInstanceOf[js.Any], bevelThickness = bevelThickness.asInstanceOf[js.Any], curveSegments = curveSegments.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BevelEnabled]
  }
  
  @scala.inline
  implicit class BevelEnabledOps[Self <: BevelEnabled] (val x: Self) extends AnyVal {
    
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
    def setBevelEnabled(value: Boolean): Self = this.set("bevelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelOffset(value: Double): Self = this.set("bevelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelSegments(value: Double): Self = this.set("bevelSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelSize(value: Double): Self = this.set("bevelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelThickness(value: Double): Self = this.set("bevelThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveSegments(value: Double): Self = this.set("curveSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
