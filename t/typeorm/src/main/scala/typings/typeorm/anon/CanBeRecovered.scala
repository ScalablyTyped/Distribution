package typings.typeorm.anon

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.persistenceSubjectChangeMapMod.SubjectChangeMap
import typings.typeorm.persistenceSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanBeRecovered extends StObject {
  
  var canBeInserted: js.UndefOr[Boolean] = js.undefined
  
  var canBeRecovered: js.UndefOr[Boolean] = js.undefined
  
  var canBeSoftRemoved: js.UndefOr[Boolean] = js.undefined
  
  var canBeUpdated: js.UndefOr[Boolean] = js.undefined
  
  var changeMaps: js.UndefOr[js.Array[SubjectChangeMap]] = js.undefined
  
  var entity: js.UndefOr[ObjectLiteral] = js.undefined
  
  var identifier: js.UndefOr[ObjectLiteral] = js.undefined
  
  var metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  
  var mustBeRemoved: js.UndefOr[Boolean] = js.undefined
  
  var parentSubject: js.UndefOr[Subject] = js.undefined
}
object CanBeRecovered {
  
  inline def apply(metadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): CanBeRecovered = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanBeRecovered]
  }
  
  extension [Self <: CanBeRecovered](x: Self) {
    
    inline def setCanBeInserted(value: Boolean): Self = StObject.set(x, "canBeInserted", value.asInstanceOf[js.Any])
    
    inline def setCanBeInsertedUndefined: Self = StObject.set(x, "canBeInserted", js.undefined)
    
    inline def setCanBeRecovered(value: Boolean): Self = StObject.set(x, "canBeRecovered", value.asInstanceOf[js.Any])
    
    inline def setCanBeRecoveredUndefined: Self = StObject.set(x, "canBeRecovered", js.undefined)
    
    inline def setCanBeSoftRemoved(value: Boolean): Self = StObject.set(x, "canBeSoftRemoved", value.asInstanceOf[js.Any])
    
    inline def setCanBeSoftRemovedUndefined: Self = StObject.set(x, "canBeSoftRemoved", js.undefined)
    
    inline def setCanBeUpdated(value: Boolean): Self = StObject.set(x, "canBeUpdated", value.asInstanceOf[js.Any])
    
    inline def setCanBeUpdatedUndefined: Self = StObject.set(x, "canBeUpdated", js.undefined)
    
    inline def setChangeMaps(value: js.Array[SubjectChangeMap]): Self = StObject.set(x, "changeMaps", value.asInstanceOf[js.Any])
    
    inline def setChangeMapsUndefined: Self = StObject.set(x, "changeMaps", js.undefined)
    
    inline def setChangeMapsVarargs(value: SubjectChangeMap*): Self = StObject.set(x, "changeMaps", js.Array(value :_*))
    
    inline def setEntity(value: ObjectLiteral): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setIdentifier(value: ObjectLiteral): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMustBeRemoved(value: Boolean): Self = StObject.set(x, "mustBeRemoved", value.asInstanceOf[js.Any])
    
    inline def setMustBeRemovedUndefined: Self = StObject.set(x, "mustBeRemoved", js.undefined)
    
    inline def setParentSubject(value: Subject): Self = StObject.set(x, "parentSubject", value.asInstanceOf[js.Any])
    
    inline def setParentSubjectUndefined: Self = StObject.set(x, "parentSubject", js.undefined)
  }
}
