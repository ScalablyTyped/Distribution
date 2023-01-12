package typings.yaireoTagify.mod

import typings.yaireoTagify.anon.PartialInvalidTagsMessage
import typings.yaireoTagify.yaireoTagifyBooleans.`false`
import typings.yaireoTagify.yaireoTagifyInts.`1`
import typings.yaireoTagify.yaireoTagifyInts.`2`
import typings.yaireoTagify.yaireoTagifyStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings that are available after the tagify instance was created.
  * Includes a few extra properties that are not available when creating a
  * new instance. These are also passed to several callback methods.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.TagifyCoreSettings<T>> */
trait TagifySettings[T /* <: BaseTagData */] extends StObject {
  
  /**
    * Options related to accessibility.
    */
  var a11y: js.UndefOr[A11ySettings] = js.undefined
  
  var addTagOnBlur: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options for offering autocomplete suggestions as the user types.
    */
  var autoComplete: js.UndefOr[AutoCompleteSettings] = js.undefined
  
  var backspace: js.UndefOr[Boolean | edit] = js.undefined
  
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  
  var callbacks: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @yaireo/tagify.@yaireo/tagify.EventDataMap<@yaireo/tagify.@yaireo/tagify.TagData> ]:? (event : std.CustomEvent<@yaireo/tagify.@yaireo/tagify.EventDataMap<T>[K]>): void} */ js.Any
  ] = js.undefined
  
  /**
    * Optional class names that are added to the corresponding elements.
    */
  var classNames: js.UndefOr[ClassNameSettings] = js.undefined
  
  var createInvalidTags: js.UndefOr[Boolean] = js.undefined
  
  var delimiters: js.UndefOr[String | js.RegExp] = js.undefined
  
  /**
    * Options for offering a dropdown menu with available tags.
    */
  var dropdown: js.UndefOr[DropDownSettings[T]] = js.undefined
  
  var duplicates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of clicks to enter `edit` mode: 1 for single click, `2` for a
    * double-click.
    *
    * `false` or `null` will disallow editing.
    * @default {clicks: 2, keepInvalid: true}
    */
  var editTags: js.UndefOr[`1` | `2` | `false` | Null | EditTagsSettings] = js.undefined
  
  var enforceWhitelist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Promise-based hooks for async program flow scenarios. Allows to
    * "hook" (intervene) at certain points of the program, which were
    * selected as a suitable place to pause the program flow and wait for
    * further instructions on how / if to proceed.
    */
  var hooks: js.UndefOr[Hooks[T]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var keepInvalidTags: js.UndefOr[Boolean] = js.undefined
  
  var maxTags: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional settings to configure how mixed mode behaves, see also the
    * `mode` setting.
    */
  var mixMode: js.UndefOr[MixModeSettings] = js.undefined
  
  var mixTagsAllowedAfter: js.UndefOr[js.RegExp] = js.undefined
  
  var mixTagsInterpolator: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  var mode: js.UndefOr[TagifyMode | Null] = js.undefined
  
  var onChangeAfterBlur: js.UndefOr[Boolean] = js.undefined
  
  var originalInputValueFormat: js.UndefOr[js.Function1[/* value */ js.Array[T], String]] = js.undefined
  
  var pasteAsTags: js.UndefOr[Boolean] = js.undefined
  
  var pattern: js.UndefOr[String | js.RegExp | Null] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var skipInvalid: js.UndefOr[Boolean] = js.undefined
  
  var tagTextProp: js.UndefOr[/* keyof T */ String] = js.undefined
  
  /**
    * Functions that return template strings. Can be used to customize how
    * tags, drop down menus etc. are rendered.
    */
  var templates: js.UndefOr[Templates[T]] = js.undefined
  
  var texts: js.UndefOr[PartialInvalidTagsMessage] = js.undefined
  
  var transformTag: js.UndefOr[js.Function1[/* tagData */ T, Unit]] = js.undefined
  
  var trim: js.UndefOr[Boolean] = js.undefined
  
  var userInput: js.UndefOr[Boolean] = js.undefined
  
  var validate: js.UndefOr[js.Function1[/* tagData */ T, Boolean | String]] = js.undefined
  
  var whitelist: js.UndefOr[js.Array[String | T]] = js.undefined
}
object TagifySettings {
  
