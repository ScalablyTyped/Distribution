package typings
package yargsDashParserLib.yargsDashParserMod.yargsParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedArguments extends js.Object {
  /** The inferred list of aliases built by combining lists in opts.alias. */
  var aliases: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  /** An object representing the parsed value of `args` */
  var argv: Arguments
  /** The configuration loaded from the yargs stanza in package.json. */
  var configuration: Configuration
  /** Populated with an error object if an exception occurred during parsing. */
  var error: stdLib.Error | scala.Null
  /** Any new aliases added via camel-case expansion. */
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
    val __obj = js.Dynamic.literal(aliases = aliases, argv = argv, configuration = configuration, newAliases = newAliases)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[DetailedArguments]
  }
}

