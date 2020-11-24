package typings.webpackPluginServe.anon

import typings.webpackPluginServe.webpackPluginServeStrings.debug
import typings.webpackPluginServe.webpackPluginServeStrings.error
import typings.webpackPluginServe.webpackPluginServeStrings.info
import typings.webpackPluginServe.webpackPluginServeStrings.trace
import typings.webpackPluginServe.webpackPluginServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  var level: trace | debug | info | warn | error = js.native
  
  var timestamp: js.UndefOr[Boolean] = js.native
}
object Level {
  
  @scala.inline
  def apply(level: trace | debug | info | warn | error): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: trace | debug | info | warn | error): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Boolean): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
