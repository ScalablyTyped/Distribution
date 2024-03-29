package typings.webix.webix

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touch extends StObject {
  
  var config: obj
  
  def disable(): Unit
  
  def enable(): Unit
  
  def limit(mode: Boolean): Unit
  
  def scrollTo(node: HTMLElement, x: Double, y: Double, speed: String): Unit
}
object Touch {
  
  inline def apply(
    config: obj,
    disable: () => Unit,
    enable: () => Unit,
    limit: Boolean => Unit,
    scrollTo: (HTMLElement, Double, Double, String) => Unit
  ): Touch = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), limit = js.Any.fromFunction1(limit), scrollTo = js.Any.fromFunction4(scrollTo))
    __obj.asInstanceOf[Touch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Touch] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: obj): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setLimit(value: Boolean => Unit): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
    
    inline def setScrollTo(value: (HTMLElement, Double, Double, String) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction4(value))
  }
}
