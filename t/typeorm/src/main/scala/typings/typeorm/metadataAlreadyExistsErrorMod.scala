package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataAlreadyExistsErrorMod {
  
  @JSImport("typeorm/browser/error/MetadataAlreadyExistsError", "MetadataAlreadyExistsError")
  @js.native
  class MetadataAlreadyExistsError protected ()
    extends StObject
       with Error {
    def this(metadataType: String, constructor: js.Function) = this()
    def this(metadataType: String, constructor: js.Function, propertyName: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
