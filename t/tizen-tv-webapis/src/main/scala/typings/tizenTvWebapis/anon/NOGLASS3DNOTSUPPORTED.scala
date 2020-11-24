package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NOGLASS3DNOTSUPPORTED extends js.Object {
  
  /**
    * Glasses-free 3D is not supported
    * @since 2.3
    */
  var NO_GLASS_3D_NOT_SUPPORTED: `0` = js.native
  
  /**
    * @descEng Glasses-free 3D is supported
    * @since 2.3
    */
  var NO_GLASS_3D_SUPPORTED: `1` = js.native
}
object NOGLASS3DNOTSUPPORTED {
  
  @scala.inline
  def apply(NO_GLASS_3D_NOT_SUPPORTED: `0`, NO_GLASS_3D_SUPPORTED: `1`): NOGLASS3DNOTSUPPORTED = {
    val __obj = js.Dynamic.literal(NO_GLASS_3D_NOT_SUPPORTED = NO_GLASS_3D_NOT_SUPPORTED.asInstanceOf[js.Any], NO_GLASS_3D_SUPPORTED = NO_GLASS_3D_SUPPORTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOGLASS3DNOTSUPPORTED]
  }
  
  @scala.inline
  implicit class NOGLASS3DNOTSUPPORTEDOps[Self <: NOGLASS3DNOTSUPPORTED] (val x: Self) extends AnyVal {
    
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
    def setNO_GLASS_3D_NOT_SUPPORTED(value: `0`): Self = this.set("NO_GLASS_3D_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_GLASS_3D_SUPPORTED(value: `1`): Self = this.set("NO_GLASS_3D_SUPPORTED", value.asInstanceOf[js.Any])
  }
}
