package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.mod.BlockIcon
import typings.wordpressBlocks.mod.BlockIconNormalized
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@wordpress/blocks/api/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[js.Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnmodifiedDefaultBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidIcon(icon: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeIconObject(): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")().asInstanceOf[BlockIconNormalized]
  inline def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")(icon.asInstanceOf[js.Any]).asInstanceOf[BlockIconNormalized]
}
