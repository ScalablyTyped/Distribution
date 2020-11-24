package typings.wordpressEditor

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Decontextualize
import typings.wordpressApiFetch.mod.Schema.PostOrPage
import typings.wordpressApiFetch.mod.Schema.User
import typings.wordpressBlockEditor.anon.Index
import typings.wordpressBlockEditor.mod.EditorBlockListSettings
import typings.wordpressBlockEditor.mod.EditorBlockMode
import typings.wordpressBlockEditor.mod.EditorInserterItem
import typings.wordpressBlockEditor.mod.EditorSettings
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressCoreData.mod.Autosave
import typings.wordpressEditor.anon.PostName
import typings.wordpressEditor.wordpressEditorNumbers.`-1`
import typings.wordpressEditor.wordpressEditorNumbers.`1`
import typings.wordpressEditor.wordpressEditorStrings.`private`
import typings.wordpressEditor.wordpressEditorStrings.edit
import typings.wordpressEditor.wordpressEditorStrings.password
import typings.wordpressEditor.wordpressEditorStrings.preview_link
import typings.wordpressEditor.wordpressEditorStrings.public
import typings.wordpressEditor.wordpressEditorStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/editor/store/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  
  def canInsertBlockType(blockName: String): Boolean = js.native
  def canInsertBlockType(blockName: String, rootClientId: String): Boolean = js.native
  
  def canUserUseUnfilteredHTML(): Boolean = js.native
  
  def didPostSaveRequestFail(): Boolean = js.native
  
  def didPostSaveRequestSucceed(): Boolean = js.native
  
  def getActivePostLock(): js.UndefOr[String] = js.native
  
  def getAdjacentBlockClientId(): String | Null = js.native
  def getAdjacentBlockClientId(startClientId: String): String | Null = js.native
  @JSName("getAdjacentBlockClientId")
  def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `-1`): String | Null = js.native
  @JSName("getAdjacentBlockClientId")
  def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `1`): String | Null = js.native
  @JSName("getAdjacentBlockClientId")
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `-1`): String | Null = js.native
  @JSName("getAdjacentBlockClientId")
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `1`): String | Null = js.native
  
  def getAutosave(): Autosave | js.Object = js.native
  
  @JSName("getAutosaveAttribute")
  def getAutosaveAttribute_previewlink(attributeName: preview_link): String | js.Object = js.native
  
  def getBlock(clientId: String): BlockInstance[StringDictionary[_]] | Null = js.native
  
  def getBlockAttributes(clientId: String): (Record[String, _]) | Null = js.native
  
  def getBlockCount(): Double = js.native
  def getBlockCount(rootClientId: String): Double = js.native
  
  def getBlockHierarchyRootClientId(clientId: String): String = js.native
  
  def getBlockIndex(clientId: String): Double = js.native
  def getBlockIndex(clientId: String, rootClientId: String): Double = js.native
  
  def getBlockInsertionPoint(): Index = js.native
  
  def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = js.native
  def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = js.native
  
  def getBlockMode(clientId: String): EditorBlockMode = js.native
  
  def getBlockName(clientId: String): String | Null = js.native
  
  def getBlockOrder(): js.Array[String] = js.native
  def getBlockOrder(rootClientId: String): js.Array[String] = js.native
  
  def getBlockRootClientId(clientId: String): String | Null = js.native
  
  def getBlockSelectionEnd(): js.UndefOr[String] = js.native
  
  def getBlockSelectionStart(): js.UndefOr[String] = js.native
  
  def getBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
  def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
  
  def getBlocksForSerialization(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = js.native
  
  def getClientIdsWithDescendants(): js.Array[String] = js.native
  
  def getCurrentPost(): Decontextualize[PostOrPage[edit]] = js.native
  
  def getCurrentPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ] = js.native
  
  def getCurrentPostId(): Double = js.native
  
  def getCurrentPostLastRevisionId(): Double | Null = js.native
  
  def getCurrentPostRevisionsCount(): Double = js.native
  
  def getCurrentPostType(): String = js.native
  
  def getEditedPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ] = js.native
  
  def getEditedPostContent(): String = js.native
  
  def getEditedPostPreviewLink(): String | Null = js.native
  
  def getEditedPostVisibility(): password | `private` | public = js.native
  
  def getEditorBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  def getEditorSettings(): EditorSettings = js.native
  
  def getFirstMultiSelectedBlockClientId(): String | Null = js.native
  
  def getGlobalBlockCount(): Double = js.native
  def getGlobalBlockCount(blockName: String): Double = js.native
  
  def getInserterItems(): js.Array[EditorInserterItem] = js.native
  def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = js.native
  
  def getLastMultiSelectedBlockClientId(): String | Null = js.native
  
  def getMultiSelectedBlockClientIds(): js.Array[String] = js.native
  
  def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  def getMultiSelectedBlocksEndClientId(): String | Null = js.native
  
  def getMultiSelectedBlocksStartClientId(): String | Null = js.native
  
  def getNextBlockClientId(): String | Null = js.native
  def getNextBlockClientId(startClientId: String): String | Null = js.native
  
  def getPermalink(): String | Null = js.native
  
  def getPermalinkParts(): PostName | Null = js.native
  
  def getPostEdits(): Partial[Decontextualize[PostOrPage[edit]]] = js.native
  
  def getPostLockUser(): js.UndefOr[User[view] | Null] = js.native
  
  def getPreviousBlockClientId(): String | Null = js.native
  def getPreviousBlockClientId(startClientId: String): String | Null = js.native
  
  def getReferenceByDistinctEdits(): js.Array[js.Any] = js.native
  
  def getSelectedBlock(): BlockInstance[StringDictionary[_]] | Null = js.native
  
  def getSelectedBlockClientId(): String | Null = js.native
  
  def getSelectedBlockCount(): Double = js.native
  
  def getSelectedBlocksInitialCaretPosition(): Double | Null = js.native
  
  def getStateBeforeOptimisticTransaction(transactionId: js.Object): js.Any = js.native
  
  def getSuggestedPostFormat(): String | Null = js.native
  
  def getTemplate(): js.Any = js.native
  
  def getTemplateLock(): js.UndefOr[String] = js.native
  def getTemplateLock(rootClientId: String): js.UndefOr[String] = js.native
  
  def hasAutosave(): Boolean = js.native
  
  def hasChangedContent(): Boolean = js.native
  
  def hasEditorRedo(): Boolean = js.native
  
  def hasEditorUndo(): Boolean = js.native
  
  def hasInserterItems(): Boolean = js.native
  def hasInserterItems(rootClientId: String): Boolean = js.native
  
  def hasMultiSelection(): Boolean = js.native
  
  def hasSelectedBlock(): Boolean = js.native
  
  def hasSelectedInnerBlock(clientId: String): Boolean = js.native
  def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = js.native
  
  def inSomeHistory(predicate: js.Function1[/* state */ Record[String, _], Boolean]): Boolean = js.native
  
  def isAncestorMultiSelected(clientId: String): Boolean = js.native
  
  def isAutosavingPost(): Boolean = js.native
  
  def isBlockInsertionPointVisible(): Boolean = js.native
  
  def isBlockMultiSelected(clientId: String): Boolean = js.native
  
  def isBlockSelected(clientId: String): Boolean = js.native
  
  def isBlockValid(clientId: String): Boolean = js.native
  
  def isBlockWithinSelection(clientId: String): Boolean = js.native
  
  def isCaretWithinFormattedText(): Boolean = js.native
  
  def isCleanNewPost(): Boolean = js.native
  
  def isCurrentPostPending(): Boolean = js.native
  
  def isCurrentPostPublished(): Boolean = js.native
  
  def isCurrentPostScheduled(): Boolean = js.native
  
  def isEditedPostAutosaveable(): Boolean = js.native
  
  def isEditedPostBeingScheduled(): Boolean = js.native
  
  def isEditedPostDateFloating(): Boolean = js.native
  
  def isEditedPostDirty(): Boolean = js.native
  
  def isEditedPostEmpty(): Boolean = js.native
  
  def isEditedPostNew(): Boolean = js.native
  
  def isEditedPostPublishable(): Boolean = js.native
  
  def isEditedPostSaveable(): Boolean = js.native
  
  def isFirstMultiSelectedBlock(clientId: String): Boolean = js.native
  
  def isMultiSelecting(): Boolean = js.native
  
  def isPermalinkEditable(): Boolean = js.native
  
  def isPostLockTakeover(): Boolean = js.native
  
  def isPostLocked(): Boolean = js.native
  
  def isPostSavingLocked(): Boolean = js.native
  
  def isPreviewingPost(): Boolean = js.native
  
  def isPublishSidebarEnabled(): Boolean = js.native
  
  def isPublishingPost(): Boolean = js.native
  
  def isSavingPost(): Boolean = js.native
  
  def isSelectionEnabled(): Boolean = js.native
  
  def isTyping(): Boolean = js.native
  
  def isValidTemplate(): Boolean = js.native
}
