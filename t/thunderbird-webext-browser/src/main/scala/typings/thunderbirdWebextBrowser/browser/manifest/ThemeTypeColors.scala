package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTypeColors extends StObject {
  
  /**
    * @deprecated Unsupported colors property, use `theme.colors.frame`,
    * this alias is ignored in Thunderbird >= 70.
    */
  var accentcolor: js.UndefOr[ThemeColor] = js.undefined
  
  /** Not used in Thunderbird. */
  var bookmark_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The color of the background of the pressed toolbar buttons. */
  var button_background_active: js.UndefOr[ThemeColor] = js.undefined
  
  /** The color of the background of the toolbar buttons on hover. */
  var button_background_hover: js.UndefOr[ThemeColor] = js.undefined
  
  /** The background color of the header area. */
  var frame: js.UndefOr[ThemeColor] = js.undefined
  
  /** The background color of the header area when the window is inactive. */
  var frame_inactive: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The color of the toolbar icons. Defaults to the color specified by
    * `toolbar_text`.
    */
  var icons: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The color of the toolbar icons in attention state such as the chat
    * icon with new messages.
    */
  var icons_attention: js.UndefOr[ThemeColor] = js.undefined
  
  /** Not used in Thunderbird. */
  var ntp_background: js.UndefOr[ThemeColor] = js.undefined
  
  /** Not used in Thunderbird. */
  var ntp_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The background color of popups such as the AppMenu. */
  var popup: js.UndefOr[ThemeColor] = js.undefined
  
  /** The border color of popups. */
  var popup_border: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The background color of items highlighted using the keyboard inside
    * popups.
    */
  var popup_highlight: js.UndefOr[ThemeColor] = js.undefined
  
  /** The text color of items highlighted using the keyboard inside popups. */
  var popup_highlight_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The text color of popups. */
  var popup_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The background color of the trees. */
  var sidebar: js.UndefOr[ThemeColor] = js.undefined
  
  /** The border color of the trees. */
  var sidebar_border: js.UndefOr[ThemeColor] = js.undefined
  
  /** The background color of highlighted rows in trees. */
  var sidebar_highlight: js.UndefOr[ThemeColor] = js.undefined
  
  /** The border color of highlighted rows in trees. */
  var sidebar_highlight_border: js.UndefOr[ThemeColor] = js.undefined
  
  /** The text color of highlighted rows in trees. */
  var sidebar_highlight_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The text color of the trees. Needed to enable the tree theming. */
  var sidebar_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The color of the vertical separator of the background tabs. */
  var tab_background_separator: js.UndefOr[ThemeColor] = js.undefined
  
  /** The text color of the unselected tabs. */
  var tab_background_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The color of the selected tab line. */
  var tab_line: js.UndefOr[ThemeColor] = js.undefined
  
  /** The color of the tab loading indicator. */
  var tab_loading: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * Background color of the selected tab. Defaults to the color specified
    * by `toolbar`.
    */
  var tab_selected: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The text color for the selected tab. Defaults to the color specified
    * by `toolbar_text`.
    */
  var tab_text: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * @deprecated Unsupported color property, use
    * `theme.colors.tab_background_text`, this alias is ignored in
    * Thunderbird >= 70.
    */
  var textcolor: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The background color of the toolbars. Also used as default value for
    * `tab_selected`.
    */
  var toolbar: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The color of the line separating the bottom of the toolbar from the
    * region below.
    */
  var toolbar_bottom_separator: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The background color for fields in the toolbar, such as the search
    * field.
    */
  var toolbar_field: js.UndefOr[ThemeColor] = js.undefined
  
  /** The border color for fields in the toolbar. */
  var toolbar_field_border: js.UndefOr[ThemeColor] = js.undefined
  
  /** The focused border color for fields in the toolbar. */
  var toolbar_field_border_focus: js.UndefOr[ThemeColor] = js.undefined
  
  /** The focused background color for fields in the toolbar. */
  var toolbar_field_focus: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The background color used to indicate the current selection of text in
    * the search field.
    */
  var toolbar_field_highlight: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The color used to draw text that's currently selected in the search
    * field.
    */
  var toolbar_field_highlight_text: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * Not used in Thunderbird.
    *
    * @deprecated This color property is ignored in >= 89.
    */
  var toolbar_field_separator: js.UndefOr[ThemeColor] = js.undefined
  
  /** The text color for fields in the toolbar. */
  var toolbar_field_text: js.UndefOr[ThemeColor] = js.undefined
  
  /** The text color in the focused fields in the toolbar. */
  var toolbar_field_text_focus: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The text color in the main Thunderbird toolbar. Also used as default
    * value for `icons` and `tab_text`.
    */
  var toolbar_text: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The color of the line separating the top of the toolbar from the
    * region above.
    */
  var toolbar_top_separator: js.UndefOr[ThemeColor] = js.undefined
  
  /** The color of the vertical separators on the toolbars. */
  var toolbar_vertical_separator: js.UndefOr[ThemeColor] = js.undefined
}
object ThemeTypeColors {
  
