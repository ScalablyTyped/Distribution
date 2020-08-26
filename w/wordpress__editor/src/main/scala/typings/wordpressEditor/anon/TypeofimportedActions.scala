package typings.wordpressEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.std.Record
import typings.wordpressBlockEditor.anon.IsLocked
import typings.wordpressBlockEditor.anon.PartialBlockInstancekstri
import typings.wordpressBlockEditor.mod.EditorBlockListSettings
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressBlocks.templatesMod.TemplateArray
import typings.wordpressCoreData.mod.Autosave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedActions extends js.Object {
  def autosave(): IterableIterator[Unit] = js.native
  def autosave(options: Record[String, Boolean]): IterableIterator[Unit] = js.native
  def clearSelectedBlock(): Unit = js.native
  def createUndoLevel(): Unit = js.native
  def disablePublishSidebar(): Unit = js.native
  def editPost(edits: Record[String, _]): Unit = js.native
  def enablePublishSidebar(): Unit = js.native
  def enterFormattedText(): Unit = js.native
  def exitFormattedText(): Unit = js.native
  def hideInsertionPoint(): Unit = js.native
  def insertBlock(block: BlockInstance[StringDictionary[_]]): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[_]],
    index: js.UndefOr[scala.Nothing],
    rootClientId: js.UndefOr[scala.Nothing],
    updateSelection: Boolean
  ): Unit = js.native
  def insertBlock(block: BlockInstance[StringDictionary[_]], index: js.UndefOr[scala.Nothing], rootClientId: String): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[_]],
    index: js.UndefOr[scala.Nothing],
    rootClientId: String,
    updateSelection: Boolean
  ): Unit = js.native
  def insertBlock(block: BlockInstance[StringDictionary[_]], index: Double): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[_]],
    index: Double,
    rootClientId: js.UndefOr[scala.Nothing],
    updateSelection: Boolean
  ): Unit = js.native
  def insertBlock(block: BlockInstance[StringDictionary[_]], index: Double, rootClientId: String): Unit = js.native
  def insertBlock(
    block: BlockInstance[StringDictionary[_]],
    index: Double,
    rootClientId: String,
    updateSelection: Boolean
  ): Unit = js.native
  def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[_]]],
    index: js.UndefOr[scala.Nothing],
    rootClientId: js.UndefOr[scala.Nothing],
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[_]]],
    index: js.UndefOr[scala.Nothing],
    rootClientId: String
  ): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[_]]],
    index: js.UndefOr[scala.Nothing],
    rootClientId: String,
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], index: Double): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[_]]],
    index: Double,
    rootClientId: js.UndefOr[scala.Nothing],
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], index: Double, rootClientId: String): IterableIterator[Unit] = js.native
  def insertBlocks(
    blocks: js.Array[BlockInstance[StringDictionary[_]]],
    index: Double,
    rootClientId: String,
    updateSelection: Boolean
  ): IterableIterator[Unit] = js.native
  def insertDefaultBlock(): Unit = js.native
  def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: String): Unit = js.native
  def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: String, index: Double): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, _]): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, _], rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, _], rootClientId: String): Unit = js.native
  def insertDefaultBlock(attributes: Record[String, _], rootClientId: String, index: Double): Unit = js.native
  def lockPostSaving(lockName: String): Unit = js.native
  def mergeBlocks(firstBlockClientId: String, secondBlockClientId: String): Unit = js.native
  def moveBlockToPosition(
    clientId: js.UndefOr[scala.Nothing],
    fromRootClientId: js.UndefOr[scala.Nothing],
    toRootClientId: js.UndefOr[scala.Nothing],
    index: Double
  ): IterableIterator[Unit] = js.native
  def moveBlockToPosition(
    clientId: js.UndefOr[scala.Nothing],
    fromRootClientId: js.UndefOr[scala.Nothing],
    toRootClientId: String,
    index: Double
  ): IterableIterator[Unit] = js.native
  def moveBlockToPosition(
    clientId: js.UndefOr[scala.Nothing],
    fromRootClientId: String,
    toRootClientId: js.UndefOr[scala.Nothing],
    index: Double
  ): IterableIterator[Unit] = js.native
  def moveBlockToPosition(
    clientId: js.UndefOr[scala.Nothing],
    fromRootClientId: String,
    toRootClientId: String,
    index: Double
  ): IterableIterator[Unit] = js.native
  def moveBlockToPosition(
    clientId: String,
    fromRootClientId: js.UndefOr[scala.Nothing],
    toRootClientId: js.UndefOr[scala.Nothing],
    index: Double
  ): IterableIterator[Unit] = js.native
  def moveBlockToPosition(
    clientId: String,
    fromRootClientId: js.UndefOr[scala.Nothing],
    toRootClientId: String,
    index: Double
  ): IterableIterator[Unit] = js.native
  def moveBlockToPosition(
    clientId: String,
    fromRootClientId: String,
    toRootClientId: js.UndefOr[scala.Nothing],
    index: Double
  ): IterableIterator[Unit] = js.native
  def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
  def moveBlocksDown(clientIds: String, rootClientId: String): Unit = js.native
  def moveBlocksDown(clientIds: js.Array[String], rootClientId: String): Unit = js.native
  def moveBlocksUp(clientIds: String, rootClientId: String): Unit = js.native
  def moveBlocksUp(clientIds: js.Array[String], rootClientId: String): Unit = js.native
  def multiSelect(start: String, end: String): Unit = js.native
  def receiveBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
  def redo(): Unit = js.native
  def refreshPost(): IterableIterator[Unit] = js.native
  def removeBlock(clientId: String): Unit = js.native
  def removeBlock(clientId: String, selectPrevious: Boolean): Unit = js.native
  def removeBlocks(clientIds: String): IterableIterator[Unit] = js.native
  def removeBlocks(clientIds: String, selectPrevious: Boolean): IterableIterator[Unit] = js.native
  def removeBlocks(clientIds: js.Array[String]): IterableIterator[Unit] = js.native
  def removeBlocks(clientIds: js.Array[String], selectPrevious: Boolean): IterableIterator[Unit] = js.native
  def replaceBlock(clientId: String, block: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
  def replaceBlock(clientId: String, block: BlockInstance[StringDictionary[_]]): Unit = js.native
  def replaceBlock(clientId: js.Array[String], block: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
  def replaceBlock(clientId: js.Array[String], block: BlockInstance[StringDictionary[_]]): Unit = js.native
  def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[_]]], indexToSelect: Double): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[_]]): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[_]], indexToSelect: Double): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: js.Array[String], blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
  def replaceBlocks(
    clientIds: js.Array[String],
    blocks: js.Array[BlockInstance[StringDictionary[_]]],
    indexToSelect: Double
  ): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[_]]): IterableIterator[Unit] = js.native
  def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[_]], indexToSelect: Double): IterableIterator[Unit] = js.native
  def resetAutosave(newAutosave: Autosave): IterableIterator[Unit] = js.native
  def resetBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
  def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
  def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], options: Record[String, _]): IterableIterator[Unit] = js.native
  def resetPost(post: Record[String, _]): Unit = js.native
  def savePost(): IterableIterator[Unit] = js.native
  def savePost(options: Record[String, _]): IterableIterator[Unit] = js.native
  def selectBlock(clientId: String): Unit = js.native
  def selectBlock(clientId: String, initialPosition: Double): Unit = js.native
  def setTemplateValidity(isValid: Boolean): Unit = js.native
  def setupEditor(post: Record[String, _]): IterableIterator[Unit] = js.native
  def setupEditor(post: Record[String, _], edits: js.UndefOr[scala.Nothing], template: TemplateArray): IterableIterator[Unit] = js.native
  def setupEditor(post: Record[String, _], edits: Record[String, _]): IterableIterator[Unit] = js.native
  def setupEditor(post: Record[String, _], edits: Record[String, _], template: TemplateArray): IterableIterator[Unit] = js.native
  def setupEditorState(post: Record[String, _]): Unit = js.native
  def showInsertionPoint(): Unit = js.native
  def showInsertionPoint(rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def showInsertionPoint(rootClientId: String): Unit = js.native
  def showInsertionPoint(rootClientId: String, index: Double): Unit = js.native
  def startMultiSelect(): Unit = js.native
  def startTyping(): Unit = js.native
  def stopMultiSelect(): Unit = js.native
  def stopTyping(): Unit = js.native
  def synchronizeTemplate(): Unit = js.native
  def toggleBlockMode(clientId: String): Unit = js.native
  def toggleSelection(): Unit = js.native
  def toggleSelection(isSelectionEnabled: Boolean): Unit = js.native
  def trashPost(): IterableIterator[Unit] = js.native
  def undo(): Unit = js.native
  def unlockPostSaving(lockName: String): Unit = js.native
  def updateBlock(clientId: String, updates: PartialBlockInstancekstri): Unit = js.native
  def updateBlockAttributes(clientId: String, attributes: Record[String, _]): Unit = js.native
  def updateBlockListSettings(clientId: String, settings: EditorBlockListSettings): Unit = js.native
  def updateEditorSettings(settings: PartialEditorSettings): Unit = js.native
  def updatePost(edits: Record[String, _]): Unit = js.native
  def updatePostLock(lock: IsLocked): Unit = js.native
}

