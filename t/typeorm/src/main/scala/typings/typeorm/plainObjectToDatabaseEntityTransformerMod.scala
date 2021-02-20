package typings.typeorm

import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plainObjectToDatabaseEntityTransformerMod {
  
  @JSImport("typeorm/browser/query-builder/transformer/PlainObjectToDatabaseEntityTransformer", "PlainObjectToDatabaseEntityTransformer")
  @js.native
  class PlainObjectToDatabaseEntityTransformer protected () extends StObject {
    def this(manager: EntityManager) = this()
    
    var manager: js.Any = js.native
    
    def transform(plainObject: ObjectLiteral, metadata: EntityMetadata): js.Promise[js.UndefOr[ObjectLiteral]] = js.native
  }
}
