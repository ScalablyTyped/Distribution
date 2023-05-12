package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateWaitUntilMod {
  
  @JSImport("workbox-core/_private/waitUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A utility method that makes it easier to use `event.waitUntil` with
    * async functions and return the result.
    *
    * @param {ExtendableEvent} event
    * @param {Function} asyncFn
    * @return {Function}
    * @private
    */
  inline def waitUntil(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    asyncFn: js.Function0[js.Promise[Any]]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(event.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
