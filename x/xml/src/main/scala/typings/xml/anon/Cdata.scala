package typings.xml.anon

import typings.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cdata extends _XmlDesc {
  var _cdata: String
}

object Cdata {
  @scala.inline
  def apply(_cdata: String): Cdata = {
    val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cdata]
  }
}

