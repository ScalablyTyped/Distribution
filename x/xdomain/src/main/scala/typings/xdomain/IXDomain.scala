package typings.xdomain

import typings.xdomain.xdomainStrings.log
import typings.xdomain.xdomainStrings.timeout
import typings.xdomain.xdomainStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXDomain extends StObject {
  
  var cookies: XDomainCookies
  
  /**
    * When true, XDomain will log actions to console
    */
  var debug: Boolean
  
  /**
    * Will initialize as a slave
    *
    * Each of the masters must be defined as: origin: path
    *
    * origin and path are converted to a regular expression by escaping all non-alphanumeric chars, then converting * into .* and finally wrapping it with ^ and $. path can also be a RegExp literal.
    *
    * Requests that do not match both the origin and the path regular expressions will be blocked.
    * @param masterObj
    */
  def masters(masterObj: js.Object): Unit
  
  /**
    * event may be log, warn or timeout. When listening for log and warn events, handler with contain the message as
    * the first parameter. The timeout event fires when an iframe exeeds the xdomain.timeout time limit.
    * @param event
    * @param handler
    */
  def on(event: log | warn | timeout, handler: js.Function1[/* message */ js.UndefOr[String], Any]): Unit
  
  var origin: String
  
  /**
    * Will initialize as a master
    *
    * Each of the slaves must be defined as: origin: proxy file
    *
    * The slaves object is used as a list slaves to force one proxy file per origin.
    * @param slaveObj
    */
  def slaves(slaveObj: js.Object): Unit
}
object IXDomain {
  
  inline def apply(
    cookies: XDomainCookies,
    debug: Boolean,
    masters: js.Object => Unit,
    on: (log | warn | timeout, js.Function1[/* message */ js.UndefOr[String], Any]) => Unit,
    origin: String,
    slaves: js.Object => Unit
  ): IXDomain = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], masters = js.Any.fromFunction1(masters), on = js.Any.fromFunction2(on), origin = origin.asInstanceOf[js.Any], slaves = js.Any.fromFunction1(slaves))
    __obj.asInstanceOf[IXDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IXDomain] (val x: Self) extends AnyVal {
    
    inline def setCookies(value: XDomainCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setMasters(value: js.Object => Unit): Self = StObject.set(x, "masters", js.Any.fromFunction1(value))
    
    inline def setOn(value: (log | warn | timeout, js.Function1[/* message */ js.UndefOr[String], Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setSlaves(value: js.Object => Unit): Self = StObject.set(x, "slaves", js.Any.fromFunction1(value))
  }
}
