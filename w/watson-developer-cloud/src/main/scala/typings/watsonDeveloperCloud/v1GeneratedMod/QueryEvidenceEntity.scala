package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Entity description and location within evidence field. */
@js.native
trait QueryEvidenceEntity extends js.Object {
  
  /** The end location of the entity text in the identified field. This value is exclusive. */
  var end_offset: js.UndefOr[Double] = js.native
  
  /** The start location of the entity text in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.native
  
  /** The original text of this entity as found in the evidence field. */
  var text: js.UndefOr[String] = js.native
  
  /** The entity type for this entity. Possible types vary based on model used. */
  var `type`: js.UndefOr[String] = js.native
}
object QueryEvidenceEntity {
  
  @scala.inline
  def apply(): QueryEvidenceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEvidenceEntity]
  }
  
  @scala.inline
  implicit class QueryEvidenceEntityOps[Self <: QueryEvidenceEntity] (val x: Self) extends AnyVal {
    
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
    def setEnd_offset(value: Double): Self = this.set("end_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_offset: Self = this.set("end_offset", js.undefined)
    
    @scala.inline
    def setStart_offset(value: Double): Self = this.set("start_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_offset: Self = this.set("start_offset", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
