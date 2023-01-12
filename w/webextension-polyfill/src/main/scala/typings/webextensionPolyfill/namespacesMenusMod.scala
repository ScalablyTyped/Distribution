package typings.webextensionPolyfill

import typings.std.Element
import typings.std.Record
import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesExtensionMod.Extension.ViewType
import typings.webextensionPolyfill.namespacesTabsMod.Tabs.Tab
import typings.webextensionPolyfill.webextensionPolyfillInts.`6`
import typings.webextensionPolyfill.webextensionPolyfillStrings._execute_action
import typings.webextensionPolyfill.webextensionPolyfillStrings._execute_browser_action
import typings.webextensionPolyfill.webextensionPolyfillStrings._execute_page_action
import typings.webextensionPolyfill.webextensionPolyfillStrings._execute_sidebar_action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesMenusMod {
  
  object Menus {
    
    /**
      * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other contexts
      * except for 'tab' and 'tools_menu'.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.all
      - typings.webextensionPolyfill.webextensionPolyfillStrings.page
      - typings.webextensionPolyfill.webextensionPolyfillStrings.frame
      - typings.webextensionPolyfill.webextensionPolyfillStrings.selection
      - typings.webextensionPolyfill.webextensionPolyfillStrings.link
      - typings.webextensionPolyfill.webextensionPolyfillStrings.editable
      - typings.webextensionPolyfill.webextensionPolyfillStrings.password
      - typings.webextensionPolyfill.webextensionPolyfillStrings.image
      - typings.webextensionPolyfill.webextensionPolyfillStrings.video
      - typings.webextensionPolyfill.webextensionPolyfillStrings.audio
      - typings.webextensionPolyfill.webextensionPolyfillStrings.launcher
      - typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark
      - typings.webextensionPolyfill.webextensionPolyfillStrings.tab
      - typings.webextensionPolyfill.webextensionPolyfillStrings.tools_menu
      - typings.webextensionPolyfill.webextensionPolyfillStrings.browser_action
      - typings.webextensionPolyfill.webextensionPolyfillStrings.page_action
      - typings.webextensionPolyfill.webextensionPolyfillStrings.action
    */
    trait ContextType extends StObject
    object ContextType {
      
      inline def action: typings.webextensionPolyfill.webextensionPolyfillStrings.action = "action".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.action]
      
      inline def all: typings.webextensionPolyfill.webextensionPolyfillStrings.all = "all".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.all]
      
      inline def audio: typings.webextensionPolyfill.webextensionPolyfillStrings.audio = "audio".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.audio]
      
      inline def bookmark: typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark = "bookmark".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark]
      
      inline def browser_action: typings.webextensionPolyfill.webextensionPolyfillStrings.browser_action = "browser_action".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.browser_action]
      
      inline def editable: typings.webextensionPolyfill.webextensionPolyfillStrings.editable = "editable".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.editable]
      
      inline def frame: typings.webextensionPolyfill.webextensionPolyfillStrings.frame = "frame".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.frame]
      
      inline def image: typings.webextensionPolyfill.webextensionPolyfillStrings.image = "image".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.image]
      
      inline def launcher: typings.webextensionPolyfill.webextensionPolyfillStrings.launcher = "launcher".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.launcher]
      
      inline def link: typings.webextensionPolyfill.webextensionPolyfillStrings.link = "link".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.link]
      
      inline def page: typings.webextensionPolyfill.webextensionPolyfillStrings.page = "page".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.page]
      
      inline def page_action: typings.webextensionPolyfill.webextensionPolyfillStrings.page_action = "page_action".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.page_action]
      
      inline def password: typings.webextensionPolyfill.webextensionPolyfillStrings.password = "password".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.password]
      
      inline def selection: typings.webextensionPolyfill.webextensionPolyfillStrings.selection = "selection".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.selection]
      
      inline def tab: typings.webextensionPolyfill.webextensionPolyfillStrings.tab = "tab".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.tab]
      
      inline def tools_menu: typings.webextensionPolyfill.webextensionPolyfillStrings.tools_menu = "tools_menu".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.tools_menu]
      
      inline def video: typings.webextensionPolyfill.webextensionPolyfillStrings.video = "video".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.video]
    }
    
    trait CreateCreatePropertiesType extends StObject {
      
      /**
        * The initial state of a checkbox or radio item: true for selected and false for unselected.
        * Only one radio item can be selected at a time in a given group of radio items.
        * Optional.
        */
      var checked: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Specifies a command to issue for the context click.
        * Optional.
        */
      var command: js.UndefOr[
            String | _execute_browser_action | _execute_page_action | _execute_sidebar_action | _execute_action
          ] = js.undefined
      
      /**
        * List of contexts this menu item will appear in. Defaults to ['page'] if not specified.
        * Optional.
        */
      var contexts: js.UndefOr[js.Array[ContextType]] = js.undefined
      
      /**
        * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns.
        * (This applies to frames as well.) For details on the format of a pattern, see $(topic:match_patterns)[Match Patterns].
        * Optional.
        */
      var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Whether this context menu item is enabled or disabled. Defaults to true.
        * Optional.
        */
      var enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Optional.
        */
      var icons: js.UndefOr[Record[String, String]] = js.undefined
      
      /**
        * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
        * Optional.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead,
        * they should register a listener for $(ref:contextMenus.onClicked).
        *
        * @param info Information about the item clicked and the context where the click happened.
        * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
        */
      var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.undefined
      
      /**
        * The ID of a parent menu item; this makes the item a child of a previously added item.
        * Optional.
        */
      var parentId: js.UndefOr[Double | String] = js.undefined
      
      /**
        * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of
        * anchor tags.
        * Optional.
        */
      var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The text to be displayed in the item; this is <em>required</em> unless <code>type</code> is 'separator'.
        * When the context is 'selection', you can use <code>%s</code> within the string to show the selected text. For example,
        * if this parameter's value is "Translate '%s' to Pig Latin" and the user selects the word "cool",
        * the context menu item for the selection is "Translate 'cool' to Pig Latin".
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The type of menu item. Defaults to 'normal' if not specified.
        * Optional.
        */
      var `type`: js.UndefOr[ItemType] = js.undefined
      
      /**
        * List of view types where the menu item will be shown. Defaults to any view, including those without a viewType.
        * Optional.
        */
      var viewTypes: js.UndefOr[js.Array[ViewType]] = js.undefined
      
      /**
        * Whether the item is visible in the menu.
        * Optional.
        */
      var visible: js.UndefOr[Boolean] = js.undefined
    }
    object CreateCreatePropertiesType {
      
      inline def apply(): CreateCreatePropertiesType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateCreatePropertiesType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CreateCreatePropertiesType] (val x: Self) extends AnyVal {
        
        inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        inline def setCommand(
          value: String | _execute_browser_action | _execute_page_action | _execute_sidebar_action | _execute_action
        ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
        
        inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
        
        inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
        
        inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
        
        inline def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
        
        inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
        
        inline def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        inline def setIcons(value: Record[String, String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
        
        inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
        
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
    
    /**
      * The type of menu item.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.normal
      - typings.webextensionPolyfill.webextensionPolyfillStrings.checkbox
      - typings.webextensionPolyfill.webextensionPolyfillStrings.radio
      - typings.webextensionPolyfill.webextensionPolyfillStrings.separator
    */
    trait ItemType extends StObject
    object ItemType {
      
      inline def checkbox: typings.webextensionPolyfill.webextensionPolyfillStrings.checkbox = "checkbox".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.checkbox]
      
      inline def normal: typings.webextensionPolyfill.webextensionPolyfillStrings.normal = "normal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.normal]
      
      inline def radio: typings.webextensionPolyfill.webextensionPolyfillStrings.radio = "radio".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.radio]
      
      inline def separator: typings.webextensionPolyfill.webextensionPolyfillStrings.separator = "separator".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.separator]
    }
    
    /**
      * Information sent when a context menu item is clicked.
      */
    trait OnClickData extends StObject {
      
      /**
        * The id of the bookmark where the context menu was clicked, if it was on a bookmark.
        */
      var bookmarkId: String
      
      /**
        * An integer value of button by which menu item was clicked.
        * Optional.
        */
      var button: js.UndefOr[Double] = js.undefined
      
      /**
        * A flag indicating the state of a checkbox or radio item after it is clicked.
        * Optional.
        */
      var checked: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A flag indicating whether the element is editable (text input, textarea, etc.).
        */
      var editable: Boolean
      
      /**
        * The id of the frame of the element where the context menu was clicked.
        * Optional.
        */
      var frameId: js.UndefOr[Double] = js.undefined
      
      /**
        * The URL of the frame of the element where the context menu was clicked, if it was in a frame.
        * Optional.
        */
      var frameUrl: js.UndefOr[String] = js.undefined
      
      /**
        * If the element is a link, the text of that link.
        * Optional.
        */
      var linkText: js.UndefOr[String] = js.undefined
      
      /**
        * If the element is a link, the URL it points to.
        * Optional.
        */
      var linkUrl: js.UndefOr[String] = js.undefined
      
      /**
        * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
        * Optional.
        */
      var mediaType: js.UndefOr[String] = js.undefined
      
      /**
        * The ID of the menu item that was clicked.
        */
      var menuItemId: Double | String
      
      /**
        * An array of keyboard modifiers that were held while the menu item was clicked.
        */
      var modifiers: js.Array[OnClickDataModifiersItemEnum]
      
      /**
        * The URL of the page where the menu item was clicked. This property is not set if the click occured in a context where
        * there is no current page, such as in a launcher context menu.
        * Optional.
        */
      var pageUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The parent ID, if any, for the item clicked.
        * Optional.
        */
      var parentMenuItemId: js.UndefOr[Double | String] = js.undefined
      
      /**
        * The text for the context selection, if any.
        * Optional.
        */
      var selectionText: js.UndefOr[String] = js.undefined
      
      /**
        * Will be present for elements with a 'src' URL.
        * Optional.
        */
      var srcUrl: js.UndefOr[String] = js.undefined
      
      /**
        * An identifier of the clicked element, if any. Use menus.getTargetElement in the page to find the corresponding element.
        * Optional.
        */
      var targetElementId: js.UndefOr[Double] = js.undefined
      
      /**
        * The type of view where the menu is clicked. May be unset if the menu is not associated with a view.
        * Optional.
        */
      var viewType: js.UndefOr[ViewType] = js.undefined
      
      /**
        * A flag indicating the state of a checkbox or radio item before it was clicked.
        * Optional.
        */
      var wasChecked: js.UndefOr[Boolean] = js.undefined
    }
    object OnClickData {
      
      inline def apply(
        bookmarkId: String,
        editable: Boolean,
        menuItemId: Double | String,
        modifiers: js.Array[OnClickDataModifiersItemEnum]
      ): OnClickData = {
        val __obj = js.Dynamic.literal(bookmarkId = bookmarkId.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnClickData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
        
        inline def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
        
        inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
        
        inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
        
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
        
        inline def setModifiers(value: js.Array[OnClickDataModifiersItemEnum]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersVarargs(value: OnClickDataModifiersItemEnum*): Self = StObject.set(x, "modifiers", js.Array(value*))
        
        inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
        
        inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
        
        inline def setParentMenuItemId(value: Double | String): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
        
        inline def setParentMenuItemIdUndefined: Self = StObject.set(x, "parentMenuItemId", js.undefined)
        
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
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Shift
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Alt
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Command
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Ctrl
      - typings.webextensionPolyfill.webextensionPolyfillStrings.MacCtrl
    */
    trait OnClickDataModifiersItemEnum extends StObject
    object OnClickDataModifiersItemEnum {
      
      inline def Alt: typings.webextensionPolyfill.webextensionPolyfillStrings.Alt = "Alt".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Alt]
      
      inline def Command: typings.webextensionPolyfill.webextensionPolyfillStrings.Command = "Command".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Command]
      
      inline def Ctrl: typings.webextensionPolyfill.webextensionPolyfillStrings.Ctrl = "Ctrl".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Ctrl]
      
      inline def MacCtrl: typings.webextensionPolyfill.webextensionPolyfillStrings.MacCtrl = "MacCtrl".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.MacCtrl]
      
      inline def Shift: typings.webextensionPolyfill.webextensionPolyfillStrings.Shift = "Shift".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Shift]
    }
    
    /**
      * Information about the context of the menu action and the created menu items. For more information about each property,
      * see OnClickData. The following properties are only set if the extension has host permissions for the given context:
      * linkUrl, linkText, srcUrl, pageUrl, frameUrl, selectionText.
      */
    trait OnShownInfoType extends StObject {
      
      /**
        * A list of all contexts that apply to the menu.
        */
      var contexts: js.Array[ContextType]
      
      var editable: Boolean
      
      /**
        * Optional.
        */
      var frameUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var linkText: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var linkUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var mediaType: js.UndefOr[String] = js.undefined
      
      /**
        * A list of IDs of the menu items that were shown.
        */
      var menuIds: js.Array[Double | String]
      
      /**
        * Optional.
        */
      var pageUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var selectionText: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var srcUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var targetElementId: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional.
        */
      var viewType: js.UndefOr[ViewType] = js.undefined
    }
    object OnShownInfoType {
      
      inline def apply(contexts: js.Array[ContextType], editable: Boolean, menuIds: js.Array[Double | String]): OnShownInfoType = {
        val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuIds = menuIds.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnShownInfoType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnShownInfoType] (val x: Self) extends AnyVal {
        
        inline def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
        
        inline def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value*))
        
        inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
        
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
    
    trait OverrideContextContextOptionsType extends StObject {
      
      /**
        * Required when context is 'bookmark'. Requires 'bookmark' permission.
        * Optional.
        */
      var bookmarkId: js.UndefOr[String] = js.undefined
      
      /**
        * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and 'tab' are
        * supported. showDefaults cannot be used with this option.
        * Optional.
        */
      var context: js.UndefOr[OverrideContextContextOptionsTypeContextEnum] = js.undefined
      
      /**
        * Whether to also include default menu items in the menu.
        * Optional.
        */
      var showDefaults: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Required when context is 'tab'. Requires 'tabs' permission.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
    }
    object OverrideContextContextOptionsType {
      
      inline def apply(): OverrideContextContextOptionsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OverrideContextContextOptionsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OverrideContextContextOptionsType] (val x: Self) extends AnyVal {
        
        inline def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
        
        inline def setBookmarkIdUndefined: Self = StObject.set(x, "bookmarkId", js.undefined)
        
        inline def setContext(value: OverrideContextContextOptionsTypeContextEnum): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setShowDefaults(value: Boolean): Self = StObject.set(x, "showDefaults", value.asInstanceOf[js.Any])
        
        inline def setShowDefaultsUndefined: Self = StObject.set(x, "showDefaults", js.undefined)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      }
    }
    
    /**
      * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and 'tab' are
      * supported. showDefaults cannot be used with this option.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark
      - typings.webextensionPolyfill.webextensionPolyfillStrings.tab
    */
    trait OverrideContextContextOptionsTypeContextEnum extends StObject
    object OverrideContextContextOptionsTypeContextEnum {
      
      inline def bookmark: typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark = "bookmark".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.bookmark]
      
      inline def tab: typings.webextensionPolyfill.webextensionPolyfillStrings.tab = "tab".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.tab]
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * The maximum number of top level extension items that can be added to an extension action context menu.
        * Any items beyond this limit will be ignored.
        */
      var ACTION_MENU_TOP_LEVEL_LIMIT: `6` = js.native
      
      /**
        * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the creation
        * callback fires (the details will be in $(ref:runtime.lastError)).
        *
        * @param createProperties
        * @param callback Optional. Called when the item has been created in the browser. If there were any problems creating the
        * item, details will be available in $(ref:runtime.lastError).
        * @returns The ID of the newly created item.
        */
      def create(createProperties: CreateCreatePropertiesType): Double | String = js.native
      def create(createProperties: CreateCreatePropertiesType, callback: js.Function0[Unit]): Double | String = js.native
      
      /**
        * Retrieve the element that was associated with a recent contextmenu event.
        *
        * @param targetElementId The identifier of the clicked element, available as info.targetElementId in the menus.onShown,
        * onClicked or onclick event.
        */
      def getTargetElement(targetElementId: Double): Element = js.native
      
      /**
        * Fired when a context menu item is clicked.
        *
        * @param info Information about the item clicked and the context where the click happened.
        * @param tab Optional. The details of the tab where the click took place. If the click did not take place in a tab,
        * this parameter will be missing.
        */
      var onClicked: Event[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]] = js.native
      
      /**
        * Fired when a menu is hidden. This event is only fired if onShown has fired before.
        */
      var onHidden: Event[js.Function0[Unit]] = js.native
      
      /**
        * Fired when a menu is shown. The extension can add, modify or remove menu items and call menus.refresh()
        * to update the menu.
        *
        * @param info Information about the context of the menu action and the created menu items.
        * For more information about each property, see OnClickData. The following properties are only set if the extension has
        * host permissions for the given context: linkUrl, linkText, srcUrl, pageUrl, frameUrl, selectionText.
        * @param tab The details of the tab where the menu was opened.
        */
      var onShown: Event[js.Function2[/* info */ OnShownInfoType, /* tab */ Tab, Unit]] = js.native
      
      /**
        * Show the matching menu items from this extension instead of the default menu. This should be called during a
        * 'contextmenu' DOM event handler, and only applies to the menu that opens after this event.
        *
        * @param contextOptions
        */
      def overrideContext(contextOptions: OverrideContextContextOptionsType): Unit = js.native
      
      /**
        * Updates the extension items in the shown menu, including changes that have been made since the menu was shown.
        * Has no effect if the menu is hidden. Rebuilding a shown menu is an expensive operation,
        * only invoke this method when necessary.
        */
      def refresh(): js.Promise[Unit] = js.native
      
      def remove(menuItemId: String): js.Promise[Unit] = js.native
      /**
        * Removes a context menu item.
        *
        * @param menuItemId The ID of the context menu item to remove.
        * @returns Called when the context menu has been removed.
        */
      def remove(menuItemId: Double): js.Promise[Unit] = js.native
      
      /**
        * Removes all context menu items added by this extension.
        *
        * @returns Called when removal is complete.
        */
      def removeAll(): js.Promise[Unit] = js.native
      
      def update(id: String, updateProperties: UpdateUpdatePropertiesType): js.Promise[Unit] = js.native
      /**
        * Updates a previously created context menu item.
        *
        * @param id The ID of the item to update.
        * @param updateProperties The properties to update. Accepts the same values as the create function.
        * @returns Called when the context menu has been updated.
        */
      def update(id: Double, updateProperties: UpdateUpdatePropertiesType): js.Promise[Unit] = js.native
    }
    
    /**
      * The properties to update. Accepts the same values as the create function.
      */
    trait UpdateUpdatePropertiesType extends StObject {
      
      /**
        * Optional.
        */
      var checked: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Optional.
        */
      var contexts: js.UndefOr[js.Array[ContextType]] = js.undefined
      
      /**
        * Optional.
        */
      var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Optional.
        */
      var enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Optional.
        */
      var icons: js.UndefOr[Record[String, String]] = js.undefined
      
      /**
        * @param info
        * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
        */
      var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.undefined
      
      /**
        * Note: You cannot change an item to be a child of one of its own descendants.
        * Optional.
        */
      var parentId: js.UndefOr[Double | String] = js.undefined
      
      /**
        * Optional.
        */
      var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var `type`: js.UndefOr[ItemType] = js.undefined
      
      /**
        * Optional.
        */
      var viewTypes: js.UndefOr[js.Array[ViewType]] = js.undefined
      
      /**
        * Whether the item is visible in the menu.
        * Optional.
        */
      var visible: js.UndefOr[Boolean] = js.undefined
    }
    object UpdateUpdatePropertiesType {
      
      inline def apply(): UpdateUpdatePropertiesType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateUpdatePropertiesType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UpdateUpdatePropertiesType] (val x: Self) extends AnyVal {
        
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
        
        inline def setIcons(value: Record[String, String]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
        
        inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
        
        inline def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
        
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
}
