package typings.wordpressComponents.menuItemMod.MenuItem

import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.popoverMod.Popover.Position
import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typings.wordpressComponents.wordpressComponentsStrings.`additions text`
import typings.wordpressComponents.wordpressComponentsStrings.`inline`
import typings.wordpressComponents.wordpressComponentsStrings.additions
import typings.wordpressComponents.wordpressComponentsStrings.all
import typings.wordpressComponents.wordpressComponentsStrings.ascending
import typings.wordpressComponents.wordpressComponentsStrings.assertive
import typings.wordpressComponents.wordpressComponentsStrings.both
import typings.wordpressComponents.wordpressComponentsStrings.copy
import typings.wordpressComponents.wordpressComponentsStrings.date
import typings.wordpressComponents.wordpressComponentsStrings.decimal
import typings.wordpressComponents.wordpressComponentsStrings.descending
import typings.wordpressComponents.wordpressComponentsStrings.dialog
import typings.wordpressComponents.wordpressComponentsStrings.email
import typings.wordpressComponents.wordpressComponentsStrings.execute
import typings.wordpressComponents.wordpressComponentsStrings.grammar
import typings.wordpressComponents.wordpressComponentsStrings.grid
import typings.wordpressComponents.wordpressComponentsStrings.horizontal
import typings.wordpressComponents.wordpressComponentsStrings.inherit
import typings.wordpressComponents.wordpressComponentsStrings.link
import typings.wordpressComponents.wordpressComponentsStrings.list
import typings.wordpressComponents.wordpressComponentsStrings.listbox
import typings.wordpressComponents.wordpressComponentsStrings.location
import typings.wordpressComponents.wordpressComponentsStrings.menu
import typings.wordpressComponents.wordpressComponentsStrings.mixed
import typings.wordpressComponents.wordpressComponentsStrings.move
import typings.wordpressComponents.wordpressComponentsStrings.no
import typings.wordpressComponents.wordpressComponentsStrings.none
import typings.wordpressComponents.wordpressComponentsStrings.numeric
import typings.wordpressComponents.wordpressComponentsStrings.off
import typings.wordpressComponents.wordpressComponentsStrings.on
import typings.wordpressComponents.wordpressComponentsStrings.other
import typings.wordpressComponents.wordpressComponentsStrings.page
import typings.wordpressComponents.wordpressComponentsStrings.polite
import typings.wordpressComponents.wordpressComponentsStrings.popup
import typings.wordpressComponents.wordpressComponentsStrings.removals
import typings.wordpressComponents.wordpressComponentsStrings.search
import typings.wordpressComponents.wordpressComponentsStrings.spelling
import typings.wordpressComponents.wordpressComponentsStrings.step
import typings.wordpressComponents.wordpressComponentsStrings.tel
import typings.wordpressComponents.wordpressComponentsStrings.text
import typings.wordpressComponents.wordpressComponentsStrings.time
import typings.wordpressComponents.wordpressComponentsStrings.tree
import typings.wordpressComponents.wordpressComponentsStrings.url
import typings.wordpressComponents.wordpressComponentsStrings.vertical
import typings.wordpressComponents.wordpressComponentsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@wordpress/components.@wordpress/components/icon-button.default.Props> */
trait Props extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var acceptCharset: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
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
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
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
  var as: js.UndefOr[String] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  var challenge: js.UndefOr[String] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var cite: js.UndefOr[String] = js.undefined
  var classID: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var coords: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var dateTime: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Icon | Element] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /**
    * Text to use as description for button text.
    */
  var info: js.UndefOr[ReactNode] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var isBusy: js.UndefOr[Boolean] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var isDestructive: js.UndefOr[Boolean] = js.undefined
  var isLarge: js.UndefOr[Boolean] = js.undefined
  var isLink: js.UndefOr[Boolean] = js.undefined
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the menu item is currently selected.
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var isSmall: js.UndefOr[Boolean] = js.undefined
  var isTertiary: js.UndefOr[Boolean] = js.undefined
  var isToggled: js.UndefOr[Boolean] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var keyParams: js.UndefOr[String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[Position] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var manifest: js.UndefOr[String] = js.undefined
  var marginHeight: js.UndefOr[Double] = js.undefined
  var marginWidth: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var optimum: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[LegacyRef[HTMLButtonElement]] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var shortcut: js.UndefOr[ShortcutType] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var srcLang: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

