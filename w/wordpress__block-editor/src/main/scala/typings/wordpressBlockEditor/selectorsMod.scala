package typings.wordpressBlockEditor

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wordpressBlockEditor.anon.Index
import typings.wordpressBlockEditor.mod.EditorBlockListSettings
import typings.wordpressBlockEditor.mod.EditorBlockMode
import typings.wordpressBlockEditor.mod.EditorInserterItem
import typings.wordpressBlockEditor.mod.EditorSelection
import typings.wordpressBlockEditor.mod.EditorSettings
import typings.wordpressBlockEditor.wordpressBlockEditorNumbers.`-1`
import typings.wordpressBlockEditor.wordpressBlockEditorNumbers.`1`
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/block-editor/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canInsertBlockType(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canInsertBlockType")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def canInsertBlockType(blockName: String, rootClientId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canInsertBlockType")(blockName.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getAdjacentBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")().asInstanceOf[String | Null]
  @scala.inline
  def getAdjacentBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `-1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  @scala.inline
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  @scala.inline
  def getAdjacentBlockClientId_1(startClientId: Unit, modifier: `-1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  @scala.inline
  def getAdjacentBlockClientId_1(startClientId: Unit, modifier: `1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def getBlock(clientId: String): BlockInstance[StringDictionary[js.Any]] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[StringDictionary[js.Any]] | Null]
  
  @scala.inline
  def getBlockAttributes(clientId: String): (Record[String, js.Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(clientId.asInstanceOf[js.Any]).asInstanceOf[(Record[String, js.Any]) | Null]
  
  @scala.inline
  def getBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockCount")().asInstanceOf[Double]
  @scala.inline
  def getBlockCount(rootClientId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockCount")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getBlockHierarchyRootClientId(clientId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockHierarchyRootClientId")(clientId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getBlockIndex(clientId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockIndex")(clientId.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getBlockIndex(clientId: String, rootClientId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockIndex")(clientId.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getBlockInsertionPoint(): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockInsertionPoint")().asInstanceOf[Index]
  
  @scala.inline
  def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockListSettings")().asInstanceOf[js.UndefOr[EditorBlockListSettings]]
  @scala.inline
  def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockListSettings")(clientId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EditorBlockListSettings]]
  
  @scala.inline
  def getBlockMode(clientId: String): EditorBlockMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMode")(clientId.asInstanceOf[js.Any]).asInstanceOf[EditorBlockMode]
  
  @scala.inline
  def getBlockName(clientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockName")(clientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getBlockOrder(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockOrder")().asInstanceOf[js.Array[String]]
  @scala.inline
  def getBlockOrder(rootClientId: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockOrder")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getBlockRootClientId(clientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockRootClientId")(clientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getBlockSelectionEnd(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSelectionEnd")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getBlockSelectionStart(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSelectionStart")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getBlocks(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocks")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  @scala.inline
  def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocks")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  @scala.inline
  def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[js.Any]] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocksByClientId")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]] | Null]]
  @scala.inline
  def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[js.Any]] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocksByClientId")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]] | Null]]
  
  @scala.inline
  def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientIdsOfDescendants")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getClientIdsWithDescendants(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientIdsWithDescendants")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getFirstMultiSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMultiSelectedBlockClientId")().asInstanceOf[String | Null]
  
  @scala.inline
  def getGlobalBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalBlockCount")().asInstanceOf[Double]
  @scala.inline
  def getGlobalBlockCount(blockName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalBlockCount")(blockName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getInserterItems(): js.Array[EditorInserterItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInserterItems")().asInstanceOf[js.Array[EditorInserterItem]]
  @scala.inline
  def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInserterItems")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[EditorInserterItem]]
  
  @scala.inline
  def getLastMultiSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastMultiSelectedBlockClientId")().asInstanceOf[String | Null]
  
  @scala.inline
  def getMultiSelectedBlockClientIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlockClientIds")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocks")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  @scala.inline
  def getMultiSelectedBlocksEndClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocksEndClientId")().asInstanceOf[String | Null]
  
  @scala.inline
  def getMultiSelectedBlocksStartClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocksStartClientId")().asInstanceOf[String | Null]
  
  @scala.inline
  def getNextBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextBlockClientId")().asInstanceOf[String | Null]
  @scala.inline
  def getNextBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getPreviousBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousBlockClientId")().asInstanceOf[String | Null]
  @scala.inline
  def getPreviousBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getSelectedBlock(): BlockInstance[StringDictionary[js.Any]] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlock")().asInstanceOf[BlockInstance[StringDictionary[js.Any]] | Null]
  
  @scala.inline
  def getSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockClientId")().asInstanceOf[String | Null]
  
  @scala.inline
  def getSelectedBlockClientIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockClientIds")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getSelectedBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockCount")().asInstanceOf[Double]
  
  @scala.inline
  def getSelectedBlocksInitialCaretPosition(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlocksInitialCaretPosition")().asInstanceOf[Double | Null]
  
  @scala.inline
  def getSelectionEnd(): EditorSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionEnd")().asInstanceOf[EditorSelection]
  
  @scala.inline
  def getSelectionStart(): EditorSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionStart")().asInstanceOf[EditorSelection]
  
  @scala.inline
  def getSettings(): EditorSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[EditorSettings]
  
  @scala.inline
  def getTemplate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")().asInstanceOf[js.Any]
  
  @scala.inline
  def getTemplateLock(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateLock")().asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def getTemplateLock(rootClientId: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateLock")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def hasInserterItems(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInserterItems")().asInstanceOf[Boolean]
  @scala.inline
  def hasInserterItems(rootClientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInserterItems")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasMultiSelection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMultiSelection")().asInstanceOf[Boolean]
  
  @scala.inline
  def hasSelectedBlock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedBlock")().asInstanceOf[Boolean]
  
  @scala.inline
  def hasSelectedInnerBlock(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedInnerBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedInnerBlock")(clientId.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isAncestorMultiSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAncestorMultiSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBlockInsertionPointVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockInsertionPointVisible")().asInstanceOf[Boolean]
  
  @scala.inline
  def isBlockMultiSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockMultiSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBlockSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBlockValid(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockValid")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBlockWithinSelection(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockWithinSelection")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isCaretWithinFormattedText(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaretWithinFormattedText")().asInstanceOf[Boolean]
  
  @scala.inline
  def isFirstMultiSelectedBlock(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstMultiSelectedBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isLastBlockChangePersistent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastBlockChangePersistent")().asInstanceOf[Boolean]
  
  @scala.inline
  def isMultiSelecting(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelecting")().asInstanceOf[Boolean]
  
  @scala.inline
  def isSelectionEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def isTyping(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTyping")().asInstanceOf[Boolean]
  
  @scala.inline
  def isValidTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTemplate")().asInstanceOf[Boolean]
}
