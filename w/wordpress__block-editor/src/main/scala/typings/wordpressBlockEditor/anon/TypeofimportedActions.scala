package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.std.Record
import typings.wordpressBlockEditor.mod.EditorBlockListSettings
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedActions extends StObject {
  
  def clearSelectedBlock(): Unit = js.native
  
  def enterFormattedText(): Unit = js.native
  
  def exitFormattedText(): Unit = js.native
  
  def hideInsertionPoint(): Unit = js.native
  
  def insertBlock(block: BlockInstance[StringDictionary[Any]]): Unit = js.native
  def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Double): Unit = js.native
  def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Double, rootClientId: String): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Double,
    rootClientId: String,
    updateSelection: Boolean
  ): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Double,
    rootClientId: Unit,
    updateSelection: Boolean
  ): Unit = js.native
  def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Unit, rootClientId: String): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Unit,
    rootClientId: String,
    updateSelection: Boolean
  ): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[Any]],
    index: Unit,
    rootClientId: Unit,
    updateSelection: Boolean
  ): Unit = js.native
  
  def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = js.native
  def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Double): IterableIterator[Unit] = js.native
  def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Double, rootClientId: String): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Double,
    rootClientId: String,
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Double,
    rootClientId: Unit,
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Unit, rootClientId: String): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Unit,
    rootClientId: String,
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    index: Unit,
    rootClientId: Unit,
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  
  def insertDefaultBlock(): Unit = js.native
  def insertDefaultBlock(attributes: Unit, rootClientId: String): Unit = js.native
  def insertDefaultBlock(attributes: Unit, rootClientId: String, index: Double): Unit = js.native
  def insertDefaultBlock(attributes: Unit, rootClientId: Unit, index: Double): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, Any]): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, Any], rootClientId: String): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, Any], rootClientId: String, index: Double): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, Any], rootClientId: Unit, index: Double): Unit = js.native
  
  def mergeBlocks(firstBlockClientId: String, secondBlockClientId: String): Unit = js.native
  
  def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: String, fromRootClientId: Unit, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: String, fromRootClientId: Unit, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: Unit, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: Unit, fromRootClientId: String, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: Unit, fromRootClientId: Unit, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: Unit, fromRootClientId: Unit, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
  
  def moveBlocksDown(clientIds: String, rootClientId: String): Unit = js.native
  def moveBlocksDown(clientIds: js.Array[String], rootClientId: String): Unit = js.native
  
  def moveBlocksUp(clientIds: String, rootClientId: String): Unit = js.native
  def moveBlocksUp(clientIds: js.Array[String], rootClientId: String): Unit = js.native
  
  def multiSelect(start: String, end: String): Unit = js.native
  
  def receiveBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
  
  def removeBlock(clientId: String): Unit = js.native
  def removeBlock(clientId: String, selectPrevious: Boolean): Unit = js.native
  
  def removeBlocks(clientIds: String): IterableIterator[Unit] = js.native
  def removeBlocks(clientIds: String, selectPrevious: Boolean): IterableIterator[Unit] = js.native
  def removeBlocks(clientIds: js.Array[String]): IterableIterator[Unit] = js.native
  def removeBlocks(clientIds: js.Array[String], selectPrevious: Boolean): IterableIterator[Unit] = js.native
  
  def replaceBlock(clientId: String, block: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
  def replaceBlock(clientId: String, block: BlockInstance[StringDictionary[Any]]): Unit = js.native
  def replaceBlock(clientId: js.Array[String], block: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
  def replaceBlock(clientId: js.Array[String], block: BlockInstance[StringDictionary[Any]]): Unit = js.native
  
  def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]], indexToSelect: Double): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[Any]]): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[Any]], indexToSelect: Double): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: js.Array[String], blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = js.native
  def replaceBlocks(
    clientIds: js.Array[String],
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    indexToSelect: Double
  ): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[Any]]): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[Any]], indexToSelect: Double): IterableIterator[Unit] = js.native
  
  def replaceInnerBlocks(rootClientId: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
  def replaceInnerBlocks(
    rootClientId: String,
    blocks: js.Array[BlockInstance[StringDictionary[Any]]],
    updateSelection: Boolean
  ): Unit = js.native
  
  def resetBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
  
  def selectBlock(clientId: String): Unit = js.native
  def selectBlock(clientId: String, initialPosition: Double): Unit = js.native
  
  def selectNextBlock(clientId: String): IterableIterator[Unit] = js.native
  
  def selectPreviousBlock(clientId: String): IterableIterator[Unit] = js.native
  
  def selectionChange(clientId: String, attributeKey: String, startOffset: Double, endOffset: Double): Unit = js.native
  
  def setTemplateValidity(isValid: Boolean): Unit = js.native
  
  def showInsertionPoint(): Unit = js.native
  def showInsertionPoint(rootClientId: String): Unit = js.native
  def showInsertionPoint(rootClientId: String, index: Double): Unit = js.native
  def showInsertionPoint(rootClientId: Unit, index: Double): Unit = js.native
  
  def startMultiSelect(): Unit = js.native
  
  def startTyping(): Unit = js.native
  
  def stopMultiSelect(): Unit = js.native
  
  def stopTyping(): Unit = js.native
  
  def synchronizeTemplate(): Unit = js.native
  
  def toggleBlockMode(clientId: String): Unit = js.native
  
  def toggleSelection(): Unit = js.native
  def toggleSelection(isSelectionEnabled: Boolean): Unit = js.native
  
  def updateBlock(clientId: String, updates: PartialBlockInstancekstri): Unit = js.native
  
  def updateBlockAttributes(clientId: String, attributes: Record[String, Any]): Unit = js.native
  
  def updateBlockListSettings(clientId: String, settings: EditorBlockListSettings): Unit = js.native
  
  def updateSettings(settings: PartialEditorSettings): Unit = js.native
}
