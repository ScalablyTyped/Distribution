package typings.wordpressBlocks.anon

import typings.wordpressBlocks.Block
import typings.wordpressBlocks.BlockStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSelectors extends StObject {
  
  def getBlockStyles(blockName: String): js.UndefOr[js.Array[BlockStyle]] = js.native
  
  def getFreeformFallbackBlockName(): js.UndefOr[String] = js.native
  
  def getUnregisteredFallbackBlockName(): js.UndefOr[String] = js.native
  
  def isMatchingSearchTerm(nameOrType: String, searchTerm: String): Boolean = js.native
  def isMatchingSearchTerm(nameOrType: Block[Any], searchTerm: String): Boolean = js.native
}
