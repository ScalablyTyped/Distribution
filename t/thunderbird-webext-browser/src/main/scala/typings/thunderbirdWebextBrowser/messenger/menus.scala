package typings.thunderbirdWebextBrowser.messenger

import typings.thunderbirdWebextBrowser.messenger.`extension`.ViewType
import typings.thunderbirdWebextBrowser.messenger.accounts.MailAccount
import typings.thunderbirdWebextBrowser.messenger.compose.ComposeAttachment
import typings.thunderbirdWebextBrowser.messenger.folders.MailFolder
import typings.thunderbirdWebextBrowser.messenger.manifest.IconPath
import typings.thunderbirdWebextBrowser.messenger.messages.MessageAttachment
import typings.thunderbirdWebextBrowser.messenger.messages.MessageList
import typings.thunderbirdWebextBrowser.messenger.tabs.Tab
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menus {
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.page
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.frame
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.selection
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.link
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.editable
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.password
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.image
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.video
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.audio
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.browser_action
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.compose_action
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_display_action
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_list
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.folder_pane
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.compose_attachments
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_attachments
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all_message_attachments
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tools_menu
  */
  trait ContextType extends StObject
  object ContextType {
    
    inline def all: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all = "all".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all]
    
    inline def all_message_attachments: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all_message_attachments = "all_message_attachments".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all_message_attachments]
    
    inline def audio: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.audio = "audio".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.audio]
    
    inline def browser_action: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.browser_action = "browser_action".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.browser_action]
    
    inline def compose_action: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.compose_action = "compose_action".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.compose_action]
    
    inline def compose_attachments: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.compose_attachments = "compose_attachments".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.compose_attachments]
    
    inline def editable: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.editable = "editable".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.editable]
    
    inline def folder_pane: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.folder_pane = "folder_pane".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.folder_pane]
    
    inline def frame: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.frame = "frame".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.frame]
    
    inline def image: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.image = "image".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.image]
    
    inline def link: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.link = "link".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.link]
    
    inline def message_attachments: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_attachments = "message_attachments".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_attachments]
    
    inline def message_display_action: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_display_action = "message_display_action".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_display_action]
    
    inline def message_list: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_list = "message_list".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.message_list]
    
    inline def page: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.page = "page".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.page]
    
    inline def password: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.password = "password".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.password]
    
    inline def selection: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.selection = "selection".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.selection]
    
    inline def tab: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab = "tab".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab]
    
    inline def tools_menu: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tools_menu = "tools_menu".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tools_menu]
    
    inline def video: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.video = "video".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.video]
  }
  
  trait CreateCreateProperties extends StObject {
    
    /**
      * The initial state of a checkbox or radio item: `true` for selected and
      * `false` for unselected. Only one radio item can be selected at a time
      * in a given group of radio items.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a command to issue for the context click. Currently supports
      * internal commands `_execute_browser_action`, `_execute_compose_action`
      * and `_execute_message_display_action`.
      */
    var command: js.UndefOr[String] = js.undefined
    
    /**
      * List of contexts this menu item will appear in. Defaults to `['page']`
      * if not specified.
      */
    var contexts: js.UndefOr[js.Array[ContextType]] = js.undefined
    
    /**
      * Lets you restrict the item to apply only to documents whose URL
      * matches one of the given patterns. (This applies to frames as well.)
      * For details on the format of a pattern, see Match Patterns .
      */
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether this context menu item is enabled or disabled. Defaults to
      * true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom icons to display next to the menu item. Custom icons can only
      * be set for items appearing in submenus.
      */
    var icons: js.UndefOr[IconPath] = js.undefined
    
    /**
      * The unique ID to assign to this item. Mandatory for event pages.
      * Cannot be the same as another ID for this extension.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * A function that will be called back when the menu item is clicked.
      * Event pages cannot use this.
      *
      * @param info Information about the item clicked and the context where
      * the click happened.
      *
      * @param tab The details of the tab where the click took place.
      */
    var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, js.UndefOr[Unit]]] = js.undefined
    
    /**
      * The ID of a parent menu item; this makes the item a child of a
      * previously added item.
      */
    var parentId: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Similar to documentUrlPatterns, but lets you filter based on the src
      * attribute of img/audio/video tags and the href of anchor tags.
      */
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The text to be displayed in the item; this is _required_ unless `type`
      * is `separator`. When the context is `selection`, you can use `%s`
      * within the string to show the selected text. For example, if this
      * parameter's value is `Translate '%s' to Latin` and the user selects
      * the word `cool`, the context menu item for the selection is
      * `Translate 'cool' to Latin`. To specify an access key for the new menu
      * entry, include a `&` before the desired letter in the title. For
      * example `&Help`.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** The type of menu item. Defaults to `normal` if not specified. */
    var `type`: js.UndefOr[ItemType] = js.undefined
    
    /**
      * List of view types where the menu item will be shown. Defaults to any
      * view, including those without a viewType.
      */
    var viewTypes: js.UndefOr[js.Array[ViewType]] = js.undefined
    
    /** Whether the item is visible in the menu. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CreateCreateProperties {
    
    inline def apply(): CreateCreateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCreateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateCreateProperties] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcons(value: IconPath): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => js.UndefOr[Unit]): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setViewTypes(value: js.Array[ViewType]): Self = StObject.set(x, "viewTypes", value.asInstanceOf[js.Any])
      
      inline def setViewTypesUndefined: Self = StObject.set(x, "viewTypes", js.undefined)
      
      inline def setViewTypesVarargs(value: ViewType*): Self = StObject.set(x, "viewTypes", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.checkbox
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.radio
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.separator
  */
  trait ItemType extends StObject
  object ItemType {
    
    inline def checkbox: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.checkbox = "checkbox".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.checkbox]
    
    inline def normal: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal = "normal".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal]
    
    inline def radio: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.radio = "radio".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.radio]
    
    inline def separator: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.separator = "separator".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.separator]
  }
  
  trait OnClickData extends StObject {
    
    /**
      * The selected attachments. The <permission>compose</permission>
      * permission is required to return attachments of a message being
      * composed. The <permission>messagesRead</permission> permission is
      * required to return attachments of displayed messages.
      */
    var attachments: js.UndefOr[js.Array[ComposeAttachment | MessageAttachment]] = js.undefined
    
    /** An integer value of button by which menu item was clicked. */
    var button: js.UndefOr[Double] = js.undefined
    
    /**
      * A flag indicating the state of a checkbox or radio item after it is
      * clicked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The displayed folder, if the context menu was opened in the message
      * list. The <permission>accountsRead</permission> permission is
      * required.
      */
    var displayedFolder: js.UndefOr[MailFolder] = js.undefined
    
    /**
      * A flag indicating whether the element is editable (text input,
      * textarea, etc.).
      */
    var editable: Boolean
    
    /** An identifier of the clicked Thunderbird UI element, if any. */
    var fieldId: js.UndefOr[OnClickDataFieldId] = js.undefined
    
    /** The id of the frame of the element where the context menu was clicked. */
    var frameId: js.UndefOr[Double] = js.undefined
    
    /**
      * The URL of the frame of the element where the context menu was
      * clicked, if it was in a frame.
      */
    var frameUrl: js.UndefOr[String] = js.undefined
    
    /** If the element is a link, the text of that link. */
    var linkText: js.UndefOr[String] = js.undefined
    
    /** If the element is a link, the URL it points to. */
    var linkUrl: js.UndefOr[String] = js.undefined
    
    /**
      * One of `image`, `video`, or `audio` if the context menu was activated
      * on one of these types of elements.
      */
    var mediaType: js.UndefOr[String] = js.undefined
    
    /** The ID of the menu item that was clicked. */
    var menuItemId: Double | String
    
    /**
      * An array of keyboard modifiers that were held while the menu item was
      * clicked.
      */
    var modifiers: js.Array[OnClickDataModifiers]
    
    /**
      * The URL of the page where the menu item was clicked. This property is
      * not set if the click occurred in a context where there is no current
      * page, such as in a launcher context menu.
      */
    var pageUrl: js.UndefOr[String] = js.undefined
    
    /** The parent ID, if any, for the item clicked. */
    var parentMenuItemId: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The selected account, if the context menu was opened on an account
      * entry in the folder pane. The <permission>accountsRead</permission>
      * permission is required.
      */
    var selectedAccount: js.UndefOr[MailAccount] = js.undefined
    
    /**
      * The selected folder, if the context menu was opened in the folder
      * pane. The <permission>accountsRead</permission> permission is
      * required.
      */
    var selectedFolder: js.UndefOr[MailFolder] = js.undefined
    
    /**
      * The selected messages, if the context menu was opened in the message
      * list. The <permission>messagesRead</permission> permission is
      * required.
      */
    var selectedMessages: js.UndefOr[MessageList] = js.undefined
    
    /** The text for the context selection, if any. */
    var selectionText: js.UndefOr[String] = js.undefined
    
    /** Will be present for elements with a _src_ URL. */
    var srcUrl: js.UndefOr[String] = js.undefined
    
    /**
      * An identifier of the clicked content element, if any. Use {@link menus.getTargetElement}
      * in the page to find the corresponding element.
      */
    var targetElementId: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of view where the menu is clicked. May be unset if the menu
      * is not associated with a view.
      */
    var viewType: js.UndefOr[ViewType] = js.undefined
    
    /**
      * A flag indicating the state of a checkbox or radio item before it was
      * clicked.
      */
    var wasChecked: js.UndefOr[Boolean] = js.undefined
  }
  object OnClickData {
    
    inline def apply(editable: Boolean, menuItemId: Double | String, modifiers: js.Array[OnClickDataModifiers]): OnClickData = {
      val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[ComposeAttachment | MessageAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: (ComposeAttachment | MessageAttachment)*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisplayedFolder(value: MailFolder): Self = StObject.set(x, "displayedFolder", value.asInstanceOf[js.Any])
      
      inline def setDisplayedFolderUndefined: Self = StObject.set(x, "displayedFolder", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setFieldId(value: OnClickDataFieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      inline def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      inline def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      inline def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMenuItemId(value: Double | String): Self = StObject.set(x, "menuItemId", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: js.Array[OnClickDataModifiers]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: OnClickDataModifiers*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      inline def setParentMenuItemId(value: Double | String): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
      
      inline def setParentMenuItemIdUndefined: Self = StObject.set(x, "parentMenuItemId", js.undefined)
      
      inline def setSelectedAccount(value: MailAccount): Self = StObject.set(x, "selectedAccount", value.asInstanceOf[js.Any])
      
      inline def setSelectedAccountUndefined: Self = StObject.set(x, "selectedAccount", js.undefined)
      
      inline def setSelectedFolder(value: MailFolder): Self = StObject.set(x, "selectedFolder", value.asInstanceOf[js.Any])
      
      inline def setSelectedFolderUndefined: Self = StObject.set(x, "selectedFolder", js.undefined)
      
      inline def setSelectedMessages(value: MessageList): Self = StObject.set(x, "selectedMessages", value.asInstanceOf[js.Any])
      
      inline def setSelectedMessagesUndefined: Self = StObject.set(x, "selectedMessages", js.undefined)
      
      inline def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      inline def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      inline def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      inline def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      inline def setTargetElementId(value: Double): Self = StObject.set(x, "targetElementId", value.asInstanceOf[js.Any])
      
      inline def setTargetElementIdUndefined: Self = StObject.set(x, "targetElementId", js.undefined)
      
      inline def setViewType(value: ViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      
      inline def setWasChecked(value: Boolean): Self = StObject.set(x, "wasChecked", value.asInstanceOf[js.Any])
      
      inline def setWasCheckedUndefined: Self = StObject.set(x, "wasChecked", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeSubject
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeTo
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeCc
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeBcc
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeReplyTo
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeNewsgroupTo
  */
  trait OnClickDataFieldId extends StObject
  object OnClickDataFieldId {
    
    inline def composeBcc: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeBcc = "composeBcc".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeBcc]
    
    inline def composeCc: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeCc = "composeCc".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeCc]
    
    inline def composeNewsgroupTo: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeNewsgroupTo = "composeNewsgroupTo".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeNewsgroupTo]
    
    inline def composeReplyTo: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeReplyTo = "composeReplyTo".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeReplyTo]
    
    inline def composeSubject: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeSubject = "composeSubject".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeSubject]
    
    inline def composeTo: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeTo = "composeTo".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeTo]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Shift
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Alt
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Command
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Ctrl
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.MacCtrl
  */
  trait OnClickDataModifiers extends StObject
  object OnClickDataModifiers {
    
    inline def Alt: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Alt = "Alt".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Alt]
    
    inline def Command: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Command = "Command".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Command]
    
    inline def Ctrl: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Ctrl = "Ctrl".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Ctrl]
    
    inline def MacCtrl: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.MacCtrl = "MacCtrl".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.MacCtrl]
    
    inline def Shift: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Shift = "Shift".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Shift]
  }
  
  trait OnShowData extends StObject {
    
    /**
      * The selected attachments. The <permission>compose</permission>
      * permission is required to return attachments of a message being
      * composed. The <permission>messagesRead</permission> permission is
      * required to return attachments of displayed messages.
      */
    var attachments: js.UndefOr[js.Array[ComposeAttachment | MessageAttachment]] = js.undefined
    
    /** A list of all contexts that apply to the menu. */
    var contexts: js.Array[ContextType]
    
    /**
      * The displayed folder, if the context menu was opened in the message
      * list. The <permission>accountsRead</permission> permission is
      * required.
      */
    var displayedFolder: js.UndefOr[MailFolder] = js.undefined
    
    /**
      * A flag indicating whether the element is editable (text input,
      * textarea, etc.).
      */
    var editable: Boolean
    
    /** An identifier of the clicked Thunderbird UI element, if any. */
    var fieldId: js.UndefOr[OnShowDataFieldId] = js.undefined
    
    /**
      * The URL of the frame of the element where the context menu was
      * clicked, if it was in a frame. **Note:** Host permission is required.
      */
    var frameUrl: js.UndefOr[String] = js.undefined
    
    /**
      * If the element is a link, the text of that link. **Note:** Host
      * permission is required.
      */
    var linkText: js.UndefOr[String] = js.undefined
    
    /**
      * If the element is a link, the URL it points to. **Note:** Host
      * permission is required.
      */
    var linkUrl: js.UndefOr[String] = js.undefined
    
    /**
      * One of `image`, `video`, or `audio` if the context menu was activated
      * on one of these types of elements.
      */
    var mediaType: js.UndefOr[String] = js.undefined
    
    /** A list of IDs of the menu items that were shown. */
    var menuIds: js.Array[Double | String]
    
    /**
      * The URL of the page where the menu item was clicked. This property is
      * not set if the click occurred in a context where there is no current
      * page, such as in a launcher context menu. **Note:** Host permission is
      * required.
      */
    var pageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The selected account, if the context menu was opened on an account
      * entry in the folder pane. The <permission>accountsRead</permission>
      * permission is required.
      */
    var selectedAccount: js.UndefOr[MailAccount] = js.undefined
    
    /**
      * The selected folder, if the context menu was opened in the folder
      * pane. The <permission>accountsRead</permission> permission is
      * required.
      */
    var selectedFolder: js.UndefOr[MailFolder] = js.undefined
    
    /**
      * The selected messages, if the context menu was opened in the message
      * list. The <permission>messagesRead</permission> permission is
      * required.
      */
    var selectedMessages: js.UndefOr[MessageList] = js.undefined
    
    /**
      * The text for the context selection, if any. **Note:** Host permission
      * is required.
      */
    var selectionText: js.UndefOr[String] = js.undefined
    
    /**
      * Will be present for elements with a _src_ URL. **Note:** Host
      * permission is required.
      */
    var srcUrl: js.UndefOr[String] = js.undefined
    
    /**
      * An identifier of the clicked content element, if any. Use {@link menus.getTargetElement}
      * in the page to find the corresponding element.
      */
    var targetElementId: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of view where the menu is shown. May be unset if the menu is
      * not associated with a view.
      */
    var viewType: js.UndefOr[ViewType] = js.undefined
  }
  object OnShowData {
    
    inline def apply(contexts: js.Array[ContextType], editable: Boolean, menuIds: js.Array[Double | String]): OnShowData = {
      val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuIds = menuIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnShowData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnShowData] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[ComposeAttachment | MessageAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: (ComposeAttachment | MessageAttachment)*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDisplayedFolder(value: MailFolder): Self = StObject.set(x, "displayedFolder", value.asInstanceOf[js.Any])
      
      inline def setDisplayedFolderUndefined: Self = StObject.set(x, "displayedFolder", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setFieldId(value: OnShowDataFieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      inline def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      inline def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      inline def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      inline def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMenuIds(value: js.Array[Double | String]): Self = StObject.set(x, "menuIds", value.asInstanceOf[js.Any])
      
      inline def setMenuIdsVarargs(value: (Double | String)*): Self = StObject.set(x, "menuIds", js.Array(value*))
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      inline def setSelectedAccount(value: MailAccount): Self = StObject.set(x, "selectedAccount", value.asInstanceOf[js.Any])
      
      inline def setSelectedAccountUndefined: Self = StObject.set(x, "selectedAccount", js.undefined)
      
      inline def setSelectedFolder(value: MailFolder): Self = StObject.set(x, "selectedFolder", value.asInstanceOf[js.Any])
      
      inline def setSelectedFolderUndefined: Self = StObject.set(x, "selectedFolder", js.undefined)
      
      inline def setSelectedMessages(value: MessageList): Self = StObject.set(x, "selectedMessages", value.asInstanceOf[js.Any])
      
      inline def setSelectedMessagesUndefined: Self = StObject.set(x, "selectedMessages", js.undefined)
      
      inline def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      inline def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      inline def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      inline def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      inline def setTargetElementId(value: Double): Self = StObject.set(x, "targetElementId", value.asInstanceOf[js.Any])
      
      inline def setTargetElementIdUndefined: Self = StObject.set(x, "targetElementId", js.undefined)
      
      inline def setViewType(value: ViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeSubject
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeTo
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeCc
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeBcc
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeReplyTo
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeNewsgroupTo
  */
  trait OnShowDataFieldId extends StObject
  object OnShowDataFieldId {
    
    inline def composeBcc: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeBcc = "composeBcc".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeBcc]
    
    inline def composeCc: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeCc = "composeCc".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeCc]
    
    inline def composeNewsgroupTo: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeNewsgroupTo = "composeNewsgroupTo".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeNewsgroupTo]
    
    inline def composeReplyTo: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeReplyTo = "composeReplyTo".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeReplyTo]
    
    inline def composeSubject: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeSubject = "composeSubject".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeSubject]
    
    inline def composeTo: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeTo = "composeTo".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.composeTo]
  }
  
  trait OverrideContextContextOptions extends StObject {
    
    /**
      * ContextType to override, to allow menu items from other extensions in
      * the menu. Currently only `tab` is supported.
      * `contextOptions.showDefaults` cannot be used with this option.
      */
    var context: js.UndefOr[tab] = js.undefined
    
    /** Whether to also include default menu items in the menu. */
    var showDefaults: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Required when context is `tab`. Requires the
      * <permission>tabs</permission> permission.
      */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object OverrideContextContextOptions {
    
    inline def apply(): OverrideContextContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideContextContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverrideContextContextOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: tab): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setShowDefaults(value: Boolean): Self = StObject.set(x, "showDefaults", value.asInstanceOf[js.Any])
      
      inline def setShowDefaultsUndefined: Self = StObject.set(x, "showDefaults", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  trait UpdateUpdateProperties extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var contexts: js.UndefOr[js.Array[ContextType]] = js.undefined
    
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var icons: js.UndefOr[IconPath] = js.undefined
    
    /**
      * @param tab The details of the tab where the click took place.
      * **Note:** this parameter only present for extensions.
      */
    var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, js.UndefOr[Unit]]] = js.undefined
    
    /**
      * **Note:** You cannot change an item to be a child of one of its own
      * descendants.
      */
    var parentId: js.UndefOr[Double | String] = js.undefined
    
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ItemType] = js.undefined
    
    var viewTypes: js.UndefOr[js.Array[ViewType]] = js.undefined
    
    /** Whether the item is visible in the menu. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateUpdateProperties {
    
    inline def apply(): UpdateUpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUpdateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateUpdateProperties] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcons(value: IconPath): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => js.UndefOr[Unit]): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      inline def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setViewTypes(value: js.Array[ViewType]): Self = StObject.set(x, "viewTypes", value.asInstanceOf[js.Any])
      
      inline def setViewTypesUndefined: Self = StObject.set(x, "viewTypes", js.undefined)
      
      inline def setViewTypesVarargs(value: ViewType*): Self = StObject.set(x, "viewTypes", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
