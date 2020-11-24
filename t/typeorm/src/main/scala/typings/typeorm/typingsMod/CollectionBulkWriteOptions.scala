package typings.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionBulkWriteOptions extends js.Object {
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.native
  
  /**
    * Execute write operation in ordered or unordered fashion.
    */
  var ordered: js.UndefOr[Boolean] = js.native
  
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.native
}
object CollectionBulkWriteOptions {
  
  @scala.inline
  def apply(): CollectionBulkWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionBulkWriteOptions]
  }
  
  @scala.inline
  implicit class CollectionBulkWriteOptionsOps[Self <: CollectionBulkWriteOptions] (val x: Self) extends AnyVal {
    
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
    def setBypassDocumentValidation(value: Boolean): Self = this.set("bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassDocumentValidation: Self = this.set("bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
    
    @scala.inline
    def setW(value: scala.Double | String): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
}
