package typings.tinymce.mod

import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.RegExp
import typings.std.Window
import typings.tinymce.mod.settings.Menu
import typings.tinymce.tinymceBooleans.`false`
import typings.tinymce.tinymceStrings.auto
import typings.tinymce.tinymceStrings.fixed
import typings.tinymce.tinymceStrings.relative
import typings.tinymce.tinymceStrings.responsive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings_ extends StObject {
  
  var advlist_number_styles: js.UndefOr[String] = js.undefined
  
  var allow_conditional_comments: js.UndefOr[Boolean] = js.undefined
  
  var allow_html_in_named_anchor: js.UndefOr[Boolean] = js.undefined
  
  var allow_script_urls: js.UndefOr[Boolean] = js.undefined
  
  var allow_unsafe_link_target: js.UndefOr[Boolean] = js.undefined
  
  var anchor_bottom: js.UndefOr[String] = js.undefined
  
  var anchor_top: js.UndefOr[String] = js.undefined
  
  var auto_focus: js.UndefOr[String] = js.undefined
  
  var automatic_uploads: js.UndefOr[Boolean] = js.undefined
  
  var autosave_ask_before_unload: js.UndefOr[Boolean] = js.undefined
  
  var autosave_interval: js.UndefOr[String] = js.undefined
  
  var autosave_prefix: js.UndefOr[String] = js.undefined
  
  var autosave_restore_when_empty: js.UndefOr[Boolean] = js.undefined
  
  var autosave_retention: js.UndefOr[String] = js.undefined
  
  var base_url: js.UndefOr[String] = js.undefined
  
  var block_formats: js.UndefOr[String] = js.undefined
  
  var body_class: js.UndefOr[String] = js.undefined
  
  var body_id: js.UndefOr[String] = js.undefined
  
  var br_in_pre: js.UndefOr[Boolean] = js.undefined
  
  var branding: js.UndefOr[Boolean] = js.undefined
  
  var browser_spellcheck: js.UndefOr[Boolean] = js.undefined
  
  var cache_suffix: js.UndefOr[String] = js.undefined
  
  var color_picker_callback: js.UndefOr[
    js.Function2[/* callback */ js.Function1[/* hexColor */ String, Unit], /* value */ String, Unit]
  ] = js.undefined
  
  var content_css: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var content_security_policy: js.UndefOr[String] = js.undefined
  
  var content_style: js.UndefOr[String] = js.undefined
  
  var convert_fonts_to_spans: js.UndefOr[Boolean] = js.undefined
  
  var convert_urls: js.UndefOr[Boolean] = js.undefined
  
  var custom_elements: js.UndefOr[String] = js.undefined
  
  var custom_ui_selector: js.UndefOr[String] = js.undefined
  
  var custom_undo_redo_levels: js.UndefOr[Double] = js.undefined
  
  var directionality: js.UndefOr[String] = js.undefined
  
  var doctype: js.UndefOr[String] = js.undefined
  
  var document_base_url: js.UndefOr[String] = js.undefined
  
  var element_format: js.UndefOr[String] = js.undefined
  
  var elementpath: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var end_container_on_empty_block: js.UndefOr[Boolean] = js.undefined
  
  var entities: js.UndefOr[String] = js.undefined
  
  var entity_encoding: js.UndefOr[String] = js.undefined
  
  var event_root: js.UndefOr[Boolean] = js.undefined
  
  var extended_valid_elements: js.UndefOr[String] = js.undefined
  
  var external_plugins: js.UndefOr[js.Object] = js.undefined
  
  var file_browser_callback: js.UndefOr[
    js.Function4[/* field_name */ String, /* url */ String, /* type */ String, /* win */ Window, Unit]
  ] = js.undefined
  
  var file_browser_callback_types: js.UndefOr[String] = js.undefined
  
  var file_picker_callback: js.UndefOr[
    js.Function3[
      /* callback */ js.Function2[/* filename */ String, /* metadata */ js.Object, Unit], 
      /* valud */ String, 
      /* meta */ js.Object, 
      Unit
    ]
  ] = js.undefined
  
  var file_picker_types: js.UndefOr[String] = js.undefined
  
  var fix_list_elements: js.UndefOr[Boolean] = js.undefined
  
  var fixed_toolbar_container: js.UndefOr[String] = js.undefined
  
  var font_formats: js.UndefOr[String] = js.undefined
  
  var fontsize_formats: js.UndefOr[String] = js.undefined
  
  var force_hex_style_colors: js.UndefOr[Boolean] = js.undefined
  
  var forced_root_block: js.UndefOr[String] = js.undefined
  
  var forced_root_block_attrs: js.UndefOr[js.Object] = js.undefined
  
  var formats: js.UndefOr[js.Object] = js.undefined
  
  var gecko_spellcheck: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var hidden_input: js.UndefOr[Boolean] = js.undefined
  
  var images_dataimg_filter: js.UndefOr[js.Function1[/* img */ HTMLImageElement, Unit]] = js.undefined
  
  var images_reuse_filename: js.UndefOr[Boolean] = js.undefined
  
  var images_upload_base_path: js.UndefOr[String] = js.undefined
  
  var images_upload_credentials: js.UndefOr[Boolean] = js.undefined
  
  var images_upload_handler: js.UndefOr[
    js.Function3[
      /* blobInfo */ js.Any, 
      /* success */ js.Function1[/* msg */ String, Unit], 
      /* failure */ js.Function1[/* msg */ String, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var images_upload_url: js.UndefOr[String] = js.undefined
  
  var imagetools_api_key: js.UndefOr[String] = js.undefined
  
  var imagetools_cors_hosts: js.UndefOr[js.Array[String]] = js.undefined
  
  var imagetools_proxy: js.UndefOr[String] = js.undefined
  
  var imagetools_toolbar: js.UndefOr[String] = js.undefined
  
  var indentation: js.UndefOr[String] = js.undefined
  
  var init_instance_callback: js.UndefOr[js.Function1[/* editor */ Editor, Unit]] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var inline_boundaries: js.UndefOr[Boolean] = js.undefined
  
  var inline_boundaries_selector: js.UndefOr[Boolean] = js.undefined
  
  var insert_button_items: js.UndefOr[String] = js.undefined
  
  var insert_toolbar: js.UndefOr[String] = js.undefined
  
  var invalid_elements: js.UndefOr[String] = js.undefined
  
  var invalid_styles: js.UndefOr[String | js.Object] = js.undefined
  
  var keep_styles: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var language_url: js.UndefOr[String] = js.undefined
  
  var max_height: js.UndefOr[Double] = js.undefined
  
  var max_width: js.UndefOr[Double] = js.undefined
  
  var menu: js.UndefOr[Menu] = js.undefined
  
  var menubar: js.UndefOr[String | Boolean] = js.undefined
  
  var min_height: js.UndefOr[Double | String] = js.undefined
  
  var min_width: js.UndefOr[Double | String] = js.undefined
  
  var nowrap: js.UndefOr[Boolean] = js.undefined
  
  var object_resizing: js.UndefOr[Boolean | String] = js.undefined
  
  var paste_data_images: js.UndefOr[Boolean] = js.undefined
  
  var plugins: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var preview_styles: js.UndefOr[Boolean | String] = js.undefined
  
  var protect: js.UndefOr[js.Array[RegExp]] = js.undefined
  
  var relative_urls: js.UndefOr[Boolean] = js.undefined
  
  var removeFormat: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var remove_script_host: js.UndefOr[Boolean] = js.undefined
  
  var remove_trailing_brs: js.UndefOr[Boolean] = js.undefined
  
  var removed_menuitems: js.UndefOr[String] = js.undefined
  
  var resize: js.UndefOr[Boolean | String] = js.undefined
  
  var schema: js.UndefOr[String] = js.undefined
  
  var selection_toolbar: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var setup: js.UndefOr[js.Function1[/* edtor */ Editor, Unit]] = js.undefined
  
  var skin: js.UndefOr[`false` | String] = js.undefined
  
  var skin_url: js.UndefOr[String] = js.undefined
  
  var spellchecker_active: js.UndefOr[Boolean] = js.undefined
  
  var spellchecker_dialog: js.UndefOr[Boolean] = js.undefined
  
  var spellchecker_language: js.UndefOr[String] = js.undefined
  
  var spellchecker_languages: js.UndefOr[String] = js.undefined
  
  var spellchecker_on_load: js.UndefOr[Boolean] = js.undefined
  
  var spellchecker_rpc_url: js.UndefOr[String] = js.undefined
  
  var spellchecker_whitelist: js.UndefOr[js.Array[String]] = js.undefined
  
  var statusbar: js.UndefOr[Boolean] = js.undefined
  
  var style_formats: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var style_formats_autohide: js.UndefOr[Boolean] = js.undefined
  
  var style_formats_merge: js.UndefOr[Boolean] = js.undefined
  
  var table_advtab: js.UndefOr[Boolean] = js.undefined
  
  var table_appearance_options: js.UndefOr[Boolean] = js.undefined
  
  var table_cell_advtab: js.UndefOr[Boolean] = js.undefined
  
  var table_cell_class_list: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var table_class_list: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var table_clone_elements: js.UndefOr[String] = js.undefined
  
  var table_default_attributes: js.UndefOr[js.Object | String] = js.undefined
  
  var table_default_styles: js.UndefOr[js.Object | String] = js.undefined
  
  var table_grid: js.UndefOr[Boolean] = js.undefined
  
  var table_resize_bars: js.UndefOr[Boolean] = js.undefined
  
  var table_row_advtab: js.UndefOr[Boolean] = js.undefined
  
  var table_row_class_list: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var table_sizing_mode: js.UndefOr[fixed | relative | responsive | auto] = js.undefined
  
  var table_style_by_css: js.UndefOr[Boolean] = js.undefined
  
  var table_tab_navigation: js.UndefOr[Boolean] = js.undefined
  
  var table_toolbar: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[Element] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var theme_url: js.UndefOr[String] = js.undefined
  
  var toolbar: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  
  var type_ahead_urls: js.UndefOr[Boolean] = js.undefined
  
  var urlconverter_callback: js.UndefOr[
    js.Function4[/* url */ String, /* node */ HTMLElement, /* on_save */ Boolean, /* name */ String, Unit]
  ] = js.undefined
  
  var valid_children: js.UndefOr[String] = js.undefined
  
  var valid_classes: js.UndefOr[String | js.Object] = js.undefined
  
  var valid_elements: js.UndefOr[String] = js.undefined
  
  var valid_styles: js.UndefOr[js.Object] = js.undefined
  
  var visual: js.UndefOr[Boolean] = js.undefined
  
  var visual_anchor_class: js.UndefOr[String] = js.undefined
  
  var visual_table_class: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object Settings_ {
  
  @scala.inline
  def apply(): Settings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings_]
  }
  
  @scala.inline
  implicit class Settings_MutableBuilder[Self <: Settings_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvlist_number_styles(value: String): Self = StObject.set(x, "advlist_number_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvlist_number_stylesUndefined: Self = StObject.set(x, "advlist_number_styles", js.undefined)
    
    @scala.inline
    def setAllow_conditional_comments(value: Boolean): Self = StObject.set(x, "allow_conditional_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_conditional_commentsUndefined: Self = StObject.set(x, "allow_conditional_comments", js.undefined)
    
    @scala.inline
    def setAllow_html_in_named_anchor(value: Boolean): Self = StObject.set(x, "allow_html_in_named_anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_html_in_named_anchorUndefined: Self = StObject.set(x, "allow_html_in_named_anchor", js.undefined)
    
    @scala.inline
    def setAllow_script_urls(value: Boolean): Self = StObject.set(x, "allow_script_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_script_urlsUndefined: Self = StObject.set(x, "allow_script_urls", js.undefined)
    
    @scala.inline
    def setAllow_unsafe_link_target(value: Boolean): Self = StObject.set(x, "allow_unsafe_link_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_unsafe_link_targetUndefined: Self = StObject.set(x, "allow_unsafe_link_target", js.undefined)
    
    @scala.inline
    def setAnchor_bottom(value: String): Self = StObject.set(x, "anchor_bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor_bottomUndefined: Self = StObject.set(x, "anchor_bottom", js.undefined)
    
    @scala.inline
    def setAnchor_top(value: String): Self = StObject.set(x, "anchor_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor_topUndefined: Self = StObject.set(x, "anchor_top", js.undefined)
    
    @scala.inline
    def setAuto_focus(value: String): Self = StObject.set(x, "auto_focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_focusUndefined: Self = StObject.set(x, "auto_focus", js.undefined)
    
    @scala.inline
    def setAutomatic_uploads(value: Boolean): Self = StObject.set(x, "automatic_uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatic_uploadsUndefined: Self = StObject.set(x, "automatic_uploads", js.undefined)
    
    @scala.inline
    def setAutosave_ask_before_unload(value: Boolean): Self = StObject.set(x, "autosave_ask_before_unload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosave_ask_before_unloadUndefined: Self = StObject.set(x, "autosave_ask_before_unload", js.undefined)
    
    @scala.inline
    def setAutosave_interval(value: String): Self = StObject.set(x, "autosave_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosave_intervalUndefined: Self = StObject.set(x, "autosave_interval", js.undefined)
    
    @scala.inline
    def setAutosave_prefix(value: String): Self = StObject.set(x, "autosave_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosave_prefixUndefined: Self = StObject.set(x, "autosave_prefix", js.undefined)
    
    @scala.inline
    def setAutosave_restore_when_empty(value: Boolean): Self = StObject.set(x, "autosave_restore_when_empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosave_restore_when_emptyUndefined: Self = StObject.set(x, "autosave_restore_when_empty", js.undefined)
    
    @scala.inline
    def setAutosave_retention(value: String): Self = StObject.set(x, "autosave_retention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosave_retentionUndefined: Self = StObject.set(x, "autosave_retention", js.undefined)
    
    @scala.inline
    def setBase_url(value: String): Self = StObject.set(x, "base_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_urlUndefined: Self = StObject.set(x, "base_url", js.undefined)
    
    @scala.inline
    def setBlock_formats(value: String): Self = StObject.set(x, "block_formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock_formatsUndefined: Self = StObject.set(x, "block_formats", js.undefined)
    
    @scala.inline
    def setBody_class(value: String): Self = StObject.set(x, "body_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody_classUndefined: Self = StObject.set(x, "body_class", js.undefined)
    
    @scala.inline
    def setBody_id(value: String): Self = StObject.set(x, "body_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody_idUndefined: Self = StObject.set(x, "body_id", js.undefined)
    
    @scala.inline
    def setBr_in_pre(value: Boolean): Self = StObject.set(x, "br_in_pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBr_in_preUndefined: Self = StObject.set(x, "br_in_pre", js.undefined)
    
    @scala.inline
    def setBranding(value: Boolean): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    @scala.inline
    def setBrowser_spellcheck(value: Boolean): Self = StObject.set(x, "browser_spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_spellcheckUndefined: Self = StObject.set(x, "browser_spellcheck", js.undefined)
    
    @scala.inline
    def setCache_suffix(value: String): Self = StObject.set(x, "cache_suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache_suffixUndefined: Self = StObject.set(x, "cache_suffix", js.undefined)
    
    @scala.inline
    def setColor_picker_callback(value: (/* callback */ js.Function1[/* hexColor */ String, Unit], /* value */ String) => Unit): Self = StObject.set(x, "color_picker_callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColor_picker_callbackUndefined: Self = StObject.set(x, "color_picker_callback", js.undefined)
    
    @scala.inline
    def setContent_css(value: String | js.Array[String]): Self = StObject.set(x, "content_css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_cssUndefined: Self = StObject.set(x, "content_css", js.undefined)
    
    @scala.inline
    def setContent_cssVarargs(value: String*): Self = StObject.set(x, "content_css", js.Array(value :_*))
    
    @scala.inline
    def setContent_security_policy(value: String): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
    
    @scala.inline
    def setContent_style(value: String): Self = StObject.set(x, "content_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_styleUndefined: Self = StObject.set(x, "content_style", js.undefined)
    
    @scala.inline
    def setConvert_fonts_to_spans(value: Boolean): Self = StObject.set(x, "convert_fonts_to_spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert_fonts_to_spansUndefined: Self = StObject.set(x, "convert_fonts_to_spans", js.undefined)
    
    @scala.inline
    def setConvert_urls(value: Boolean): Self = StObject.set(x, "convert_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert_urlsUndefined: Self = StObject.set(x, "convert_urls", js.undefined)
    
    @scala.inline
    def setCustom_elements(value: String): Self = StObject.set(x, "custom_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_elementsUndefined: Self = StObject.set(x, "custom_elements", js.undefined)
    
    @scala.inline
    def setCustom_ui_selector(value: String): Self = StObject.set(x, "custom_ui_selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_ui_selectorUndefined: Self = StObject.set(x, "custom_ui_selector", js.undefined)
    
    @scala.inline
    def setCustom_undo_redo_levels(value: Double): Self = StObject.set(x, "custom_undo_redo_levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_undo_redo_levelsUndefined: Self = StObject.set(x, "custom_undo_redo_levels", js.undefined)
    
    @scala.inline
    def setDirectionality(value: String): Self = StObject.set(x, "directionality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalityUndefined: Self = StObject.set(x, "directionality", js.undefined)
    
    @scala.inline
    def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
    
    @scala.inline
    def setDocument_base_url(value: String): Self = StObject.set(x, "document_base_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_base_urlUndefined: Self = StObject.set(x, "document_base_url", js.undefined)
    
    @scala.inline
    def setElement_format(value: String): Self = StObject.set(x, "element_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement_formatUndefined: Self = StObject.set(x, "element_format", js.undefined)
    
    @scala.inline
    def setElementpath(value: Boolean): Self = StObject.set(x, "elementpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementpathUndefined: Self = StObject.set(x, "elementpath", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setEnd_container_on_empty_block(value: Boolean): Self = StObject.set(x, "end_container_on_empty_block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_container_on_empty_blockUndefined: Self = StObject.set(x, "end_container_on_empty_block", js.undefined)
    
    @scala.inline
    def setEntities(value: String): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntity_encoding(value: String): Self = StObject.set(x, "entity_encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity_encodingUndefined: Self = StObject.set(x, "entity_encoding", js.undefined)
    
    @scala.inline
    def setEvent_root(value: Boolean): Self = StObject.set(x, "event_root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_rootUndefined: Self = StObject.set(x, "event_root", js.undefined)
    
    @scala.inline
    def setExtended_valid_elements(value: String): Self = StObject.set(x, "extended_valid_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtended_valid_elementsUndefined: Self = StObject.set(x, "extended_valid_elements", js.undefined)
    
    @scala.inline
    def setExternal_plugins(value: js.Object): Self = StObject.set(x, "external_plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_pluginsUndefined: Self = StObject.set(x, "external_plugins", js.undefined)
    
    @scala.inline
    def setFile_browser_callback(value: (/* field_name */ String, /* url */ String, /* type */ String, /* win */ Window) => Unit): Self = StObject.set(x, "file_browser_callback", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFile_browser_callbackUndefined: Self = StObject.set(x, "file_browser_callback", js.undefined)
    
    @scala.inline
    def setFile_browser_callback_types(value: String): Self = StObject.set(x, "file_browser_callback_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_browser_callback_typesUndefined: Self = StObject.set(x, "file_browser_callback_types", js.undefined)
    
    @scala.inline
    def setFile_picker_callback(
      value: (/* callback */ js.Function2[/* filename */ String, /* metadata */ js.Object, Unit], /* valud */ String, /* meta */ js.Object) => Unit
    ): Self = StObject.set(x, "file_picker_callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFile_picker_callbackUndefined: Self = StObject.set(x, "file_picker_callback", js.undefined)
    
    @scala.inline
    def setFile_picker_types(value: String): Self = StObject.set(x, "file_picker_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_picker_typesUndefined: Self = StObject.set(x, "file_picker_types", js.undefined)
    
    @scala.inline
    def setFix_list_elements(value: Boolean): Self = StObject.set(x, "fix_list_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFix_list_elementsUndefined: Self = StObject.set(x, "fix_list_elements", js.undefined)
    
    @scala.inline
    def setFixed_toolbar_container(value: String): Self = StObject.set(x, "fixed_toolbar_container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixed_toolbar_containerUndefined: Self = StObject.set(x, "fixed_toolbar_container", js.undefined)
    
    @scala.inline
    def setFont_formats(value: String): Self = StObject.set(x, "font_formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_formatsUndefined: Self = StObject.set(x, "font_formats", js.undefined)
    
    @scala.inline
    def setFontsize_formats(value: String): Self = StObject.set(x, "fontsize_formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsize_formatsUndefined: Self = StObject.set(x, "fontsize_formats", js.undefined)
    
    @scala.inline
    def setForce_hex_style_colors(value: Boolean): Self = StObject.set(x, "force_hex_style_colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce_hex_style_colorsUndefined: Self = StObject.set(x, "force_hex_style_colors", js.undefined)
    
    @scala.inline
    def setForced_root_block(value: String): Self = StObject.set(x, "forced_root_block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForced_root_blockUndefined: Self = StObject.set(x, "forced_root_block", js.undefined)
    
    @scala.inline
    def setForced_root_block_attrs(value: js.Object): Self = StObject.set(x, "forced_root_block_attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForced_root_block_attrsUndefined: Self = StObject.set(x, "forced_root_block_attrs", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setGecko_spellcheck(value: Boolean): Self = StObject.set(x, "gecko_spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGecko_spellcheckUndefined: Self = StObject.set(x, "gecko_spellcheck", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden_input(value: Boolean): Self = StObject.set(x, "hidden_input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden_inputUndefined: Self = StObject.set(x, "hidden_input", js.undefined)
    
    @scala.inline
    def setImages_dataimg_filter(value: /* img */ HTMLImageElement => Unit): Self = StObject.set(x, "images_dataimg_filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImages_dataimg_filterUndefined: Self = StObject.set(x, "images_dataimg_filter", js.undefined)
    
    @scala.inline
    def setImages_reuse_filename(value: Boolean): Self = StObject.set(x, "images_reuse_filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_reuse_filenameUndefined: Self = StObject.set(x, "images_reuse_filename", js.undefined)
    
    @scala.inline
    def setImages_upload_base_path(value: String): Self = StObject.set(x, "images_upload_base_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_upload_base_pathUndefined: Self = StObject.set(x, "images_upload_base_path", js.undefined)
    
    @scala.inline
    def setImages_upload_credentials(value: Boolean): Self = StObject.set(x, "images_upload_credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_upload_credentialsUndefined: Self = StObject.set(x, "images_upload_credentials", js.undefined)
    
    @scala.inline
    def setImages_upload_handler(
      value: (/* blobInfo */ js.Any, /* success */ js.Function1[/* msg */ String, Unit], /* failure */ js.Function1[/* msg */ String, Unit]) => Unit
    ): Self = StObject.set(x, "images_upload_handler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setImages_upload_handlerUndefined: Self = StObject.set(x, "images_upload_handler", js.undefined)
    
    @scala.inline
    def setImages_upload_url(value: String): Self = StObject.set(x, "images_upload_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_upload_urlUndefined: Self = StObject.set(x, "images_upload_url", js.undefined)
    
    @scala.inline
    def setImagetools_api_key(value: String): Self = StObject.set(x, "imagetools_api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagetools_api_keyUndefined: Self = StObject.set(x, "imagetools_api_key", js.undefined)
    
    @scala.inline
    def setImagetools_cors_hosts(value: js.Array[String]): Self = StObject.set(x, "imagetools_cors_hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagetools_cors_hostsUndefined: Self = StObject.set(x, "imagetools_cors_hosts", js.undefined)
    
    @scala.inline
    def setImagetools_cors_hostsVarargs(value: String*): Self = StObject.set(x, "imagetools_cors_hosts", js.Array(value :_*))
    
    @scala.inline
    def setImagetools_proxy(value: String): Self = StObject.set(x, "imagetools_proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagetools_proxyUndefined: Self = StObject.set(x, "imagetools_proxy", js.undefined)
    
    @scala.inline
    def setImagetools_toolbar(value: String): Self = StObject.set(x, "imagetools_toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagetools_toolbarUndefined: Self = StObject.set(x, "imagetools_toolbar", js.undefined)
    
    @scala.inline
    def setIndentation(value: String): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
    
    @scala.inline
    def setInit_instance_callback(value: /* editor */ Editor => Unit): Self = StObject.set(x, "init_instance_callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit_instance_callbackUndefined: Self = StObject.set(x, "init_instance_callback", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setInline_boundaries(value: Boolean): Self = StObject.set(x, "inline_boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_boundariesUndefined: Self = StObject.set(x, "inline_boundaries", js.undefined)
    
    @scala.inline
    def setInline_boundaries_selector(value: Boolean): Self = StObject.set(x, "inline_boundaries_selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_boundaries_selectorUndefined: Self = StObject.set(x, "inline_boundaries_selector", js.undefined)
    
    @scala.inline
    def setInsert_button_items(value: String): Self = StObject.set(x, "insert_button_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert_button_itemsUndefined: Self = StObject.set(x, "insert_button_items", js.undefined)
    
    @scala.inline
    def setInsert_toolbar(value: String): Self = StObject.set(x, "insert_toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert_toolbarUndefined: Self = StObject.set(x, "insert_toolbar", js.undefined)
    
    @scala.inline
    def setInvalid_elements(value: String): Self = StObject.set(x, "invalid_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid_elementsUndefined: Self = StObject.set(x, "invalid_elements", js.undefined)
    
    @scala.inline
    def setInvalid_styles(value: String | js.Object): Self = StObject.set(x, "invalid_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid_stylesUndefined: Self = StObject.set(x, "invalid_styles", js.undefined)
    
    @scala.inline
    def setKeep_styles(value: Boolean): Self = StObject.set(x, "keep_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_stylesUndefined: Self = StObject.set(x, "keep_styles", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLanguage_url(value: String): Self = StObject.set(x, "language_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_urlUndefined: Self = StObject.set(x, "language_url", js.undefined)
    
    @scala.inline
    def setMax_height(value: Double): Self = StObject.set(x, "max_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_heightUndefined: Self = StObject.set(x, "max_height", js.undefined)
    
    @scala.inline
    def setMax_width(value: Double): Self = StObject.set(x, "max_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_widthUndefined: Self = StObject.set(x, "max_width", js.undefined)
    
    @scala.inline
    def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMenubar(value: String | Boolean): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenubarUndefined: Self = StObject.set(x, "menubar", js.undefined)
    
    @scala.inline
    def setMin_height(value: Double | String): Self = StObject.set(x, "min_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_heightUndefined: Self = StObject.set(x, "min_height", js.undefined)
    
    @scala.inline
    def setMin_width(value: Double | String): Self = StObject.set(x, "min_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_widthUndefined: Self = StObject.set(x, "min_width", js.undefined)
    
    @scala.inline
    def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
    
    @scala.inline
    def setObject_resizing(value: Boolean | String): Self = StObject.set(x, "object_resizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject_resizingUndefined: Self = StObject.set(x, "object_resizing", js.undefined)
    
    @scala.inline
    def setPaste_data_images(value: Boolean): Self = StObject.set(x, "paste_data_images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste_data_imagesUndefined: Self = StObject.set(x, "paste_data_images", js.undefined)
    
    @scala.inline
    def setPlugins(value: String | js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setPreview_styles(value: Boolean | String): Self = StObject.set(x, "preview_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_stylesUndefined: Self = StObject.set(x, "preview_styles", js.undefined)
    
    @scala.inline
    def setProtect(value: js.Array[RegExp]): Self = StObject.set(x, "protect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectUndefined: Self = StObject.set(x, "protect", js.undefined)
    
    @scala.inline
    def setProtectVarargs(value: RegExp*): Self = StObject.set(x, "protect", js.Array(value :_*))
    
    @scala.inline
    def setRelative_urls(value: Boolean): Self = StObject.set(x, "relative_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative_urlsUndefined: Self = StObject.set(x, "relative_urls", js.undefined)
    
    @scala.inline
    def setRemoveFormat(value: js.Array[js.Object]): Self = StObject.set(x, "removeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFormatUndefined: Self = StObject.set(x, "removeFormat", js.undefined)
    
    @scala.inline
    def setRemoveFormatVarargs(value: js.Object*): Self = StObject.set(x, "removeFormat", js.Array(value :_*))
    
    @scala.inline
    def setRemove_script_host(value: Boolean): Self = StObject.set(x, "remove_script_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_script_hostUndefined: Self = StObject.set(x, "remove_script_host", js.undefined)
    
    @scala.inline
    def setRemove_trailing_brs(value: Boolean): Self = StObject.set(x, "remove_trailing_brs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_trailing_brsUndefined: Self = StObject.set(x, "remove_trailing_brs", js.undefined)
    
    @scala.inline
    def setRemoved_menuitems(value: String): Self = StObject.set(x, "removed_menuitems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoved_menuitemsUndefined: Self = StObject.set(x, "removed_menuitems", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean | String): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSelection_toolbar(value: String): Self = StObject.set(x, "selection_toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection_toolbarUndefined: Self = StObject.set(x, "selection_toolbar", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSetup(value: /* edtor */ Editor => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    @scala.inline
    def setSkin(value: `false` | String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setSkin_url(value: String): Self = StObject.set(x, "skin_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkin_urlUndefined: Self = StObject.set(x, "skin_url", js.undefined)
    
    @scala.inline
    def setSpellchecker_active(value: Boolean): Self = StObject.set(x, "spellchecker_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellchecker_activeUndefined: Self = StObject.set(x, "spellchecker_active", js.undefined)
    
    @scala.inline
    def setSpellchecker_dialog(value: Boolean): Self = StObject.set(x, "spellchecker_dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellchecker_dialogUndefined: Self = StObject.set(x, "spellchecker_dialog", js.undefined)
    
    @scala.inline
    def setSpellchecker_language(value: String): Self = StObject.set(x, "spellchecker_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellchecker_languageUndefined: Self = StObject.set(x, "spellchecker_language", js.undefined)
    
    @scala.inline
    def setSpellchecker_languages(value: String): Self = StObject.set(x, "spellchecker_languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellchecker_languagesUndefined: Self = StObject.set(x, "spellchecker_languages", js.undefined)
    
    @scala.inline
    def setSpellchecker_on_load(value: Boolean): Self = StObject.set(x, "spellchecker_on_load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellchecker_on_loadUndefined: Self = StObject.set(x, "spellchecker_on_load", js.undefined)
    
    @scala.inline
    def setSpellchecker_rpc_url(value: String): Self = StObject.set(x, "spellchecker_rpc_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellchecker_rpc_urlUndefined: Self = StObject.set(x, "spellchecker_rpc_url", js.undefined)
    
    @scala.inline
    def setSpellchecker_whitelist(value: js.Array[String]): Self = StObject.set(x, "spellchecker_whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellchecker_whitelistUndefined: Self = StObject.set(x, "spellchecker_whitelist", js.undefined)
    
    @scala.inline
    def setSpellchecker_whitelistVarargs(value: String*): Self = StObject.set(x, "spellchecker_whitelist", js.Array(value :_*))
    
    @scala.inline
    def setStatusbar(value: Boolean): Self = StObject.set(x, "statusbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusbarUndefined: Self = StObject.set(x, "statusbar", js.undefined)
    
    @scala.inline
    def setStyle_formats(value: js.Array[js.Object]): Self = StObject.set(x, "style_formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle_formatsUndefined: Self = StObject.set(x, "style_formats", js.undefined)
    
    @scala.inline
    def setStyle_formatsVarargs(value: js.Object*): Self = StObject.set(x, "style_formats", js.Array(value :_*))
    
    @scala.inline
    def setStyle_formats_autohide(value: Boolean): Self = StObject.set(x, "style_formats_autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle_formats_autohideUndefined: Self = StObject.set(x, "style_formats_autohide", js.undefined)
    
    @scala.inline
    def setStyle_formats_merge(value: Boolean): Self = StObject.set(x, "style_formats_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle_formats_mergeUndefined: Self = StObject.set(x, "style_formats_merge", js.undefined)
    
    @scala.inline
    def setTable_advtab(value: Boolean): Self = StObject.set(x, "table_advtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_advtabUndefined: Self = StObject.set(x, "table_advtab", js.undefined)
    
    @scala.inline
    def setTable_appearance_options(value: Boolean): Self = StObject.set(x, "table_appearance_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_appearance_optionsUndefined: Self = StObject.set(x, "table_appearance_options", js.undefined)
    
    @scala.inline
    def setTable_cell_advtab(value: Boolean): Self = StObject.set(x, "table_cell_advtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_cell_advtabUndefined: Self = StObject.set(x, "table_cell_advtab", js.undefined)
    
    @scala.inline
    def setTable_cell_class_list(value: js.Array[js.Object]): Self = StObject.set(x, "table_cell_class_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_cell_class_listUndefined: Self = StObject.set(x, "table_cell_class_list", js.undefined)
    
    @scala.inline
    def setTable_cell_class_listVarargs(value: js.Object*): Self = StObject.set(x, "table_cell_class_list", js.Array(value :_*))
    
    @scala.inline
    def setTable_class_list(value: js.Array[js.Object]): Self = StObject.set(x, "table_class_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_class_listUndefined: Self = StObject.set(x, "table_class_list", js.undefined)
    
    @scala.inline
    def setTable_class_listVarargs(value: js.Object*): Self = StObject.set(x, "table_class_list", js.Array(value :_*))
    
    @scala.inline
    def setTable_clone_elements(value: String): Self = StObject.set(x, "table_clone_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_clone_elementsUndefined: Self = StObject.set(x, "table_clone_elements", js.undefined)
    
    @scala.inline
    def setTable_default_attributes(value: js.Object | String): Self = StObject.set(x, "table_default_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_default_attributesUndefined: Self = StObject.set(x, "table_default_attributes", js.undefined)
    
    @scala.inline
    def setTable_default_styles(value: js.Object | String): Self = StObject.set(x, "table_default_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_default_stylesUndefined: Self = StObject.set(x, "table_default_styles", js.undefined)
    
    @scala.inline
    def setTable_grid(value: Boolean): Self = StObject.set(x, "table_grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_gridUndefined: Self = StObject.set(x, "table_grid", js.undefined)
    
    @scala.inline
    def setTable_resize_bars(value: Boolean): Self = StObject.set(x, "table_resize_bars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_resize_barsUndefined: Self = StObject.set(x, "table_resize_bars", js.undefined)
    
    @scala.inline
    def setTable_row_advtab(value: Boolean): Self = StObject.set(x, "table_row_advtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_row_advtabUndefined: Self = StObject.set(x, "table_row_advtab", js.undefined)
    
    @scala.inline
    def setTable_row_class_list(value: js.Array[js.Object]): Self = StObject.set(x, "table_row_class_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_row_class_listUndefined: Self = StObject.set(x, "table_row_class_list", js.undefined)
    
    @scala.inline
    def setTable_row_class_listVarargs(value: js.Object*): Self = StObject.set(x, "table_row_class_list", js.Array(value :_*))
    
    @scala.inline
    def setTable_sizing_mode(value: fixed | relative | responsive | auto): Self = StObject.set(x, "table_sizing_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_sizing_modeUndefined: Self = StObject.set(x, "table_sizing_mode", js.undefined)
    
    @scala.inline
    def setTable_style_by_css(value: Boolean): Self = StObject.set(x, "table_style_by_css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_style_by_cssUndefined: Self = StObject.set(x, "table_style_by_css", js.undefined)
    
    @scala.inline
    def setTable_tab_navigation(value: Boolean): Self = StObject.set(x, "table_tab_navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_tab_navigationUndefined: Self = StObject.set(x, "table_tab_navigation", js.undefined)
    
    @scala.inline
    def setTable_toolbar(value: String): Self = StObject.set(x, "table_toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_toolbarUndefined: Self = StObject.set(x, "table_toolbar", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTheme_url(value: String): Self = StObject.set(x, "theme_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme_urlUndefined: Self = StObject.set(x, "theme_url", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: String*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    
    @scala.inline
    def setType_ahead_urls(value: Boolean): Self = StObject.set(x, "type_ahead_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_ahead_urlsUndefined: Self = StObject.set(x, "type_ahead_urls", js.undefined)
    
    @scala.inline
    def setUrlconverter_callback(
      value: (/* url */ String, /* node */ HTMLElement, /* on_save */ Boolean, /* name */ String) => Unit
    ): Self = StObject.set(x, "urlconverter_callback", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUrlconverter_callbackUndefined: Self = StObject.set(x, "urlconverter_callback", js.undefined)
    
    @scala.inline
    def setValid_children(value: String): Self = StObject.set(x, "valid_children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_childrenUndefined: Self = StObject.set(x, "valid_children", js.undefined)
    
    @scala.inline
    def setValid_classes(value: String | js.Object): Self = StObject.set(x, "valid_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_classesUndefined: Self = StObject.set(x, "valid_classes", js.undefined)
    
    @scala.inline
    def setValid_elements(value: String): Self = StObject.set(x, "valid_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_elementsUndefined: Self = StObject.set(x, "valid_elements", js.undefined)
    
    @scala.inline
    def setValid_styles(value: js.Object): Self = StObject.set(x, "valid_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_stylesUndefined: Self = StObject.set(x, "valid_styles", js.undefined)
    
    @scala.inline
    def setVisual(value: Boolean): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
    
    @scala.inline
    def setVisual_anchor_class(value: String): Self = StObject.set(x, "visual_anchor_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisual_anchor_classUndefined: Self = StObject.set(x, "visual_anchor_class", js.undefined)
    
    @scala.inline
    def setVisual_table_class(value: String): Self = StObject.set(x, "visual_table_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisual_table_classUndefined: Self = StObject.set(x, "visual_table_class", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
