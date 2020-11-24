package typings.wordpressBlocks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "isValidBlockContent")
@js.native
object isValidBlockContent extends js.Object {
  
  def apply[T](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = js.native
  def apply[T](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = js.native
}
