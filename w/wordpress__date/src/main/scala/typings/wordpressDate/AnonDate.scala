package typings.wordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: String
  var datetime: String
  var datetimeAbbreviated: String
  var time: String
}

object AnonDate {
  @scala.inline
  def apply(date: String, datetime: String, datetimeAbbreviated: String, time: String): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], datetimeAbbreviated = datetimeAbbreviated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}

