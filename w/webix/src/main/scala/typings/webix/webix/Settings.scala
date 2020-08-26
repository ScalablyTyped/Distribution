package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var config: StringDictionary[js.Any] = js.native
  var name: String = js.native
  def define(property: String, value: js.Any): Unit = js.native
}

object Settings {
  @scala.inline
  def apply(config: StringDictionary[js.Any], define: (String, js.Any) => Unit, name: String): Settings = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], define = js.Any.fromFunction2(define), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setConfig(value: StringDictionary[js.Any]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefine(value: (String, js.Any) => Unit): Self = this.set("define", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

