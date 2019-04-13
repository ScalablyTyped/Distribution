package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlError")
@js.native
class XmlError protected ()
  extends stdLib.Error {
  def this(code: XE, args: js.Any*) = this()
  var code: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  val prefix: java.lang.String = js.native
}

