package typings.uinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateID extends js.Object {
  
  var absflat: js.UndefOr[js.Array[Double]] = js.native
  
  var absfuzz: js.UndefOr[js.Array[Double]] = js.native
  
  var absmax: js.UndefOr[js.Array[Double]] = js.native
  
  var absmin: js.UndefOr[js.Array[Double]] = js.native
  
  var bustype: Double = js.native
  
  var ff_effects_max: js.UndefOr[Double] = js.native
  
  var product: Double = js.native
  
  var vendor: Double = js.native
  
  var version: Double = js.native
}
object CreateID {
  
  @scala.inline
  def apply(bustype: Double, product: Double, vendor: Double, version: Double): CreateID = {
    val __obj = js.Dynamic.literal(bustype = bustype.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateID]
  }
  
  @scala.inline
  implicit class CreateIDOps[Self <: CreateID] (val x: Self) extends AnyVal {
    
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
    def setBustype(value: Double): Self = this.set("bustype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: Double): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: Double): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsflatVarargs(value: Double*): Self = this.set("absflat", js.Array(value :_*))
    
    @scala.inline
    def setAbsflat(value: js.Array[Double]): Self = this.set("absflat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsflat: Self = this.set("absflat", js.undefined)
    
    @scala.inline
    def setAbsfuzzVarargs(value: Double*): Self = this.set("absfuzz", js.Array(value :_*))
    
    @scala.inline
    def setAbsfuzz(value: js.Array[Double]): Self = this.set("absfuzz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsfuzz: Self = this.set("absfuzz", js.undefined)
    
    @scala.inline
    def setAbsmaxVarargs(value: Double*): Self = this.set("absmax", js.Array(value :_*))
    
    @scala.inline
    def setAbsmax(value: js.Array[Double]): Self = this.set("absmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsmax: Self = this.set("absmax", js.undefined)
    
    @scala.inline
    def setAbsminVarargs(value: Double*): Self = this.set("absmin", js.Array(value :_*))
    
    @scala.inline
    def setAbsmin(value: js.Array[Double]): Self = this.set("absmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsmin: Self = this.set("absmin", js.undefined)
    
    @scala.inline
    def setFf_effects_max(value: Double): Self = this.set("ff_effects_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFf_effects_max: Self = this.set("ff_effects_max", js.undefined)
  }
}
