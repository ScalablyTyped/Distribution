package typings.atXmppXml.atXmppXmlMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLError extends Error {
  @JSName("name")
  val name_XMLError: typings.atXmppXml.atXmppXmlStrings.XMLError
}

object XMLError {
  @scala.inline
  def apply(message: String, name: typings.atXmppXml.atXmppXmlStrings.XMLError, stack: String = null): XMLError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[XMLError]
  }
}

