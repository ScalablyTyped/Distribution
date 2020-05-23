package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var config: StringDictionary[js.Any]
  var name: String
  def define(property: String, value: js.Any): Unit
}

object Settings {
  @scala.inline
  def apply(config: StringDictionary[js.Any], define: (String, js.Any) => Unit, name: String): Settings = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], define = js.Any.fromFunction2(define), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

