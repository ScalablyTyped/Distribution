package typings.turistFetch

import typings.turistFetch.typesMod.AgentOptions
import typings.turistFetch.typesMod.Fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@turist/fetch/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Fetch = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Fetch]
  inline def default(fetch: Unit, options: AgentOptions): Fetch = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fetch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Fetch]
  inline def default(fetch: Fetch): Fetch = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fetch.asInstanceOf[js.Any]).asInstanceOf[Fetch]
  inline def default(fetch: Fetch, options: AgentOptions): Fetch = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fetch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Fetch]
}
