package typings.wordpressBlocks.mod

import typings.wordpressBlocks.anon.TypeofimportedActions
import typings.wordpressBlocks.anon.TypeofimportedSelectors
import typings.wordpressBlocks.wordpressBlocksStrings.coreSlashblocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressDataAugmentingMod {
  
  @JSImport("@wordpress/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch_coreblocks(key: coreSlashblocks): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
  
  inline def select_coreblocks(key: coreSlashblocks): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
}
