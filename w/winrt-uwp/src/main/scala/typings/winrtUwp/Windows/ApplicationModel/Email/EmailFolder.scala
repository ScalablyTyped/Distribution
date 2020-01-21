package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents and email folder. */
@JSGlobal("Windows.ApplicationModel.Email.EmailFolder")
@js.native
abstract class EmailFolder () extends js.Object {
  /** Gets or sets the display name for the folder. */
  var displayName: String = js.native
  /** Gets the ID of the email folder. */
  var id: String = js.native
  /** Gets or sets a Boolean value indicating if the folder is sync enabled. */
  var isSyncEnabled: Boolean = js.native
  /** Gets the type of the folder such as inbox, outbox, drafts, sent, and so on. */
  var kind: EmailSpecialFolderKind = js.native
  /** Gets or sets the last time the folder was successfully synced with the server. */
  var lastSuccessfulSyncTime: Date = js.native
  /** Gets the ID of the mailbox that contains this folder. */
  var mailboxId: String = js.native
  /** Gets the ID of this folder's parent folder. */
  var parentFolderId: String = js.native
  /** Gets or sets the remote ID of the corresponding folder on the server. */
  var remoteId: String = js.native
  /**
    * Asynchronously creates a new folder.
    * @param name The name for the new folder.
    * @return Returns the newly created folder.
    */
  def createFolderAsync(name: String): IPromiseWithIAsyncOperation[EmailFolder] = js.native
  /**
    * Asynchronously deletes this folder.
    * @return An async action indicating that the operation has completed.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously finds the child folders of this folder.
    * @return The list of child folders.
    */
  def findChildFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets an instance of the EmailConversationReader class.
    * @return The conversation reader.
    */
  def getConversationReader(): EmailConversationReader = js.native
  /**
    * Gets an instance of the EmailConversationReader class using the specified query options.
    * @param options The query options to use when finding the conversation reader.
    * @return The conversation reader that matches the query options.
    */
  def getConversationReader(options: EmailQueryOptions): EmailConversationReader = js.native
  /**
    * Asynchronously gets the specified message from the folder.
    * @param id The ID of the message to retrieve.
    * @return The message specified in the id parameter.
    */
  def getMessageAsync(id: String): IPromiseWithIAsyncOperation[EmailMessage] = js.native
  /**
    * Asynchronously gets the counts of email items such as flagged emails, important emails, unread emails, total emails, and so on.
    * @return An EmailItemCounts object containing the counts of email items such as flagged emails, important emails, unread emails, total emails, and so on.
    */
  def getMessageCountsAsync(): IPromiseWithIAsyncOperation[EmailItemCounts] = js.native
  /**
    * Gets an instance of the EmailMessageReader class.
    * @return The message reader.
    */
  def getMessageReader(): EmailMessageReader = js.native
  /**
    * Gets an instance of the EmailMessageReader class using the specified query options.
    * @param options The query options to use when finding the message reader.
    * @return The message reader that matches the query options.
    */
  def getMessageReader(options: EmailQueryOptions): EmailMessageReader = js.native
  /**
    * Asynchronously saves the specified email message to the folder.
    * @param message The email message to save.
    * @return An async action indicating that the operation has completed.
    */
  def saveMessageAsync(message: EmailMessage): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously attempts to move this folder to the specified folder.
    * @param newParentFolder The new location for this folder.
    * @return A Boolean value indicating if the move was successful.
    */
  def tryMoveAsync(newParentFolder: EmailFolder): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Asynchronously attempts to move this folder to the specified folder and rename it in the process.
    * @param newParentFolder The new location for this folder.
    * @param newFolderName The name for the folder in the new location.
    * @return A Boolean value indicating if the move was successful.
    */
  def tryMoveAsync(newParentFolder: EmailFolder, newFolderName: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Asynchronously attempts to save changes to the folder.
    * @return A Boolean value indicating if the save was successful.
    */
  def trySaveAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}

