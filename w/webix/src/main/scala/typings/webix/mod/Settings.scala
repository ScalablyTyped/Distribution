package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  var config: StringDictionary[js.Any] = js.native
  
  def define(property: String, value: js.Any): Unit = js.native
  
  var name: String = js.native
}
object Settings {
  
  @JSImport("webix", "Settings")
  @js.native
  val ^ : Settings = js.native
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefine(value: (String, js.Any) => Unit): Self = StObject.set(x, "define", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
