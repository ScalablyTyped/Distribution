package typings.typeorm.anon

import typings.typeorm.metadataForeignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.metadataUniqueMetadataMod.UniqueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueConstraint extends StObject {
  
  var foreignKey: js.UndefOr[ForeignKeyMetadata] = js.undefined
  
  var uniqueConstraint: js.UndefOr[UniqueMetadata] = js.undefined
}
object UniqueConstraint {
  
  inline def apply(): UniqueConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueConstraint]
  }
  
  extension [Self <: UniqueConstraint](x: Self) {
    
    inline def setForeignKey(value: ForeignKeyMetadata): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    inline def setUniqueConstraint(value: UniqueMetadata): Self = StObject.set(x, "uniqueConstraint", value.asInstanceOf[js.Any])
    
    inline def setUniqueConstraintUndefined: Self = StObject.set(x, "uniqueConstraint", js.undefined)
  }
}
