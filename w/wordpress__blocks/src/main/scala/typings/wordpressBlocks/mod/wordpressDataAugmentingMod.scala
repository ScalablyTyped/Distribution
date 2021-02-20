package typings.wordpressBlocks.mod

import typings.wordpressBlocks.anon.TypeofimportedActions
import typings.wordpressBlocks.anon.TypeofimportedSelectors
import typings.wordpressBlocks.wordpressBlocksStrings.coreSlashblocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object wordpressDataAugmentingMod {
  
  @JSImport("@wordpress/data", "dispatch")
  @js.native
  def dispatch_coreblocks(key: coreSlashblocks): TypeofimportedActions = js.native
  
  @JSImport("@wordpress/data", "select")
  @js.native
  def select_coreblocks(key: coreSlashblocks): TypeofimportedSelectors = js.native
}
