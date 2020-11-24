package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsIntOptions extends js.Object {
  
  /**
    * if `false`, will disallow integer values with leading zeroes
    * @default true
    */
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.native
  
  /**
    * enforce integers being less than the value provided
    */
  var gt: js.UndefOr[Double] = js.native
  
  /**
    * enforce integers being greater than the value provided
    */
  var lt: js.UndefOr[Double] = js.native
  
  /**
    * to check the integer max boundary
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * to check the integer min boundary
    */
  var min: js.UndefOr[Double] = js.native
}
object IsIntOptions {
  
  @scala.inline
  def apply(): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIntOptions]
  }
  
  @scala.inline
  implicit class IsIntOptionsOps[Self <: IsIntOptions] (val x: Self) extends AnyVal {
    
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
    def setAllow_leading_zeroes(value: Boolean): Self = this.set("allow_leading_zeroes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_leading_zeroes: Self = this.set("allow_leading_zeroes", js.undefined)
    
    @scala.inline
    def setGt(value: Double): Self = this.set("gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    
    @scala.inline
    def setLt(value: Double): Self = this.set("lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
