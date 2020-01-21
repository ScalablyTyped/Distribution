package typings.webcola.layoutMod

import typings.webcola.linklengthsMod.LinkLengthAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkLengthTypeAccessor extends LinkLengthAccessor[Link[Node | Double]] {
  @JSName("getType")
  var getType_Original: LinkNumericPropertyAccessor = js.native
  def getType(t: Link[Node | Double]): Double = js.native
}

