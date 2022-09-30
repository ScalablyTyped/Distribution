package typings.testcafeHammerhead.mod

import typings.testcafeHammerhead.ExternalProxySettingsRaw
import typings.testcafeHammerhead.StaticContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "Proxy")
@js.native
/** Creates a web proxy instance **/
open class Proxy () extends StObject {
  
  def GET(route: String, handler: js.Function): Unit = js.native
  /** Register a new route for the GET HTTP method **/
  def GET(route: String, handler: StaticContent): Unit = js.native
  
  def POST(route: String, handler: js.Function): Unit = js.native
  /** Register a new route for the POST HTTP method **/
  def POST(route: String, handler: StaticContent): Unit = js.native
  
  /**  Close the proxy instance */
  def close(): Unit = js.native
  
  /** Closes the specified test run session **/
  def closeSession(session: Session): Unit = js.native
  
  /** Opens a new test run session **/
  def openSession(url: String, session: Session, externalProxySettings: ExternalProxySettingsRaw): String = js.native
  
  /** Proxy options **/
  var options: ProxyOptions = js.native
  
  /** Resolve relative service url **/
  def resolveRelativeServiceUrl(relativeServiceUrl: String): String = js.native
  
  /** Information about server1 **/
  var server1Info: ServerInfo = js.native
  
  /** Information about server2 **/
  var server2Info: ServerInfo = js.native
  
  /** Unregister the route **/
  def unRegisterRoute(route: String, method: String): Unit = js.native
}
