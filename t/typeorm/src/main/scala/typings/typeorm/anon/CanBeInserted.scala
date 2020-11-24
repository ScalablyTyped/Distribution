package typings.typeorm.anon

import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.subjectChangeMapMod.SubjectChangeMap
import typings.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanBeInserted extends js.Object {
  
  var canBeInserted: js.UndefOr[Boolean] = js.native
  
  var canBeRecovered: js.UndefOr[Boolean] = js.native
  
  var canBeSoftRemoved: js.UndefOr[Boolean] = js.native
  
  var canBeUpdated: js.UndefOr[Boolean] = js.native
  
  var changeMaps: js.UndefOr[js.Array[SubjectChangeMap]] = js.native
  
  var entity: js.UndefOr[ObjectLiteral] = js.native
  
  var identifier: js.UndefOr[ObjectLiteral] = js.native
  
  var metadata: typings.typeorm.entityMetadataMod.EntityMetadata = js.native
  
  var mustBeRemoved: js.UndefOr[Boolean] = js.native
  
  var parentSubject: js.UndefOr[Subject] = js.native
}
object CanBeInserted {
  
  @scala.inline
  def apply(metadata: typings.typeorm.entityMetadataMod.EntityMetadata): CanBeInserted = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanBeInserted]
  }
  
  @scala.inline
  implicit class CanBeInsertedOps[Self <: CanBeInserted] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeInserted(value: Boolean): Self = this.set("canBeInserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanBeInserted: Self = this.set("canBeInserted", js.undefined)
    
    @scala.inline
    def setCanBeRecovered(value: Boolean): Self = this.set("canBeRecovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanBeRecovered: Self = this.set("canBeRecovered", js.undefined)
    
    @scala.inline
    def setCanBeSoftRemoved(value: Boolean): Self = this.set("canBeSoftRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanBeSoftRemoved: Self = this.set("canBeSoftRemoved", js.undefined)
    
    @scala.inline
    def setCanBeUpdated(value: Boolean): Self = this.set("canBeUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanBeUpdated: Self = this.set("canBeUpdated", js.undefined)
    
    @scala.inline
    def setChangeMapsVarargs(value: SubjectChangeMap*): Self = this.set("changeMaps", js.Array(value :_*))
    
    @scala.inline
    def setChangeMaps(value: js.Array[SubjectChangeMap]): Self = this.set("changeMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeMaps: Self = this.set("changeMaps", js.undefined)
    
    @scala.inline
    def setEntity(value: ObjectLiteral): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setIdentifier(value: ObjectLiteral): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setMustBeRemoved(value: Boolean): Self = this.set("mustBeRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustBeRemoved: Self = this.set("mustBeRemoved", js.undefined)
    
    @scala.inline
    def setParentSubject(value: Subject): Self = this.set("parentSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSubject: Self = this.set("parentSubject", js.undefined)
  }
}
