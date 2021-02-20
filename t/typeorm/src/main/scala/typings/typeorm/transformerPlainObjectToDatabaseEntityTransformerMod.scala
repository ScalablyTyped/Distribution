package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformerPlainObjectToDatabaseEntityTransformerMod {
  
  @JSImport("typeorm/query-builder/transformer/PlainObjectToDatabaseEntityTransformer", "PlainObjectToDatabaseEntityTransformer")
  @js.native
  class PlainObjectToDatabaseEntityTransformer protected () extends StObject {
    def this(manager: EntityManager) = this()
    
    var manager: js.Any = js.native
    
    def transform(plainObject: ObjectLiteral, metadata: EntityMetadata): js.Promise[js.UndefOr[ObjectLiteral]] = js.native
  }
}
