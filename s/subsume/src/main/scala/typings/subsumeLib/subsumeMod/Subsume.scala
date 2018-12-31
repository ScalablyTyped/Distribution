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

