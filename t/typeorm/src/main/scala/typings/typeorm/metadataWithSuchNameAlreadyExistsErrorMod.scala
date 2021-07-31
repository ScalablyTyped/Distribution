package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataWithSuchNameAlreadyExistsErrorMod {
  
  @JSImport("typeorm/browser/error/MetadataWithSuchNameAlreadyExistsError", "MetadataWithSuchNameAlreadyExistsError")
  @js.native
  class MetadataWithSuchNameAlreadyExistsError protected ()
    extends StObject
       with Error {
    def this(metadataType: String, name: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
