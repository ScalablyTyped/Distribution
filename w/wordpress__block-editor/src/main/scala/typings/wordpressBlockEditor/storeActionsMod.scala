package typings.wordpressBlockEditor

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.std.Record
import typings.wordpressBlockEditor.anon.PartialBlockInstancekstri
import typings.wordpressBlockEditor.anon.PartialEditorSettings
import typings.wordpressBlockEditor.mod.EditorBlockListSettings
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeActionsMod {
  
  @JSImport("@wordpress/block-editor/store/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearSelectedBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSelectedBlock")().asInstanceOf[Unit]
  
  inline def enterFormattedText(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enterFormattedText")().asInstanceOf[Unit]
  
  inline def exitFormattedText(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exitFormattedText")().asInstanceOf[Unit]
  
  inline def hideInsertionPoint(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideInsertionPoint")().asInstanceOf[Unit]
  
  inline def insertBlock(block: BlockInstance[StringDictionary[Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Double, rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Double,
    rootClientId: String,
    updateSelection: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Double,
    rootClientId: Unit,
    updateSelection: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Unit, rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Unit,
    rootClientId: String,
    updateSelection: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Unit,
    rootClientId: Unit,
    updateSelection: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlock")(block.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Unit]]
  inline def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Double, rootClientId: String): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Double,
    rootClientId: String,
    updateSelection: Boolean
  ): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Double,
    rootClientId: Unit,
    updateSelection: Boolean
  ): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Unit, rootClientId: String): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Unit,
    rootClientId: String,
    updateSelection: Boolean
  ): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Unit,
    rootClientId: Unit,
    updateSelection: Boolean
  ): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBlocks")(blocks.asInstanceOf[js.Any], index.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  
  inline def insertDefaultBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")().asInstanceOf[Unit]
  inline def insertDefaultBlock(attributes: Unit, rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")(attributes.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertDefaultBlock(attributes: Unit, rootClientId: String, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")(attributes.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertDefaultBlock(attributes: Unit, rootClientId: Unit, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")(attributes.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertDefaultBlock(attributes: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")(attributes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insertDefaultBlock(attributes: Record[String, Any], rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")(attributes.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertDefaultBlock(attributes: Record[String, Any], rootClientId: String, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")(attributes.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertDefaultBlock(attributes: Record[String, Any], rootClientId: Unit, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertDefaultBlock")(attributes.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeBlocks(firstBlockClientId: String, secondBlockClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeBlocks")(firstBlockClientId.asInstanceOf[js.Any], secondBlockClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: Unit, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def moveBlockToPosition(clientId: String, fromRootClientId: Unit, toRootClientId: String, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def moveBlockToPosition(clientId: String, fromRootClientId: Unit, toRootClientId: Unit, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def moveBlockToPosition(clientId: Unit, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def moveBlockToPosition(clientId: Unit, fromRootClientId: String, toRootClientId: Unit, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def moveBlockToPosition(clientId: Unit, fromRootClientId: Unit, toRootClientId: String, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def moveBlockToPosition(clientId: Unit, fromRootClientId: Unit, toRootClientId: Unit, index: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlockToPosition")(clientId.asInstanceOf[js.Any], fromRootClientId.asInstanceOf[js.Any], toRootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  
  inline def moveBlocksDown(clientIds: String, rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlocksDown")(clientIds.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def moveBlocksDown(clientIds: js.Array[String], rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlocksDown")(clientIds.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveBlocksUp(clientIds: String, rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlocksUp")(clientIds.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def moveBlocksUp(clientIds: js.Array[String], rootClientId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBlocksUp")(clientIds.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def multiSelect(start: String, end: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("multiSelect")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def receiveBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("receiveBlocks")(blocks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeBlock(clientId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeBlock(clientId: String, selectPrevious: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBlock")(clientId.asInstanceOf[js.Any], selectPrevious.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeBlocks(clientIds: String): IterableIterator[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBlocks")(clientIds.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Unit]]
  inline def removeBlocks(clientIds: String, selectPrevious: Boolean): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBlocks")(clientIds.asInstanceOf[js.Any], selectPrevious.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def removeBlocks(clientIds: js.Array[String]): IterableIterator[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBlocks")(clientIds.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Unit]]
  inline def removeBlocks(clientIds: js.Array[String], selectPrevious: Boolean): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBlocks")(clientIds.asInstanceOf[js.Any], selectPrevious.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  
  inline def replaceBlock(clientId: String, block: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlock")(clientId.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceBlock(clientId: String, block: BlockInstance[StringDictionary[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlock")(clientId.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceBlock(clientId: js.Array[String], block: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlock")(clientId.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceBlock(clientId: js.Array[String], block: BlockInstance[StringDictionary[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlock")(clientId.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]], indexToSelect: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any], indexToSelect.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[Any]]): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[Any]], indexToSelect: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any], indexToSelect.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def replaceBlocks(clientIds: js.Array[String], blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def replaceBlocks(
    clientIds: js.Array[String],
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    indexToSelect: Double
  ): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any], indexToSelect.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[Any]]): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  inline def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[Any]], indexToSelect: Double): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceBlocks")(clientIds.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any], indexToSelect.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
  
  inline def replaceInnerBlocks(rootClientId: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceInnerBlocks")(rootClientId.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceInnerBlocks(
    rootClientId: String,
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    updateSelection: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceInnerBlocks")(rootClientId.asInstanceOf[js.Any], blocks.asInstanceOf[js.Any], updateSelection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetBlocks")(blocks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def selectBlock(clientId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def selectBlock(clientId: String, initialPosition: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectBlock")(clientId.asInstanceOf[js.Any], initialPosition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def selectNextBlock(clientId: String): IterableIterator[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNextBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Unit]]
  
  inline def selectPreviousBlock(clientId: String): IterableIterator[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectPreviousBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Unit]]
  
  inline def selectionChange(clientId: String, attributeKey: String, startOffset: Double, endOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectionChange")(clientId.asInstanceOf[js.Any], attributeKey.asInstanceOf[js.Any], startOffset.asInstanceOf[js.Any], endOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTemplateValidity(isValid: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateValidity")(isValid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def showInsertionPoint(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showInsertionPoint")().asInstanceOf[Unit]
  inline def showInsertionPoint(rootClientId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showInsertionPoint")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showInsertionPoint(rootClientId: String, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showInsertionPoint")(rootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def showInsertionPoint(rootClientId: Unit, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showInsertionPoint")(rootClientId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startMultiSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startMultiSelect")().asInstanceOf[Unit]
  
  inline def startTyping(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTyping")().asInstanceOf[Unit]
  
  inline def stopMultiSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopMultiSelect")().asInstanceOf[Unit]
  
  inline def stopTyping(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopTyping")().asInstanceOf[Unit]
  
  inline def synchronizeTemplate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeTemplate")().asInstanceOf[Unit]
  
  inline def toggleBlockMode(clientId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleBlockMode")(clientId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toggleSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSelection")().asInstanceOf[Unit]
  inline def toggleSelection(isSelectionEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSelection")(isSelectionEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def updateBlock(clientId: String, updates: PartialBlockInstancekstri): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBlock")(clientId.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateBlockAttributes(clientId: String, attributes: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBlockAttributes")(clientId.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateBlockListSettings(clientId: String, settings: EditorBlockListSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBlockListSettings")(clientId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateSettings(settings: PartialEditorSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
