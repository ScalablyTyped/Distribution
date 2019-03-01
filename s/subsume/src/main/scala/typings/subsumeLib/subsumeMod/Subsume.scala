package typings
package subsumeLib.subsumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subsume extends js.Object {
  var id: java.lang.String
  var postfix: java.lang.String
  var prefix: java.lang.String
  var regex: stdLib.RegExp
  def compose(text: java.lang.String): java.lang.String
  def parse(text: java.lang.String): subsumeLib.subsumeMod.SubsumeNs.ParseResult
}

object Subsume {
  @scala.inline
  def apply(
    compose: js.Function1[java.lang.String, java.lang.String],
    id: java.lang.String,
    parse: js.Function1[java.lang.String, subsumeLib.subsumeMod.SubsumeNs.ParseResult],
    postfix: java.lang.String,
    prefix: java.lang.String,
    regex: stdLib.RegExp
  ): Subsume = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compose")(compose)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("postfix")(postfix)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Subsume]
  }
}

