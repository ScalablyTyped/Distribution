package typings.wordpressBlocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeSelectorsMod {
  
  @JSImport("@wordpress/blocks/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlockStyles(blockName: String): js.UndefOr[js.Array[BlockStyle]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockStyles")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[BlockStyle]]]
  
  inline def getFreeformFallbackBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformFallbackBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getUnregisteredFallbackBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredFallbackBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def isMatchingSearchTerm(nameOrType: String, searchTerm: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingSearchTerm")(nameOrType.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingSearchTerm(nameOrType: Block[Any], searchTerm: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingSearchTerm")(nameOrType.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
