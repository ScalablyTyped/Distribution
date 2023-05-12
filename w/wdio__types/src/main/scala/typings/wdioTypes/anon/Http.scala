package typings.wdioTypes.anon

import typings.node.nodeColonhttpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Http extends StObject {
  
  var http: Agent
  
  var https: typings.node.nodeColonhttpsMod.Agent
}
object Http {
  
  inline def apply(http: Agent, https: typings.node.nodeColonhttpsMod.Agent): Http = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
    
    inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttps(value: typings.node.nodeColonhttpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
  }
}
