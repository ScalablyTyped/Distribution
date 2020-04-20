package typings.xmlcreate.xmlEntityRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlEntityRefOptions extends js.Object {
  /**
    * The name of the entity to be referenced.
    */
  var name: String
}

object IXmlEntityRefOptions {
  @scala.inline
  def apply(name: String): IXmlEntityRefOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlEntityRefOptions]
  }
}

