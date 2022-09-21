package typings.testingLibraryReactHooks

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@testing-library/react-hooks/lib/helpers/error", "TimeoutError")
  @js.native
  open class TimeoutError protected ()
    extends StObject
       with Error {
    def this(util: js.Function, timeout: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
