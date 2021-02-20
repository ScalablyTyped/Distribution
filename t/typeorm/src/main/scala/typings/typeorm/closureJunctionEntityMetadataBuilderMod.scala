package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityMetadataMod.EntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closureJunctionEntityMetadataBuilderMod {
  
  @JSImport("typeorm/browser/metadata-builder/ClosureJunctionEntityMetadataBuilder", "ClosureJunctionEntityMetadataBuilder")
  @js.native
  class ClosureJunctionEntityMetadataBuilder protected () extends StObject {
    def this(connection: Connection) = this()
    
    /**
      * Builds EntityMetadata for the closure junction of the given closure entity.
      */
    def build(parentClosureEntityMetadata: EntityMetadata): EntityMetadata = js.native
    
    var connection: js.Any = js.native
  }
}
