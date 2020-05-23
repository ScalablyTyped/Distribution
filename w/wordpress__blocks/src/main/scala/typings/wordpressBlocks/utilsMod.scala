package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.mod.BlockIcon
import typings.wordpressBlocks.mod.BlockIconNormalized
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks/api/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[_]]): Boolean = js.native
  def isValidIcon(icon: js.Any): Boolean = js.native
  def normalizeIconObject(): BlockIconNormalized = js.native
  def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = js.native
}

