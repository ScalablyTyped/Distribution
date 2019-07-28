package typings.atWordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: String
  var datetime: String
  var datetimeAbbreviated: String
  var time: String
}

object Anon_Date {
  @scala.inline
  def apply(date: String, datetime: String, datetimeAbbreviated: String, time: String): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date, datetime = datetime, datetimeAbbreviated = datetimeAbbreviated, time = time)
  
    __obj.asInstanceOf[Anon_Date]
  }
}