  inline def apply(): ThemeTypeColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTypeColors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeTypeColors] (val x: Self) extends AnyVal {
    
    inline def setAccentcolor(value: ThemeColor): Self = StObject.set(x, "accentcolor", value.asInstanceOf[js.Any])
    
    inline def setAccentcolorUndefined: Self = StObject.set(x, "accentcolor", js.undefined)
    
    inline def setBookmark_text(value: ThemeColor): Self = StObject.set(x, "bookmark_text", value.asInstanceOf[js.Any])
    
    inline def setBookmark_textUndefined: Self = StObject.set(x, "bookmark_text", js.undefined)
    
    inline def setButton_background_active(value: ThemeColor): Self = StObject.set(x, "button_background_active", value.asInstanceOf[js.Any])
    
    inline def setButton_background_activeUndefined: Self = StObject.set(x, "button_background_active", js.undefined)
    
    inline def setButton_background_hover(value: ThemeColor): Self = StObject.set(x, "button_background_hover", value.asInstanceOf[js.Any])
    
    inline def setButton_background_hoverUndefined: Self = StObject.set(x, "button_background_hover", js.undefined)
    
    inline def setFrame(value: ThemeColor): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setFrame_inactive(value: ThemeColor): Self = StObject.set(x, "frame_inactive", value.asInstanceOf[js.Any])
    
    inline def setFrame_inactiveUndefined: Self = StObject.set(x, "frame_inactive", js.undefined)
    
    inline def setIcons(value: ThemeColor): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIcons_attention(value: ThemeColor): Self = StObject.set(x, "icons_attention", value.asInstanceOf[js.Any])
    
    inline def setIcons_attentionUndefined: Self = StObject.set(x, "icons_attention", js.undefined)
    
    inline def setNtp_background(value: ThemeColor): Self = StObject.set(x, "ntp_background", value.asInstanceOf[js.Any])
    
    inline def setNtp_backgroundUndefined: Self = StObject.set(x, "ntp_background", js.undefined)
    
    inline def setNtp_text(value: ThemeColor): Self = StObject.set(x, "ntp_text", value.asInstanceOf[js.Any])
    
    inline def setNtp_textUndefined: Self = StObject.set(x, "ntp_text", js.undefined)
    
    inline def setPopup(value: ThemeColor): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setPopup_border(value: ThemeColor): Self = StObject.set(x, "popup_border", value.asInstanceOf[js.Any])
    
    inline def setPopup_borderUndefined: Self = StObject.set(x, "popup_border", js.undefined)
    
    inline def setPopup_highlight(value: ThemeColor): Self = StObject.set(x, "popup_highlight", value.asInstanceOf[js.Any])
    
    inline def setPopup_highlightUndefined: Self = StObject.set(x, "popup_highlight", js.undefined)
    
    inline def setPopup_highlight_text(value: ThemeColor): Self = StObject.set(x, "popup_highlight_text", value.asInstanceOf[js.Any])
    
    inline def setPopup_highlight_textUndefined: Self = StObject.set(x, "popup_highlight_text", js.undefined)
    
    inline def setPopup_text(value: ThemeColor): Self = StObject.set(x, "popup_text", value.asInstanceOf[js.Any])
    
    inline def setPopup_textUndefined: Self = StObject.set(x, "popup_text", js.undefined)
    
    inline def setSidebar(value: ThemeColor): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
    
    inline def setSidebar_border(value: ThemeColor): Self = StObject.set(x, "sidebar_border", value.asInstanceOf[js.Any])
    
    inline def setSidebar_borderUndefined: Self = StObject.set(x, "sidebar_border", js.undefined)
    
    inline def setSidebar_highlight(value: ThemeColor): Self = StObject.set(x, "sidebar_highlight", value.asInstanceOf[js.Any])
    
    inline def setSidebar_highlightUndefined: Self = StObject.set(x, "sidebar_highlight", js.undefined)
    
    inline def setSidebar_highlight_border(value: ThemeColor): Self = StObject.set(x, "sidebar_highlight_border", value.asInstanceOf[js.Any])
    
    inline def setSidebar_highlight_borderUndefined: Self = StObject.set(x, "sidebar_highlight_border", js.undefined)
    
    inline def setSidebar_highlight_text(value: ThemeColor): Self = StObject.set(x, "sidebar_highlight_text", value.asInstanceOf[js.Any])
    
    inline def setSidebar_highlight_textUndefined: Self = StObject.set(x, "sidebar_highlight_text", js.undefined)
    
    inline def setSidebar_text(value: ThemeColor): Self = StObject.set(x, "sidebar_text", value.asInstanceOf[js.Any])
    
    inline def setSidebar_textUndefined: Self = StObject.set(x, "sidebar_text", js.undefined)
    
    inline def setTab_background_separator(value: ThemeColor): Self = StObject.set(x, "tab_background_separator", value.asInstanceOf[js.Any])
    
    inline def setTab_background_separatorUndefined: Self = StObject.set(x, "tab_background_separator", js.undefined)
    
    inline def setTab_background_text(value: ThemeColor): Self = StObject.set(x, "tab_background_text", value.asInstanceOf[js.Any])
    
    inline def setTab_background_textUndefined: Self = StObject.set(x, "tab_background_text", js.undefined)
    
    inline def setTab_line(value: ThemeColor): Self = StObject.set(x, "tab_line", value.asInstanceOf[js.Any])
    
    inline def setTab_lineUndefined: Self = StObject.set(x, "tab_line", js.undefined)
    
    inline def setTab_loading(value: ThemeColor): Self = StObject.set(x, "tab_loading", value.asInstanceOf[js.Any])
    
    inline def setTab_loadingUndefined: Self = StObject.set(x, "tab_loading", js.undefined)
    
    inline def setTab_selected(value: ThemeColor): Self = StObject.set(x, "tab_selected", value.asInstanceOf[js.Any])
    
    inline def setTab_selectedUndefined: Self = StObject.set(x, "tab_selected", js.undefined)
    
    inline def setTab_text(value: ThemeColor): Self = StObject.set(x, "tab_text", value.asInstanceOf[js.Any])
    
    inline def setTab_textUndefined: Self = StObject.set(x, "tab_text", js.undefined)
    
    inline def setTextcolor(value: ThemeColor): Self = StObject.set(x, "textcolor", value.asInstanceOf[js.Any])
    
    inline def setTextcolorUndefined: Self = StObject.set(x, "textcolor", js.undefined)
    
    inline def setToolbar(value: ThemeColor): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setToolbar_bottom_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_bottom_separator", value.asInstanceOf[js.Any])
    
    inline def setToolbar_bottom_separatorUndefined: Self = StObject.set(x, "toolbar_bottom_separator", js.undefined)
    
    inline def setToolbar_field(value: ThemeColor): Self = StObject.set(x, "toolbar_field", value.asInstanceOf[js.Any])
    
    inline def setToolbar_fieldUndefined: Self = StObject.set(x, "toolbar_field", js.undefined)
    
    inline def setToolbar_field_border(value: ThemeColor): Self = StObject.set(x, "toolbar_field_border", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_borderUndefined: Self = StObject.set(x, "toolbar_field_border", js.undefined)
    
    inline def setToolbar_field_border_focus(value: ThemeColor): Self = StObject.set(x, "toolbar_field_border_focus", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_border_focusUndefined: Self = StObject.set(x, "toolbar_field_border_focus", js.undefined)
    
    inline def setToolbar_field_focus(value: ThemeColor): Self = StObject.set(x, "toolbar_field_focus", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_focusUndefined: Self = StObject.set(x, "toolbar_field_focus", js.undefined)
    
    inline def setToolbar_field_highlight(value: ThemeColor): Self = StObject.set(x, "toolbar_field_highlight", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_highlightUndefined: Self = StObject.set(x, "toolbar_field_highlight", js.undefined)
    
    inline def setToolbar_field_highlight_text(value: ThemeColor): Self = StObject.set(x, "toolbar_field_highlight_text", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_highlight_textUndefined: Self = StObject.set(x, "toolbar_field_highlight_text", js.undefined)
    
    inline def setToolbar_field_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_field_separator", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_separatorUndefined: Self = StObject.set(x, "toolbar_field_separator", js.undefined)
    
    inline def setToolbar_field_text(value: ThemeColor): Self = StObject.set(x, "toolbar_field_text", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_textUndefined: Self = StObject.set(x, "toolbar_field_text", js.undefined)
    
    inline def setToolbar_field_text_focus(value: ThemeColor): Self = StObject.set(x, "toolbar_field_text_focus", value.asInstanceOf[js.Any])
    
    inline def setToolbar_field_text_focusUndefined: Self = StObject.set(x, "toolbar_field_text_focus", js.undefined)
    
    inline def setToolbar_text(value: ThemeColor): Self = StObject.set(x, "toolbar_text", value.asInstanceOf[js.Any])
    
    inline def setToolbar_textUndefined: Self = StObject.set(x, "toolbar_text", js.undefined)
    
    inline def setToolbar_top_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_top_separator", value.asInstanceOf[js.Any])
    
    inline def setToolbar_top_separatorUndefined: Self = StObject.set(x, "toolbar_top_separator", js.undefined)
    
    inline def setToolbar_vertical_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_vertical_separator", value.asInstanceOf[js.Any])
    
    inline def setToolbar_vertical_separatorUndefined: Self = StObject.set(x, "toolbar_vertical_separator", js.undefined)
  }
}