  inline def apply[T /* <: BaseTagData */](): TagifySettings[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagifySettings[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagifySettings[?], T /* <: BaseTagData */] (val x: Self & TagifySettings[T]) extends AnyVal {
    
    inline def setA11y(value: A11ySettings): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
    
    inline def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
    
    inline def setAddTagOnBlur(value: Boolean): Self = StObject.set(x, "addTagOnBlur", value.asInstanceOf[js.Any])
    
    inline def setAddTagOnBlurUndefined: Self = StObject.set(x, "addTagOnBlur", js.undefined)
    
    inline def setAutoComplete(value: AutoCompleteSettings): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setBackspace(value: Boolean | edit): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
    
    inline def setBackspaceUndefined: Self = StObject.set(x, "backspace", js.undefined)
    
    inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
    
    inline def setCallbacks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @yaireo/tagify.@yaireo/tagify.EventDataMap<@yaireo/tagify.@yaireo/tagify.TagData> ]:? (event : std.CustomEvent<@yaireo/tagify.@yaireo/tagify.EventDataMap<T>[K]>): void} */ js.Any
    ): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setClassNames(value: ClassNameSettings): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setCreateInvalidTags(value: Boolean): Self = StObject.set(x, "createInvalidTags", value.asInstanceOf[js.Any])
    
    inline def setCreateInvalidTagsUndefined: Self = StObject.set(x, "createInvalidTags", js.undefined)
    
    inline def setDelimiters(value: String | js.RegExp): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
    
    inline def setDropdown(value: DropDownSettings[T]): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
    
    inline def setDuplicates(value: Boolean): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
    
    inline def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
    
    inline def setEditTags(value: `1` | `2` | `false` | EditTagsSettings): Self = StObject.set(x, "editTags", value.asInstanceOf[js.Any])
    
    inline def setEditTagsNull: Self = StObject.set(x, "editTags", null)
    
    inline def setEditTagsUndefined: Self = StObject.set(x, "editTags", js.undefined)
    
    inline def setEnforceWhitelist(value: Boolean): Self = StObject.set(x, "enforceWhitelist", value.asInstanceOf[js.Any])
    
    inline def setEnforceWhitelistUndefined: Self = StObject.set(x, "enforceWhitelist", js.undefined)
    
    inline def setHooks(value: Hooks[T]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeepInvalidTags(value: Boolean): Self = StObject.set(x, "keepInvalidTags", value.asInstanceOf[js.Any])
    
    inline def setKeepInvalidTagsUndefined: Self = StObject.set(x, "keepInvalidTags", js.undefined)
    
    inline def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
    
    inline def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
    
    inline def setMixMode(value: MixModeSettings): Self = StObject.set(x, "mixMode", value.asInstanceOf[js.Any])
    
    inline def setMixModeUndefined: Self = StObject.set(x, "mixMode", js.undefined)
    
    inline def setMixTagsAllowedAfter(value: js.RegExp): Self = StObject.set(x, "mixTagsAllowedAfter", value.asInstanceOf[js.Any])
    
    inline def setMixTagsAllowedAfterUndefined: Self = StObject.set(x, "mixTagsAllowedAfter", js.undefined)
    
    inline def setMixTagsInterpolator(value: js.Tuple2[String, String]): Self = StObject.set(x, "mixTagsInterpolator", value.asInstanceOf[js.Any])
    
    inline def setMixTagsInterpolatorUndefined: Self = StObject.set(x, "mixTagsInterpolator", js.undefined)
    
    inline def setMode(value: TagifyMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnChangeAfterBlur(value: Boolean): Self = StObject.set(x, "onChangeAfterBlur", value.asInstanceOf[js.Any])
    
    inline def setOnChangeAfterBlurUndefined: Self = StObject.set(x, "onChangeAfterBlur", js.undefined)
    
    inline def setOriginalInputValueFormat(value: /* value */ js.Array[T] => String): Self = StObject.set(x, "originalInputValueFormat", js.Any.fromFunction1(value))
    
    inline def setOriginalInputValueFormatUndefined: Self = StObject.set(x, "originalInputValueFormat", js.undefined)
    
    inline def setPasteAsTags(value: Boolean): Self = StObject.set(x, "pasteAsTags", value.asInstanceOf[js.Any])
    
    inline def setPasteAsTagsUndefined: Self = StObject.set(x, "pasteAsTags", js.undefined)
    
    inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setSkipInvalid(value: Boolean): Self = StObject.set(x, "skipInvalid", value.asInstanceOf[js.Any])
    
    inline def setSkipInvalidUndefined: Self = StObject.set(x, "skipInvalid", js.undefined)
    
    inline def setTagTextProp(value: /* keyof T */ String): Self = StObject.set(x, "tagTextProp", value.asInstanceOf[js.Any])
    
    inline def setTagTextPropUndefined: Self = StObject.set(x, "tagTextProp", js.undefined)
    
    inline def setTemplates(value: Templates[T]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTexts(value: PartialInvalidTagsMessage): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTransformTag(value: /* tagData */ T => Unit): Self = StObject.set(x, "transformTag", js.Any.fromFunction1(value))
    
    inline def setTransformTagUndefined: Self = StObject.set(x, "transformTag", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setUserInput(value: Boolean): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
    
    inline def setUserInputUndefined: Self = StObject.set(x, "userInput", js.undefined)
    
    inline def setValidate(value: /* tagData */ T => Boolean | String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setWhitelist(value: js.Array[String | T]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: (String | T)*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
