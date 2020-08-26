package typings.wordpressBlockEditor.richTextMod.RichText

import org.scalablytyped.runtime.StringDictionary
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Event
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`additions text`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`inline`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.additions
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.all
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ascending
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.assertive
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.both
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.copy
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.date
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.decimal
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.descending
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dialog
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.email
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.execute
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.grammar
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.grid
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.horizontal
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.inherit
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.link
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.list
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.listbox
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.location
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.menu
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.mixed
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.move
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.no
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.none
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.numeric
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.off
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.on
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.other
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.page
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.polite
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.popup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.removals
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.search
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.spelling
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.step
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tel
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.text
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.time
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tree
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.url
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.vertical
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.yes
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressComponents.autocompleteMod.Autocomplete.Completer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react.react.HTMLProps<T>, 'onChange'> */
@js.native
trait Props[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */] extends js.Object {
  var about: js.UndefOr[String] = js.native
  var accept: js.UndefOr[String] = js.native
  var acceptCharset: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var action: js.UndefOr[String] = js.native
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  var allowTransparency: js.UndefOr[Boolean] = js.native
  var alt: js.UndefOr[String] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var as: js.UndefOr[String] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  /**
    * A list of autocompleters to use instead of the default.
    */
  var autocompleters: js.UndefOr[js.Array[Completer[_]]] = js.native
  var capture: js.UndefOr[Boolean | String] = js.native
  var cellPadding: js.UndefOr[Double | String] = js.native
  var cellSpacing: js.UndefOr[Double | String] = js.native
  var challenge: js.UndefOr[String] = js.native
  var charSet: js.UndefOr[String] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[scala.Nothing] = js.native
  var cite: js.UndefOr[String] = js.native
  var classID: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var cols: js.UndefOr[Double] = js.native
  var content: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var coords: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var data: js.UndefOr[String] = js.native
  var datatype: js.UndefOr[String] = js.native
  var dateTime: js.UndefOr[String] = js.native
  var default: js.UndefOr[Boolean] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var download: js.UndefOr[js.Any] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var encType: js.UndefOr[String] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var frameBorder: js.UndefOr[Double | String] = js.native
  var headers: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var high: js.UndefOr[Double] = js.native
  var href: js.UndefOr[String] = js.native
  var hrefLang: js.UndefOr[String] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var httpEquiv: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var identifier: js.UndefOr[String] = js.native
  var inlineToolbar: js.UndefOr[Boolean] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var integrity: js.UndefOr[String] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  /**
    * By default, the placeholder will hide as soon as the editable field receives focus. With
    * this setting it can be be kept while the field is focussed and empty.
    */
  var keepPlaceholderOnFocus: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var keyParams: js.UndefOr[String] = js.native
  var keyType: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var list: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var low: js.UndefOr[Double] = js.native
  var manifest: js.UndefOr[String] = js.native
  var marginHeight: js.UndefOr[Double] = js.native
  var marginWidth: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var media: js.UndefOr[String] = js.native
  var mediaGroup: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var multiline: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 121 */ js.Any
  ] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var nonce: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[T]] = js.native
  var onError: js.UndefOr[ReactEventHandler[T]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.native
  var onInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.native
  /**
    * Called when blocks can be merged. `forward` is `true` when merging with the next block,
    * false when merging with the previous block.
    */
  var onMerge: js.UndefOr[js.Function1[/* forward */ Boolean, Unit]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.native
  /**
    * Called when the block can be removed. `forward` is `true` when the selection is expected to
    * move to the next block, `false` to the previous block.
    */
  var onRemove: js.UndefOr[js.Function1[/* forward */ Boolean, Unit]] = js.native
  /**
    * Called when the `RichText` instance can be replaced with the given blocks.
    */
  var onReplace: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[_]]], Unit]] = js.native
  var onReset: js.UndefOr[FormEventHandler[T]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[T]] = js.native
  /**
    * Called when the content can be split, where `value` is a piece of content being split
    * off. Here you should create a new block with that content and return it. Note that you
    * also need to provide `onReplace` in order for this to take any effect.
    */
  var onSplit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.native
  var onTagNameChange: js.UndefOr[
    js.Function1[
      /* tagName */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any, 
      Unit
    ]
  ] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var optimum: js.UndefOr[Double] = js.native
  var pattern: js.UndefOr[String] = js.native
  /**
    * Placeholder text to show when the field is empty, similar to the `input` and `textarea`
    * attribute of the same name.
    * See: {@link https://developer.mozilla.org/en-US/docs/Learn/HTML/Forms/HTML5_updates#The_placeholder_attribute }
    */
  var placeholder: js.UndefOr[String] = js.native
  var playsInline: js.UndefOr[Boolean] = js.native
  var poster: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var preload: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[LegacyRef[T]] = js.native
  var rel: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  var sandbox: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var scoped: js.UndefOr[Boolean] = js.native
  var scrolling: js.UndefOr[String] = js.native
  var seamless: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var shape: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var sizes: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var span: js.UndefOr[Double] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var src: js.UndefOr[String] = js.native
  var srcDoc: js.UndefOr[String] = js.native
  var srcLang: js.UndefOr[String] = js.native
  var srcSet: js.UndefOr[String] = js.native
  var start: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var summary: js.UndefOr[String] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * The tag name of the editable element.
    * @defaultValue div
    */
  var tagName: js.UndefOr[T] = js.native
  var target: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var useMap: js.UndefOr[String] = js.native
  /**
    * HTML string to make editable. The HTML should be valid, and valid inside the `tagName`,
    * if provided.
    */
  var value: String = js.native
  var vocab: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var wmode: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[String] = js.native
  var wrapperClassName: js.UndefOr[String] = js.native
  /**
    * Called when the value changes.
    */
  def onChange(value: String): Unit = js.native
}

