package typings.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanupOutdatedCachesMod {
  
  @JSImport("workbox-precaching/cleanupOutdatedCaches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds an `activate` event listener which will clean up incompatible
    * precaches that were created by older versions of Workbox.
    *
    * @memberof workbox-precaching
    */
  inline def cleanupOutdatedCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupOutdatedCaches")().asInstanceOf[Unit]
}
