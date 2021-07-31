package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigName extends StObject {
  
  /**
    * Filename of the ormconfig configuration. By default its equal to "ormconfig".
    */
  var configName: js.UndefOr[String] = js.undefined
  
  /**
    * Directory where ormconfig should be read from.
    * By default its your application root (where your app package.json is located).
    */
  var root: js.UndefOr[String] = js.undefined
}
object ConfigName {
  
  @scala.inline
  def apply(): ConfigName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigName]
  }
  
  @scala.inline
  implicit class ConfigNameMutableBuilder[Self <: ConfigName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
