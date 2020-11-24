package typings.tsLoader.anon

import typings.tsLoader.interfacesMod.WebpackError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFile extends js.Object {
  
  var configFile: typings.tsLoader.configMod.ConfigFile = js.native
  
  var configFileError: js.UndefOr[WebpackError] = js.native
  
  var configFilePath: js.UndefOr[String] = js.native
}
object ConfigFile {
  
  @scala.inline
  def apply(configFile: typings.tsLoader.configMod.ConfigFile): ConfigFile = {
    val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
  
  @scala.inline
  implicit class ConfigFileOps[Self <: ConfigFile] (val x: Self) extends AnyVal {
    
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
    def setConfigFile(value: typings.tsLoader.configMod.ConfigFile): Self = this.set("configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileError(value: WebpackError): Self = this.set("configFileError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFileError: Self = this.set("configFileError", js.undefined)
    
    @scala.inline
    def setConfigFilePath(value: String): Self = this.set("configFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFilePath: Self = this.set("configFilePath", js.undefined)
  }
}
