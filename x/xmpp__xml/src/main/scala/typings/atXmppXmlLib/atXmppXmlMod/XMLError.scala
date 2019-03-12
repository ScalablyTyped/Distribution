package typings
package atXmppXmlLib.atXmppXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLError
  extends stdLib.Error {
  @JSName("name")
  val name_XMLError: atXmppXmlLib.atXmppXmlLibStrings.XMLError
}

object XMLError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: atXmppXmlLib.atXmppXmlLibStrings.XMLError,
    stack: java.lang.String = null
  ): XMLError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[XMLError]
  }
}

