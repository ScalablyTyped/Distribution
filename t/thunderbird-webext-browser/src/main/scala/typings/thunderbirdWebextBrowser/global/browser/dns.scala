package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.browser.dns.DNSRecord
import typings.thunderbirdWebextBrowser.browser.dns.ResolveFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dns {
  
  @JSGlobal("browser.dns")
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve(hostname: String): js.Promise[DNSRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DNSRecord]]
  inline def resolve(hostname: String, flags: ResolveFlags): js.Promise[DNSRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DNSRecord]]
}
