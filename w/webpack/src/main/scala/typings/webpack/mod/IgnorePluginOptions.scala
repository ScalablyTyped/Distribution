package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webpack.anon.ContextRegExp
  - typings.webpack.anon.CheckResource
*/
trait IgnorePluginOptions extends StObject
object IgnorePluginOptions {
  
  inline def CheckResource(checkResource: (String, String) => Boolean): typings.webpack.anon.CheckResource = {
    val __obj = js.Dynamic.literal(checkResource = js.Any.fromFunction2(checkResource))
    __obj.asInstanceOf[typings.webpack.anon.CheckResource]
  }
  
  inline def ContextRegExp(resourceRegExp: js.RegExp): typings.webpack.anon.ContextRegExp = {
    val __obj = js.Dynamic.literal(resourceRegExp = resourceRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webpack.anon.ContextRegExp]
  }
}
