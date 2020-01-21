package typings.xml

import typings.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCdata extends _XmlDesc {
  var _cdata: String
}

object AnonCdata {
  @scala.inline
  def apply(_cdata: String): AnonCdata = {
    val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCdata]
  }
}

