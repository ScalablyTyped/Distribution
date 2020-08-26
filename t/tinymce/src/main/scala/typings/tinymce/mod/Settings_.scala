package typings.tinymce.mod

import typings.std.Element
import typings.std.HTMLElement
import typings.std.RegExp
import typings.std.Window
import typings.tinymce.mod.settings.Menu
import typings.tinymce.tinymceBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings_ extends js.Object {
  var advlist_number_styles: js.UndefOr[String] = js.native
  var allow_conditional_comments: js.UndefOr[Boolean] = js.native
  var allow_html_in_named_anchor: js.UndefOr[Boolean] = js.native
  var allow_script_urls: js.UndefOr[Boolean] = js.native
  var allow_unsafe_link_target: js.UndefOr[Boolean] = js.native
  var anchor_bottom: js.UndefOr[String] = js.native
  var anchor_top: js.UndefOr[String] = js.native
  var auto_focus: js.UndefOr[String] = js.native
  var automatic_uploads: js.UndefOr[Boolean] = js.native
  var autosave_ask_before_unload: js.UndefOr[Boolean] = js.native
  var autosave_interval: js.UndefOr[String] = js.native
  var autosave_prefix: js.UndefOr[String] = js.native
  var autosave_restore_when_empty: js.UndefOr[Boolean] = js.native
  var autosave_retention: js.UndefOr[String] = js.native
  var base_url: js.UndefOr[String] = js.native
  var block_formats: js.UndefOr[String] = js.native
  var body_class: js.UndefOr[String] = js.native
  var body_id: js.UndefOr[String] = js.native
  var br_in_pre: js.UndefOr[Boolean] = js.native
  var branding: js.UndefOr[Boolean] = js.native
  var browser_spellcheck: js.UndefOr[Boolean] = js.native
  var cache_suffix: js.UndefOr[String] = js.native
  var color_picker_callback: js.UndefOr[
    js.Function2[/* callback */ js.Function1[/* hexColor */ String, Unit], /* value */ String, Unit]
  ] = js.native
  var content_css: js.UndefOr[String | js.Array[String]] = js.native
  var content_security_policy: js.UndefOr[String] = js.native
  var content_style: js.UndefOr[String] = js.native
  var convert_fonts_to_spans: js.UndefOr[Boolean] = js.native
  var convert_urls: js.UndefOr[Boolean] = js.native
  var custom_elements: js.UndefOr[String] = js.native
  var custom_ui_selector: js.UndefOr[String] = js.native
  var custom_undo_redo_levels: js.UndefOr[Double] = js.native
  var directionality: js.UndefOr[String] = js.native
  var doctype: js.UndefOr[String] = js.native
  var document_base_url: js.UndefOr[String] = js.native
  var element_format: js.UndefOr[String] = js.native
  var elementpath: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var end_container_on_empty_block: js.UndefOr[Boolean] = js.native
  var entities: js.UndefOr[String] = js.native
  var entity_encoding: js.UndefOr[String] = js.native
  var event_root: js.UndefOr[Boolean] = js.native
  var extended_valid_elements: js.UndefOr[String] = js.native
  var external_plugins: js.UndefOr[js.Object] = js.native
  var file_browser_callback: js.UndefOr[
    js.Function4[/* field_name */ String, /* url */ String, /* type */ String, /* win */ Window, Unit]
  ] = js.native
  var file_browser_callback_types: js.UndefOr[String] = js.native
  var file_picker_callback: js.UndefOr[
    js.Function3[
      /* callback */ js.Function2[/* filename */ String, /* metadata */ js.Object, Unit], 
      /* valud */ String, 
      /* meta */ js.Object, 
      Unit
    ]
  ] = js.native
  var file_picker_types: js.UndefOr[String] = js.native
  var fix_list_elements: js.UndefOr[Boolean] = js.native
  var fixed_toolbar_container: js.UndefOr[String] = js.native
  var font_formats: js.UndefOr[String] = js.native
  var fontsize_formats: js.UndefOr[String] = js.native
  var force_hex_style_colors: js.UndefOr[Boolean] = js.native
  var forced_root_block: js.UndefOr[String] = js.native
  var forced_root_block_attrs: js.UndefOr[js.Object] = js.native
  var formats: js.UndefOr[js.Object] = js.native
  var gecko_spellcheck: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hidden_input: js.UndefOr[Boolean] = js.native
  var images_dataimg_filter: js.UndefOr[js.Function1[/* img */ js.Any, Unit]] = js.native
  var images_reuse_filename: js.UndefOr[Boolean] = js.native
  var images_upload_base_path: js.UndefOr[String] = js.native
  var images_upload_credentials: js.UndefOr[Boolean] = js.native
  var images_upload_handler: js.UndefOr[
    js.Function3[
      /* blobInfo */ js.Any, 
      /* success */ js.Function1[/* msg */ String, Unit], 
      /* failure */ js.Function1[/* msg */ String, Unit], 
      Unit
    ]
  ] = js.native
  var images_upload_url: js.UndefOr[String] = js.native
  var imagetools_api_key: js.UndefOr[String] = js.native
  var imagetools_cors_hosts: js.UndefOr[js.Array[String]] = js.native
  var imagetools_proxy: js.UndefOr[String] = js.native
  var imagetools_toolbar: js.UndefOr[String] = js.native
  var indentation: js.UndefOr[String] = js.native
  var init_instance_callback: js.UndefOr[js.Function1[/* editor */ Editor, Unit]] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inline_boundaries: js.UndefOr[Boolean] = js.native
  var insert_button_items: js.UndefOr[String] = js.native
  var insert_toolbar: js.UndefOr[String] = js.native
  var invalid_elements: js.UndefOr[String] = js.native
  var invalid_styles: js.UndefOr[String | js.Object] = js.native
  var keep_styles: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var language_url: js.UndefOr[String] = js.native
  var max_height: js.UndefOr[Double] = js.native
  var max_width: js.UndefOr[Double] = js.native
  var menu: js.UndefOr[Menu] = js.native
  var menubar: js.UndefOr[String | Boolean] = js.native
  var min_height: js.UndefOr[Double | String] = js.native
  var min_width: js.UndefOr[Double | String] = js.native
  var nowrap: js.UndefOr[Boolean] = js.native
  var object_resizing: js.UndefOr[Boolean | String] = js.native
  var paste_data_images: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[String | js.Array[String]] = js.native
  var preview_styles: js.UndefOr[Boolean | String] = js.native
  var protect: js.UndefOr[js.Array[RegExp]] = js.native
  var relative_urls: js.UndefOr[Boolean] = js.native
  var removeFormat: js.UndefOr[js.Array[js.Object]] = js.native
  var remove_script_host: js.UndefOr[Boolean] = js.native
  var remove_trailing_brs: js.UndefOr[Boolean] = js.native
  var removed_menuitems: js.UndefOr[String] = js.native
  var resize: js.UndefOr[Boolean | String] = js.native
  var schema: js.UndefOr[String] = js.native
  var selection_toolbar: js.UndefOr[String] = js.native
  var selector: js.UndefOr[String] = js.native
  var setup: js.UndefOr[js.Function1[/* edtor */ Editor, Unit]] = js.native
  var skin: js.UndefOr[`false` | String] = js.native
  var skin_url: js.UndefOr[String] = js.native
  var spellchecker_active: js.UndefOr[Boolean] = js.native
  var spellchecker_dialog: js.UndefOr[Boolean] = js.native
  var spellchecker_language: js.UndefOr[String] = js.native
  var spellchecker_languages: js.UndefOr[String] = js.native
  var spellchecker_on_load: js.UndefOr[Boolean] = js.native
  var spellchecker_rpc_url: js.UndefOr[String] = js.native
  var spellchecker_whitelist: js.UndefOr[js.Array[String]] = js.native
  var statusbar: js.UndefOr[Boolean] = js.native
  var style_formats: js.UndefOr[js.Array[js.Object]] = js.native
  var style_formats_autohide: js.UndefOr[Boolean] = js.native
  var style_formats_merge: js.UndefOr[Boolean] = js.native
  var table_advtab: js.UndefOr[Boolean] = js.native
  var table_appearance_options: js.UndefOr[Boolean] = js.native
  var table_cell_advtab: js.UndefOr[Boolean] = js.native
  var table_cell_class_list: js.UndefOr[js.Array[js.Object]] = js.native
  var table_class_list: js.UndefOr[js.Array[js.Object]] = js.native
  var table_clone_elements: js.UndefOr[String] = js.native
  var table_default_attributes: js.UndefOr[js.Object | String] = js.native
  var table_default_styles: js.UndefOr[js.Object | String] = js.native
  var table_grid: js.UndefOr[Boolean] = js.native
  var table_row_advtab: js.UndefOr[Boolean] = js.native
  var table_row_class_list: js.UndefOr[js.Array[js.Object]] = js.native
  var table_tab_navigation: js.UndefOr[Boolean] = js.native
  var table_toolbar: js.UndefOr[String] = js.native
  var target: js.UndefOr[Element] = js.native
  var theme: js.UndefOr[String] = js.native
  var theme_url: js.UndefOr[String] = js.native
  var toolbar: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  var type_ahead_urls: js.UndefOr[Boolean] = js.native
  var urlconverter_callback: js.UndefOr[
    js.Function4[/* url */ String, /* node */ HTMLElement, /* on_save */ Boolean, /* name */ String, Unit]
  ] = js.native
  var valid_children: js.UndefOr[String] = js.native
  var valid_classes: js.UndefOr[String | js.Object] = js.native
  var valid_elements: js.UndefOr[String] = js.native
  var valid_styles: js.UndefOr[js.Object] = js.native
  var visual: js.UndefOr[Boolean] = js.native
  var visual_anchor_class: js.UndefOr[String] = js.native
  var visual_table_class: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object Settings_ {
  @scala.inline
  def apply(): Settings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings_]
  }
  @scala.inline
  implicit class Settings_Ops[Self <: Settings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvlist_number_styles(value: String): Self = this.set("advlist_number_styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvlist_number_styles: Self = this.set("advlist_number_styles", js.undefined)
    @scala.inline
    def setAllow_conditional_comments(value: Boolean): Self = this.set("allow_conditional_comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_conditional_comments: Self = this.set("allow_conditional_comments", js.undefined)
    @scala.inline
    def setAllow_html_in_named_anchor(value: Boolean): Self = this.set("allow_html_in_named_anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_html_in_named_anchor: Self = this.set("allow_html_in_named_anchor", js.undefined)
    @scala.inline
    def setAllow_script_urls(value: Boolean): Self = this.set("allow_script_urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_script_urls: Self = this.set("allow_script_urls", js.undefined)
    @scala.inline
    def setAllow_unsafe_link_target(value: Boolean): Self = this.set("allow_unsafe_link_target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_unsafe_link_target: Self = this.set("allow_unsafe_link_target", js.undefined)
    @scala.inline
    def setAnchor_bottom(value: String): Self = this.set("anchor_bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor_bottom: Self = this.set("anchor_bottom", js.undefined)
    @scala.inline
    def setAnchor_top(value: String): Self = this.set("anchor_top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor_top: Self = this.set("anchor_top", js.undefined)
    @scala.inline
    def setAuto_focus(value: String): Self = this.set("auto_focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_focus: Self = this.set("auto_focus", js.undefined)
    @scala.inline
    def setAutomatic_uploads(value: Boolean): Self = this.set("automatic_uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatic_uploads: Self = this.set("automatic_uploads", js.undefined)
    @scala.inline
    def setAutosave_ask_before_unload(value: Boolean): Self = this.set("autosave_ask_before_unload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosave_ask_before_unload: Self = this.set("autosave_ask_before_unload", js.undefined)
    @scala.inline
    def setAutosave_interval(value: String): Self = this.set("autosave_interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosave_interval: Self = this.set("autosave_interval", js.undefined)
    @scala.inline
    def setAutosave_prefix(value: String): Self = this.set("autosave_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosave_prefix: Self = this.set("autosave_prefix", js.undefined)
    @scala.inline
    def setAutosave_restore_when_empty(value: Boolean): Self = this.set("autosave_restore_when_empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosave_restore_when_empty: Self = this.set("autosave_restore_when_empty", js.undefined)
    @scala.inline
    def setAutosave_retention(value: String): Self = this.set("autosave_retention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosave_retention: Self = this.set("autosave_retention", js.undefined)
    @scala.inline
    def setBase_url(value: String): Self = this.set("base_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase_url: Self = this.set("base_url", js.undefined)
    @scala.inline
    def setBlock_formats(value: String): Self = this.set("block_formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock_formats: Self = this.set("block_formats", js.undefined)
    @scala.inline
    def setBody_class(value: String): Self = this.set("body_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_class: Self = this.set("body_class", js.undefined)
    @scala.inline
    def setBody_id(value: String): Self = this.set("body_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_id: Self = this.set("body_id", js.undefined)
    @scala.inline
    def setBr_in_pre(value: Boolean): Self = this.set("br_in_pre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBr_in_pre: Self = this.set("br_in_pre", js.undefined)
    @scala.inline
    def setBranding(value: Boolean): Self = this.set("branding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranding: Self = this.set("branding", js.undefined)
    @scala.inline
    def setBrowser_spellcheck(value: Boolean): Self = this.set("browser_spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser_spellcheck: Self = this.set("browser_spellcheck", js.undefined)
    @scala.inline
    def setCache_suffix(value: String): Self = this.set("cache_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache_suffix: Self = this.set("cache_suffix", js.undefined)
    @scala.inline
    def setColor_picker_callback(value: (/* callback */ js.Function1[/* hexColor */ String, Unit], /* value */ String) => Unit): Self = this.set("color_picker_callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColor_picker_callback: Self = this.set("color_picker_callback", js.undefined)
    @scala.inline
    def setContent_cssVarargs(value: String*): Self = this.set("content_css", js.Array(value :_*))
    @scala.inline
    def setContent_css(value: String | js.Array[String]): Self = this.set("content_css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_css: Self = this.set("content_css", js.undefined)
    @scala.inline
    def setContent_security_policy(value: String): Self = this.set("content_security_policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_security_policy: Self = this.set("content_security_policy", js.undefined)
    @scala.inline
    def setContent_style(value: String): Self = this.set("content_style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_style: Self = this.set("content_style", js.undefined)
    @scala.inline
    def setConvert_fonts_to_spans(value: Boolean): Self = this.set("convert_fonts_to_spans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert_fonts_to_spans: Self = this.set("convert_fonts_to_spans", js.undefined)
    @scala.inline
    def setConvert_urls(value: Boolean): Self = this.set("convert_urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert_urls: Self = this.set("convert_urls", js.undefined)
    @scala.inline
    def setCustom_elements(value: String): Self = this.set("custom_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_elements: Self = this.set("custom_elements", js.undefined)
    @scala.inline
    def setCustom_ui_selector(value: String): Self = this.set("custom_ui_selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_ui_selector: Self = this.set("custom_ui_selector", js.undefined)
    @scala.inline
    def setCustom_undo_redo_levels(value: Double): Self = this.set("custom_undo_redo_levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_undo_redo_levels: Self = this.set("custom_undo_redo_levels", js.undefined)
    @scala.inline
    def setDirectionality(value: String): Self = this.set("directionality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionality: Self = this.set("directionality", js.undefined)
    @scala.inline
    def setDoctype(value: String): Self = this.set("doctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoctype: Self = this.set("doctype", js.undefined)
    @scala.inline
    def setDocument_base_url(value: String): Self = this.set("document_base_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_base_url: Self = this.set("document_base_url", js.undefined)
    @scala.inline
    def setElement_format(value: String): Self = this.set("element_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement_format: Self = this.set("element_format", js.undefined)
    @scala.inline
    def setElementpath(value: Boolean): Self = this.set("elementpath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementpath: Self = this.set("elementpath", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEnd_container_on_empty_block(value: Boolean): Self = this.set("end_container_on_empty_block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_container_on_empty_block: Self = this.set("end_container_on_empty_block", js.undefined)
    @scala.inline
    def setEntities(value: String): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setEntity_encoding(value: String): Self = this.set("entity_encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity_encoding: Self = this.set("entity_encoding", js.undefined)
    @scala.inline
    def setEvent_root(value: Boolean): Self = this.set("event_root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_root: Self = this.set("event_root", js.undefined)
    @scala.inline
    def setExtended_valid_elements(value: String): Self = this.set("extended_valid_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtended_valid_elements: Self = this.set("extended_valid_elements", js.undefined)
    @scala.inline
    def setExternal_plugins(value: js.Object): Self = this.set("external_plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_plugins: Self = this.set("external_plugins", js.undefined)
    @scala.inline
    def setFile_browser_callback(value: (/* field_name */ String, /* url */ String, /* type */ String, /* win */ Window) => Unit): Self = this.set("file_browser_callback", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFile_browser_callback: Self = this.set("file_browser_callback", js.undefined)
    @scala.inline
    def setFile_browser_callback_types(value: String): Self = this.set("file_browser_callback_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_browser_callback_types: Self = this.set("file_browser_callback_types", js.undefined)
    @scala.inline
    def setFile_picker_callback(
      value: (/* callback */ js.Function2[/* filename */ String, /* metadata */ js.Object, Unit], /* valud */ String, /* meta */ js.Object) => Unit
    ): Self = this.set("file_picker_callback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFile_picker_callback: Self = this.set("file_picker_callback", js.undefined)
    @scala.inline
    def setFile_picker_types(value: String): Self = this.set("file_picker_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_picker_types: Self = this.set("file_picker_types", js.undefined)
    @scala.inline
    def setFix_list_elements(value: Boolean): Self = this.set("fix_list_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix_list_elements: Self = this.set("fix_list_elements", js.undefined)
    @scala.inline
    def setFixed_toolbar_container(value: String): Self = this.set("fixed_toolbar_container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed_toolbar_container: Self = this.set("fixed_toolbar_container", js.undefined)
    @scala.inline
    def setFont_formats(value: String): Self = this.set("font_formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont_formats: Self = this.set("font_formats", js.undefined)
    @scala.inline
    def setFontsize_formats(value: String): Self = this.set("fontsize_formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontsize_formats: Self = this.set("fontsize_formats", js.undefined)
    @scala.inline
    def setForce_hex_style_colors(value: Boolean): Self = this.set("force_hex_style_colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce_hex_style_colors: Self = this.set("force_hex_style_colors", js.undefined)
    @scala.inline
    def setForced_root_block(value: String): Self = this.set("forced_root_block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForced_root_block: Self = this.set("forced_root_block", js.undefined)
    @scala.inline
    def setForced_root_block_attrs(value: js.Object): Self = this.set("forced_root_block_attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForced_root_block_attrs: Self = this.set("forced_root_block_attrs", js.undefined)
    @scala.inline
    def setFormats(value: js.Object): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setGecko_spellcheck(value: Boolean): Self = this.set("gecko_spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGecko_spellcheck: Self = this.set("gecko_spellcheck", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden_input(value: Boolean): Self = this.set("hidden_input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden_input: Self = this.set("hidden_input", js.undefined)
    @scala.inline
    def setImages_dataimg_filter(value: /* img */ js.Any => Unit): Self = this.set("images_dataimg_filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteImages_dataimg_filter: Self = this.set("images_dataimg_filter", js.undefined)
    @scala.inline
    def setImages_reuse_filename(value: Boolean): Self = this.set("images_reuse_filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages_reuse_filename: Self = this.set("images_reuse_filename", js.undefined)
    @scala.inline
    def setImages_upload_base_path(value: String): Self = this.set("images_upload_base_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages_upload_base_path: Self = this.set("images_upload_base_path", js.undefined)
    @scala.inline
    def setImages_upload_credentials(value: Boolean): Self = this.set("images_upload_credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages_upload_credentials: Self = this.set("images_upload_credentials", js.undefined)
    @scala.inline
    def setImages_upload_handler(
      value: (/* blobInfo */ js.Any, /* success */ js.Function1[/* msg */ String, Unit], /* failure */ js.Function1[/* msg */ String, Unit]) => Unit
    ): Self = this.set("images_upload_handler", js.Any.fromFunction3(value))
    @scala.inline
    def deleteImages_upload_handler: Self = this.set("images_upload_handler", js.undefined)
    @scala.inline
    def setImages_upload_url(value: String): Self = this.set("images_upload_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages_upload_url: Self = this.set("images_upload_url", js.undefined)
    @scala.inline
    def setImagetools_api_key(value: String): Self = this.set("imagetools_api_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagetools_api_key: Self = this.set("imagetools_api_key", js.undefined)
    @scala.inline
    def setImagetools_cors_hostsVarargs(value: String*): Self = this.set("imagetools_cors_hosts", js.Array(value :_*))
    @scala.inline
    def setImagetools_cors_hosts(value: js.Array[String]): Self = this.set("imagetools_cors_hosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagetools_cors_hosts: Self = this.set("imagetools_cors_hosts", js.undefined)
    @scala.inline
    def setImagetools_proxy(value: String): Self = this.set("imagetools_proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagetools_proxy: Self = this.set("imagetools_proxy", js.undefined)
    @scala.inline
    def setImagetools_toolbar(value: String): Self = this.set("imagetools_toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagetools_toolbar: Self = this.set("imagetools_toolbar", js.undefined)
    @scala.inline
    def setIndentation(value: String): Self = this.set("indentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentation: Self = this.set("indentation", js.undefined)
    @scala.inline
    def setInit_instance_callback(value: /* editor */ Editor => Unit): Self = this.set("init_instance_callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit_instance_callback: Self = this.set("init_instance_callback", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInline_boundaries(value: Boolean): Self = this.set("inline_boundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline_boundaries: Self = this.set("inline_boundaries", js.undefined)
    @scala.inline
    def setInsert_button_items(value: String): Self = this.set("insert_button_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsert_button_items: Self = this.set("insert_button_items", js.undefined)
    @scala.inline
    def setInsert_toolbar(value: String): Self = this.set("insert_toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsert_toolbar: Self = this.set("insert_toolbar", js.undefined)
    @scala.inline
    def setInvalid_elements(value: String): Self = this.set("invalid_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid_elements: Self = this.set("invalid_elements", js.undefined)
    @scala.inline
    def setInvalid_styles(value: String | js.Object): Self = this.set("invalid_styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid_styles: Self = this.set("invalid_styles", js.undefined)
    @scala.inline
    def setKeep_styles(value: Boolean): Self = this.set("keep_styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_styles: Self = this.set("keep_styles", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLanguage_url(value: String): Self = this.set("language_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage_url: Self = this.set("language_url", js.undefined)
    @scala.inline
    def setMax_height(value: Double): Self = this.set("max_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_height: Self = this.set("max_height", js.undefined)
    @scala.inline
    def setMax_width(value: Double): Self = this.set("max_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_width: Self = this.set("max_width", js.undefined)
    @scala.inline
    def setMenu(value: Menu): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMenubar(value: String | Boolean): Self = this.set("menubar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenubar: Self = this.set("menubar", js.undefined)
    @scala.inline
    def setMin_height(value: Double | String): Self = this.set("min_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin_height: Self = this.set("min_height", js.undefined)
    @scala.inline
    def setMin_width(value: Double | String): Self = this.set("min_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin_width: Self = this.set("min_width", js.undefined)
    @scala.inline
    def setNowrap(value: Boolean): Self = this.set("nowrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNowrap: Self = this.set("nowrap", js.undefined)
    @scala.inline
    def setObject_resizing(value: Boolean | String): Self = this.set("object_resizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject_resizing: Self = this.set("object_resizing", js.undefined)
    @scala.inline
    def setPaste_data_images(value: Boolean): Self = this.set("paste_data_images", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaste_data_images: Self = this.set("paste_data_images", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: String | js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPreview_styles(value: Boolean | String): Self = this.set("preview_styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview_styles: Self = this.set("preview_styles", js.undefined)
    @scala.inline
    def setProtectVarargs(value: RegExp*): Self = this.set("protect", js.Array(value :_*))
    @scala.inline
    def setProtect(value: js.Array[RegExp]): Self = this.set("protect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtect: Self = this.set("protect", js.undefined)
    @scala.inline
    def setRelative_urls(value: Boolean): Self = this.set("relative_urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative_urls: Self = this.set("relative_urls", js.undefined)
    @scala.inline
    def setRemoveFormatVarargs(value: js.Object*): Self = this.set("removeFormat", js.Array(value :_*))
    @scala.inline
    def setRemoveFormat(value: js.Array[js.Object]): Self = this.set("removeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveFormat: Self = this.set("removeFormat", js.undefined)
    @scala.inline
    def setRemove_script_host(value: Boolean): Self = this.set("remove_script_host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove_script_host: Self = this.set("remove_script_host", js.undefined)
    @scala.inline
    def setRemove_trailing_brs(value: Boolean): Self = this.set("remove_trailing_brs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove_trailing_brs: Self = this.set("remove_trailing_brs", js.undefined)
    @scala.inline
    def setRemoved_menuitems(value: String): Self = this.set("removed_menuitems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoved_menuitems: Self = this.set("removed_menuitems", js.undefined)
    @scala.inline
    def setResize(value: Boolean | String): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSelection_toolbar(value: String): Self = this.set("selection_toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection_toolbar: Self = this.set("selection_toolbar", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSetup(value: /* edtor */ Editor => Unit): Self = this.set("setup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setSkin(value: `false` | String): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setSkin_url(value: String): Self = this.set("skin_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin_url: Self = this.set("skin_url", js.undefined)
    @scala.inline
    def setSpellchecker_active(value: Boolean): Self = this.set("spellchecker_active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellchecker_active: Self = this.set("spellchecker_active", js.undefined)
    @scala.inline
    def setSpellchecker_dialog(value: Boolean): Self = this.set("spellchecker_dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellchecker_dialog: Self = this.set("spellchecker_dialog", js.undefined)
    @scala.inline
    def setSpellchecker_language(value: String): Self = this.set("spellchecker_language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellchecker_language: Self = this.set("spellchecker_language", js.undefined)
    @scala.inline
    def setSpellchecker_languages(value: String): Self = this.set("spellchecker_languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellchecker_languages: Self = this.set("spellchecker_languages", js.undefined)
    @scala.inline
    def setSpellchecker_on_load(value: Boolean): Self = this.set("spellchecker_on_load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellchecker_on_load: Self = this.set("spellchecker_on_load", js.undefined)
    @scala.inline
    def setSpellchecker_rpc_url(value: String): Self = this.set("spellchecker_rpc_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellchecker_rpc_url: Self = this.set("spellchecker_rpc_url", js.undefined)
    @scala.inline
    def setSpellchecker_whitelistVarargs(value: String*): Self = this.set("spellchecker_whitelist", js.Array(value :_*))
    @scala.inline
    def setSpellchecker_whitelist(value: js.Array[String]): Self = this.set("spellchecker_whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellchecker_whitelist: Self = this.set("spellchecker_whitelist", js.undefined)
    @scala.inline
    def setStatusbar(value: Boolean): Self = this.set("statusbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusbar: Self = this.set("statusbar", js.undefined)
    @scala.inline
    def setStyle_formatsVarargs(value: js.Object*): Self = this.set("style_formats", js.Array(value :_*))
    @scala.inline
    def setStyle_formats(value: js.Array[js.Object]): Self = this.set("style_formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle_formats: Self = this.set("style_formats", js.undefined)
    @scala.inline
    def setStyle_formats_autohide(value: Boolean): Self = this.set("style_formats_autohide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle_formats_autohide: Self = this.set("style_formats_autohide", js.undefined)
    @scala.inline
    def setStyle_formats_merge(value: Boolean): Self = this.set("style_formats_merge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle_formats_merge: Self = this.set("style_formats_merge", js.undefined)
    @scala.inline
    def setTable_advtab(value: Boolean): Self = this.set("table_advtab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_advtab: Self = this.set("table_advtab", js.undefined)
    @scala.inline
    def setTable_appearance_options(value: Boolean): Self = this.set("table_appearance_options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_appearance_options: Self = this.set("table_appearance_options", js.undefined)
    @scala.inline
    def setTable_cell_advtab(value: Boolean): Self = this.set("table_cell_advtab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_cell_advtab: Self = this.set("table_cell_advtab", js.undefined)
    @scala.inline
    def setTable_cell_class_listVarargs(value: js.Object*): Self = this.set("table_cell_class_list", js.Array(value :_*))
    @scala.inline
    def setTable_cell_class_list(value: js.Array[js.Object]): Self = this.set("table_cell_class_list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_cell_class_list: Self = this.set("table_cell_class_list", js.undefined)
    @scala.inline
    def setTable_class_listVarargs(value: js.Object*): Self = this.set("table_class_list", js.Array(value :_*))
    @scala.inline
    def setTable_class_list(value: js.Array[js.Object]): Self = this.set("table_class_list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_class_list: Self = this.set("table_class_list", js.undefined)
    @scala.inline
    def setTable_clone_elements(value: String): Self = this.set("table_clone_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_clone_elements: Self = this.set("table_clone_elements", js.undefined)
    @scala.inline
    def setTable_default_attributes(value: js.Object | String): Self = this.set("table_default_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_default_attributes: Self = this.set("table_default_attributes", js.undefined)
    @scala.inline
    def setTable_default_styles(value: js.Object | String): Self = this.set("table_default_styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_default_styles: Self = this.set("table_default_styles", js.undefined)
    @scala.inline
    def setTable_grid(value: Boolean): Self = this.set("table_grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_grid: Self = this.set("table_grid", js.undefined)
    @scala.inline
    def setTable_row_advtab(value: Boolean): Self = this.set("table_row_advtab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_row_advtab: Self = this.set("table_row_advtab", js.undefined)
    @scala.inline
    def setTable_row_class_listVarargs(value: js.Object*): Self = this.set("table_row_class_list", js.Array(value :_*))
    @scala.inline
    def setTable_row_class_list(value: js.Array[js.Object]): Self = this.set("table_row_class_list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_row_class_list: Self = this.set("table_row_class_list", js.undefined)
    @scala.inline
    def setTable_tab_navigation(value: Boolean): Self = this.set("table_tab_navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_tab_navigation: Self = this.set("table_tab_navigation", js.undefined)
    @scala.inline
    def setTable_toolbar(value: String): Self = this.set("table_toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable_toolbar: Self = this.set("table_toolbar", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTheme_url(value: String): Self = this.set("theme_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme_url: Self = this.set("theme_url", js.undefined)
    @scala.inline
    def setToolbarVarargs(value: String*): Self = this.set("toolbar", js.Array(value :_*))
    @scala.inline
    def setToolbar(value: Boolean | String | js.Array[String]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setType_ahead_urls(value: Boolean): Self = this.set("type_ahead_urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType_ahead_urls: Self = this.set("type_ahead_urls", js.undefined)
    @scala.inline
    def setUrlconverter_callback(
      value: (/* url */ String, /* node */ HTMLElement, /* on_save */ Boolean, /* name */ String) => Unit
    ): Self = this.set("urlconverter_callback", js.Any.fromFunction4(value))
    @scala.inline
    def deleteUrlconverter_callback: Self = this.set("urlconverter_callback", js.undefined)
    @scala.inline
    def setValid_children(value: String): Self = this.set("valid_children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid_children: Self = this.set("valid_children", js.undefined)
    @scala.inline
    def setValid_classes(value: String | js.Object): Self = this.set("valid_classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid_classes: Self = this.set("valid_classes", js.undefined)
    @scala.inline
    def setValid_elements(value: String): Self = this.set("valid_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid_elements: Self = this.set("valid_elements", js.undefined)
    @scala.inline
    def setValid_styles(value: js.Object): Self = this.set("valid_styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid_styles: Self = this.set("valid_styles", js.undefined)
    @scala.inline
    def setVisual(value: Boolean): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
    @scala.inline
    def setVisual_anchor_class(value: String): Self = this.set("visual_anchor_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual_anchor_class: Self = this.set("visual_anchor_class", js.undefined)
    @scala.inline
    def setVisual_table_class(value: String): Self = this.set("visual_table_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual_table_class: Self = this.set("visual_table_class", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

