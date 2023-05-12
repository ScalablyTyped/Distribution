package typings.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDeleteOutdatedCachesMod {
  
  @JSImport("workbox-precaching/utils/deleteOutdatedCaches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cleans up incompatible precaches that were created by older versions of
    * Workbox, by a service worker registered under the current scope.
    *
    * This is meant to be called as part of the `activate` event.
    *
    * This should be safe to use as long as you don't include `substringToFind`
    * (defaulting to `-precache-`) in your non-precache cache names.
    *
    * @param {string} currentPrecacheName The cache name currently in use for
    * precaching. This cache won't be deleted.
    * @param {string} [substringToFind='-precache-'] Cache names which include this
    * substring will be deleted (excluding `currentPrecacheName`).
    * @return {Array<string>} A list of all the cache names that were deleted.
    *
    * @private
    * @memberof workbox-precaching
    */
  inline def deleteOutdatedCaches(currentPrecacheName: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteOutdatedCaches")(currentPrecacheName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def deleteOutdatedCaches(currentPrecacheName: String, substringToFind: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteOutdatedCaches")(currentPrecacheName.asInstanceOf[js.Any], substringToFind.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
