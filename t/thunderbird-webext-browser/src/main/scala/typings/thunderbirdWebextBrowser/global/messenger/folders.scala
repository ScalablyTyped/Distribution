package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.accounts.MailAccount
import typings.thunderbirdWebextBrowser.messenger.folders.MailFolder
import typings.thunderbirdWebextBrowser.messenger.folders.MailFolderInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folders {
  
  @JSGlobal("messenger.folders")
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy(sourceFolder: MailFolder, destination: MailAccount): js.Promise[MailFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(sourceFolder.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailFolder]]
  inline def copy(sourceFolder: MailFolder, destination: MailFolder): js.Promise[MailFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(sourceFolder.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailFolder]]
  
  inline def create(parent: MailAccount, childName: String): js.Promise[MailFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], childName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailFolder]]
  inline def create(parent: MailFolder, childName: String): js.Promise[MailFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], childName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailFolder]]
  
  /** Deletes a folder. */
  inline def delete(folder: MailFolder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getFolderInfo(folder: MailFolder): js.Promise[MailFolderInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFolderInfo")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailFolderInfo]]
  
  inline def getParentFolders(folder: MailFolder): js.Promise[js.Array[MailFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentFolders")(folder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailFolder]]]
  inline def getParentFolders(folder: MailFolder, includeSubFolders: Boolean): js.Promise[js.Array[MailFolder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentFolders")(folder.asInstanceOf[js.Any], includeSubFolders.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MailFolder]]]
  
  inline def getSubFolders(folderOrAccount: MailAccount): js.Promise[js.Array[MailFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubFolders")(folderOrAccount.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailFolder]]]
  inline def getSubFolders(folderOrAccount: MailAccount, includeSubFolders: Boolean): js.Promise[js.Array[MailFolder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubFolders")(folderOrAccount.asInstanceOf[js.Any], includeSubFolders.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MailFolder]]]
  inline def getSubFolders(folderOrAccount: MailFolder): js.Promise[js.Array[MailFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubFolders")(folderOrAccount.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailFolder]]]
  inline def getSubFolders(folderOrAccount: MailFolder, includeSubFolders: Boolean): js.Promise[js.Array[MailFolder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubFolders")(folderOrAccount.asInstanceOf[js.Any], includeSubFolders.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MailFolder]]]
  
  inline def move(sourceFolder: MailFolder, destination: MailAccount): js.Promise[MailFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(sourceFolder.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailFolder]]
  inline def move(sourceFolder: MailFolder, destination: MailFolder): js.Promise[MailFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(sourceFolder.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailFolder]]
  
  @JSGlobal("messenger.folders.onCopied")
  @js.native
  val onCopied: WebExtEvent[
    js.Function2[/* originalFolder */ MailFolder, /* copiedFolder */ MailFolder, Unit]
  ] = js.native
  
  @JSGlobal("messenger.folders.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* createdFolder */ MailFolder, Unit]] = js.native
  
  @JSGlobal("messenger.folders.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function1[/* deletedFolder */ MailFolder, Unit]] = js.native
  
  @JSGlobal("messenger.folders.onFolderInfoChanged")
  @js.native
  val onFolderInfoChanged: WebExtEvent[js.Function2[/* folder */ MailFolder, /* folderInfo */ MailFolderInfo, Unit]] = js.native
  
  @JSGlobal("messenger.folders.onMoved")
  @js.native
  val onMoved: WebExtEvent[
    js.Function2[/* originalFolder */ MailFolder, /* movedFolder */ MailFolder, Unit]
  ] = js.native
  
  @JSGlobal("messenger.folders.onRenamed")
  @js.native
  val onRenamed: WebExtEvent[
    js.Function2[/* originalFolder */ MailFolder, /* renamedFolder */ MailFolder, Unit]
  ] = js.native
  
  inline def rename(folder: MailFolder, newName: String): js.Promise[MailFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(folder.asInstanceOf[js.Any], newName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailFolder]]
}
