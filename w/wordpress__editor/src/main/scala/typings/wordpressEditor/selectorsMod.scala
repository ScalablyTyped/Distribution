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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/editor/store/selectors", "canInsertBlockType")
  @js.native
  def canInsertBlockType(blockName: String): Boolean = js.native
  @JSImport("@wordpress/editor/store/selectors", "canInsertBlockType")
  @js.native
  def canInsertBlockType(blockName: String, rootClientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "canUserUseUnfilteredHTML")
  @js.native
  def canUserUseUnfilteredHTML(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "didPostSaveRequestFail")
  @js.native
  def didPostSaveRequestFail(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "didPostSaveRequestSucceed")
  @js.native
  def didPostSaveRequestSucceed(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getActivePostLock")
  @js.native
  def getActivePostLock(): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId(): String | Null = js.native
  @JSImport("@wordpress/editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId(startClientId: String): String | Null = js.native
  @JSImport("@wordpress/editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `-1`): String | Null = js.native
  @JSImport("@wordpress/editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `1`): String | Null = js.native
  @JSImport("@wordpress/editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `-1`): String | Null = js.native
  @JSImport("@wordpress/editor/store/selectors", "getAdjacentBlockClientId")
  @js.native
  def getAdjacentBlockClientId_1(startClientId: String, modifier: `1`): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getAutosave")
  @js.native
  def getAutosave(): Autosave | js.Object = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getAutosaveAttribute")
  @js.native
  def getAutosaveAttribute_previewlink(attributeName: preview_link): String | js.Object = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlock")
  @js.native
  def getBlock(clientId: String): BlockInstance[StringDictionary[_]] | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockAttributes")
  @js.native
  def getBlockAttributes(clientId: String): (Record[String, _]) | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockCount")
  @js.native
  def getBlockCount(): Double = js.native
  @JSImport("@wordpress/editor/store/selectors", "getBlockCount")
  @js.native
  def getBlockCount(rootClientId: String): Double = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockHierarchyRootClientId")
  @js.native
  def getBlockHierarchyRootClientId(clientId: String): String = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockIndex")
  @js.native
  def getBlockIndex(clientId: String): Double = js.native
  @JSImport("@wordpress/editor/store/selectors", "getBlockIndex")
  @js.native
  def getBlockIndex(clientId: String, rootClientId: String): Double = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockInsertionPoint")
  @js.native
  def getBlockInsertionPoint(): Index = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockListSettings")
  @js.native
  def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = js.native
  @JSImport("@wordpress/editor/store/selectors", "getBlockListSettings")
  @js.native
  def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockMode")
  @js.native
  def getBlockMode(clientId: String): EditorBlockMode = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockName")
  @js.native
  def getBlockName(clientId: String): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockOrder")
  @js.native
  def getBlockOrder(): js.Array[String] = js.native
  @JSImport("@wordpress/editor/store/selectors", "getBlockOrder")
  @js.native
  def getBlockOrder(rootClientId: String): js.Array[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockRootClientId")
  @js.native
  def getBlockRootClientId(clientId: String): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockSelectionEnd")
  @js.native
  def getBlockSelectionEnd(): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlockSelectionStart")
  @js.native
  def getBlockSelectionStart(): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlocks")
  @js.native
  def getBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  @JSImport("@wordpress/editor/store/selectors", "getBlocks")
  @js.native
  def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlocksByClientId")
  @js.native
  def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
  @JSImport("@wordpress/editor/store/selectors", "getBlocksByClientId")
  @js.native
  def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getBlocksForSerialization")
  @js.native
  def getBlocksForSerialization(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getClientIdsOfDescendants")
  @js.native
  def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getClientIdsWithDescendants")
  @js.native
  def getClientIdsWithDescendants(): js.Array[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getCurrentPost")
  @js.native
  def getCurrentPost(): Decontextualize[PostOrPage[edit]] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getCurrentPostAttribute")
  @js.native
  def getCurrentPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getCurrentPostId")
  @js.native
  def getCurrentPostId(): Double = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getCurrentPostLastRevisionId")
  @js.native
  def getCurrentPostLastRevisionId(): Double | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getCurrentPostRevisionsCount")
  @js.native
  def getCurrentPostRevisionsCount(): Double = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getCurrentPostType")
  @js.native
  def getCurrentPostType(): String = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getEditedPostAttribute")
  @js.native
  def getEditedPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getEditedPostContent")
  @js.native
  def getEditedPostContent(): String = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getEditedPostPreviewLink")
  @js.native
  def getEditedPostPreviewLink(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getEditedPostVisibility")
  @js.native
  def getEditedPostVisibility(): password | `private` | public = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getEditorBlocks")
  @js.native
  def getEditorBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getEditorSettings")
  @js.native
  def getEditorSettings(): EditorSettings = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getFirstMultiSelectedBlockClientId")
  @js.native
  def getFirstMultiSelectedBlockClientId(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getGlobalBlockCount")
  @js.native
  def getGlobalBlockCount(): Double = js.native
  @JSImport("@wordpress/editor/store/selectors", "getGlobalBlockCount")
  @js.native
  def getGlobalBlockCount(blockName: String): Double = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getInserterItems")
  @js.native
  def getInserterItems(): js.Array[EditorInserterItem] = js.native
  @JSImport("@wordpress/editor/store/selectors", "getInserterItems")
  @js.native
  def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getLastMultiSelectedBlockClientId")
  @js.native
  def getLastMultiSelectedBlockClientId(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getMultiSelectedBlockClientIds")
  @js.native
  def getMultiSelectedBlockClientIds(): js.Array[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getMultiSelectedBlocks")
  @js.native
  def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getMultiSelectedBlocksEndClientId")
  @js.native
  def getMultiSelectedBlocksEndClientId(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getMultiSelectedBlocksStartClientId")
  @js.native
  def getMultiSelectedBlocksStartClientId(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getNextBlockClientId")
  @js.native
  def getNextBlockClientId(): String | Null = js.native
  @JSImport("@wordpress/editor/store/selectors", "getNextBlockClientId")
  @js.native
  def getNextBlockClientId(startClientId: String): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getPermalink")
  @js.native
  def getPermalink(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getPermalinkParts")
  @js.native
  def getPermalinkParts(): PostName | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getPostEdits")
  @js.native
  def getPostEdits(): Partial[Decontextualize[PostOrPage[edit]]] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getPostLockUser")
  @js.native
  def getPostLockUser(): js.UndefOr[User[view] | Null] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getPreviousBlockClientId")
  @js.native
  def getPreviousBlockClientId(): String | Null = js.native
  @JSImport("@wordpress/editor/store/selectors", "getPreviousBlockClientId")
  @js.native
  def getPreviousBlockClientId(startClientId: String): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getReferenceByDistinctEdits")
  @js.native
  def getReferenceByDistinctEdits(): js.Array[js.Any] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getSelectedBlock")
  @js.native
  def getSelectedBlock(): BlockInstance[StringDictionary[_]] | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getSelectedBlockClientId")
  @js.native
  def getSelectedBlockClientId(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getSelectedBlockCount")
  @js.native
  def getSelectedBlockCount(): Double = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getSelectedBlocksInitialCaretPosition")
  @js.native
  def getSelectedBlocksInitialCaretPosition(): Double | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getStateBeforeOptimisticTransaction")
  @js.native
  def getStateBeforeOptimisticTransaction(transactionId: js.Object): js.Any = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getSuggestedPostFormat")
  @js.native
  def getSuggestedPostFormat(): String | Null = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getTemplate")
  @js.native
  def getTemplate(): js.Any = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "getTemplateLock")
  @js.native
  def getTemplateLock(): js.UndefOr[String] = js.native
  @JSImport("@wordpress/editor/store/selectors", "getTemplateLock")
  @js.native
  def getTemplateLock(rootClientId: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasAutosave")
  @js.native
  def hasAutosave(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasChangedContent")
  @js.native
  def hasChangedContent(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasEditorRedo")
  @js.native
  def hasEditorRedo(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasEditorUndo")
  @js.native
  def hasEditorUndo(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasInserterItems")
  @js.native
  def hasInserterItems(): Boolean = js.native
  @JSImport("@wordpress/editor/store/selectors", "hasInserterItems")
  @js.native
  def hasInserterItems(rootClientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasMultiSelection")
  @js.native
  def hasMultiSelection(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasSelectedBlock")
  @js.native
  def hasSelectedBlock(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "hasSelectedInnerBlock")
  @js.native
  def hasSelectedInnerBlock(clientId: String): Boolean = js.native
  @JSImport("@wordpress/editor/store/selectors", "hasSelectedInnerBlock")
  @js.native
  def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "inSomeHistory")
  @js.native
  def inSomeHistory(predicate: js.Function1[/* state */ Record[String, _], Boolean]): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isAncestorMultiSelected")
  @js.native
  def isAncestorMultiSelected(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isAutosavingPost")
  @js.native
  def isAutosavingPost(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isBlockInsertionPointVisible")
  @js.native
  def isBlockInsertionPointVisible(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isBlockMultiSelected")
  @js.native
  def isBlockMultiSelected(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isBlockSelected")
  @js.native
  def isBlockSelected(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isBlockValid")
  @js.native
  def isBlockValid(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isBlockWithinSelection")
  @js.native
  def isBlockWithinSelection(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isCaretWithinFormattedText")
  @js.native
  def isCaretWithinFormattedText(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isCleanNewPost")
  @js.native
  def isCleanNewPost(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isCurrentPostPending")
  @js.native
  def isCurrentPostPending(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isCurrentPostPublished")
  @js.native
  def isCurrentPostPublished(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isCurrentPostScheduled")
  @js.native
  def isCurrentPostScheduled(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostAutosaveable")
  @js.native
  def isEditedPostAutosaveable(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostBeingScheduled")
  @js.native
  def isEditedPostBeingScheduled(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostDateFloating")
  @js.native
  def isEditedPostDateFloating(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostDirty")
  @js.native
  def isEditedPostDirty(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostEmpty")
  @js.native
  def isEditedPostEmpty(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostNew")
  @js.native
  def isEditedPostNew(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostPublishable")
  @js.native
  def isEditedPostPublishable(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isEditedPostSaveable")
  @js.native
  def isEditedPostSaveable(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isFirstMultiSelectedBlock")
  @js.native
  def isFirstMultiSelectedBlock(clientId: String): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isMultiSelecting")
  @js.native
  def isMultiSelecting(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isPermalinkEditable")
  @js.native
  def isPermalinkEditable(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isPostLockTakeover")
  @js.native
  def isPostLockTakeover(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isPostLocked")
  @js.native
  def isPostLocked(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isPostSavingLocked")
  @js.native
  def isPostSavingLocked(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isPreviewingPost")
  @js.native
  def isPreviewingPost(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isPublishSidebarEnabled")
  @js.native
  def isPublishSidebarEnabled(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isPublishingPost")
  @js.native
  def isPublishingPost(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isSavingPost")
  @js.native
  def isSavingPost(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isSelectionEnabled")
  @js.native
  def isSelectionEnabled(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isTyping")
  @js.native
  def isTyping(): Boolean = js.native
  
  @JSImport("@wordpress/editor/store/selectors", "isValidTemplate")
  @js.native
  def isValidTemplate(): Boolean = js.native
}
