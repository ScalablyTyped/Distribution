package typings.yaireoTagify.mod

import typings.yaireoTagify.anon.PartialInvalidTagsMessage
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
trait TagifyCoreSettings[T /* <: BaseTagData */] extends StObject {
  
  /**
    * Automatically adds the text which was entered as a tag when a blur
    * event happens.
    * @default true
    */
  var addTagOnBlur: Boolean
  
  /**
    * When the backspace key is pressed:
    * `true` - remove last tag
    * `edit` - edit last tag
    * `false` - do nothing (useful for outside style)
    * @default true
    */
  var backspace: Boolean | edit
  
  /**
    * An array of tags which aren't allowed.
    * @default Empty array.
    */
  var blacklist: js.Array[String]
  
  /**
    * Callbacks that are invoked when the event specified by the key
    * occurs.
    */
  var callbacks: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @yaireo/tagify.@yaireo/tagify.EventDataMap<@yaireo/tagify.@yaireo/tagify.TagData> ]:? (event : std.CustomEvent<@yaireo/tagify.@yaireo/tagify.EventDataMap<T>[K]>): void} */ js.Any
  ] = js.undefined
  
  /**
    * If `true`, create invalid tags. Otherwise, keep the editable input
    * and do not create tags from it.
    * @default true
    */
  var createInvalidTags: Boolean
  
  /**
    * RegEx string. Split tags by any of these delimiters.
    * Example delimiters: ",|.| " (comma, dot, or whitespace)
    * @default ','
    */
  var delimiters: String | js.RegExp
  
  /**
    * Should duplicate tags be allowed or not?
    * @default false
    */
  var duplicates: Boolean
  
  /**
    * Should ONLY use tags allowed in whitelist.
    * In `mix` mode, setting it to `false` will not allow creating new tags.
    * @default false
    */
  var enforceWhitelist: Boolean
  
  /**
    * Assign a unique id to enable the feature to store and load persisted data via `localStorage`.
    * @default undefined
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, do not remove tags which did not pass validation.
    * @default false
    */
  var keepInvalidTags: Boolean
  
  /**
    * Maximum number of allowed tags.
    *
    * When reached, adds a class `tagify--hasMaxTags` to `<tags>`.
    * @default Infinity
    */
  var maxTags: Double
  
  /**
    * Define conditions in which typed mix-tags content is allowing a tag
    * to be created after.
    * @default /,|\.|\:|\s/
    */
  var mixTagsAllowedAfter: js.RegExp
  
  /**
    * Interpolation for mix mode. Everything between these will become a
    * tag.
    * @default ['[[', ']]']
    */
  var mixTagsInterpolator: js.Tuple2[String, String]
  
  /**
    * Use `select` for single-value dropdown-like select box.
    * See `mix` as value to allow mixed-content. The `pattern` setting must be set to some character.
    * @default null
    */
  var mode: js.UndefOr[TagifyMode | Null] = js.undefined
  
  /**
    * If `true`, the native way of input's `onChange` event is kept,
    * and it only fires when the field is blurred.
    * @default true
    */
  var onChangeAfterBlur: Boolean
  
  /**
    * If you wish your original input / textarea `value` property format to
    * be anything other than the default (which I recommend keeping), you
    * may use this and make sure it returns a string.
    */
  var originalInputValueFormat: js.UndefOr[js.Function1[/* value */ js.Array[T], String]] = js.undefined
  
  /**
    * Automatically converts pasted text into tags.
    * @default true
    */
  var pasteAsTags: Boolean
  
  /**
    * Validate input by RegEx pattern (can also be applied on the input itself as an attribute).
    * Example: /[1-9]/
    * @default null
    */
  var pattern: String | js.RegExp | Null
  
  /**
    * Placeholder text. If this attribute is set on an input / textarea
    * element it will override this setting.
    * @default Empty string
    */
  var placeholder: String
  
  /**
    * No user-interaction (add / remove / edit) is allowed when `true`.
    */
  var readonly: Boolean
  
  /**
    * If `true`, do not add invalid, temporary tags before automatically
    * removing them.
    * @default false
    */
  var skipInvalid: Boolean
  
  /**
    * `TagData` property which will be displayed as the tag's text.
    * Remember to keep `value` property unique.
    * @default 'value'
    */
  var tagTextProp: /* keyof T */ String
  
  /**
    * Customize messages for reasons if tag validation fails.
    */
  var texts: js.UndefOr[PartialInvalidTagsMessage] = js.undefined
  
  /**
    * Takes a tag data as an argument and allows mutating it before a tag
    * is created or edited and also before validation.
    *
    * Should not return anything, only mutate the argument.
    */
  def transformTag(tagData: T): Unit
  
  /**
    * If `true` trim the tag's value (remove before / after white spaces).
    * @default true
    */
  var trim: Boolean
  
  /**
    * Set `false` to disable manually typing/pasting/editing tags (tags may only be added from the whitelist).
    * @default true
    */
  var userInput: Boolean
  
  /**
    * If the `pattern` setting does not meet your needs, use this function
    * to implement a custom validation.
    */
  var validate: js.UndefOr[js.Function1[/* tagData */ T, Boolean | String]] = js.undefined
  
  /**
    * An array of allowed tags.
    *
    * Also used for auto-completion when `autocomplete.enabled` is `true`.
    * @default Empty array.
    */
  var whitelist: js.Array[String | T]
}
object TagifyCoreSettings {
  
