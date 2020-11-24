package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "getSaveContent")
@js.native
object getSaveContent extends js.Object {
  
  def apply[T](blockTypeOrName: String, attributes: T): String = js.native
  def apply[T](blockTypeOrName: String, attributes: T, innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): String = js.native
  def apply[T](blockTypeOrName: Block[T], attributes: T): String = js.native
  def apply[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): String = js.native
}
