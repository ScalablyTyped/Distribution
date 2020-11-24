package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Description of evidence location supporting Knoweldge Graph query result. */
@js.native
trait QueryEvidence extends js.Object {
  
  /** The docuemnt ID (as indexed in Discovery) of the evidence location. */
  var document_id: js.UndefOr[String] = js.native
  
  /** The end location of the evidence in the identified field. This value is inclusive. */
  var end_offset: js.UndefOr[Double] = js.native
  
  /** An array of entity objects that show evidence of the result. */
  var entities: js.UndefOr[js.Array[QueryEvidenceEntity]] = js.native
  
  /** The field of the document where the supporting evidence was identified. */
  var field: js.UndefOr[String] = js.native
  
  /** The start location of the evidence in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.native
}
object QueryEvidence {
  
  @scala.inline
  def apply(): QueryEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEvidence]
  }
  
  @scala.inline
  implicit class QueryEvidenceOps[Self <: QueryEvidence] (val x: Self) extends AnyVal {
    
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
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_id: Self = this.set("document_id", js.undefined)
    
    @scala.inline
    def setEnd_offset(value: Double): Self = this.set("end_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_offset: Self = this.set("end_offset", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: QueryEvidenceEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[QueryEvidenceEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setStart_offset(value: Double): Self = this.set("start_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_offset: Self = this.set("start_offset", js.undefined)
  }
}
