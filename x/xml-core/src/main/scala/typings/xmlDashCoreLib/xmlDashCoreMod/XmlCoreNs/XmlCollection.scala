package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlCollection[I /* <: XmlObject */]
  extends XmlObject
     with ICollection[I] {
  var MaxOccurs: scala.Double = js.native
  var MinOccurs: scala.Double = js.native
  var items: js.Array[I] = js.native
  /* InferMemberOverrides */
  override def IsEmpty(): scala.Boolean = js.native
}

