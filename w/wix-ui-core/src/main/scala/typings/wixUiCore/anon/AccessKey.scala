package typings.wixUiCore.anon

import typings.emotionCore.mod.InterpolationWithTheme
import typings.emotionSerialize.mod.Interpolation
import typings.react.mod.AnimationEvent
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import typings.wixUiCore.componentsInputInputMod.AriaAutoCompleteType
import typings.wixUiCore.wixUiCoreStrings.`additions text`
import typings.wixUiCore.wixUiCoreStrings.additions
import typings.wixUiCore.wixUiCoreStrings.all
import typings.wixUiCore.wixUiCoreStrings.ascending
import typings.wixUiCore.wixUiCoreStrings.assertive
import typings.wixUiCore.wixUiCoreStrings.copy
import typings.wixUiCore.wixUiCoreStrings.date
import typings.wixUiCore.wixUiCoreStrings.decimal
import typings.wixUiCore.wixUiCoreStrings.descending
import typings.wixUiCore.wixUiCoreStrings.dialog
import typings.wixUiCore.wixUiCoreStrings.email
import typings.wixUiCore.wixUiCoreStrings.execute
import typings.wixUiCore.wixUiCoreStrings.grammar
import typings.wixUiCore.wixUiCoreStrings.grid
import typings.wixUiCore.wixUiCoreStrings.horizontal
import typings.wixUiCore.wixUiCoreStrings.link
import typings.wixUiCore.wixUiCoreStrings.listbox
import typings.wixUiCore.wixUiCoreStrings.location
import typings.wixUiCore.wixUiCoreStrings.menu
import typings.wixUiCore.wixUiCoreStrings.mixed
import typings.wixUiCore.wixUiCoreStrings.move
import typings.wixUiCore.wixUiCoreStrings.none
import typings.wixUiCore.wixUiCoreStrings.numeric
import typings.wixUiCore.wixUiCoreStrings.off
import typings.wixUiCore.wixUiCoreStrings.on
import typings.wixUiCore.wixUiCoreStrings.other
import typings.wixUiCore.wixUiCoreStrings.page
import typings.wixUiCore.wixUiCoreStrings.polite
import typings.wixUiCore.wixUiCoreStrings.popup
import typings.wixUiCore.wixUiCoreStrings.removals
import typings.wixUiCore.wixUiCoreStrings.search
import typings.wixUiCore.wixUiCoreStrings.spelling
import typings.wixUiCore.wixUiCoreStrings.step
import typings.wixUiCore.wixUiCoreStrings.tel
import typings.wixUiCore.wixUiCoreStrings.text
import typings.wixUiCore.wixUiCoreStrings.time
import typings.wixUiCore.wixUiCoreStrings.tree
import typings.wixUiCore.wixUiCoreStrings.url
import typings.wixUiCore.wixUiCoreStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKey extends StObject {
  
  var about: js.UndefOr[String] = js.undefined
  
  var accept: js.UndefOr[String] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-autocomplete`: AriaAutoCompleteType
  
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  var `aria-current`: js.UndefOr[Boolean | time | page | step | location | date] = js.undefined
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var `aria-details`: js.UndefOr[String] = js.undefined
  
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-dropeffect`: js.UndefOr[link | none | copy | move | execute | popup] = js.undefined
  
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-haspopup`: js.UndefOr[Boolean | dialog | menu | listbox | grid | tree] = js.undefined
  
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var `aria-level`: js.UndefOr[Double] = js.undefined
  
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  var `aria-owns`: js.UndefOr[String] = js.undefined
  
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-relevant`: js.UndefOr[all | text | additions | (`additions text`) | removals] = js.undefined
  
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  var autoCapitalize: js.UndefOr[String] = js.undefined
  
  var autoComplete: js.UndefOr[String] = js.undefined
  
  var autoCorrect: js.UndefOr[String] = js.undefined
  
  var autoFocus: Boolean
  
  var autoSave: js.UndefOr[String] = js.undefined
  
  var capture: js.UndefOr[String | Boolean] = js.undefined
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /** hook for testing purposes */
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  
  var contextMenu: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var css: js.UndefOr[InterpolationWithTheme[js.Any]] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  var `data-hook`: js.UndefOr[String] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var disabled: Boolean
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var error: String | Boolean
  
  var form: js.UndefOr[String] = js.undefined
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formEncType: js.UndefOr[String] = js.undefined
  
  var formMethod: js.UndefOr[String] = js.undefined
  
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  
  var formTarget: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[js.Any] = js.undefined
  
  var inputClassName: js.UndefOr[String] = js.undefined
  
  var inputMode: js.UndefOr[search | none | text | decimal | numeric | tel | url | email] = js.undefined
  
  var is: js.UndefOr[String] = js.undefined
  
  var itemID: js.UndefOr[String] = js.undefined
  
  var itemProp: js.UndefOr[String] = js.undefined
  
  var itemRef: js.UndefOr[String] = js.undefined
  
  var itemScope: js.UndefOr[Boolean] = js.undefined
  
  var itemType: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var list: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[String | Double] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[String | Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onAbort: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onAbortCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onAnimationEndCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onAnimationIterationCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onAnimationStart: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onAnimationStartCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onAuxClick: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onAuxClickCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onBeforeInput: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onBeforeInputCapture: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  def onBlur(event: FocusEvent[HTMLInputElement]): Unit
  
  var onBlurCapture: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCanPlay: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onCanPlayCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onCanPlayThroughCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  def onChange(event: ChangeEvent[HTMLInputElement]): Unit
  
  var onChangeCapture: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onClickCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onCompositionEnd: js.UndefOr[js.Function1[/* event */ CompositionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCompositionEndCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCompositionStart: js.UndefOr[js.Function1[/* event */ CompositionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCompositionStartCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[js.Function1[/* event */ CompositionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCompositionUpdateCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onContextMenu: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onContextMenuCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onCopy: js.UndefOr[js.Function1[/* event */ ClipboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCopyCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCut: js.UndefOr[js.Function1[/* event */ ClipboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onCutCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDoubleClick: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onDoubleClickCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragEndCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragEnterCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragExit: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragExitCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragOverCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDragStartCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDropCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onDurationChange: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onDurationChangeCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onEmptied: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onEmptiedCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onEncrypted: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onEncryptedCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onEnded: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onEndedCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onError: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onErrorCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  def onFocus(event: FocusEvent[HTMLInputElement]): Unit
  
  var onFocusCapture: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onGotPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onGotPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onInput: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onInputCapture: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onInvalid: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onInvalidCapture: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onKeyDownCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onKeyPressCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onKeyUpCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onLoad: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLoadCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLoadStart: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLoadStartCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLoadedData: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLoadedDataCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLoadedMetadataCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onLostPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onLostPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onMouseDown: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseDownCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseMoveCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseOut: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseOutCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseOver: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseOverCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseUp: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onMouseUpCapture: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent], Unit]
  ] = js.undefined
  
  var onPaste: js.UndefOr[js.Function1[/* event */ ClipboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPasteCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPause: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onPauseCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onPlay: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onPlayCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onPlaying: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onPlayingCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerOut: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerOutCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerOver: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerOverCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onProgress: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onProgressCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onRateChange: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onRateChangeCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onReset: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onResetCapture: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* event */ UIEvent[HTMLInputElement, NativeUIEvent], Unit]] = js.undefined
  
  var onScrollCapture: js.UndefOr[js.Function1[/* event */ UIEvent[HTMLInputElement, NativeUIEvent], Unit]] = js.undefined
  
  var onSeeked: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSeekedCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSeeking: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSeekingCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSelect: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSelectCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onStalled: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onStalledCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSubmit: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onSubmitCapture: js.UndefOr[js.Function1[/* event */ FormEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onSuspend: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSuspendCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onTimeUpdate: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onTimeUpdateCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTouchCancelCapture: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTouchMoveCapture: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTouchStartCapture: js.UndefOr[js.Function1[/* event */ TouchEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTransitionEnd: js.UndefOr[js.Function1[/* event */ TransitionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onTransitionEndCapture: js.UndefOr[js.Function1[/* event */ TransitionEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onVolumeChange: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onVolumeChangeCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onWaiting: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onWaitingCapture: js.UndefOr[
    js.Function1[/* event */ SyntheticEvent[HTMLInputElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onWheel: js.UndefOr[js.Function1[/* event */ WheelEvent[HTMLInputElement], Unit]] = js.undefined
  
  var onWheelCapture: js.UndefOr[js.Function1[/* event */ WheelEvent[HTMLInputElement], Unit]] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var placeholder: String
  
  var prefix: ReactNode
  
  var property: js.UndefOr[String] = js.undefined
  
  var radioGroup: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var step: js.UndefOr[String | Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var suffix: ReactNode
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr[on | off] = js.undefined
  
  var value: String
  
  var vocab: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object AccessKey {
  
  inline def apply(
    `aria-autocomplete`: AriaAutoCompleteType,
    autoFocus: Boolean,
    disabled: Boolean,
    error: String | Boolean,
    onBlur: FocusEvent[HTMLInputElement] => Unit,
    onChange: ChangeEvent[HTMLInputElement] => Unit,
    onFocus: FocusEvent[HTMLInputElement] => Unit,
    placeholder: String,
    value: String
  ): AccessKey = {
    val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onFocus = js.Any.fromFunction1(onFocus), placeholder = placeholder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  
  extension [Self <: AccessKey](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: AriaAutoCompleteType): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-current`(value: Boolean | time | page | step | location | date): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: link | none | copy | move | execute | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | dialog | menu | listbox | grid | tree): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(value: all | text | additions | (`additions text`) | removals): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setCapture(value: String | Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentEditable(value: Boolean): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setCss(value: InterpolationWithTheme[js.Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssFunction1(value: js.Any => Interpolation[Unit]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
    
    inline def setCssNull: Self = StObject.set(x, "css", null)
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setError(value: String | Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
    
    inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
    
    inline def setInputMode(value: search | none | text | decimal | numeric | tel | url | email): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnAbort(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    inline def setOnAbortCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1(value))
    
    inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: /* event */ AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndCapture(value: /* event */ AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: /* event */ AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    inline def setOnAnimationIterationCapture(value: /* event */ AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1(value))
    
    inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: /* event */ AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartCapture(value: /* event */ AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    inline def setOnAuxClickCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onAuxClickCapture", js.Any.fromFunction1(value))
    
    inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    inline def setOnBeforeInputCapture(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1(value))
    
    inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurCapture(value: /* event */ FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1(value))
    
    inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    inline def setOnCanPlay(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    inline def setOnCanPlayThrough(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThroughCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeCapture(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1(value))
    
    inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: /* event */ CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    inline def setOnCompositionEndCapture(value: /* event */ CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: /* event */ CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    inline def setOnCompositionStartCapture(value: /* event */ CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: /* event */ CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    inline def setOnCompositionUpdateCapture(value: /* event */ CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1(value))
    
    inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: /* event */ ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyCapture(value: /* event */ ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1(value))
    
    inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: /* event */ ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutCapture(value: /* event */ ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1(value))
    
    inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClickCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onDoubleClickCapture", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    inline def setOnDragEnd(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    inline def setOnDragExitCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    inline def setOnDragOverCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropCapture(value: /* event */ DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1(value))
    
    inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    inline def setOnEmptiedCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1(value))
    
    inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    inline def setOnEncryptedCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1(value))
    
    inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1(value))
    
    inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1(value))
    
    inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusCapture(value: /* event */ FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1(value))
    
    inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    inline def setOnGotPointerCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1(value))
    
    inline def setOnGotPointerCaptureCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1(value))
    
    inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    inline def setOnInput(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputCapture(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1(value))
    
    inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    inline def setOnInvalidCapture(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1(value))
    
    inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownCapture(value: /* event */ KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: /* event */ KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressCapture(value: /* event */ KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: /* event */ KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpCapture(value: /* event */ KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    inline def setOnLoadStart(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    inline def setOnLoadedDataCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    inline def setOnLoadedMetadataCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnLostPointerCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1(value))
    
    inline def setOnLostPointerCaptureCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1(value))
    
    inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    inline def setOnMouseDown(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnMouseOverCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpCapture(value: /* event */ typings.react.mod.MouseEvent[HTMLInputElement, MouseEvent] => Unit): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: /* event */ ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteCapture(value: /* event */ ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1(value))
    
    inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnPauseCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1(value))
    
    inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    inline def setOnPlayCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1(value))
    
    inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    inline def setOnPlayingCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1(value))
    
    inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    inline def setOnPointerOutCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    inline def setOnPointerOverCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCapture(value: /* event */ PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1(value))
    
    inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    inline def setOnRateChangeCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    inline def setOnResetCapture(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1(value))
    
    inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: /* event */ UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollCapture(value: /* event */ UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1(value))
    
    inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    inline def setOnSeekedCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1(value))
    
    inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    inline def setOnSeekingCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1(value))
    
    inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1(value))
    
    inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    inline def setOnStalledCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1(value))
    
    inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitCapture(value: /* event */ FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1(value))
    
    inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    inline def setOnSuspendCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1(value))
    
    inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    inline def setOnTimeUpdateCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1(value))
    
    inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelCapture(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCapture(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveCapture(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartCapture(value: /* event */ TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: /* event */ TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    inline def setOnTransitionEndCapture(value: /* event */ TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    inline def setOnWaitingCapture(value: /* event */ SyntheticEvent[HTMLInputElement, typings.std.Event] => Unit): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1(value))
    
    inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: /* event */ WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    inline def setOnWheelCapture(value: /* event */ WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1(value))
    
    inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
