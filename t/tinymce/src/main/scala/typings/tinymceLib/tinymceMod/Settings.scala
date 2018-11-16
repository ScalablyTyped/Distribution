package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Settings extends js.Object {
  var advlist_number_styles: js.UndefOr[java.lang.String] = js.undefined
  var allow_conditional_comments: js.UndefOr[scala.Boolean] = js.undefined
  var allow_html_in_named_anchor: js.UndefOr[scala.Boolean] = js.undefined
  var allow_script_urls: js.UndefOr[scala.Boolean] = js.undefined
  var allow_unsafe_link_target: js.UndefOr[scala.Boolean] = js.undefined
  var anchor_bottom: js.UndefOr[java.lang.String] = js.undefined
  var anchor_top: js.UndefOr[java.lang.String] = js.undefined
  var auto_focus: js.UndefOr[java.lang.String] = js.undefined
  var automatic_uploads: js.UndefOr[scala.Boolean] = js.undefined
  var autosave_ask_before_unload: js.UndefOr[scala.Boolean] = js.undefined
  var autosave_interval: js.UndefOr[java.lang.String] = js.undefined
  var autosave_prefix: js.UndefOr[java.lang.String] = js.undefined
  var autosave_restore_when_empty: js.UndefOr[scala.Boolean] = js.undefined
  var autosave_retention: js.UndefOr[java.lang.String] = js.undefined
  var block_formats: js.UndefOr[java.lang.String] = js.undefined
  var body_class: js.UndefOr[java.lang.String] = js.undefined
  var body_id: js.UndefOr[java.lang.String] = js.undefined
  var br_in_pre: js.UndefOr[scala.Boolean] = js.undefined
  var branding: js.UndefOr[scala.Boolean] = js.undefined
  var browser_spellcheck: js.UndefOr[scala.Boolean] = js.undefined
  var cache_suffix: js.UndefOr[java.lang.String] = js.undefined
  var color_picker_callback: js.UndefOr[
    js.Function2[
      /* callback */ js.Function1[/* hexColor */ java.lang.String, scala.Unit], 
      /* value */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var content_css: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var content_security_policy: js.UndefOr[java.lang.String] = js.undefined
  var content_style: js.UndefOr[java.lang.String] = js.undefined
  var convert_fonts_to_spans: js.UndefOr[scala.Boolean] = js.undefined
  var convert_urls: js.UndefOr[scala.Boolean] = js.undefined
  var custom_elements: js.UndefOr[java.lang.String] = js.undefined
  var custom_ui_selector: js.UndefOr[java.lang.String] = js.undefined
  var custom_undo_redo_levels: js.UndefOr[scala.Double] = js.undefined
  var directionality: js.UndefOr[java.lang.String] = js.undefined
  var doctype: js.UndefOr[java.lang.String] = js.undefined
  var document_base_url: js.UndefOr[java.lang.String] = js.undefined
  var element_format: js.UndefOr[java.lang.String] = js.undefined
  var elementpath: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var end_container_on_empty_block: js.UndefOr[scala.Boolean] = js.undefined
  var entities: js.UndefOr[java.lang.String] = js.undefined
  var entity_encoding: js.UndefOr[java.lang.String] = js.undefined
  var event_root: js.UndefOr[scala.Boolean] = js.undefined
  var extended_valid_elements: js.UndefOr[java.lang.String] = js.undefined
  var external_plugins: js.UndefOr[js.Object] = js.undefined
  var file_browser_callback: js.UndefOr[
    js.Function4[
      /* field_name */ java.lang.String, 
      /* url */ java.lang.String, 
      /* type */ java.lang.String, 
      /* win */ stdLib.Window, 
      scala.Unit
    ]
  ] = js.undefined
  var file_browser_callback_types: js.UndefOr[java.lang.String] = js.undefined
  var file_picker_callback: js.UndefOr[
    js.Function3[
      /* callback */ js.Function2[/* filename */ java.lang.String, /* metadata */ js.Object, scala.Unit], 
      /* valud */ java.lang.String, 
      /* meta */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var file_picker_types: js.UndefOr[java.lang.String] = js.undefined
  var fix_list_elements: js.UndefOr[scala.Boolean] = js.undefined
  var fixed_toolbar_container: js.UndefOr[java.lang.String] = js.undefined
  var font_formats: js.UndefOr[java.lang.String] = js.undefined
  var fontsize_formats: js.UndefOr[java.lang.String] = js.undefined
  var force_hex_style_colors: js.UndefOr[scala.Boolean] = js.undefined
  var forced_root_block: js.UndefOr[java.lang.String] = js.undefined
  var forced_root_block_attrs: js.UndefOr[js.Object] = js.undefined
  var formats: js.UndefOr[js.Object] = js.undefined
  var gecko_spellcheck: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hidden_input: js.UndefOr[scala.Boolean] = js.undefined
  var images_dataimg_filter: js.UndefOr[js.Function1[/* img */ js.Any, scala.Unit]] = js.undefined
  var images_reuse_filename: js.UndefOr[scala.Boolean] = js.undefined
  var images_upload_base_path: js.UndefOr[java.lang.String] = js.undefined
  var images_upload_credentials: js.UndefOr[scala.Boolean] = js.undefined
  var images_upload_handler: js.UndefOr[
    js.Function3[
      /* blobInfo */ js.Any, 
      /* success */ js.Function1[/* msg */ java.lang.String, scala.Unit], 
      /* failure */ js.Function1[/* msg */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var images_upload_url: js.UndefOr[java.lang.String] = js.undefined
  var imagetools_api_key: js.UndefOr[java.lang.String] = js.undefined
  var imagetools_cors_hosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var imagetools_proxy: js.UndefOr[java.lang.String] = js.undefined
  var imagetools_toolbar: js.UndefOr[java.lang.String] = js.undefined
  var indentation: js.UndefOr[java.lang.String] = js.undefined
  var init_instance_callback: js.UndefOr[js.Function1[/* editor */ Editor, scala.Unit]] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inline_boundaries: js.UndefOr[scala.Boolean] = js.undefined
  var insert_button_items: js.UndefOr[java.lang.String] = js.undefined
  var insert_toolbar: js.UndefOr[java.lang.String] = js.undefined
  var invalid_elements: js.UndefOr[java.lang.String] = js.undefined
  var invalid_styles: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var keep_styles: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var language_url: js.UndefOr[java.lang.String] = js.undefined
  var max_height: js.UndefOr[scala.Double] = js.undefined
  var max_width: js.UndefOr[scala.Double] = js.undefined
  var menu: js.UndefOr[tinymceLib.tinymceMod.settingsNs.Menu] = js.undefined
  var menubar: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var min_height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var min_width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var nowrap: js.UndefOr[scala.Boolean] = js.undefined
  var object_resizing: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var paste_data_images: js.UndefOr[scala.Boolean] = js.undefined
  var plugins: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var preview_styles: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var protect: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  var relative_urls: js.UndefOr[scala.Boolean] = js.undefined
  var removeFormat: js.UndefOr[js.Array[js.Object]] = js.undefined
  var remove_script_host: js.UndefOr[scala.Boolean] = js.undefined
  var remove_trailing_brs: js.UndefOr[scala.Boolean] = js.undefined
  var removed_menuitems: js.UndefOr[java.lang.String] = js.undefined
  var resize: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var schema: js.UndefOr[java.lang.String] = js.undefined
  var selection_toolbar: js.UndefOr[java.lang.String] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var setup: js.UndefOr[js.Function1[/* edtor */ Editor, scala.Unit]] = js.undefined
  var skin: js.UndefOr[java.lang.String] = js.undefined
  var skin_url: js.UndefOr[java.lang.String] = js.undefined
  var statusbar: js.UndefOr[scala.Boolean] = js.undefined
  var style_formats: js.UndefOr[js.Array[js.Object]] = js.undefined
  var style_formats_autohide: js.UndefOr[scala.Boolean] = js.undefined
  var style_formats_merge: js.UndefOr[scala.Boolean] = js.undefined
  var table_advtab: js.UndefOr[scala.Boolean] = js.undefined
  var table_appearance_options: js.UndefOr[scala.Boolean] = js.undefined
  var table_cell_advtab: js.UndefOr[scala.Boolean] = js.undefined
  var table_cell_class_list: js.UndefOr[js.Array[js.Object]] = js.undefined
  var table_class_list: js.UndefOr[js.Array[js.Object]] = js.undefined
  var table_clone_elements: js.UndefOr[java.lang.String] = js.undefined
  var table_default_attributes: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var table_default_styles: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var table_grid: js.UndefOr[scala.Boolean] = js.undefined
  var table_row_advtab: js.UndefOr[scala.Boolean] = js.undefined
  var table_row_class_list: js.UndefOr[js.Array[js.Object]] = js.undefined
  var table_tab_navigation: js.UndefOr[scala.Boolean] = js.undefined
  var table_toolbar: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var theme_url: js.UndefOr[java.lang.String] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  var type_ahead_urls: js.UndefOr[scala.Boolean] = js.undefined
  var urlconverter_callback: js.UndefOr[
    js.Function4[
      /* url */ java.lang.String, 
      /* node */ stdLib.HTMLElement, 
      /* on_save */ scala.Boolean, 
      /* name */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var valid_children: js.UndefOr[java.lang.String] = js.undefined
  var valid_classes: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var valid_elements: js.UndefOr[java.lang.String] = js.undefined
  var valid_styles: js.UndefOr[js.Object] = js.undefined
  var visual: js.UndefOr[scala.Boolean] = js.undefined
  var visual_anchor_class: js.UndefOr[java.lang.String] = js.undefined
  var visual_table_class: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

