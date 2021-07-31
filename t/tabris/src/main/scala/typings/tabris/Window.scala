package typings.tabris

import typings.std.Document
import typings.std.Navigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var cordova: Cordova
  
  var document: Document
  
  var navigator: Navigator
  
  var plugins: CordovaPlugins
  
  var window: Window
}
object Window {
  
  @scala.inline
  def apply(
    cordova: Cordova,
    document: Document,
    navigator: Navigator,
    plugins: CordovaPlugins,
    window: Window
  ): Window = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCordova(value: Cordova): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: CordovaPlugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
