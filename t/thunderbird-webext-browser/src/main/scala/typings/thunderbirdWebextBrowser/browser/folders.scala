package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folders {
  
  trait MailFolder extends StObject {
    
    /** The account this folder belongs to. */
    var accountId: String
    
    /** The human-friendly name of this folder. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Path to this folder in the account. Although paths look predictable,
      * never guess a folder's path, as there are a number of reasons why it
      * may not be what you think it is. Use {@link folders.getParentFolders}
      * or {@link folders.getSubFolders} to obtain hierarchy information.
      */
    var path: String
    
    /**
      * Subfolders are only included if requested. They will be returned in
      * the same order as used in Thunderbird's folder pane.
      */
    var subFolders: js.UndefOr[js.Array[MailFolder]] = js.undefined
    
    /** The type of folder, for several common types. */
    var `type`: js.UndefOr[MailFolderType] = js.undefined
  }
  object MailFolder {
    
    inline def apply(accountId: String, path: String): MailFolder = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailFolder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailFolder] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSubFolders(value: js.Array[MailFolder]): Self = StObject.set(x, "subFolders", value.asInstanceOf[js.Any])
      
      inline def setSubFoldersUndefined: Self = StObject.set(x, "subFolders", js.undefined)
      
      inline def setSubFoldersVarargs(value: MailFolder*): Self = StObject.set(x, "subFolders", js.Array(value*))
      
      inline def setType(value: MailFolderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MailFolderInfo extends StObject {
    
    /** Whether this folder is a favorite folder. */
    var favorite: js.UndefOr[Boolean] = js.undefined
    
    /** Number of messages in this folder. */
    var totalMessageCount: js.UndefOr[Double] = js.undefined
    
    /** Number of unread messages in this folder. */
    var unreadMessageCount: js.UndefOr[Double] = js.undefined
  }
  object MailFolderInfo {
    
    inline def apply(): MailFolderInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailFolderInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailFolderInfo] (val x: Self) extends AnyVal {
      
      inline def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
      
      inline def setFavoriteUndefined: Self = StObject.set(x, "favorite", js.undefined)
      
      inline def setTotalMessageCount(value: Double): Self = StObject.set(x, "totalMessageCount", value.asInstanceOf[js.Any])
      
      inline def setTotalMessageCountUndefined: Self = StObject.set(x, "totalMessageCount", js.undefined)
      
      inline def setUnreadMessageCount(value: Double): Self = StObject.set(x, "unreadMessageCount", value.asInstanceOf[js.Any])
      
      inline def setUnreadMessageCountUndefined: Self = StObject.set(x, "unreadMessageCount", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.inbox
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.drafts
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.sent
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.trash
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.templates
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.archives
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junk
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.outbox
  */
  trait MailFolderType extends StObject
  object MailFolderType {
    
    inline def archives: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.archives = "archives".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.archives]
    
    inline def drafts: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.drafts = "drafts".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.drafts]
    
    inline def inbox: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.inbox = "inbox".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.inbox]
    
    inline def junk: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junk = "junk".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junk]
    
    inline def outbox: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.outbox = "outbox".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.outbox]
    
    inline def sent: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.sent = "sent".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.sent]
    
    inline def templates: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.templates = "templates".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.templates]
    
    inline def trash: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.trash = "trash".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.trash]
  }
}
