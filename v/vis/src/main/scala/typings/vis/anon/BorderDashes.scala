package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderDashes extends js.Object {
  
  var borderDashes: js.UndefOr[Boolean | js.Array[Double]] = js.native
  
   // only for borders
  var borderRadius: js.UndefOr[Double] = js.native
  
       // only for box shape
  var interpolation: js.UndefOr[Boolean] = js.native
  
    // only for image and circularImage shapes
  var useBorderWithImage: js.UndefOr[Boolean] = js.native
  
    // only for image and circularImage shapes
  var useImageSize: js.UndefOr[Boolean] = js.native
}
object BorderDashes {
  
  @scala.inline
  def apply(): BorderDashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderDashes]
  }
  
  @scala.inline
  implicit class BorderDashesOps[Self <: BorderDashes] (val x: Self) extends AnyVal {
    
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
    def setBorderDashesVarargs(value: Double*): Self = this.set("borderDashes", js.Array(value :_*))
    
    @scala.inline
    def setBorderDashes(value: Boolean | js.Array[Double]): Self = this.set("borderDashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDashes: Self = this.set("borderDashes", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setInterpolation(value: Boolean): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setUseBorderWithImage(value: Boolean): Self = this.set("useBorderWithImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBorderWithImage: Self = this.set("useBorderWithImage", js.undefined)
    
    @scala.inline
    def setUseImageSize(value: Boolean): Self = this.set("useImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseImageSize: Self = this.set("useImageSize", js.undefined)
  }
}
