package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageOptions extends js.Object {
  
  var autoSchema: js.UndefOr[Boolean] = js.native
  
  var isSerial: js.UndefOr[Boolean] = js.native
  
  var mechanisms: js.UndefOr[js.Array[String]] = js.native
  
  var requestType: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object StorageOptions {
  
  @scala.inline
  def apply(): StorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageOptions]
  }
  
  @scala.inline
  implicit class StorageOptionsOps[Self <: StorageOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoSchema(value: Boolean): Self = this.set("autoSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSchema: Self = this.set("autoSchema", js.undefined)
    
    @scala.inline
    def setIsSerial(value: Boolean): Self = this.set("isSerial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSerial: Self = this.set("isSerial", js.undefined)
    
    @scala.inline
    def setMechanismsVarargs(value: String*): Self = this.set("mechanisms", js.Array(value :_*))
    
    @scala.inline
    def setMechanisms(value: js.Array[String]): Self = this.set("mechanisms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMechanisms: Self = this.set("mechanisms", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
