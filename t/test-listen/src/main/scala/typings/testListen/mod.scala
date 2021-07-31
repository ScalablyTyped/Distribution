package typings.testListen

import typings.node.netMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(srv: Server): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(srv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(srv: Server, hostname: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(srv.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("test-listen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
