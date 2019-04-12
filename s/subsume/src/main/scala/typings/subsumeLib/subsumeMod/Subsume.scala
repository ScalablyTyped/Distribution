package typings
package subsumeLib.subsumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subsume extends js.Object {
  /**
  	Used identifier.
  	*/
  var id: java.lang.String
  /**
  	Postfix used in `.compose()`.
  	*/
  var postfix: java.lang.String
  /**
  	Prefix used in `.compose()`.
  	*/
  var prefix: java.lang.String
  /**
  	Regex used in `.parse()`.
  	*/
  var regex: stdLib.RegExp
  /**
  	@returns A wrapped version of `text` that you can embed in other content.
  	*/
  def compose(text: java.lang.String): java.lang.String
  /**
  	Extract your embedded data from `text`.
  	@returns an object with properties `.data` for your embedded data and `.rest` for everything else.
  	*/
  def parse(text: java.lang.String): subsumeLib.subsumeMod.SubsumeNs.ParseResult
}

object Subsume {
  @scala.inline
  def apply(
    compose: java.lang.String => java.lang.String,
    id: java.lang.String,
    parse: java.lang.String => subsumeLib.subsumeMod.SubsumeNs.ParseResult,
    postfix: java.lang.String,
    prefix: java.lang.String,
    regex: stdLib.RegExp
  ): Subsume = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), id = id, parse = js.Any.fromFunction1(parse), postfix = postfix, prefix = prefix, regex = regex)
  
    __obj.asInstanceOf[Subsume]
  }
}

