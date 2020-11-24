package typings.tensorflowTfjsConverter.compiledApiMod.TensorShape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Dim. */
@js.native
trait IDim extends js.Object {
  
  /** Dim name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** Dim size */
  var size: js.UndefOr[Double | String | Null] = js.native
}
object IDim {
  
  @scala.inline
  def apply(): IDim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDim]
  }
  
  @scala.inline
  implicit class IDimOps[Self <: IDim] (val x: Self) extends AnyVal {
    
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
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
  }
}
