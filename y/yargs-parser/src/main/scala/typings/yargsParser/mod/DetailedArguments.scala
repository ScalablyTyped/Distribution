package typings.yargsParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedArguments extends js.Object {
  /** The inferred list of aliases built by combining lists in opts.alias. */
  var aliases: StringDictionary[js.Array[String]] = js.native
  /** An object representing the parsed value of `args` */
  var argv: Arguments = js.native
  /** The configuration loaded from the yargs stanza in package.json. */
  var configuration: Configuration = js.native
  /** Populated with an error object if an exception occurred during parsing. */
  var error: Error | Null = js.native
  /** Any new aliases added via camel-case expansion. */
  var newAliases: StringDictionary[Boolean] = js.native
}

object DetailedArguments {
  @scala.inline
  def apply(
    aliases: StringDictionary[js.Array[String]],
    argv: Arguments,
    configuration: Configuration,
    newAliases: StringDictionary[Boolean]
  ): DetailedArguments = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], argv = argv.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], newAliases = newAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedArguments]
  }
  @scala.inline
  implicit class DetailedArgumentsOps[Self <: DetailedArguments] (val x: Self) extends AnyVal {
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
    def setAliases(value: StringDictionary[js.Array[String]]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgv(value: Arguments): Self = this.set("argv", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfiguration(value: Configuration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewAliases(value: StringDictionary[Boolean]): Self = this.set("newAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
  
}

