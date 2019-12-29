package typings.tinymce.tinymceMod

import typings.std.Element
import typings.std.HTMLElement
import typings.std.RegExp
import typings.std.Window
import typings.tinymce.tinymceBooleans.`false`
import typings.tinymce.tinymceMod.settings.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
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
  var images_dataimg_filter: js.UndefOr[js.Function1[/* img */ js.Any, Unit]] = js.undefined
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
  var table_row_advtab: js.UndefOr[Boolean] = js.undefined
  var table_row_class_list: js.UndefOr[js.Array[js.Object]] = js.undefined
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

object Settings {
  @scala.inline
  def apply(
    advlist_number_styles: String = null,
    allow_conditional_comments: js.UndefOr[Boolean] = js.undefined,
    allow_html_in_named_anchor: js.UndefOr[Boolean] = js.undefined,
    allow_script_urls: js.UndefOr[Boolean] = js.undefined,
    allow_unsafe_link_target: js.UndefOr[Boolean] = js.undefined,
    anchor_bottom: String = null,
    anchor_top: String = null,
    auto_focus: String = null,
    automatic_uploads: js.UndefOr[Boolean] = js.undefined,
    autosave_ask_before_unload: js.UndefOr[Boolean] = js.undefined,
    autosave_interval: String = null,
    autosave_prefix: String = null,
    autosave_restore_when_empty: js.UndefOr[Boolean] = js.undefined,
    autosave_retention: String = null,
    block_formats: String = null,
    body_class: String = null,
    body_id: String = null,
    br_in_pre: js.UndefOr[Boolean] = js.undefined,
    branding: js.UndefOr[Boolean] = js.undefined,
    browser_spellcheck: js.UndefOr[Boolean] = js.undefined,
    cache_suffix: String = null,
    color_picker_callback: (/* callback */ js.Function1[/* hexColor */ String, Unit], /* value */ String) => Unit = null,
    content_css: String | js.Array[String] = null,
    content_security_policy: String = null,
    content_style: String = null,
    convert_fonts_to_spans: js.UndefOr[Boolean] = js.undefined,
    convert_urls: js.UndefOr[Boolean] = js.undefined,
    custom_elements: String = null,
    custom_ui_selector: String = null,
    custom_undo_redo_levels: Int | Double = null,
    directionality: String = null,
    doctype: String = null,
    document_base_url: String = null,
    element_format: String = null,
    elementpath: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    end_container_on_empty_block: js.UndefOr[Boolean] = js.undefined,
    entities: String = null,
    entity_encoding: String = null,
    event_root: js.UndefOr[Boolean] = js.undefined,
    extended_valid_elements: String = null,
    external_plugins: js.Object = null,
    file_browser_callback: (/* field_name */ String, /* url */ String, /* type */ String, /* win */ Window) => Unit = null,
    file_browser_callback_types: String = null,
    file_picker_callback: (/* callback */ js.Function2[/* filename */ String, /* metadata */ js.Object, Unit], /* valud */ String, /* meta */ js.Object) => Unit = null,
    file_picker_types: String = null,
    fix_list_elements: js.UndefOr[Boolean] = js.undefined,
    fixed_toolbar_container: String = null,
    font_formats: String = null,
    fontsize_formats: String = null,
    force_hex_style_colors: js.UndefOr[Boolean] = js.undefined,
    forced_root_block: String = null,
    forced_root_block_attrs: js.Object = null,
    formats: js.Object = null,
    gecko_spellcheck: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    hidden_input: js.UndefOr[Boolean] = js.undefined,
    images_dataimg_filter: /* img */ js.Any => Unit = null,
    images_reuse_filename: js.UndefOr[Boolean] = js.undefined,
    images_upload_base_path: String = null,
    images_upload_credentials: js.UndefOr[Boolean] = js.undefined,
    images_upload_handler: (/* blobInfo */ js.Any, /* success */ js.Function1[/* msg */ String, Unit], /* failure */ js.Function1[/* msg */ String, Unit]) => Unit = null,
    images_upload_url: String = null,
    imagetools_api_key: String = null,
    imagetools_cors_hosts: js.Array[String] = null,
    imagetools_proxy: String = null,
    imagetools_toolbar: String = null,
    indentation: String = null,
    init_instance_callback: /* editor */ Editor => Unit = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inline_boundaries: js.UndefOr[Boolean] = js.undefined,
    insert_button_items: String = null,
    insert_toolbar: String = null,
    invalid_elements: String = null,
    invalid_styles: String | js.Object = null,
    keep_styles: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    language_url: String = null,
    max_height: Int | Double = null,
    max_width: Int | Double = null,
    menu: Menu = null,
    menubar: String | Boolean = null,
    min_height: Double | String = null,
    min_width: Double | String = null,
    nowrap: js.UndefOr[Boolean] = js.undefined,
    object_resizing: Boolean | String = null,
    paste_data_images: js.UndefOr[Boolean] = js.undefined,
    plugins: String | js.Array[String] = null,
    preview_styles: Boolean | String = null,
    protect: js.Array[RegExp] = null,
    relative_urls: js.UndefOr[Boolean] = js.undefined,
    removeFormat: js.Array[js.Object] = null,
    remove_script_host: js.UndefOr[Boolean] = js.undefined,
    remove_trailing_brs: js.UndefOr[Boolean] = js.undefined,
    removed_menuitems: String = null,
    resize: Boolean | String = null,
    schema: String = null,
    selection_toolbar: String = null,
    selector: String = null,
    setup: /* edtor */ Editor => Unit = null,
    skin: `false` | String = null,
    skin_url: String = null,
    spellchecker_active: js.UndefOr[Boolean] = js.undefined,
    spellchecker_dialog: js.UndefOr[Boolean] = js.undefined,
    spellchecker_language: String = null,
    spellchecker_languages: String = null,
    spellchecker_on_load: js.UndefOr[Boolean] = js.undefined,
    spellchecker_rpc_url: String = null,
    spellchecker_whitelist: js.Array[String] = null,
    statusbar: js.UndefOr[Boolean] = js.undefined,
    style_formats: js.Array[js.Object] = null,
    style_formats_autohide: js.UndefOr[Boolean] = js.undefined,
    style_formats_merge: js.UndefOr[Boolean] = js.undefined,
    table_advtab: js.UndefOr[Boolean] = js.undefined,
    table_appearance_options: js.UndefOr[Boolean] = js.undefined,
    table_cell_advtab: js.UndefOr[Boolean] = js.undefined,
    table_cell_class_list: js.Array[js.Object] = null,
    table_class_list: js.Array[js.Object] = null,
    table_clone_elements: String = null,
    table_default_attributes: js.Object | String = null,
    table_default_styles: js.Object | String = null,
    table_grid: js.UndefOr[Boolean] = js.undefined,
    table_row_advtab: js.UndefOr[Boolean] = js.undefined,
    table_row_class_list: js.Array[js.Object] = null,
    table_tab_navigation: js.UndefOr[Boolean] = js.undefined,
    table_toolbar: String = null,
    target: Element = null,
    theme: String = null,
    theme_url: String = null,
    toolbar: Boolean | String | js.Array[String] = null,
    type_ahead_urls: js.UndefOr[Boolean] = js.undefined,
    urlconverter_callback: (/* url */ String, /* node */ HTMLElement, /* on_save */ Boolean, /* name */ String) => Unit = null,
    valid_children: String = null,
    valid_classes: String | js.Object = null,
    valid_elements: String = null,
    valid_styles: js.Object = null,
    visual: js.UndefOr[Boolean] = js.undefined,
    visual_anchor_class: String = null,
    visual_table_class: String = null,
    width: Double | String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (advlist_number_styles != null) __obj.updateDynamic("advlist_number_styles")(advlist_number_styles.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_conditional_comments)) __obj.updateDynamic("allow_conditional_comments")(allow_conditional_comments.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_html_in_named_anchor)) __obj.updateDynamic("allow_html_in_named_anchor")(allow_html_in_named_anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_script_urls)) __obj.updateDynamic("allow_script_urls")(allow_script_urls.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_unsafe_link_target)) __obj.updateDynamic("allow_unsafe_link_target")(allow_unsafe_link_target.asInstanceOf[js.Any])
    if (anchor_bottom != null) __obj.updateDynamic("anchor_bottom")(anchor_bottom.asInstanceOf[js.Any])
    if (anchor_top != null) __obj.updateDynamic("anchor_top")(anchor_top.asInstanceOf[js.Any])
    if (auto_focus != null) __obj.updateDynamic("auto_focus")(auto_focus.asInstanceOf[js.Any])
    if (!js.isUndefined(automatic_uploads)) __obj.updateDynamic("automatic_uploads")(automatic_uploads.asInstanceOf[js.Any])
    if (!js.isUndefined(autosave_ask_before_unload)) __obj.updateDynamic("autosave_ask_before_unload")(autosave_ask_before_unload.asInstanceOf[js.Any])
    if (autosave_interval != null) __obj.updateDynamic("autosave_interval")(autosave_interval.asInstanceOf[js.Any])
    if (autosave_prefix != null) __obj.updateDynamic("autosave_prefix")(autosave_prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(autosave_restore_when_empty)) __obj.updateDynamic("autosave_restore_when_empty")(autosave_restore_when_empty.asInstanceOf[js.Any])
    if (autosave_retention != null) __obj.updateDynamic("autosave_retention")(autosave_retention.asInstanceOf[js.Any])
    if (block_formats != null) __obj.updateDynamic("block_formats")(block_formats.asInstanceOf[js.Any])
    if (body_class != null) __obj.updateDynamic("body_class")(body_class.asInstanceOf[js.Any])
    if (body_id != null) __obj.updateDynamic("body_id")(body_id.asInstanceOf[js.Any])
    if (!js.isUndefined(br_in_pre)) __obj.updateDynamic("br_in_pre")(br_in_pre.asInstanceOf[js.Any])
    if (!js.isUndefined(branding)) __obj.updateDynamic("branding")(branding.asInstanceOf[js.Any])
    if (!js.isUndefined(browser_spellcheck)) __obj.updateDynamic("browser_spellcheck")(browser_spellcheck.asInstanceOf[js.Any])
    if (cache_suffix != null) __obj.updateDynamic("cache_suffix")(cache_suffix.asInstanceOf[js.Any])
    if (color_picker_callback != null) __obj.updateDynamic("color_picker_callback")(js.Any.fromFunction2(color_picker_callback))
    if (content_css != null) __obj.updateDynamic("content_css")(content_css.asInstanceOf[js.Any])
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy.asInstanceOf[js.Any])
    if (content_style != null) __obj.updateDynamic("content_style")(content_style.asInstanceOf[js.Any])
    if (!js.isUndefined(convert_fonts_to_spans)) __obj.updateDynamic("convert_fonts_to_spans")(convert_fonts_to_spans.asInstanceOf[js.Any])
    if (!js.isUndefined(convert_urls)) __obj.updateDynamic("convert_urls")(convert_urls.asInstanceOf[js.Any])
    if (custom_elements != null) __obj.updateDynamic("custom_elements")(custom_elements.asInstanceOf[js.Any])
    if (custom_ui_selector != null) __obj.updateDynamic("custom_ui_selector")(custom_ui_selector.asInstanceOf[js.Any])
    if (custom_undo_redo_levels != null) __obj.updateDynamic("custom_undo_redo_levels")(custom_undo_redo_levels.asInstanceOf[js.Any])
    if (directionality != null) __obj.updateDynamic("directionality")(directionality.asInstanceOf[js.Any])
    if (doctype != null) __obj.updateDynamic("doctype")(doctype.asInstanceOf[js.Any])
    if (document_base_url != null) __obj.updateDynamic("document_base_url")(document_base_url.asInstanceOf[js.Any])
    if (element_format != null) __obj.updateDynamic("element_format")(element_format.asInstanceOf[js.Any])
    if (!js.isUndefined(elementpath)) __obj.updateDynamic("elementpath")(elementpath.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(end_container_on_empty_block)) __obj.updateDynamic("end_container_on_empty_block")(end_container_on_empty_block.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (entity_encoding != null) __obj.updateDynamic("entity_encoding")(entity_encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(event_root)) __obj.updateDynamic("event_root")(event_root.asInstanceOf[js.Any])
    if (extended_valid_elements != null) __obj.updateDynamic("extended_valid_elements")(extended_valid_elements.asInstanceOf[js.Any])
    if (external_plugins != null) __obj.updateDynamic("external_plugins")(external_plugins.asInstanceOf[js.Any])
    if (file_browser_callback != null) __obj.updateDynamic("file_browser_callback")(js.Any.fromFunction4(file_browser_callback))
    if (file_browser_callback_types != null) __obj.updateDynamic("file_browser_callback_types")(file_browser_callback_types.asInstanceOf[js.Any])
    if (file_picker_callback != null) __obj.updateDynamic("file_picker_callback")(js.Any.fromFunction3(file_picker_callback))
    if (file_picker_types != null) __obj.updateDynamic("file_picker_types")(file_picker_types.asInstanceOf[js.Any])
    if (!js.isUndefined(fix_list_elements)) __obj.updateDynamic("fix_list_elements")(fix_list_elements.asInstanceOf[js.Any])
    if (fixed_toolbar_container != null) __obj.updateDynamic("fixed_toolbar_container")(fixed_toolbar_container.asInstanceOf[js.Any])
    if (font_formats != null) __obj.updateDynamic("font_formats")(font_formats.asInstanceOf[js.Any])
    if (fontsize_formats != null) __obj.updateDynamic("fontsize_formats")(fontsize_formats.asInstanceOf[js.Any])
    if (!js.isUndefined(force_hex_style_colors)) __obj.updateDynamic("force_hex_style_colors")(force_hex_style_colors.asInstanceOf[js.Any])
    if (forced_root_block != null) __obj.updateDynamic("forced_root_block")(forced_root_block.asInstanceOf[js.Any])
    if (forced_root_block_attrs != null) __obj.updateDynamic("forced_root_block_attrs")(forced_root_block_attrs.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (!js.isUndefined(gecko_spellcheck)) __obj.updateDynamic("gecko_spellcheck")(gecko_spellcheck.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden_input)) __obj.updateDynamic("hidden_input")(hidden_input.asInstanceOf[js.Any])
    if (images_dataimg_filter != null) __obj.updateDynamic("images_dataimg_filter")(js.Any.fromFunction1(images_dataimg_filter))
    if (!js.isUndefined(images_reuse_filename)) __obj.updateDynamic("images_reuse_filename")(images_reuse_filename.asInstanceOf[js.Any])
    if (images_upload_base_path != null) __obj.updateDynamic("images_upload_base_path")(images_upload_base_path.asInstanceOf[js.Any])
    if (!js.isUndefined(images_upload_credentials)) __obj.updateDynamic("images_upload_credentials")(images_upload_credentials.asInstanceOf[js.Any])
    if (images_upload_handler != null) __obj.updateDynamic("images_upload_handler")(js.Any.fromFunction3(images_upload_handler))
    if (images_upload_url != null) __obj.updateDynamic("images_upload_url")(images_upload_url.asInstanceOf[js.Any])
    if (imagetools_api_key != null) __obj.updateDynamic("imagetools_api_key")(imagetools_api_key.asInstanceOf[js.Any])
    if (imagetools_cors_hosts != null) __obj.updateDynamic("imagetools_cors_hosts")(imagetools_cors_hosts.asInstanceOf[js.Any])
    if (imagetools_proxy != null) __obj.updateDynamic("imagetools_proxy")(imagetools_proxy.asInstanceOf[js.Any])
    if (imagetools_toolbar != null) __obj.updateDynamic("imagetools_toolbar")(imagetools_toolbar.asInstanceOf[js.Any])
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (init_instance_callback != null) __obj.updateDynamic("init_instance_callback")(js.Any.fromFunction1(init_instance_callback))
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(inline_boundaries)) __obj.updateDynamic("inline_boundaries")(inline_boundaries.asInstanceOf[js.Any])
    if (insert_button_items != null) __obj.updateDynamic("insert_button_items")(insert_button_items.asInstanceOf[js.Any])
    if (insert_toolbar != null) __obj.updateDynamic("insert_toolbar")(insert_toolbar.asInstanceOf[js.Any])
    if (invalid_elements != null) __obj.updateDynamic("invalid_elements")(invalid_elements.asInstanceOf[js.Any])
    if (invalid_styles != null) __obj.updateDynamic("invalid_styles")(invalid_styles.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_styles)) __obj.updateDynamic("keep_styles")(keep_styles.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (language_url != null) __obj.updateDynamic("language_url")(language_url.asInstanceOf[js.Any])
    if (max_height != null) __obj.updateDynamic("max_height")(max_height.asInstanceOf[js.Any])
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menubar != null) __obj.updateDynamic("menubar")(menubar.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height.asInstanceOf[js.Any])
    if (min_width != null) __obj.updateDynamic("min_width")(min_width.asInstanceOf[js.Any])
    if (!js.isUndefined(nowrap)) __obj.updateDynamic("nowrap")(nowrap.asInstanceOf[js.Any])
    if (object_resizing != null) __obj.updateDynamic("object_resizing")(object_resizing.asInstanceOf[js.Any])
    if (!js.isUndefined(paste_data_images)) __obj.updateDynamic("paste_data_images")(paste_data_images.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (preview_styles != null) __obj.updateDynamic("preview_styles")(preview_styles.asInstanceOf[js.Any])
    if (protect != null) __obj.updateDynamic("protect")(protect.asInstanceOf[js.Any])
    if (!js.isUndefined(relative_urls)) __obj.updateDynamic("relative_urls")(relative_urls.asInstanceOf[js.Any])
    if (removeFormat != null) __obj.updateDynamic("removeFormat")(removeFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(remove_script_host)) __obj.updateDynamic("remove_script_host")(remove_script_host.asInstanceOf[js.Any])
    if (!js.isUndefined(remove_trailing_brs)) __obj.updateDynamic("remove_trailing_brs")(remove_trailing_brs.asInstanceOf[js.Any])
    if (removed_menuitems != null) __obj.updateDynamic("removed_menuitems")(removed_menuitems.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selection_toolbar != null) __obj.updateDynamic("selection_toolbar")(selection_toolbar.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (skin_url != null) __obj.updateDynamic("skin_url")(skin_url.asInstanceOf[js.Any])
    if (!js.isUndefined(spellchecker_active)) __obj.updateDynamic("spellchecker_active")(spellchecker_active.asInstanceOf[js.Any])
    if (!js.isUndefined(spellchecker_dialog)) __obj.updateDynamic("spellchecker_dialog")(spellchecker_dialog.asInstanceOf[js.Any])
    if (spellchecker_language != null) __obj.updateDynamic("spellchecker_language")(spellchecker_language.asInstanceOf[js.Any])
    if (spellchecker_languages != null) __obj.updateDynamic("spellchecker_languages")(spellchecker_languages.asInstanceOf[js.Any])
    if (!js.isUndefined(spellchecker_on_load)) __obj.updateDynamic("spellchecker_on_load")(spellchecker_on_load.asInstanceOf[js.Any])
    if (spellchecker_rpc_url != null) __obj.updateDynamic("spellchecker_rpc_url")(spellchecker_rpc_url.asInstanceOf[js.Any])
    if (spellchecker_whitelist != null) __obj.updateDynamic("spellchecker_whitelist")(spellchecker_whitelist.asInstanceOf[js.Any])
    if (!js.isUndefined(statusbar)) __obj.updateDynamic("statusbar")(statusbar.asInstanceOf[js.Any])
    if (style_formats != null) __obj.updateDynamic("style_formats")(style_formats.asInstanceOf[js.Any])
    if (!js.isUndefined(style_formats_autohide)) __obj.updateDynamic("style_formats_autohide")(style_formats_autohide.asInstanceOf[js.Any])
    if (!js.isUndefined(style_formats_merge)) __obj.updateDynamic("style_formats_merge")(style_formats_merge.asInstanceOf[js.Any])
    if (!js.isUndefined(table_advtab)) __obj.updateDynamic("table_advtab")(table_advtab.asInstanceOf[js.Any])
    if (!js.isUndefined(table_appearance_options)) __obj.updateDynamic("table_appearance_options")(table_appearance_options.asInstanceOf[js.Any])
    if (!js.isUndefined(table_cell_advtab)) __obj.updateDynamic("table_cell_advtab")(table_cell_advtab.asInstanceOf[js.Any])
    if (table_cell_class_list != null) __obj.updateDynamic("table_cell_class_list")(table_cell_class_list.asInstanceOf[js.Any])
    if (table_class_list != null) __obj.updateDynamic("table_class_list")(table_class_list.asInstanceOf[js.Any])
    if (table_clone_elements != null) __obj.updateDynamic("table_clone_elements")(table_clone_elements.asInstanceOf[js.Any])
    if (table_default_attributes != null) __obj.updateDynamic("table_default_attributes")(table_default_attributes.asInstanceOf[js.Any])
    if (table_default_styles != null) __obj.updateDynamic("table_default_styles")(table_default_styles.asInstanceOf[js.Any])
    if (!js.isUndefined(table_grid)) __obj.updateDynamic("table_grid")(table_grid.asInstanceOf[js.Any])
    if (!js.isUndefined(table_row_advtab)) __obj.updateDynamic("table_row_advtab")(table_row_advtab.asInstanceOf[js.Any])
    if (table_row_class_list != null) __obj.updateDynamic("table_row_class_list")(table_row_class_list.asInstanceOf[js.Any])
    if (!js.isUndefined(table_tab_navigation)) __obj.updateDynamic("table_tab_navigation")(table_tab_navigation.asInstanceOf[js.Any])
    if (table_toolbar != null) __obj.updateDynamic("table_toolbar")(table_toolbar.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (theme_url != null) __obj.updateDynamic("theme_url")(theme_url.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(type_ahead_urls)) __obj.updateDynamic("type_ahead_urls")(type_ahead_urls.asInstanceOf[js.Any])
    if (urlconverter_callback != null) __obj.updateDynamic("urlconverter_callback")(js.Any.fromFunction4(urlconverter_callback))
    if (valid_children != null) __obj.updateDynamic("valid_children")(valid_children.asInstanceOf[js.Any])
    if (valid_classes != null) __obj.updateDynamic("valid_classes")(valid_classes.asInstanceOf[js.Any])
    if (valid_elements != null) __obj.updateDynamic("valid_elements")(valid_elements.asInstanceOf[js.Any])
    if (valid_styles != null) __obj.updateDynamic("valid_styles")(valid_styles.asInstanceOf[js.Any])
    if (!js.isUndefined(visual)) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    if (visual_anchor_class != null) __obj.updateDynamic("visual_anchor_class")(visual_anchor_class.asInstanceOf[js.Any])
    if (visual_table_class != null) __obj.updateDynamic("visual_table_class")(visual_table_class.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

