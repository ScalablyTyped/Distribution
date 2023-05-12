package typings.thunderbirdWebextBrowser.browser

import typings.thunderbirdWebextBrowser.browser.folders.MailFolder
import typings.thunderbirdWebextBrowser.browser.messages.TagsDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailTabs {
  
  trait MailTab extends StObject {
    
    var active: Boolean
    
    /**
      * The <permission>accountsRead</permission> permission is required for
      * this property to be included.
      */
    var displayedFolder: js.UndefOr[MailFolder] = js.undefined
    
    var folderPaneVisible: js.UndefOr[Boolean] = js.undefined
    
    var id: Double
    
    var layout: MailTabLayout
    
    var messagePaneVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **Note:** `sortType` and `sortOrder` depend on each other, so both
      * should be present, or neither.
      */
    var sortOrder: js.UndefOr[MailTabSortOrder] = js.undefined
    
    /**
      * **Note:** `sortType` and `sortOrder` depend on each other, so both
      * should be present, or neither.
      */
    var sortType: js.UndefOr[MailTabSortType] = js.undefined
    
    var viewType: js.UndefOr[MailTabViewType] = js.undefined
    
    var windowId: Double
  }
  object MailTab {
    
    inline def apply(active: Boolean, id: Double, layout: MailTabLayout, windowId: Double): MailTab = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailTab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailTab] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisplayedFolder(value: MailFolder): Self = StObject.set(x, "displayedFolder", value.asInstanceOf[js.Any])
      
      inline def setDisplayedFolderUndefined: Self = StObject.set(x, "displayedFolder", js.undefined)
      
      inline def setFolderPaneVisible(value: Boolean): Self = StObject.set(x, "folderPaneVisible", value.asInstanceOf[js.Any])
      
      inline def setFolderPaneVisibleUndefined: Self = StObject.set(x, "folderPaneVisible", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: MailTabLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setMessagePaneVisible(value: Boolean): Self = StObject.set(x, "messagePaneVisible", value.asInstanceOf[js.Any])
      
      inline def setMessagePaneVisibleUndefined: Self = StObject.set(x, "messagePaneVisible", js.undefined)
      
      inline def setSortOrder(value: MailTabSortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setSortType(value: MailTabSortType): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
      
      inline def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
      
      inline def setViewType(value: MailTabViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.standard
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.wide
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.vertical
  */
  trait MailTabLayout extends StObject
  object MailTabLayout {
    
    inline def standard: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.standard = "standard".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.standard]
    
    inline def vertical: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.vertical = "vertical".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.vertical]
    
    inline def wide: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.wide = "wide".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.wide]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ascending
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.descending
  */
  trait MailTabSortOrder extends StObject
  object MailTabSortOrder {
    
    inline def ascending: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ascending = "ascending".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ascending]
    
    inline def descending: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.descending = "descending".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.descending]
    
    inline def none: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none = "none".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.date
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.subject
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.author
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.id
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.thread
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.status
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.size
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.flagged
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unread
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.recipient
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.location
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tags
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junkStatus
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.attachments
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.account
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.custom
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.received
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.correspondent
  */
  trait MailTabSortType extends StObject
  object MailTabSortType {
    
    inline def account: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.account = "account".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.account]
    
    inline def attachments: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.attachments = "attachments".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.attachments]
    
    inline def author: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.author = "author".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.author]
    
    inline def correspondent: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.correspondent = "correspondent".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.correspondent]
    
    inline def custom: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.custom = "custom".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.custom]
    
    inline def date: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.date = "date".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.date]
    
    inline def flagged: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.flagged = "flagged".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.flagged]
    
    inline def id: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.id = "id".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.id]
    
    inline def junkStatus: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junkStatus = "junkStatus".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junkStatus]
    
    inline def location: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.location = "location".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.location]
    
    inline def none: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none = "none".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none]
    
    inline def priority: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority = "priority".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority]
    
    inline def received: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.received = "received".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.received]
    
    inline def recipient: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.recipient = "recipient".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.recipient]
    
    inline def size: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.size = "size".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.size]
    
    inline def status: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.status = "status".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.status]
    
    inline def subject: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.subject = "subject".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.subject]
    
    inline def tags: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tags = "tags".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tags]
    
    inline def thread: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.thread = "thread".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.thread]
    
    inline def unread: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unread = "unread".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unread]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ungrouped
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedByThread
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedBySortType
  */
  trait MailTabViewType extends StObject
  object MailTabViewType {
    
    inline def groupedBySortType: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedBySortType = "groupedBySortType".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedBySortType]
    
    inline def groupedByThread: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedByThread = "groupedByThread".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedByThread]
    
    inline def ungrouped: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ungrouped = "ungrouped".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ungrouped]
  }
  
  trait QueryQueryInfo extends StObject {
    
    /** Whether the tabs are active in their windows. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the tabs are in the current window. */
    var currentWindow: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the tabs are in the last focused window. */
    var lastFocusedWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ID of the parent window, or {@link windows.WINDOW_ID_CURRENT} for
      * the current window.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object QueryQueryInfo {
    
    inline def apply(): QueryQueryInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryQueryInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryQueryInfo] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCurrentWindow(value: Boolean): Self = StObject.set(x, "currentWindow", value.asInstanceOf[js.Any])
      
      inline def setCurrentWindowUndefined: Self = StObject.set(x, "currentWindow", js.undefined)
      
      inline def setLastFocusedWindow(value: Boolean): Self = StObject.set(x, "lastFocusedWindow", value.asInstanceOf[js.Any])
      
      inline def setLastFocusedWindowUndefined: Self = StObject.set(x, "lastFocusedWindow", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait QuickFilterTextDetail extends StObject {
    
    /** Shows messages where `text` matches the author. */
    var author: js.UndefOr[Boolean] = js.undefined
    
    /** Shows messages where `text` matches the message body. */
    var body: js.UndefOr[Boolean] = js.undefined
    
    /** Shows messages where `text` matches the recipients. */
    var recipients: js.UndefOr[Boolean] = js.undefined
    
    /** Shows messages where `text` matches the subject. */
    var subject: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String to match against the `recipients`, `author`, `subject`, or
      * `body`.
      */
    var text: String
  }
  object QuickFilterTextDetail {
    
    inline def apply(text: String): QuickFilterTextDetail = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuickFilterTextDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickFilterTextDetail] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: Boolean): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setRecipients(value: Boolean): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      inline def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetQuickFilterProperties extends StObject {
    
    /** Shows only messages with attachments. */
    var attachment: js.UndefOr[Boolean] = js.undefined
    
    /** Shows only messages from people in the address book. */
    var contact: js.UndefOr[Boolean] = js.undefined
    
    /** Shows only flagged messages. */
    var flagged: js.UndefOr[Boolean] = js.undefined
    
    /** Shows or hides the Quick Filter bar. */
    var show: js.UndefOr[Boolean] = js.undefined
    
    /** Shows only messages with tags on them. */
    var tags: js.UndefOr[Boolean | TagsDetail] = js.undefined
    
    /** Shows only messages matching the supplied text. */
    var text: js.UndefOr[QuickFilterTextDetail] = js.undefined
    
    /** Shows only unread messages. */
    var unread: js.UndefOr[Boolean] = js.undefined
  }
  object SetQuickFilterProperties {
    
    inline def apply(): SetQuickFilterProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetQuickFilterProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetQuickFilterProperties] (val x: Self) extends AnyVal {
      
      inline def setAttachment(value: Boolean): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setContact(value: Boolean): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
      
      inline def setFlagged(value: Boolean): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
      
      inline def setFlaggedUndefined: Self = StObject.set(x, "flagged", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTags(value: Boolean | TagsDetail): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setText(value: QuickFilterTextDetail): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUnread(value: Boolean): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
      
      inline def setUnreadUndefined: Self = StObject.set(x, "unread", js.undefined)
    }
  }
  
  trait UpdateUpdateProperties extends StObject {
    
    /**
      * Sets the folder displayed in the tab. The extension must have the
      * <permission>accountsRead</permission> permission to do this.
      */
    var displayedFolder: js.UndefOr[MailFolder] = js.undefined
    
    /** Shows or hides the folder pane. */
    var folderPaneVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the arrangement of the folder pane, message list pane, and
      * message display pane. Note that setting this applies it to all mail
      * tabs.
      */
    var layout: js.UndefOr[UpdateUpdatePropertiesLayout] = js.undefined
    
    /** Shows or hides the message display pane. */
    var messagePaneVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Sorts the list of messages. `sortType` must also be given. */
    var sortOrder: js.UndefOr[UpdateUpdatePropertiesSortOrder] = js.undefined
    
    /** Sorts the list of messages. `sortOrder` must also be given. */
    var sortType: js.UndefOr[UpdateUpdatePropertiesSortType] = js.undefined
    
    var viewType: js.UndefOr[UpdateUpdatePropertiesViewType] = js.undefined
  }
  object UpdateUpdateProperties {
    
    inline def apply(): UpdateUpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUpdateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateUpdateProperties] (val x: Self) extends AnyVal {
      
      inline def setDisplayedFolder(value: MailFolder): Self = StObject.set(x, "displayedFolder", value.asInstanceOf[js.Any])
      
      inline def setDisplayedFolderUndefined: Self = StObject.set(x, "displayedFolder", js.undefined)
      
      inline def setFolderPaneVisible(value: Boolean): Self = StObject.set(x, "folderPaneVisible", value.asInstanceOf[js.Any])
      
      inline def setFolderPaneVisibleUndefined: Self = StObject.set(x, "folderPaneVisible", js.undefined)
      
      inline def setLayout(value: UpdateUpdatePropertiesLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMessagePaneVisible(value: Boolean): Self = StObject.set(x, "messagePaneVisible", value.asInstanceOf[js.Any])
      
      inline def setMessagePaneVisibleUndefined: Self = StObject.set(x, "messagePaneVisible", js.undefined)
      
      inline def setSortOrder(value: UpdateUpdatePropertiesSortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setSortType(value: UpdateUpdatePropertiesSortType): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
      
      inline def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
      
      inline def setViewType(value: UpdateUpdatePropertiesViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.standard
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.wide
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.vertical
  */
  trait UpdateUpdatePropertiesLayout extends StObject
  object UpdateUpdatePropertiesLayout {
    
    inline def standard: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.standard = "standard".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.standard]
    
    inline def vertical: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.vertical = "vertical".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.vertical]
    
    inline def wide: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.wide = "wide".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.wide]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ascending
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.descending
  */
  trait UpdateUpdatePropertiesSortOrder extends StObject
  object UpdateUpdatePropertiesSortOrder {
    
    inline def ascending: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ascending = "ascending".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ascending]
    
    inline def descending: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.descending = "descending".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.descending]
    
    inline def none: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none = "none".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.date
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.subject
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.author
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.id
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.thread
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.status
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.size
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.flagged
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unread
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.recipient
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.location
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tags
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junkStatus
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.attachments
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.account
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.custom
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.received
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.correspondent
  */
  trait UpdateUpdatePropertiesSortType extends StObject
  object UpdateUpdatePropertiesSortType {
    
    inline def account: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.account = "account".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.account]
    
    inline def attachments: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.attachments = "attachments".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.attachments]
    
    inline def author: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.author = "author".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.author]
    
    inline def correspondent: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.correspondent = "correspondent".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.correspondent]
    
    inline def custom: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.custom = "custom".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.custom]
    
    inline def date: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.date = "date".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.date]
    
    inline def flagged: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.flagged = "flagged".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.flagged]
    
    inline def id: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.id = "id".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.id]
    
    inline def junkStatus: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junkStatus = "junkStatus".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.junkStatus]
    
    inline def location: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.location = "location".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.location]
    
    inline def none: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none = "none".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.none]
    
    inline def priority: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority = "priority".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority]
    
    inline def received: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.received = "received".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.received]
    
    inline def recipient: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.recipient = "recipient".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.recipient]
    
    inline def size: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.size = "size".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.size]
    
    inline def status: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.status = "status".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.status]
    
    inline def subject: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.subject = "subject".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.subject]
    
    inline def tags: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tags = "tags".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tags]
    
    inline def thread: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.thread = "thread".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.thread]
    
    inline def unread: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unread = "unread".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.unread]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ungrouped
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedByThread
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedBySortType
  */
  trait UpdateUpdatePropertiesViewType extends StObject
  object UpdateUpdatePropertiesViewType {
    
    inline def groupedBySortType: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedBySortType = "groupedBySortType".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedBySortType]
    
    inline def groupedByThread: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedByThread = "groupedByThread".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.groupedByThread]
    
    inline def ungrouped: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ungrouped = "ungrouped".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.ungrouped]
  }
}
