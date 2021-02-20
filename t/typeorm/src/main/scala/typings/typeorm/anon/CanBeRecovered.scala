package typings.typeorm.anon

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.persistenceSubjectChangeMapMod.SubjectChangeMap
import typings.typeorm.persistenceSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanBeRecovered extends StObject {
  
  var canBeInserted: js.UndefOr[Boolean] = js.native
  
  var canBeRecovered: js.UndefOr[Boolean] = js.native
  
  var canBeSoftRemoved: js.UndefOr[Boolean] = js.native
  
  var canBeUpdated: js.UndefOr[Boolean] = js.native
  
  var changeMaps: js.UndefOr[js.Array[SubjectChangeMap]] = js.native
  
  var entity: js.UndefOr[ObjectLiteral] = js.native
  
  var identifier: js.UndefOr[ObjectLiteral] = js.native
  
  var metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
  
  var mustBeRemoved: js.UndefOr[Boolean] = js.native
  
  var parentSubject: js.UndefOr[Subject] = js.native
}
object CanBeRecovered {
  
  @scala.inline
  def apply(metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): CanBeRecovered = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanBeRecovered]
  }
  
  @scala.inline
  implicit class CanBeRecoveredMutableBuilder[Self <: CanBeRecovered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanBeInserted(value: Boolean): Self = StObject.set(x, "canBeInserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeInsertedUndefined: Self = StObject.set(x, "canBeInserted", js.undefined)
    
    @scala.inline
    def setCanBeRecovered(value: Boolean): Self = StObject.set(x, "canBeRecovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeRecoveredUndefined: Self = StObject.set(x, "canBeRecovered", js.undefined)
    
    @scala.inline
    def setCanBeSoftRemoved(value: Boolean): Self = StObject.set(x, "canBeSoftRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeSoftRemovedUndefined: Self = StObject.set(x, "canBeSoftRemoved", js.undefined)
    
    @scala.inline
    def setCanBeUpdated(value: Boolean): Self = StObject.set(x, "canBeUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeUpdatedUndefined: Self = StObject.set(x, "canBeUpdated", js.undefined)
    
    @scala.inline
    def setChangeMaps(value: js.Array[SubjectChangeMap]): Self = StObject.set(x, "changeMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeMapsUndefined: Self = StObject.set(x, "changeMaps", js.undefined)
    
    @scala.inline
    def setChangeMapsVarargs(value: SubjectChangeMap*): Self = StObject.set(x, "changeMaps", js.Array(value :_*))
    
    @scala.inline
    def setEntity(value: ObjectLiteral): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setIdentifier(value: ObjectLiteral): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustBeRemoved(value: Boolean): Self = StObject.set(x, "mustBeRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustBeRemovedUndefined: Self = StObject.set(x, "mustBeRemoved", js.undefined)
    
    @scala.inline
    def setParentSubject(value: Subject): Self = StObject.set(x, "parentSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSubjectUndefined: Self = StObject.set(x, "parentSubject", js.undefined)
  }
}
