package typings.typeorm.anon

import typings.typeorm.foreignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.uniqueMetadataMod.UniqueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForeignKey extends StObject {
  
  var foreignKey: js.UndefOr[ForeignKeyMetadata] = js.native
  
  var uniqueConstraint: js.UndefOr[UniqueMetadata] = js.native
}
object ForeignKey {
  
  @scala.inline
  def apply(): ForeignKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForeignKey]
  }
  
  @scala.inline
  implicit class ForeignKeyMutableBuilder[Self <: ForeignKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForeignKey(value: ForeignKeyMetadata): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setUniqueConstraint(value: UniqueMetadata): Self = StObject.set(x, "uniqueConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueConstraintUndefined: Self = StObject.set(x, "uniqueConstraint", js.undefined)
  }
}
