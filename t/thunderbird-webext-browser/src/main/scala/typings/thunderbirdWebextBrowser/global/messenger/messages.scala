package typings.thunderbirdWebextBrowser.global.messenger

import typings.std.File
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.folders.MailFolder
import typings.thunderbirdWebextBrowser.messenger.messages.MessageAttachment
import typings.thunderbirdWebextBrowser.messenger.messages.MessageHeader
import typings.thunderbirdWebextBrowser.messenger.messages.MessageList
import typings.thunderbirdWebextBrowser.messenger.messages.MessagePart
import typings.thunderbirdWebextBrowser.messenger.messages.MessageProperties
import typings.thunderbirdWebextBrowser.messenger.messages.MessageTag
import typings.thunderbirdWebextBrowser.messenger.messages.QueryQueryInfo
import typings.thunderbirdWebextBrowser.messenger.messages.UpdateTagUpdateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messages {
  
  @JSGlobal("messenger.messages")
  @js.native
  val ^ : js.Any = js.native
  
  inline def archive(messageIds: js.Array[Double]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("archive")(messageIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def continueList(messageListId: String): js.Promise[MessageList] = ^.asInstanceOf[js.Dynamic].applyDynamic("continueList")(messageListId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MessageList]]
  
  inline def copy(messageIds: js.Array[Double], destination: MailFolder): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(messageIds.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def createTag(key: String, tag: String, color: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(key.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /**
    * Deletes messages permanently, or moves them to the trash folder
    * (honoring the account's deletion behavior settings). Deleting external
    * messages will throw an _ExtensionError_. The `skipTrash` parameter
    * allows immediate permanent deletion, bypassing the trash folder.
    * **Note**: Consider using {@link messages.move} to manually move
    * messages to the account's trash folder, instead of requesting the
    * overly powerful permission to actually delete messages. The account's
    * trash folder can be extracted as follows:
    * [getTrash.js](https://raw.githubusercontent.com/thundernest/webext-docs/latest-mv2/includes/messages/getTrash.js)
    *
    * @param messageIds The IDs of the messages to delete.
    *
    * @param [skipTrash] If true, the message will be deleted permanently,
    * regardless of the account's deletion behavior settings.
    */
  inline def delete(messageIds: js.Array[Double]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(messageIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def delete(messageIds: js.Array[Double], skipTrash: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(messageIds.asInstanceOf[js.Any], skipTrash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def deleteTag(key: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTag")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(messageId: Double): js.Promise[MessageHeader] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MessageHeader]]
  
  inline def getAttachmentFile(messageId: Double, partName: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttachmentFile")(messageId.asInstanceOf[js.Any], partName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  inline def getFull(messageId: Double): js.Promise[MessagePart] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFull")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MessagePart]]
  
  inline def getRaw(messageId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRaw")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
    * Imports a message into a local Thunderbird folder. To import a message
    * into an IMAP folder, add it to a local folder first and then move it
    * to the IMAP folder.
    *
    * @param destination The folder to import the messages into.
    */
  inline def `import`(file: File, destination: MailFolder): js.Promise[MessageHeader] = (^.asInstanceOf[js.Dynamic].applyDynamic("_import")(file.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MessageHeader]]
  inline def `import`(file: File, destination: MailFolder, properties: MessageProperties): js.Promise[MessageHeader] = (^.asInstanceOf[js.Dynamic].applyDynamic("_import")(file.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MessageHeader]]
  
  inline def list(folder: MailFolder): js.Promise[MessageList] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MessageList]]
  
  inline def listAttachments(messageId: Double): js.Promise[js.Array[MessageAttachment]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAttachments")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MessageAttachment]]]
  
  inline def listTags(): js.Promise[js.Array[MessageTag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTags")().asInstanceOf[js.Promise[js.Array[MessageTag]]]
  
  inline def move(messageIds: js.Array[Double], destination: MailFolder): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(messageIds.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSGlobal("messenger.messages.onCopied")
  @js.native
  val onCopied: WebExtEvent[
    js.Function2[/* originalMessages */ MessageList, /* copiedMessages */ MessageList, Unit]
  ] = js.native
  
  @JSGlobal("messenger.messages.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function1[/* messages */ MessageList, Unit]] = js.native
  
  @JSGlobal("messenger.messages.onMoved")
  @js.native
  val onMoved: WebExtEvent[
    js.Function2[/* originalMessages */ MessageList, /* movedMessages */ MessageList, Unit]
  ] = js.native
  
  @JSGlobal("messenger.messages.onNewMailReceived")
  @js.native
  val onNewMailReceived: WebExtEvent[js.Function2[/* folder */ MailFolder, /* messages */ MessageList, Unit]] = js.native
  
  @JSGlobal("messenger.messages.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[
    js.Function2[/* message */ MessageHeader, /* changedProperties */ MessageProperties, Unit]
  ] = js.native
  
  inline def query(queryInfo: QueryQueryInfo): js.Promise[MessageList] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MessageList]]
  
  inline def update(messageId: Double, newProperties: MessageProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(messageId.asInstanceOf[js.Any], newProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def updateTag(key: String, updateProperties: UpdateTagUpdateProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTag")(key.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
