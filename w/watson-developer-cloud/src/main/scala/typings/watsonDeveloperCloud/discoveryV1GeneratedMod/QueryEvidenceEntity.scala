package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Entity description and location within evidence field. */
trait QueryEvidenceEntity extends StObject {
  
  /** The end location of the entity text in the identified field. This value is exclusive. */
  var end_offset: js.UndefOr[Double] = js.undefined
  
  /** The start location of the entity text in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.undefined
  
  /** The original text of this entity as found in the evidence field. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The entity type for this entity. Possible types vary based on model used. */
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryEvidenceEntity {
  
  inline def apply(): QueryEvidenceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEvidenceEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryEvidenceEntity] (val x: Self) extends AnyVal {
    
    inline def setEnd_offset(value: Double): Self = StObject.set(x, "end_offset", value.asInstanceOf[js.Any])
    
    inline def setEnd_offsetUndefined: Self = StObject.set(x, "end_offset", js.undefined)
    
    inline def setStart_offset(value: Double): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    inline def setStart_offsetUndefined: Self = StObject.set(x, "start_offset", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
