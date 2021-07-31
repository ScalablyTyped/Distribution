package typings.vhost

import typings.express.mod.Handler
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(hostname: String, handler: Handler): String = (^.asInstanceOf[js.Dynamic].apply(hostname.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(hostname: RegExp, handler: Handler): String = (^.asInstanceOf[js.Dynamic].apply(hostname.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("vhost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
