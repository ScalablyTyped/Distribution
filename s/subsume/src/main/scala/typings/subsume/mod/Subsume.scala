package typings.subsume.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subsume extends js.Object {
  /**
  	Used identifier.
  	*/
  var id: String
  /**
  	Postfix used in `.compose()`.
  	*/
  var postfix: String
  /**
  	Prefix used in `.compose()`.
  	*/
  var prefix: String
  /**
  	Regex used in `.parse()`.
  	*/
  var regex: RegExp
  /**
  	@returns A wrapped version of `text` that you can embed in other content.
  	*/
  def compose(string: String): String
  /**
  	Extract your embedded data from `text`.
  	@returns An object with properties `.data` for your embedded data and `.rest` for everything else.
  	*/
  def parse(string: String): ParseResult
}

object Subsume {
  @scala.inline
  def apply(
    compose: String => String,
    id: String,
    parse: String => ParseResult,
    postfix: String,
    prefix: String,
    regex: RegExp
  ): Subsume = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), id = id.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), postfix = postfix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Subsume]
  }
}

