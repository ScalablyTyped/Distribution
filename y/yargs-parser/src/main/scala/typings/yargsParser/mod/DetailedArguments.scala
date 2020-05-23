package typings.yargsParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedArguments extends js.Object {
  /** The inferred list of aliases built by combining lists in opts.alias. */
  var aliases: StringDictionary[js.Array[String]]
  /** An object representing the parsed value of `args` */
  var argv: Arguments
  /** The configuration loaded from the yargs stanza in package.json. */
  var configuration: Configuration
  /** Populated with an error object if an exception occurred during parsing. */
  var error: Error | Null
  /** Any new aliases added via camel-case expansion. */
  var newAliases: StringDictionary[Boolean]
}

object DetailedArguments {
  @scala.inline
  def apply(
    aliases: StringDictionary[js.Array[String]],
    argv: Arguments,
    configuration: Configuration,
    newAliases: StringDictionary[Boolean],
    error: Error = null
  ): DetailedArguments = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], argv = argv.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], newAliases = newAliases.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedArguments]
  }
}

