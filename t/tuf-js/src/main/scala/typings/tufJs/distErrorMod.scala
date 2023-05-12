package typings.tufJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorMod {
  
  @JSImport("tuf-js/dist/error", "BadVersionError")
  @js.native
  open class BadVersionError () extends RepositoryError
  
  @JSImport("tuf-js/dist/error", "DownloadError")
  @js.native
  open class DownloadError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("tuf-js/dist/error", "DownloadHTTPError")
  @js.native
  open class DownloadHTTPError protected () extends DownloadError {
    def this(message: String, statusCode: Double) = this()
    
    var statusCode: Double = js.native
  }
  
  @JSImport("tuf-js/dist/error", "DownloadLengthMismatchError")
  @js.native
  open class DownloadLengthMismatchError () extends DownloadError
  
  @JSImport("tuf-js/dist/error", "EqualVersionError")
  @js.native
  open class EqualVersionError () extends BadVersionError
  
  @JSImport("tuf-js/dist/error", "ExpiredMetadataError")
  @js.native
  open class ExpiredMetadataError () extends RepositoryError
  
  @JSImport("tuf-js/dist/error", "PersistError")
  @js.native
  open class PersistError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("tuf-js/dist/error", "RepositoryError")
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
  
  @JSImport("tuf-js/dist/error", "RuntimeError")
  @js.native
  open class RuntimeError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("tuf-js/dist/error", "ValueError")
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
