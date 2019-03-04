package typings
package subsumeLib.subsumeMod.SubsumeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResults extends js.Object {
  var data: stdLib.Map[java.lang.String, java.lang.String]
  var rest: java.lang.String
}

object ParseResults {
  @scala.inline
  def apply(data: stdLib.Map[java.lang.String, java.lang.String], rest: java.lang.String): ParseResults = {
    val __obj = js.Dynamic.literal(data = data, rest = rest)
  
    __obj.asInstanceOf[ParseResults]
  }
}

