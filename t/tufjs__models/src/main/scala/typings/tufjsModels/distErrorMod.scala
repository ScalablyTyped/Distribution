package typings.tufjsModels

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorMod {
  
  @JSImport("@tufjs/models/dist/error", "CryptoError")
  @js.native
  open class CryptoError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@tufjs/models/dist/error", "LengthOrHashMismatchError")
  @js.native
  open class LengthOrHashMismatchError () extends RepositoryError
  
  @JSImport("@tufjs/models/dist/error", "RepositoryError")
  @js.native
  open class RepositoryError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@tufjs/models/dist/error", "UnsignedMetadataError")
  @js.native
  open class UnsignedMetadataError () extends RepositoryError
  
  @JSImport("@tufjs/models/dist/error", "UnsupportedAlgorithmError")
  @js.native
  open class UnsupportedAlgorithmError () extends CryptoError
  
  @JSImport("@tufjs/models/dist/error", "ValueError")
  @js.native
  open class ValueError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
