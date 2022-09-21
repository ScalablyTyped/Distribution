package typings.treat

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treatErrorMod {
  
  @JSImport("treat/dist/declarations/src/webpack-plugin/TreatError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Error {
    def this(error: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type TreatError = js.Error
}
