package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata-builder/ClosureJunctionEntityMetadataBuilder", JSImport.Namespace)
@js.native
object closureJunctionEntityMetadataBuilderMod extends js.Object {
  
  @js.native
  class ClosureJunctionEntityMetadataBuilder protected () extends js.Object {
    def this(connection: Connection) = this()
    
    /**
      * Builds EntityMetadata for the closure junction of the given closure entity.
      */
    def build(parentClosureEntityMetadata: EntityMetadata): EntityMetadata = js.native
    
    var connection: js.Any = js.native
  }
}
