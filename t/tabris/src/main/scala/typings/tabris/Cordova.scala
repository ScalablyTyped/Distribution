package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cordova extends StObject {
  
  var plugins: CordovaPlugins
}
object Cordova {
  
  @scala.inline
  def apply(plugins: CordovaPlugins): Cordova = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  @scala.inline
  implicit class CordovaMutableBuilder[Self <: Cordova] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlugins(value: CordovaPlugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
