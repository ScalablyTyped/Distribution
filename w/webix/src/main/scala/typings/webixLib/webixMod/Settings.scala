package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var config: org.scalablytyped.runtime.StringDictionary[js.Any]
  var name: java.lang.String
  def define(property: java.lang.String, value: js.Any): scala.Unit
}

object Settings {
  @scala.inline
  def apply(
    config: org.scalablytyped.runtime.StringDictionary[js.Any],
    define: js.Function2[java.lang.String, js.Any, scala.Unit],
    name: java.lang.String
  ): Settings = {
    val __obj = js.Dynamic.literal(config = config, define = define, name = name)
  
    __obj.asInstanceOf[Settings]
  }
}

