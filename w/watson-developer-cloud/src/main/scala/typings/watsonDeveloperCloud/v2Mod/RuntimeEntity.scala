package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A term from the request that was identified as an entity. */
@js.native
trait RuntimeEntity extends StObject {
  
  /** A decimal percentage that represents Watson's confidence in the entity. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** An entity detected in the input. */
  var entity: String = js.native
  
  /** The recognized capture groups for the entity, as defined by the entity pattern. */
  var groups: js.UndefOr[js.Array[CaptureGroup]] = js.native
  
  /** An array of zero-based character offsets that indicate where the detected entity values begin and end in the input text. */
  var location: js.Array[Double] = js.native
  
  /** Any metadata for the entity. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** The term in the input text that was recognized as an entity value. */
  var value: String = js.native
}
object RuntimeEntity {
  
  @scala.inline
  def apply(entity: String, location: js.Array[Double], value: String): RuntimeEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEntity]
  }
  
  @scala.inline
  implicit class RuntimeEntityMutableBuilder[Self <: RuntimeEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[CaptureGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: CaptureGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
