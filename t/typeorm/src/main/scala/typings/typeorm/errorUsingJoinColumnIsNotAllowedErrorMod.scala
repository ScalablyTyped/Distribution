package typings.typeorm

import typings.std.Error
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorUsingJoinColumnIsNotAllowedErrorMod {
  
  @JSImport("typeorm/error/UsingJoinColumnIsNotAllowedError", "UsingJoinColumnIsNotAllowedError")
  @js.native
  class UsingJoinColumnIsNotAllowedError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
