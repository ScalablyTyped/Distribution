package typings.testListen

import typings.node.netMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("test-listen", JSImport.Namespace)
  @js.native
  def apply(srv: Server): js.Promise[String] = js.native
  @JSImport("test-listen", JSImport.Namespace)
  @js.native
  def apply(srv: Server, hostname: String): js.Promise[String] = js.native
}
