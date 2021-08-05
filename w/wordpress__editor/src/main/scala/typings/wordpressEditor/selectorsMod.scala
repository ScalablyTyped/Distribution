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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/editor/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canInsertBlockType(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canInsertBlockType")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def canInsertBlockType(blockName: String, rootClientId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canInsertBlockType")(blockName.asInstanceOf[js.Any], rootClientId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def canUserUseUnfilteredHTML(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUserUseUnfilteredHTML")().asInstanceOf[Boolean]
  
  inline def didPostSaveRequestFail(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("didPostSaveRequestFail")().asInstanceOf[Boolean]
  
  inline def didPostSaveRequestSucceed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("didPostSaveRequestSucceed")().asInstanceOf[Boolean]
  
  inline def getActivePostLock(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivePostLock")().asInstanceOf[js.UndefOr[String]]
  
  inline def getAdjacentBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")().asInstanceOf[String | Null]
  inline def getAdjacentBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getAdjacentBlockClientId_1(startClientId: String, modifier: `-1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getAdjacentBlockClientId_1(startClientId: String, modifier: `1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getAdjacentBlockClientId_1(startClientId: Unit, modifier: `-1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getAdjacentBlockClientId_1(startClientId: Unit, modifier: `1`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentBlockClientId")(startClientId.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getAutosave(): Autosave | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutosave")().asInstanceOf[Autosave | js.Object]
  
  inline def getAutosaveAttribute_previewlink(attributeName: preview_link): String | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutosaveAttribute")(attributeName.asInstanceOf[js.Any]).asInstanceOf[String | js.Object]
  
  inline def getBlock(clientId: String): BlockInstance[StringDictionary[js.Any]] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[StringDictionary[js.Any]] | Null]
  
  inline def getBlockAttributes(clientId: String): (Record[String, js.Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(clientId.asInstanceOf[js.Any]).asInstanceOf[(Record[String, js.Any]) | Null]
  
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
  
  inline def getBlocks(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocks")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  inline def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocks")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  inline def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[js.Any]] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocksByClientId")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]] | Null]]
  inline def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[js.Any]] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocksByClientId")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]] | Null]]
  
  inline def getBlocksForSerialization(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlocksForSerialization")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  inline def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientIdsOfDescendants")(clientIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getClientIdsWithDescendants(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientIdsWithDescendants")().asInstanceOf[js.Array[String]]
  
  inline def getCurrentPost(): Decontextualize[PostOrPage[edit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPost")().asInstanceOf[Decontextualize[PostOrPage[edit]]]
  
  inline def getCurrentPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPostAttribute")(attributeName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ]]
  
  inline def getCurrentPostId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPostId")().asInstanceOf[Double]
  
  inline def getCurrentPostLastRevisionId(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPostLastRevisionId")().asInstanceOf[Double | Null]
  
  inline def getCurrentPostRevisionsCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPostRevisionsCount")().asInstanceOf[Double]
  
  inline def getCurrentPostType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPostType")().asInstanceOf[String]
  
  inline def getEditedPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditedPostAttribute")(attributeName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
  ]]
  
  inline def getEditedPostContent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditedPostContent")().asInstanceOf[String]
  
  inline def getEditedPostPreviewLink(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditedPostPreviewLink")().asInstanceOf[String | Null]
  
  inline def getEditedPostVisibility(): password | `private` | public = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditedPostVisibility")().asInstanceOf[password | `private` | public]
  
  inline def getEditorBlocks(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditorBlocks")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  inline def getEditorSettings(): EditorSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditorSettings")().asInstanceOf[EditorSettings]
  
  inline def getFirstMultiSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMultiSelectedBlockClientId")().asInstanceOf[String | Null]
  
  inline def getGlobalBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalBlockCount")().asInstanceOf[Double]
  inline def getGlobalBlockCount(blockName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalBlockCount")(blockName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getInserterItems(): js.Array[EditorInserterItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInserterItems")().asInstanceOf[js.Array[EditorInserterItem]]
  inline def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInserterItems")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.Array[EditorInserterItem]]
  
  inline def getLastMultiSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastMultiSelectedBlockClientId")().asInstanceOf[String | Null]
  
  inline def getMultiSelectedBlockClientIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlockClientIds")().asInstanceOf[js.Array[String]]
  
  inline def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocks")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  inline def getMultiSelectedBlocksEndClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocksEndClientId")().asInstanceOf[String | Null]
  
  inline def getMultiSelectedBlocksStartClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiSelectedBlocksStartClientId")().asInstanceOf[String | Null]
  
  inline def getNextBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextBlockClientId")().asInstanceOf[String | Null]
  inline def getNextBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getPermalink(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermalink")().asInstanceOf[String | Null]
  
  inline def getPermalinkParts(): PostName | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermalinkParts")().asInstanceOf[PostName | Null]
  
  inline def getPostEdits(): Partial[Decontextualize[PostOrPage[edit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPostEdits")().asInstanceOf[Partial[Decontextualize[PostOrPage[edit]]]]
  
  inline def getPostLockUser(): js.UndefOr[User[view] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPostLockUser")().asInstanceOf[js.UndefOr[User[view] | Null]]
  
  inline def getPreviousBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousBlockClientId")().asInstanceOf[String | Null]
  inline def getPreviousBlockClientId(startClientId: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousBlockClientId")(startClientId.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getReferenceByDistinctEdits(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReferenceByDistinctEdits")().asInstanceOf[js.Array[js.Any]]
  
  inline def getSelectedBlock(): BlockInstance[StringDictionary[js.Any]] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlock")().asInstanceOf[BlockInstance[StringDictionary[js.Any]] | Null]
  
  inline def getSelectedBlockClientId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockClientId")().asInstanceOf[String | Null]
  
  inline def getSelectedBlockCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlockCount")().asInstanceOf[Double]
  
  inline def getSelectedBlocksInitialCaretPosition(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedBlocksInitialCaretPosition")().asInstanceOf[Double | Null]
  
  inline def getStateBeforeOptimisticTransaction(transactionId: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateBeforeOptimisticTransaction")(transactionId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getSuggestedPostFormat(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedPostFormat")().asInstanceOf[String | Null]
  
  inline def getTemplate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")().asInstanceOf[js.Any]
  
  inline def getTemplateLock(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateLock")().asInstanceOf[js.UndefOr[String]]
  inline def getTemplateLock(rootClientId: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateLock")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def hasAutosave(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAutosave")().asInstanceOf[Boolean]
  
  inline def hasChangedContent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChangedContent")().asInstanceOf[Boolean]
  
  inline def hasEditorRedo(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEditorRedo")().asInstanceOf[Boolean]
  
  inline def hasEditorUndo(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEditorUndo")().asInstanceOf[Boolean]
  
  inline def hasInserterItems(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInserterItems")().asInstanceOf[Boolean]
  inline def hasInserterItems(rootClientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInserterItems")(rootClientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasMultiSelection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMultiSelection")().asInstanceOf[Boolean]
  
  inline def hasSelectedBlock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedBlock")().asInstanceOf[Boolean]
  
  inline def hasSelectedInnerBlock(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedInnerBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectedInnerBlock")(clientId.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inSomeHistory(predicate: js.Function1[/* state */ Record[String, js.Any], Boolean]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inSomeHistory")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAncestorMultiSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAncestorMultiSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAutosavingPost(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutosavingPost")().asInstanceOf[Boolean]
  
  inline def isBlockInsertionPointVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockInsertionPointVisible")().asInstanceOf[Boolean]
  
  inline def isBlockMultiSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockMultiSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockSelected(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockSelected")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockValid(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockValid")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockWithinSelection(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockWithinSelection")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCaretWithinFormattedText(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaretWithinFormattedText")().asInstanceOf[Boolean]
  
  inline def isCleanNewPost(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCleanNewPost")().asInstanceOf[Boolean]
  
  inline def isCurrentPostPending(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrentPostPending")().asInstanceOf[Boolean]
  
  inline def isCurrentPostPublished(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrentPostPublished")().asInstanceOf[Boolean]
  
  inline def isCurrentPostScheduled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrentPostScheduled")().asInstanceOf[Boolean]
  
  inline def isEditedPostAutosaveable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostAutosaveable")().asInstanceOf[Boolean]
  
  inline def isEditedPostBeingScheduled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostBeingScheduled")().asInstanceOf[Boolean]
  
  inline def isEditedPostDateFloating(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostDateFloating")().asInstanceOf[Boolean]
  
  inline def isEditedPostDirty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostDirty")().asInstanceOf[Boolean]
  
  inline def isEditedPostEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostEmpty")().asInstanceOf[Boolean]
  
  inline def isEditedPostNew(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostNew")().asInstanceOf[Boolean]
  
  inline def isEditedPostPublishable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostPublishable")().asInstanceOf[Boolean]
  
  inline def isEditedPostSaveable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditedPostSaveable")().asInstanceOf[Boolean]
  
  inline def isFirstMultiSelectedBlock(clientId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstMultiSelectedBlock")(clientId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMultiSelecting(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelecting")().asInstanceOf[Boolean]
  
  inline def isPermalinkEditable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPermalinkEditable")().asInstanceOf[Boolean]
  
  inline def isPostLockTakeover(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPostLockTakeover")().asInstanceOf[Boolean]
  
  inline def isPostLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPostLocked")().asInstanceOf[Boolean]
  
  inline def isPostSavingLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPostSavingLocked")().asInstanceOf[Boolean]
  
  inline def isPreviewingPost(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPreviewingPost")().asInstanceOf[Boolean]
  
  inline def isPublishSidebarEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublishSidebarEnabled")().asInstanceOf[Boolean]
  
  inline def isPublishingPost(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublishingPost")().asInstanceOf[Boolean]
  
  inline def isSavingPost(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSavingPost")().asInstanceOf[Boolean]
  
  inline def isSelectionEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionEnabled")().asInstanceOf[Boolean]
  
  inline def isTyping(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTyping")().asInstanceOf[Boolean]
  
  inline def isValidTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTemplate")().asInstanceOf[Boolean]
}
