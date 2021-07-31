package typings.typeorm

import typings.std.Error
import typings.typeorm.entityMetadataMod.EntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object missingDeleteDateColumnErrorMod {
  
  @JSImport("typeorm/browser/error/MissingDeleteDateColumnError", "MissingDeleteDateColumnError")
  @js.native
  class MissingDeleteDateColumnError protected ()
    extends StObject
       with Error {
    def this(entityMetadata: EntityMetadata) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
