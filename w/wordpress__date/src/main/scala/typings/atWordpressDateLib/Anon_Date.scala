package typings
package atWordpressDateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: java.lang.String
  var datetime: java.lang.String
  var datetimeAbbreviated: java.lang.String
  var time: java.lang.String
}

object Anon_Date {
  @scala.inline
  def apply(
    date: java.lang.String,
    datetime: java.lang.String,
    datetimeAbbreviated: java.lang.String,
    time: java.lang.String
  ): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date, datetime = datetime, datetimeAbbreviated = datetimeAbbreviated, time = time)
  
    __obj.asInstanceOf[Anon_Date]
  }
}

