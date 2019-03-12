package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlError
  extends stdLib.Error {
  var code: scala.Double
  val prefix: java.lang.String
}

object XmlError {
  @scala.inline
  def apply(
    code: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    prefix: java.lang.String,
    stack: js.Any
  ): XmlError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name, prefix = prefix, stack = stack)
  
    __obj.asInstanceOf[XmlError]
  }
}

