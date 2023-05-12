package typings.workboxCore

import typings.std.Error
import typings.workboxCore.typesMod.MapLikeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateWorkboxErrorMod {
  
  /**
    * Workbox errors should be thrown with this class.
    * This allows use to ensure the type easily in tests,
    * helps developers identify errors from workbox
    * easily and allows use to optimise error
    * messages correctly.
    *
    * @private
    */
  @JSImport("workbox-core/_private/WorkboxError", "WorkboxError")
  @js.native
  open class WorkboxError protected ()
    extends StObject
       with Error {
    /**
      *
      * @param {string} errorCode The error code that
      * identifies this particular error.
      * @param {Object=} details Any relevant arguments
      * that will help developers identify issues should
      * be added as a key on the context object.
      */
    def this(errorCode: String) = this()
    def this(errorCode: String, details: MapLikeObject) = this()
    
    var details: js.UndefOr[MapLikeObject] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
