package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionRevision extends StObject {
  
  /**
    * The change type (add, edit, delete).
    */
  var changeType: AuditAction = js.native
  
  /**
    * The identity of the person or process that changed the definition.
    */
  var changedBy: IdentityRef = js.native
  
  /**
    * The date and time that the definition was changed.
    */
  var changedDate: Date = js.native
  
  /**
    * The comment associated with the change.
    */
  var comment: String = js.native
  
  /**
    * A link to the definition at this revision.
    */
  var definitionUrl: String = js.native
  
  /**
    * The name of the definition.
    */
  var name: String = js.native
  
  /**
    * The revision number.
    */
  var revision: Double = js.native
}
object BuildDefinitionRevision {
  
  @scala.inline
  def apply(
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: Date,
    comment: String,
    definitionUrl: String,
    name: String,
    revision: Double
  ): BuildDefinitionRevision = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionRevision]
  }
  
  @scala.inline
  implicit class BuildDefinitionRevisionMutableBuilder[Self <: BuildDefinitionRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUrl(value: String): Self = StObject.set(x, "definitionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
