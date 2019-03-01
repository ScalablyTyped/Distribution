package typings
package yargsDashParserLib.yargsDashParserMod.yargsParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedArguments extends js.Object {
  var aliases: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var argv: Arguments
  var configuration: Configuration
  var error: stdLib.Error | scala.Null
  var newAliases: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}

object DetailedArguments {
  @scala.inline
  def apply(
    aliases: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    argv: Arguments,
    configuration: Configuration,
    newAliases: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    error: stdLib.Error = null
  ): DetailedArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aliases")(aliases)
    __obj.updateDynamic("argv")(argv)
    __obj.updateDynamic("configuration")(configuration)
    __obj.updateDynamic("newAliases")(newAliases)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[DetailedArguments]
  }
}

