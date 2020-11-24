package typings.webcola.layoutMod

import typings.webcola.linklengthsMod.LinkLengthAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkLengthTypeAccessor extends LinkLengthAccessor[Link[Node | Double]] {
  
  def getType(t: Link[Node | Double]): Double = js.native
  @JSName("getType")
  var getType_Original: LinkNumericPropertyAccessor = js.native
}
