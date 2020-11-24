package typings.toIco.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToIcoOptions extends js.Object {
  
  /**
    * Use the largest image and resize to sizes defined using the [sizes](#sizes) option.
    *
    * @default false
    */
  var resize: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of sizes to use when resizing.
    *
    * @default [16, 24, 32, 48, 64, 128, 256]
    */
  var sizes: js.UndefOr[js.Array[Double]] = js.native
}
object ToIcoOptions {
  
  @scala.inline
  def apply(): ToIcoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToIcoOptions]
  }
  
  @scala.inline
  implicit class ToIcoOptionsOps[Self <: ToIcoOptions] (val x: Self) extends AnyVal {
    
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
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
  }
}
