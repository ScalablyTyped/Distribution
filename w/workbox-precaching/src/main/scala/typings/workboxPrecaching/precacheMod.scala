package typings.workboxPrecaching

import typings.workboxPrecaching.precacheEntryMod.PrecacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheMod {
  
  @JSImport("workbox-precaching/precache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def precache(entries: js.Array[String | PrecacheEntry]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precache")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
