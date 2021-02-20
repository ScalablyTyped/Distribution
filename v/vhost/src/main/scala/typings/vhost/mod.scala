package typings.vhost

import typings.express.mod.Handler
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vhost", JSImport.Namespace)
  @js.native
  def apply(hostname: String, handler: Handler): String = js.native
  @JSImport("vhost", JSImport.Namespace)
  @js.native
  def apply(hostname: RegExp, handler: Handler): String = js.native
}
