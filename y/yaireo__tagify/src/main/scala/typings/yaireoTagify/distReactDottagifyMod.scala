package typings.yaireoTagify

import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.std.CustomEvent
import typings.yaireoTagify.mod.AddEventData
import typings.yaireoTagify.mod.BaseTagData
import typings.yaireoTagify.mod.BlurEventData
import typings.yaireoTagify.mod.ChangeEventData
import typings.yaireoTagify.mod.ClickEventData
import typings.yaireoTagify.mod.DropDownHideEventData
import typings.yaireoTagify.mod.DropDownNoMatchEventData
import typings.yaireoTagify.mod.DropDownScrollEventData
import typings.yaireoTagify.mod.DropDownSelectEventData
import typings.yaireoTagify.mod.DropDownShowEventData
import typings.yaireoTagify.mod.DropDownUpdatedEventData
import typings.yaireoTagify.mod.EditBeforeUpdateEventData
import typings.yaireoTagify.mod.EditInputEventData
import typings.yaireoTagify.mod.EditKeydownEventData
import typings.yaireoTagify.mod.EditStartEventData
import typings.yaireoTagify.mod.EditUpdatedEventData
import typings.yaireoTagify.mod.FocusEventData
import typings.yaireoTagify.mod.InputEventData
import typings.yaireoTagify.mod.InvalidTagEventData
import typings.yaireoTagify.mod.KeydownEventData
import typings.yaireoTagify.mod.RemoveEventData
import typings.yaireoTagify.mod.TagifySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReactDottagifyMod {
  
  /**
    * React wrapper component for the tagify tags editor.
    * @param props Optional properties for configuring the tagify editor. Please
    * note that only some of these properties can be updated (changed after the
    * initial rendering), see the individual properties in
    * {@link Tags.TagifyTagsReactProps} for more details.
    * @returns The rendered React tagify element.
    */
  // Type parameter is used more than once within the TagifyTagsReactProps interface
  // tslint:disable-next-line no-unnecessary-generics
  inline def apply[T /* <: BaseTagData */](props: TagifyTagsReactProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@yaireo/tagify/dist/react.tagify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * React wrapper component that renders a tagify editor in mixed-mode. This
    * is a shortcut for the `<Tags InputMode="textarea" />`.
    * @param props Optional properties for configuring the tagify editor.
    * @returns The rendered React tagify element.
    */
  // Type parameter is used more than once within the TagifyMixedTagsReactProps interface
  // tslint:disable-next-line no-unnecessary-generics
  inline def MixedTags[T /* <: BaseTagData */](props: TagifyMixedTagsReactProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MixedTags")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /**
    * Possible values for the {@link TagifyBaseReactProps.InputMode} setting.
    * - `input` - renders an HTML INPUT element
    * - `textarea` - renders an HTML TEXTAREA element and switch tagify to mixed
    * mode
    */
  /* Rewritten from type alias, can be one of: 
    - typings.yaireoTagify.yaireoTagifyStrings.input
    - typings.yaireoTagify.yaireoTagifyStrings.textarea
  */
  trait InputMode extends StObject
  object InputMode {
    
    inline def input: typings.yaireoTagify.yaireoTagifyStrings.input = "input".asInstanceOf[typings.yaireoTagify.yaireoTagifyStrings.input]
    
    inline def textarea: typings.yaireoTagify.yaireoTagifyStrings.textarea = "textarea".asInstanceOf[typings.yaireoTagify.yaireoTagifyStrings.textarea]
  }
  
  /**
    * Base react props that for both the {@link Tags} and {@link MixedTags}
    * react wrapper component for tagify.
    * @template T Type of the tag data used by the tagify instance. Must
    * contain at least a `value` property. Defaults to {@link TagData}, which
    * allows arbitrary properties. To enjoy more type safety, extend from
    * {@link BaseTagData},specify the allowed properties and use that as the
    * type parameter.
    */
  trait TagifyBaseReactProps[T /* <: BaseTagData */] extends StObject {
    
    /**
      * Should the component have focus on mount. Must be unique, per-page.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default undefined
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial value, i.e. the initial tags that are shown.
      * @deprecated Specify the tags via the `value` property.
      */
    var children: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Optional class name to be added to the component.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default undefined
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Same as `value`. Initial value, i.e. the initial tags that are shown.
      * Can be either a string separated by the delimiter set in the
      * settings, an array of tag values, or an array of tag items.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default undefined
      */
    var defaultValue: js.UndefOr[String | (js.Array[String | T])] = js.undefined
    
    /**
      * Toggles loading state for the whole component.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value for the `name` attribute of the `INPUT` or `TEXTAREA` element.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default undefined
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback invoked when a tag has been added.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onAdd: js.UndefOr[js.Function1[/* event */ CustomEvent[AddEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when the component lost focus.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[BlurEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when any change to the value has occurred.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onChange: js.UndefOr[js.Function1[/* event */ CustomEvent[ChangeEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a tag was clicked.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onClick: js.UndefOr[js.Function1[/* event */ CustomEvent[ClickEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when the suggestions dropdown has been removed from
      * the DOM.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onDropdownHide: js.UndefOr[js.Function1[/* event */ CustomEvent[DropDownHideEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when no whitelist suggestion item matched for the
      * typed input. At this point it is possible to manually set
      * `suggestedListItems` to any possible custom value, for example:
      * `[{ value:"default" }]`.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onDropdownNoMatch: js.UndefOr[js.Function1[/* event */ CustomEvent[DropDownNoMatchEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when the dropdown was scrolled by the user. Use
      * `event.detail.percentage` to get the percentage scrolled.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onDropdownScroll: js.UndefOr[js.Function1[/* event */ CustomEvent[DropDownScrollEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a suggestions dropdown item was selected (by
      * mouse / keyboard / touch).
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onDropdownSelect: js.UndefOr[js.Function1[/* event */ CustomEvent[DropDownSelectEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when the suggestions dropdown is about to be
      * rendered. The dropdown DOM node is passed to the callback.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onDropdownShow: js.UndefOr[js.Function1[/* event */ CustomEvent[DropDownShowEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when the dropdown menu is open and its items were
      * recomputed via `Tagify.refilter`.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onDropdownUpdated: js.UndefOr[js.Function1[/* event */ CustomEvent[DropDownUpdatedEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked just before a tag has been updated, while still in
      * "edit" mode.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onEditBeforeUpdate: js.UndefOr[js.Function1[/* event */ CustomEvent[EditBeforeUpdateEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when typing inside an edited tag.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onEditInput: js.UndefOr[js.Function1[/* event */ CustomEvent[EditInputEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a keydown event occurs while an edited tag is
      * in focus.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onEditKeydown: js.UndefOr[js.Function1[/* event */ CustomEvent[EditKeydownEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a tag is now in "edit mode".
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onEditStart: js.UndefOr[js.Function1[/* event */ CustomEvent[EditStartEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a tag has been updated (changed view editing or
      * by directly calling the `replaceTag` method).
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onEditUpdated: js.UndefOr[js.Function1[/* event */ CustomEvent[EditUpdatedEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when the component gained focus.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[FocusEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a tag is being typed / edited.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onInput: js.UndefOr[js.Function1[/* event */ CustomEvent[InputEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a tag has been added but did not pass
      * validation.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onInvalid: js.UndefOr[js.Function1[/* event */ CustomEvent[InvalidTagEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when the tagify input element (for adding new tags
      * or editing existing tags) has focus and a key was pressed.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onKeydown: js.UndefOr[js.Function1[/* event */ CustomEvent[KeydownEventData[T]], Unit]] = js.undefined
    
    /**
      * Callback invoked when a tag has been removed.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default () => {}
      */
    var onRemove: js.UndefOr[js.Function1[/* event */ CustomEvent[RemoveEventData[T]], Unit]] = js.undefined
    
    /**
      * Placeholder text for input where the user can enter more tags.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default ''
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Toggles read-only state. When the tagify component is read-only, the user
      * cannot add, edit, or remove tags.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default undefined
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Settings for the tagify component.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default {}
      */
    var settings: js.UndefOr[TagifySettings[T]] = js.undefined
    
    /**
      * If `false`, does not show the suggestions dropdown. If `true`, shows
      * the suggestions dropdown. If a string, shows the dropdown
      * pre-filtered.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default undefined
      */
    var showDropdown: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * An optional react ref that will be populated with the Tagify
      * instance. use this when you need to access methods on the Tagify
      * instance.
      *
      * ```javascript
      * const ref = React.useRef();
      * <Tags tagifyRef={ref} {...otherProps} />
      * ```
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default undefined
      */
    var tagifyRef: js.UndefOr[MutableRefObject[js.UndefOr[typings.yaireoTagify.mod.^[T]]]] = js.undefined
    
    /**
      * Same as `defaultValue`. Initial value, i.e. the initial tags that are
      * shown. Can be either a string separated by the delimiter set in the
      * settings, an array of tag values, or an array of tag items.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default ''
      */
    var value: js.UndefOr[String | (js.Array[String | T])] = js.undefined
    
    /**
      * Sets the whitelist which is the basis for the suggestions dropdown
      * & autocomplete.
      *
      * This property can be updated, i.e. setting this to a different value
      * after the initial render will update the tagify editor
      * correspondingly.
      * @default undefined
      */
    var whitelist: js.UndefOr[js.Array[String | T]] = js.undefined
  }
  object TagifyBaseReactProps {
    
    inline def apply[T /* <: BaseTagData */](): TagifyBaseReactProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagifyBaseReactProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagifyBaseReactProps[?], T /* <: BaseTagData */] (val x: Self & TagifyBaseReactProps[T]) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: String | js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: String | (js.Array[String | T])): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (String | T)*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAdd(value: /* event */ CustomEvent[AddEventData[T]] => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnBlur(value: /* event */ CustomEvent[BlurEventData[T]] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* event */ CustomEvent[ChangeEventData[T]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* event */ CustomEvent[ClickEventData[T]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDropdownHide(value: /* event */ CustomEvent[DropDownHideEventData[T]] => Unit): Self = StObject.set(x, "onDropdownHide", js.Any.fromFunction1(value))
      
      inline def setOnDropdownHideUndefined: Self = StObject.set(x, "onDropdownHide", js.undefined)
      
      inline def setOnDropdownNoMatch(value: /* event */ CustomEvent[DropDownNoMatchEventData[T]] => Unit): Self = StObject.set(x, "onDropdownNoMatch", js.Any.fromFunction1(value))
      
      inline def setOnDropdownNoMatchUndefined: Self = StObject.set(x, "onDropdownNoMatch", js.undefined)
      
      inline def setOnDropdownScroll(value: /* event */ CustomEvent[DropDownScrollEventData[T]] => Unit): Self = StObject.set(x, "onDropdownScroll", js.Any.fromFunction1(value))
      
      inline def setOnDropdownScrollUndefined: Self = StObject.set(x, "onDropdownScroll", js.undefined)
      
      inline def setOnDropdownSelect(value: /* event */ CustomEvent[DropDownSelectEventData[T]] => Unit): Self = StObject.set(x, "onDropdownSelect", js.Any.fromFunction1(value))
      
      inline def setOnDropdownSelectUndefined: Self = StObject.set(x, "onDropdownSelect", js.undefined)
      
      inline def setOnDropdownShow(value: /* event */ CustomEvent[DropDownShowEventData[T]] => Unit): Self = StObject.set(x, "onDropdownShow", js.Any.fromFunction1(value))
      
      inline def setOnDropdownShowUndefined: Self = StObject.set(x, "onDropdownShow", js.undefined)
      
      inline def setOnDropdownUpdated(value: /* event */ CustomEvent[DropDownUpdatedEventData[T]] => Unit): Self = StObject.set(x, "onDropdownUpdated", js.Any.fromFunction1(value))
      
      inline def setOnDropdownUpdatedUndefined: Self = StObject.set(x, "onDropdownUpdated", js.undefined)
      
      inline def setOnEditBeforeUpdate(value: /* event */ CustomEvent[EditBeforeUpdateEventData[T]] => Unit): Self = StObject.set(x, "onEditBeforeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnEditBeforeUpdateUndefined: Self = StObject.set(x, "onEditBeforeUpdate", js.undefined)
      
      inline def setOnEditInput(value: /* event */ CustomEvent[EditInputEventData[T]] => Unit): Self = StObject.set(x, "onEditInput", js.Any.fromFunction1(value))
      
      inline def setOnEditInputUndefined: Self = StObject.set(x, "onEditInput", js.undefined)
      
      inline def setOnEditKeydown(value: /* event */ CustomEvent[EditKeydownEventData[T]] => Unit): Self = StObject.set(x, "onEditKeydown", js.Any.fromFunction1(value))
      
      inline def setOnEditKeydownUndefined: Self = StObject.set(x, "onEditKeydown", js.undefined)
      
      inline def setOnEditStart(value: /* event */ CustomEvent[EditStartEventData[T]] => Unit): Self = StObject.set(x, "onEditStart", js.Any.fromFunction1(value))
      
      inline def setOnEditStartUndefined: Self = StObject.set(x, "onEditStart", js.undefined)
      
      inline def setOnEditUpdated(value: /* event */ CustomEvent[EditUpdatedEventData[T]] => Unit): Self = StObject.set(x, "onEditUpdated", js.Any.fromFunction1(value))
      
      inline def setOnEditUpdatedUndefined: Self = StObject.set(x, "onEditUpdated", js.undefined)
      
      inline def setOnFocus(value: /* event */ CustomEvent[FocusEventData[T]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: /* event */ CustomEvent[InputEventData[T]] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: /* event */ CustomEvent[InvalidTagEventData[T]] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeydown(value: /* event */ CustomEvent[KeydownEventData[T]] => Unit): Self = StObject.set(x, "onKeydown", js.Any.fromFunction1(value))
      
      inline def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
      
      inline def setOnRemove(value: /* event */ CustomEvent[RemoveEventData[T]] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSettings(value: TagifySettings[T]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setShowDropdown(value: String | Boolean): Self = StObject.set(x, "showDropdown", value.asInstanceOf[js.Any])
      
      inline def setShowDropdownUndefined: Self = StObject.set(x, "showDropdown", js.undefined)
      
      inline def setTagifyRef(value: MutableRefObject[js.UndefOr[typings.yaireoTagify.mod.^[T]]]): Self = StObject.set(x, "tagifyRef", value.asInstanceOf[js.Any])
      
      inline def setTagifyRefUndefined: Self = StObject.set(x, "tagifyRef", js.undefined)
      
      inline def setValue(value: String | (js.Array[String | T])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | T)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setWhitelist(value: js.Array[String | T]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: (String | T)*): Self = StObject.set(x, "whitelist", js.Array(value*))
    }
  }
  
  /**
    * Optional react props that can be passed to the {@link Tags} react wrapper
    * component for tagify.
    * @template T Type of the tag data used by the tagify instance. Must
    * contain at least a `value` property. Defaults to {@link TagData}, which
    * allows arbitrary properties. To enjoy more type safety, extend from
    * {@link BaseTagData},specify the allowed properties and use that as the
    * type parameter.
    */
  type TagifyMixedTagsReactProps[T /* <: BaseTagData */] = TagifyBaseReactProps[T]
  
  trait TagifyTagsReactProps[T /* <: BaseTagData */]
    extends StObject
       with TagifyBaseReactProps[T] {
    
    /**
      * `textarea` will create a TEXTAREA (hidden) element instead of the
      * default INPUT element and automatically make Tagify act as
      * `mix mode`.
      *
      * This property __cannot be updated__, i.e. setting this to a different
      * value after the initial render is not supported.
      * @default 'input'
      */
    var InputMode: js.UndefOr[typings.yaireoTagify.distReactDottagifyMod.InputMode] = js.undefined
  }
  object TagifyTagsReactProps {
    
    inline def apply[T /* <: BaseTagData */](): TagifyTagsReactProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagifyTagsReactProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagifyTagsReactProps[?], T /* <: BaseTagData */] (val x: Self & TagifyTagsReactProps[T]) extends AnyVal {
      
      inline def setInputMode(value: InputMode): Self = StObject.set(x, "InputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "InputMode", js.undefined)
    }
  }
}
