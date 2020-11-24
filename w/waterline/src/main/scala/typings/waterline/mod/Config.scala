package typings.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var adapters: StringDictionary[Adapter] = js.native
  
  var connections: StringDictionary[Connection] = js.native
}
object Config {
  
  @scala.inline
  def apply(adapters: StringDictionary[Adapter], connections: StringDictionary[Connection]): Config = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setAdapters(value: StringDictionary[Adapter]): Self = this.set("adapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnections(value: StringDictionary[Connection]): Self = this.set("connections", value.asInstanceOf[js.Any])
  }
}
