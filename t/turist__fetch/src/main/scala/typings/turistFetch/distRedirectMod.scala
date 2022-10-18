package typings.turistFetch

import typings.nodeFetch.mod.Response
import typings.turistFetch.distAgentWrapperMod.default
import typings.turistFetch.distTypesMod.FetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRedirectMod {
  
  @JSImport("@turist/fetch/dist/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRedirect(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeRedirectOpts(res: Response, opts: FetchOptions, agentWrapper: default): js.Tuple2[String, FetchOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRedirectOpts")(res.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], agentWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, FetchOptions]]
}
