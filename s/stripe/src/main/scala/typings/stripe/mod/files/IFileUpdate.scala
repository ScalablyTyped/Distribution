package typings.stripe.mod.files

import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.file
import typings.stripe.stripeStrings.jpg
import typings.stripe.stripeStrings.pdf
import typings.stripe.stripeStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileUpdate extends IResourceObject {
  
  var created: Double = js.native
  
  /**
    * Value is "file"
    */
  @JSName("object")
  var object_IFileUpdate: file = js.native
  
  /**
    * The purpose of the uploaded file. Possible values are "business_logo",
    * "dispute_evidence", "identity_document", "incorporation_article",
    * "incorporation_document".
    */
  var purpose: IPurpose = js.native
  
  /**
    * The size in bytes of the file object.
    */
  var size: Double = js.native
  
  /**
    * The type of the file returned. Returns one of the following:
    * pdf, jpg, png.
    */
  var `type`: pdf | jpg | png = js.native
  
  /**
    * A read-only URL where the uploaded file can be accessed. Will be nil
    * unless the uploaded file has one of the following purposes:
    *  business_logo, dispute_evidence, incorporation_document.
    * Also nil if retrieved with the publishable API key.
    */
  var url: String = js.native
}
object IFileUpdate {
  
  @scala.inline
  def apply(
    created: Double,
    id: String,
    `object`: file,
    purpose: IPurpose,
    size: Double,
    `type`: pdf | jpg | png,
    url: String
  ): IFileUpdate = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUpdate]
  }
  
  @scala.inline
  implicit class IFileUpdateOps[Self <: IFileUpdate] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: file): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurpose(value: IPurpose): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pdf | jpg | png): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
