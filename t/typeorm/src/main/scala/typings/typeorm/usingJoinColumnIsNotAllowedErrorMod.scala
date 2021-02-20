package typings.typeorm

import typings.std.Error
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usingJoinColumnIsNotAllowedErrorMod {
  
  @JSImport("typeorm/browser/error/UsingJoinColumnIsNotAllowedError", "UsingJoinColumnIsNotAllowedError")
  @js.native
  class UsingJoinColumnIsNotAllowedError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
