package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicationuuidv4 extends js.Object {
  var application_uuidv4: String
  var payload_uuidv4: String
  var url: String
}

object Applicationuuidv4 {
  @scala.inline
  def apply(application_uuidv4: String, payload_uuidv4: String, url: String): Applicationuuidv4 = {
    val __obj = js.Dynamic.literal(application_uuidv4 = application_uuidv4.asInstanceOf[js.Any], payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationuuidv4]
  }
}

