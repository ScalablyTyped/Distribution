package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A term from the request that was identified as an entity. */
@js.native
trait RuntimeEntity extends js.Object {
  
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
  implicit class RuntimeEntityOps[Self <: RuntimeEntity] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: CaptureGroup*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[CaptureGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
