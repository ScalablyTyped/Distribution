package typings.webcola.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Block")
@js.native
class Block protected ()
  extends typings.webcola.distSrcVpscMod.Block {
  def this(v: typings.webcola.distSrcVpscMod.Variable) = this()
}

/* static members */
@JSImport("webcola", "Block")
@js.native
object Block extends js.Object {
  var createSplitBlock: js.Any = js.native
  def split(c: typings.webcola.distSrcVpscMod.Constraint): js.Array[typings.webcola.distSrcVpscMod.Block] = js.native
}

