package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigName extends js.Object {
  
  /**
    * Filename of the ormconfig configuration. By default its equal to "ormconfig".
    */
  var configName: js.UndefOr[String] = js.native
  
  /**
    * Directory where ormconfig should be read from.
    * By default its your application root (where your app package.json is located).
    */
  var root: js.UndefOr[String] = js.native
}
object ConfigName {
  
  @scala.inline
  def apply(): ConfigName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigName]
  }
  
  @scala.inline
  implicit class ConfigNameOps[Self <: ConfigName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigName(value: String): Self = this.set("configName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigName: Self = this.set("configName", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
