package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WEBGLCompressedTextureEtc1 extends js.Object {
  
  val COMPRESSED_RGB_ETC1_WEBGL: Double = js.native
}
object WEBGLCompressedTextureEtc1 {
  
  @scala.inline
  def apply(COMPRESSED_RGB_ETC1_WEBGL: Double): WEBGLCompressedTextureEtc1 = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGB_ETC1_WEBGL = COMPRESSED_RGB_ETC1_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureEtc1]
  }
  
  @scala.inline
  implicit class WEBGLCompressedTextureEtc1Ops[Self <: WEBGLCompressedTextureEtc1] (val x: Self) extends AnyVal {
    
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
    def setCOMPRESSED_RGB_ETC1_WEBGL(value: Double): Self = this.set("COMPRESSED_RGB_ETC1_WEBGL", value.asInstanceOf[js.Any])
  }
}
