package typings.webpackDevServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPortMod {
  
  /**
    * @param {number} basePort
    * @param {string=} host
    * @return {Promise<number>}
    */
  inline def apply(basePort: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(basePort.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def apply(basePort: Double, host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(basePort.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @JSImport("webpack-dev-server/types/lib/getPort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
