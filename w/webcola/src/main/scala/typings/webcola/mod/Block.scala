package typings.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Block")
@js.native
class Block protected ()
  extends typings.webcola.vpscMod.Block {
  def this(v: typings.webcola.vpscMod.Variable) = this()
}
/* static members */
@JSImport("webcola", "Block")
@js.native
object Block extends js.Object {
  
  var createSplitBlock: js.Any = js.native
  
  def split(c: typings.webcola.vpscMod.Constraint): js.Array[typings.webcola.vpscMod.Block] = js.native
}