object Props {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 * / js.Any */ T](onChange: String => Unit, value: String): Props[T] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 * / js.Any */ T] (val x: Self with Props[T]) extends AnyVal {
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
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAcceptCharset(value: String): Self = this.set("acceptCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptCharset: Self = this.set("acceptCharset", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", js.undefined)
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setAutocompletersVarargs(value: Completer[js.Any]*): Self = this.set("autocompleters", js.Array(value :_*))
    @scala.inline
    def setAutocompleters(value: js.Array[Completer[_]]): Self = this.set("autocompleters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocompleters: Self = this.set("autocompleters", js.undefined)
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setCellPadding(value: Double | String): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", js.undefined)
    @scala.inline
    def setCellSpacing(value: Double | String): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
    @scala.inline
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCite(value: String): Self = this.set("cite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCite: Self = this.set("cite", js.undefined)
    @scala.inline
    def setClassID(value: String): Self = this.set("classID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassID: Self = this.set("classID", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setCoords(value: String): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDownload(value: js.Any): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEncType(value: String): Self = this.set("encType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncType: Self = this.set("encType", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", js.undefined)
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", js.undefined)
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", js.undefined)
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", js.undefined)
    @scala.inline
    def setFrameBorder(value: Double | String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameBorder: Self = this.set("frameBorder", js.undefined)
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHrefLang(value: String): Self = this.set("hrefLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefLang: Self = this.set("hrefLang", js.undefined)
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    @scala.inline
    def setHttpEquiv(value: String): Self = this.set("httpEquiv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEquiv: Self = this.set("httpEquiv", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setInlineToolbar(value: Boolean): Self = this.set("inlineToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineToolbar: Self = this.set("inlineToolbar", js.undefined)
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setKeepPlaceholderOnFocus(value: Boolean): Self = this.set("keepPlaceholderOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepPlaceholderOnFocus: Self = this.set("keepPlaceholderOnFocus", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyParams(value: String): Self = this.set("keyParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyParams: Self = this.set("keyParams", js.undefined)
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setMarginHeight(value: Double): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginHeight: Self = this.set("marginHeight", js.undefined)
    @scala.inline
    def setMarginWidth(value: Double): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginWidth: Self = this.set("marginWidth", js.undefined)
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMultiline(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 121 */ js.Any): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setOnAbort(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAuxClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    @scala.inline
    def setOnBeforeInput(value: FormEvent[T] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[T] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnCopy(value: ClipboardEvent[T] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCut(value: ClipboardEvent[T] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDrag(value: DragEvent[T] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: DragEvent[T] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEvent[T] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragExit(value: DragEvent[T] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEvent[T] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEvent[T] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: DragEvent[T] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: DragEvent[T] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEnded(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnError(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[T] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInput(value: FormEvent[T] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInvalid(value: FormEvent[T] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnLoad(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnMerge(value: /* forward */ Boolean => Unit): Self = this.set("onMerge", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMerge: Self = this.set("onMerge", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOver(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnPaste(value: ClipboardEvent[T] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPause(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[T] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerDown(value: PointerEvent[T] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[T] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[T] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerMove(value: PointerEvent[T] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerOut(value: PointerEvent[T] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOver(value: PointerEvent[T] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerUp(value: PointerEvent[T] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnProgress(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnRemove(value: /* forward */ Boolean => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOnReplace(value: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit): Self = this.set("onReplace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReplace: Self = this.set("onReplace", js.undefined)
    @scala.inline
    def setOnReset(value: FormEvent[T] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnScroll(value: UIEvent[T, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSelect(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSplit(value: /* value */ String => Unit): Self = this.set("onSplit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSplit: Self = this.set("onSplit", js.undefined)
    @scala.inline
    def setOnStalled(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnSubmit(value: FormEvent[T] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnTagNameChange(
      value: /* tagName */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => Unit
    ): Self = this.set("onTagNameChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTagNameChange: Self = this.set("onTagNameChange", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[T] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[T] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEvent[T] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[T] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[T] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWheel(value: WheelEvent[T] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptimum(value: Double): Self = this.set("optimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimum: Self = this.set("optimum", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", js.undefined)
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcDoc(value: String): Self = this.set("srcDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcDoc: Self = this.set("srcDoc", js.undefined)
    @scala.inline
    def setSrcLang(value: String): Self = this.set("srcLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcLang: Self = this.set("srcLang", js.undefined)
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTagName(value: T): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperClassName: Self = this.set("wrapperClassName", js.undefined)
  }
  
}

