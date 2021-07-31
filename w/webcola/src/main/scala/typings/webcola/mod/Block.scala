package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Block")
@js.native
class Block protected ()
  extends typings.webcola.vpscMod.Block {
  def this(v: typings.webcola.vpscMod.Variable) = this()
}
/* static members */
object Block {
  
  @JSImport("webcola", "Block")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola", "Block.createSplitBlock")
  @js.native
  def createSplitBlock: js.Any = js.native
  @scala.inline
  def createSplitBlock_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSplitBlock")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def split(c: typings.webcola.vpscMod.Constraint): js.Array[typings.webcola.vpscMod.Block] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(c.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.webcola.vpscMod.Block]]
}
