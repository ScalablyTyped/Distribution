package typings.systemLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcesConfiguration extends js.Object {
  
  var callback: js.Any = js.native
  
  var connector: js.Any = js.native
  
  var levels: js.Array[level] = js.native
}
object SourcesConfiguration {
  
  @scala.inline
  def apply(callback: js.Any, connector: js.Any, levels: js.Array[level]): SourcesConfiguration = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesConfiguration]
  }
  
  @scala.inline
  implicit class SourcesConfigurationOps[Self <: SourcesConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnector(value: js.Any): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: level*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[level]): Self = this.set("levels", value.asInstanceOf[js.Any])
  }
}
