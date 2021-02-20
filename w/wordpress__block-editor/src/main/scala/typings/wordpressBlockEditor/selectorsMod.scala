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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/block-editor/store/selectors", "canInsertBlockType")
  @js.native
  def canInsertBlockType(blockName: String): Boolean = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "canInsertBlockType")
  @js.native
  def canInsertBlockType(blockName: String, rootClientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId(): String | Null = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId(startClientId: String): String | Null = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `-1`): String | Null = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `1`): String | Null = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `-1`): String | Null = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `1`): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlock")
  @js.native
  def getBlock(clientId: String): BlockInstance[StringDictionary[_]] | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockAttributes")
  @js.native
  def getBlockAttributes(clientId: String): (Record[String, _]) | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockCount")
  @js.native
  def getBlockCount(): Double = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockCount")
  @js.native
  def getBlockCount(rootClientId: String): Double = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockHierarchyRootClientId")
  @js.native
  def getBlockHierarchyRootClientId(clientId: String): String = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockIndex")
  @js.native
  def getBlockIndex(clientId: String): Double = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockIndex")
  @js.native
  def getBlockIndex(clientId: String, rootClientId: String): Double = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockInsertionPoint")
  @js.native
  def getBlockInsertionPoint(): Index = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockListSettings")
  @js.native
  def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockListSettings")
  @js.native
  def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockMode")
  @js.native
  def getBlockMode(clientId: String): EditorBlockMode = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockName")
  @js.native
  def getBlockName(clientId: String): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockOrder")
  @js.native
  def getBlockOrder(): js.Array[String] = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockOrder")
  @js.native
  def getBlockOrder(rootClientId: String): js.Array[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockRootClientId")
  @js.native
  def getBlockRootClientId(clientId: String): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockSelectionEnd")
  @js.native
  def getBlockSelectionEnd(): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlockSelectionStart")
  @js.native
  def getBlockSelectionStart(): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlocks")
  @js.native
  def getBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getBlocks")
  @js.native
  def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getBlocksByClientId")
  @js.native
  def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getBlocksByClientId")
  @js.native
  def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getClientIdsOfDescendants")
  @js.native
  def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getClientIdsWithDescendants")
  @js.native
  def getClientIdsWithDescendants(): js.Array[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getFirstMultiSelectedBlockClientId")
  @js.native
  def getFirstMultiSelectedBlockClientId(): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getGlobalBlockCount")
  @js.native
  def getGlobalBlockCount(): Double = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getGlobalBlockCount")
  @js.native
  def getGlobalBlockCount(blockName: String): Double = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getInserterItems")
  @js.native
  def getInserterItems(): js.Array[EditorInserterItem] = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getInserterItems")
  @js.native
  def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getLastMultiSelectedBlockClientId")
  @js.native
  def getLastMultiSelectedBlockClientId(): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getMultiSelectedBlockClientIds")
  @js.native
  def getMultiSelectedBlockClientIds(): js.Array[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getMultiSelectedBlocks")
  @js.native
  def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getMultiSelectedBlocksEndClientId")
  @js.native
  def getMultiSelectedBlocksEndClientId(): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getMultiSelectedBlocksStartClientId")
  @js.native
  def getMultiSelectedBlocksStartClientId(): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getNextBlockClientId")
  @js.native
  def getNextBlockClientId(): String | Null = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getNextBlockClientId")
  @js.native
  def getNextBlockClientId(startClientId: String): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getPreviousBlockClientId")
  @js.native
  def getPreviousBlockClientId(): String | Null = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getPreviousBlockClientId")
  @js.native
  def getPreviousBlockClientId(startClientId: String): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSelectedBlock")
  @js.native
  def getSelectedBlock(): BlockInstance[StringDictionary[_]] | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSelectedBlockClientId")
  @js.native
  def getSelectedBlockClientId(): String | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSelectedBlockClientIds")
  @js.native
  def getSelectedBlockClientIds(): js.Array[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSelectedBlockCount")
  @js.native
  def getSelectedBlockCount(): Double = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSelectedBlocksInitialCaretPosition")
  @js.native
  def getSelectedBlocksInitialCaretPosition(): Double | Null = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSelectionEnd")
  @js.native
  def getSelectionEnd(): EditorSelection = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSelectionStart")
  @js.native
  def getSelectionStart(): EditorSelection = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getSettings")
  @js.native
  def getSettings(): EditorSettings = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getTemplate")
  @js.native
  def getTemplate(): js.Any = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "getTemplateLock")
  @js.native
  def getTemplateLock(): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "getTemplateLock")
  @js.native
  def getTemplateLock(rootClientId: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "hasInserterItems")
  @js.native
  def hasInserterItems(): Boolean = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "hasInserterItems")
  @js.native
  def hasInserterItems(rootClientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "hasMultiSelection")
  @js.native
  def hasMultiSelection(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "hasSelectedBlock")
  @js.native
  def hasSelectedBlock(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "hasSelectedInnerBlock")
  @js.native
  def hasSelectedInnerBlock(clientId: String): Boolean = js.native
  @JSImport("@wordpress/block-editor/store/selectors", "hasSelectedInnerBlock")
  @js.native
  def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isAncestorMultiSelected")
  @js.native
  def isAncestorMultiSelected(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isBlockInsertionPointVisible")
  @js.native
  def isBlockInsertionPointVisible(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isBlockMultiSelected")
  @js.native
  def isBlockMultiSelected(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isBlockSelected")
  @js.native
  def isBlockSelected(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isBlockValid")
  @js.native
  def isBlockValid(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isBlockWithinSelection")
  @js.native
  def isBlockWithinSelection(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isCaretWithinFormattedText")
  @js.native
  def isCaretWithinFormattedText(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isFirstMultiSelectedBlock")
  @js.native
  def isFirstMultiSelectedBlock(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isLastBlockChangePersistent")
  @js.native
  def isLastBlockChangePersistent(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isMultiSelecting")
  @js.native
  def isMultiSelecting(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isSelectionEnabled")
  @js.native
  def isSelectionEnabled(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isTyping")
  @js.native
  def isTyping(): Boolean = js.native
  
  @JSImport("@wordpress/block-editor/store/selectors", "isValidTemplate")
  @js.native
  def isValidTemplate(): Boolean = js.native
}
