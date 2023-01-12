package typings.yaireoTagify.mod

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
trait TagifyRuntimeSettings[T /* <: BaseTagData */]
  extends StObject
     with TagifyCoreSettings[T] {
  
  /**
    * Options related to accessibility.
    */
  var a11y: A11yRuntimeSettings
  
  /**
    * Options for offering autocomplete suggestions as the user types.
    */
  var autoComplete: AutoCompleteRuntimeSettings
  
  /**
    * Optional class names that are added to the corresponding elements.
    */
  var classNames: ClassNameRuntimeSettings
  
  /**
    * `true` if the input element has the `disabled` attribute
    * or the Tagify instance has been disabled.
    */
  var disabled: Boolean
  
  /**
    * Options for offering a dropdown menu with available tags.
    */
  var dropdown: DropDownRuntimeSettings[T]
  
  /**
    * Number of clicks to enter `edit` mode: 1 for single click, `2` for a
    * double-click.
    *
    * `false` or `null` will disallow editing.
    * @default {clicks: 2, keepInvalid: true}
    */
  var editTags: `1` | `2` | `false` | Null | EditTagsRuntimeSettings
  
  /**
    * Promise-based hooks for async program flow scenarios. Allows to
    * "hook" (intervene) at certain points of the program, which were
    * selected as a suitable place to pause the program flow and wait for
    * further instructions on how / if to proceed.
    */
  var hooks: HooksRuntime[T]
  
  /**
    * Optional settings to configure how mixed mode behaves, see also the
    * `mode` setting.
    */
  var mixMode: MixModeRuntimeSettings
  
  /**
    * Adds a required attribute to the Tagify wrapper element. Does nothing
    * more.
    */
  var required: Boolean
  
  /**
    * Functions that return template strings. Can be used to customize how
    * tags, drop down menus etc. are rendered.
    */
  var templates: TemplatesRuntime[T]
}
object TagifyRuntimeSettings {
  
  inline def apply[T /* <: BaseTagData */](
    a11y: A11yRuntimeSettings,
    addTagOnBlur: Boolean,
    autoComplete: AutoCompleteRuntimeSettings,
    backspace: Boolean | edit,
    blacklist: js.Array[String],
    classNames: ClassNameRuntimeSettings,
    createInvalidTags: Boolean,
    delimiters: String | js.RegExp,
    disabled: Boolean,
    dropdown: DropDownRuntimeSettings[T],
    duplicates: Boolean,
    enforceWhitelist: Boolean,
    hooks: HooksRuntime[T],
    keepInvalidTags: Boolean,
    maxTags: Double,
    mixMode: MixModeRuntimeSettings,
    mixTagsAllowedAfter: js.RegExp,
    mixTagsInterpolator: js.Tuple2[String, String],
    onChangeAfterBlur: Boolean,
    pasteAsTags: Boolean,
    placeholder: String,
    readonly: Boolean,
    required: Boolean,
    skipInvalid: Boolean,
    tagTextProp: /* keyof T */ String,
    templates: TemplatesRuntime[T],
    transformTag: T => Unit,
    trim: Boolean,
    userInput: Boolean,
    whitelist: js.Array[String | T]
  ): TagifyRuntimeSettings[T] = {
    val __obj = js.Dynamic.literal(a11y = a11y.asInstanceOf[js.Any], addTagOnBlur = addTagOnBlur.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], backspace = backspace.asInstanceOf[js.Any], blacklist = blacklist.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], createInvalidTags = createInvalidTags.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], duplicates = duplicates.asInstanceOf[js.Any], enforceWhitelist = enforceWhitelist.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], keepInvalidTags = keepInvalidTags.asInstanceOf[js.Any], maxTags = maxTags.asInstanceOf[js.Any], mixMode = mixMode.asInstanceOf[js.Any], mixTagsAllowedAfter = mixTagsAllowedAfter.asInstanceOf[js.Any], mixTagsInterpolator = mixTagsInterpolator.asInstanceOf[js.Any], onChangeAfterBlur = onChangeAfterBlur.asInstanceOf[js.Any], pasteAsTags = pasteAsTags.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], skipInvalid = skipInvalid.asInstanceOf[js.Any], tagTextProp = tagTextProp.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], transformTag = js.Any.fromFunction1(transformTag), trim = trim.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], editTags = null, pattern = null)
    __obj.asInstanceOf[TagifyRuntimeSettings[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagifyRuntimeSettings[?], T /* <: BaseTagData */] (val x: Self & TagifyRuntimeSettings[T]) extends AnyVal {
    
    inline def setA11y(value: A11yRuntimeSettings): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: AutoCompleteRuntimeSettings): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setClassNames(value: ClassNameRuntimeSettings): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDropdown(value: DropDownRuntimeSettings[T]): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setEditTags(value: `1` | `2` | `false` | EditTagsRuntimeSettings): Self = StObject.set(x, "editTags", value.asInstanceOf[js.Any])
    
    inline def setEditTagsNull: Self = StObject.set(x, "editTags", null)
    
    inline def setHooks(value: HooksRuntime[T]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setMixMode(value: MixModeRuntimeSettings): Self = StObject.set(x, "mixMode", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setTemplates(value: TemplatesRuntime[T]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
  }
}
