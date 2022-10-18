package typings.wordpressBlockEditor

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wordpressBlockEditor.anon.Index
import typings.wordpressBlockEditor.mod.EditorBlockListSettings
import typings.wordpressBlockEditor.mod.EditorBlockMode
import typings.wordpressBlockEditor.mod.EditorInserterItem
import typings.wordpressBlockEditor.mod.EditorSelection
import typings.wordpressBlockEditor.mod.EditorSettings
import typings.wordpressBlockEditor.wordpressBlockEditorInts.`-1`
import typings.wordpressBlockEditor.wordpressBlockEditorInts.`1`
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeSelectorsMod {
  
  @JSImport("@wordpress/block-editor/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canInsertBlockType(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canInsertBlockType")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def canInsertBlockType(blockName: String, rootClientId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canInsertBlockType")(blockName.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getAdjacentBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")().asInstanceOf[String | Null]
  inline def getAdjacentBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getAdjacentBlockClientId(startClientId: String, modifier: `1` | `-1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getAdjacentBlockClientId(startClientId: Unit, modifier: `1` | `-1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getBlock(clientId: String): BlockInstance[StringDictionary[Any]] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[StringDictionary[Any]] | Null]
  
  inline def getBlockAttributes(clientId: String): (Record[String, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(clientId.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | Null]
  
  inline def getBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockCount")().asInstanceOf[Double]
  inline def getBlockCount(rootClientId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockCount")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getBlockHierarchyRootClientId(clientId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockHierarchyRootClientId")(clientId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBlockIndex(clientId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockIndex")(clientId.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getBlockIndex(clientId: String, rootClientId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockIndex")(clientId.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getBlockInsertionPoint(): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockInsertionPoint")().asInstanceOf[Index]
  
  inline def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockListSettings")().asInstanceOf[js.UndefOr[EditorBlockListSettings]]
  inline def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockListSettings")(clientId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EditorBlockListSettings]]
  
  inline def getBlockMode(clientId: String): EditorBlockMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMode")(clientId.asInstanceOf[js.Any]).asInstanceOf[EditorBlockMode]
  
  inline def getBlockName(clientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockName")(clientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getBlockOrder(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockOrder")().asInstanceOf[js.Array[String]]
  inline def getBlockOrder(rootClientId: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockOrder")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getBlockRootClientId(clientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockRootClientId")(clientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getBlockSelectionEnd(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSelectionEnd")().asInstanceOf[js.UndefOr[String]]
  
  inline def getBlockSelectionStart(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSelectionStart")().asInstanceOf[js.UndefOr[String]]
  
  inline def getBlocks(): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocks")().asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocks")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  inline def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[Any]] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocksByClientId")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]] | Null]]
  inline def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[Any]] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocksByClientId")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]] | Null]]
  
  inline def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientIdsOfDescendants")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getClientIdsWithDescendants(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientIdsWithDescendants")().asInstanceOf[js.Array[String]]
  
  inline def getFirstMultiSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMultiSelectedBlockClientId")().asInstanceOf[String | Null]
  
  inline def getGlobalBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalBlockCount")().asInstanceOf[Double]
  inline def getGlobalBlockCount(blockName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalBlockCount")(blockName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getInserterItems(): js.Array[EditorInserterItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInserterItems")().asInstanceOf[js.Array[EditorInserterItem]]
  inline def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInserterItems")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[EditorInserterItem]]
  
  inline def getLastMultiSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastMultiSelectedBlockClientId")().asInstanceOf[String | Null]
  
  inline def getMultiSelectedBlockClientIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlockClientIds")().asInstanceOf[js.Array[String]]
  
  inline def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocks")().asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  inline def getMultiSelectedBlocksEndClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocksEndClientId")().asInstanceOf[String | Null]
  
  inline def getMultiSelectedBlocksStartClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocksStartClientId")().asInstanceOf[String | Null]
  
  inline def getNextBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextBlockClientId")().asInstanceOf[String | Null]
  inline def getNextBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getPreviousBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousBlockClientId")().asInstanceOf[String | Null]
  inline def getPreviousBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getSelectedBlock(): BlockInstance[StringDictionary[Any]] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlock")().asInstanceOf[BlockInstance[StringDictionary[Any]] | Null]
  
  inline def getSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockClientId")().asInstanceOf[String | Null]
  
  inline def getSelectedBlockClientIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockClientIds")().asInstanceOf[js.Array[String]]
  
  inline def getSelectedBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockCount")().asInstanceOf[Double]
  
  inline def getSelectedBlocksInitialCaretPosition(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlocksInitialCaretPosition")().asInstanceOf[Double | Null]
  
  inline def getSelectionEnd(): EditorSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionEnd")().asInstanceOf[EditorSelection]
  
  inline def getSelectionStart(): EditorSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionStart")().asInstanceOf[EditorSelection]
  
  inline def getSettings(): EditorSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[EditorSettings]
  
  inline def getTemplate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")().asInstanceOf[Any]
  
  inline def getTemplateLock(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateLock")().asInstanceOf[js.UndefOr[String]]
  inline def getTemplateLock(rootClientId: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateLock")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def hasInserterItems(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInserterItems")().asInstanceOf[Boolean]
  inline def hasInserterItems(rootClientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInserterItems")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasMultiSelection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMultiSelection")().asInstanceOf[Boolean]
  
  inline def hasSelectedBlock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedBlock")().asInstanceOf[Boolean]
  
  inline def hasSelectedInnerBlock(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedInnerBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedInnerBlock")(clientId.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAncestorMultiSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAncestorMultiSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockInsertionPointVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockInsertionPointVisible")().asInstanceOf[Boolean]
  
  inline def isBlockMultiSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockMultiSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockValid(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockValid")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockWithinSelection(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockWithinSelection")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCaretWithinFormattedText(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaretWithinFormattedText")().asInstanceOf[Boolean]
  
  inline def isFirstMultiSelectedBlock(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstMultiSelectedBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLastBlockChangePersistent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastBlockChangePersistent")().asInstanceOf[Boolean]
  
  inline def isMultiSelecting(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelecting")().asInstanceOf[Boolean]
  
  inline def isSelectionEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionEnabled")().asInstanceOf[Boolean]
  
  inline def isTyping(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTyping")().asInstanceOf[Boolean]
  
  inline def isValidTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTemplate")().asInstanceOf[Boolean]
}
