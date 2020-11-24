package typings.wordpressBlocks.mod

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressBlocks.wordpressBlocksStrings.BlockContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "withBlockContentContext")
@js.native
object withBlockContentContext extends js.Object {
  
  def apply[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, BlockContent]] = js.native
}
