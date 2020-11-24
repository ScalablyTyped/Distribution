package typings.tslint.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormatterMetadata extends js.Object {
  
  /**
    * Sample output from the formatter.
    */
  var consumer: ConsumerType = js.native
  
  /**
    * A short, one line description of what the formatter does.
    */
  var description: String = js.native
  
  /**
    * More elaborate details about the formatter.
    */
  var descriptionDetails: js.UndefOr[String] = js.native
  
  /**
    * The name of the formatter.
    */
  var formatterName: String = js.native
  
  /**
    * Sample output from the formatter.
    */
  var sample: String = js.native
}
object IFormatterMetadata {
  
  @scala.inline
  def apply(consumer: ConsumerType, description: String, formatterName: String, sample: String): IFormatterMetadata = {
    val __obj = js.Dynamic.literal(consumer = consumer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formatterName = formatterName.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormatterMetadata]
  }
  
  @scala.inline
  implicit class IFormatterMetadataOps[Self <: IFormatterMetadata] (val x: Self) extends AnyVal {
    
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
    def setConsumer(value: ConsumerType): Self = this.set("consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterName(value: String): Self = this.set("formatterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSample(value: String): Self = this.set("sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionDetails(value: String): Self = this.set("descriptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionDetails: Self = this.set("descriptionDetails", js.undefined)
  }
}
