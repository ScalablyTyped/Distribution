package typings.xmlDashCore.xmlDashCoreMod

import typings.std.Error
import typings.xmlDashCore.xmlDashCoreStrings.XMLJS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlError")
@js.native
class XmlError protected () extends Error {
  def this(code: XE, args: js.Any*) = this()
  var code: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  val prefix: XMLJS = js.native
}

