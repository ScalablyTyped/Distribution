package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Block")
@js.native
class Block protected ()
  extends webcolaLib.distSrcVpscMod.Block {
  def this(v: webcolaLib.distSrcVpscMod.Variable) = this()
}

/* static members */
@JSImport("webcola", "Block")
@js.native
object Block extends js.Object {
  var createSplitBlock: js.Any = js.native
  def split(c: webcolaLib.distSrcVpscMod.Constraint): js.Array[webcolaLib.distSrcVpscMod.Block] = js.native
}