  inline def apply[T /* <: BaseTagData */](
    addTagOnBlur: Boolean,
    backspace: Boolean | edit,
    blacklist: js.Array[String],
    createInvalidTags: Boolean,
    delimiters: String | js.RegExp,
    duplicates: Boolean,
    enforceWhitelist: Boolean,
    keepInvalidTags: Boolean,
    maxTags: Double,
    mixTagsAllowedAfter: js.RegExp,
    mixTagsInterpolator: js.Tuple2[String, String],
    onChangeAfterBlur: Boolean,
    pasteAsTags: Boolean,
    placeholder: String,
    readonly: Boolean,
    skipInvalid: Boolean,
    tagTextProp: /* keyof T */ String,
    transformTag: T => Unit,
    trim: Boolean,
    userInput: Boolean,
    whitelist: js.Array[String | T]
  ): TagifyCoreSettings[T] = {
    val __obj = js.Dynamic.literal(addTagOnBlur = addTagOnBlur.asInstanceOf[js.Any], backspace = backspace.asInstanceOf[js.Any], blacklist = blacklist.asInstanceOf[js.Any], createInvalidTags = createInvalidTags.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], duplicates = duplicates.asInstanceOf[js.Any], enforceWhitelist = enforceWhitelist.asInstanceOf[js.Any], keepInvalidTags = keepInvalidTags.asInstanceOf[js.Any], maxTags = maxTags.asInstanceOf[js.Any], mixTagsAllowedAfter = mixTagsAllowedAfter.asInstanceOf[js.Any], mixTagsInterpolator = mixTagsInterpolator.asInstanceOf[js.Any], onChangeAfterBlur = onChangeAfterBlur.asInstanceOf[js.Any], pasteAsTags = pasteAsTags.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], skipInvalid = skipInvalid.asInstanceOf[js.Any], tagTextProp = tagTextProp.asInstanceOf[js.Any], transformTag = js.Any.fromFunction1(transformTag), trim = trim.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], pattern = null)
    __obj.asInstanceOf[TagifyCoreSettings[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagifyCoreSettings[?], T /* <: BaseTagData */] (val x: Self & TagifyCoreSettings[T]) extends AnyVal {
    
    inline def setAddTagOnBlur(value: Boolean): Self = StObject.set(x, "addTagOnBlur", value.asInstanceOf[js.Any])
    
    inline def setBackspace(value: Boolean | edit): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
    
    inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
    
    inline def setCallbacks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @yaireo/tagify.@yaireo/tagify.EventDataMap<@yaireo/tagify.@yaireo/tagify.TagData> ]:? (event : std.CustomEvent<@yaireo/tagify.@yaireo/tagify.EventDataMap<T>[K]>): void} */ js.Any
    ): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setCreateInvalidTags(value: Boolean): Self = StObject.set(x, "createInvalidTags", value.asInstanceOf[js.Any])
    
    inline def setDelimiters(value: String | js.RegExp): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDuplicates(value: Boolean): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
    
    inline def setEnforceWhitelist(value: Boolean): Self = StObject.set(x, "enforceWhitelist", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeepInvalidTags(value: Boolean): Self = StObject.set(x, "keepInvalidTags", value.asInstanceOf[js.Any])
    
    inline def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
    
    inline def setMixTagsAllowedAfter(value: js.RegExp): Self = StObject.set(x, "mixTagsAllowedAfter", value.asInstanceOf[js.Any])
    
    inline def setMixTagsInterpolator(value: js.Tuple2[String, String]): Self = StObject.set(x, "mixTagsInterpolator", value.asInstanceOf[js.Any])
    
    inline def setMode(value: TagifyMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnChangeAfterBlur(value: Boolean): Self = StObject.set(x, "onChangeAfterBlur", value.asInstanceOf[js.Any])
    
    inline def setOriginalInputValueFormat(value: /* value */ js.Array[T] => String): Self = StObject.set(x, "originalInputValueFormat", js.Any.fromFunction1(value))
    
    inline def setOriginalInputValueFormatUndefined: Self = StObject.set(x, "originalInputValueFormat", js.undefined)
    
    inline def setPasteAsTags(value: Boolean): Self = StObject.set(x, "pasteAsTags", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setSkipInvalid(value: Boolean): Self = StObject.set(x, "skipInvalid", value.asInstanceOf[js.Any])
    
    inline def setTagTextProp(value: /* keyof T */ String): Self = StObject.set(x, "tagTextProp", value.asInstanceOf[js.Any])
    
    inline def setTexts(value: PartialInvalidTagsMessage): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTransformTag(value: T => Unit): Self = StObject.set(x, "transformTag", js.Any.fromFunction1(value))
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setUserInput(value: Boolean): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* tagData */ T => Boolean | String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setWhitelist(value: js.Array[String | T]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistVarargs(value: (String | T)*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
