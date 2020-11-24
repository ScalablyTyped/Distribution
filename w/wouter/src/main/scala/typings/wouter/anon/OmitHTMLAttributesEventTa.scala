package typings.wouter.anon

import typings.preact.anon.Html
import typings.preact.jsxMod.JSXInternal.AnimationEventHandler
import typings.preact.jsxMod.JSXInternal.CSSProperties
import typings.preact.jsxMod.JSXInternal.ClipboardEventHandler
import typings.preact.jsxMod.JSXInternal.CompositionEventHandler
import typings.preact.jsxMod.JSXInternal.DragEventHandler
import typings.preact.jsxMod.JSXInternal.FocusEventHandler
import typings.preact.jsxMod.JSXInternal.GenericEventHandler
import typings.preact.jsxMod.JSXInternal.KeyboardEventHandler
import typings.preact.jsxMod.JSXInternal.MouseEventHandler
import typings.preact.jsxMod.JSXInternal.PointerEventHandler
import typings.preact.jsxMod.JSXInternal.TouchEventHandler
import typings.preact.jsxMod.JSXInternal.TransitionEventHandler
import typings.preact.jsxMod.JSXInternal.UIEventHandler
import typings.preact.jsxMod.JSXInternal.WheelEventHandler
import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.Key
import typings.preact.mod.Ref
import typings.std.EventTarget
import typings.wouter.wouterStrings.`lazy`
import typings.wouter.wouterStrings.auto
import typings.wouter.wouterStrings.eager
import typings.wouter.wouterStrings.ltr
import typings.wouter.wouterStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<preact.preact.JSX.HTMLAttributes<std.EventTarget>, 'href'> */
@js.native
trait OmitHTMLAttributesEventTa extends js.Object {
  
  var about: js.UndefOr[String] = js.native
  
  var accept: js.UndefOr[String] = js.native
  
  var acceptCharset: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
  var action: js.UndefOr[String] = js.native
  
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  
  var allowTransparency: js.UndefOr[Boolean] = js.native
  
  var alt: js.UndefOr[String] = js.native
  
  var as: js.UndefOr[String] = js.native
  
  var async: js.UndefOr[Boolean] = js.native
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var autoCorrect: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var autocomplete: js.UndefOr[String] = js.native
  
  var autocorrect: js.UndefOr[String] = js.native
  
  var autofocus: js.UndefOr[Boolean] = js.native
  
  var capture: js.UndefOr[Boolean | String] = js.native
  
  var cellPadding: js.UndefOr[Double | String] = js.native
  
  var cellSpacing: js.UndefOr[Double | String] = js.native
  
  var challenge: js.UndefOr[String] = js.native
  
  var charSet: js.UndefOr[String] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ComponentChildren] = js.native
  
  var `class`: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var cols: js.UndefOr[Double] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var contentEditable: js.UndefOr[Boolean] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var controlsList: js.UndefOr[String] = js.native
  
  var coords: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var dateTime: js.UndefOr[String] = js.native
  
  var default: js.UndefOr[Boolean] = js.native
  
  var defer: js.UndefOr[Boolean] = js.native
  
  var dir: js.UndefOr[auto | rtl | ltr] = js.native
  
  var disableRemotePlayback: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var download: js.UndefOr[js.Any] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var encType: js.UndefOr[String] = js.native
  
  var `for`: js.UndefOr[String] = js.native
  
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
  
  var hrefLang: js.UndefOr[String] = js.native
  
  var htmlFor: js.UndefOr[String] = js.native
  
  var httpEquiv: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inlist: js.UndefOr[js.Any] = js.native
  
  var inputMode: js.UndefOr[String] = js.native
  
  var integrity: js.UndefOr[String] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var jsx: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var keyParams: js.UndefOr[String] = js.native
  
  var keyType: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var list: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[eager | `lazy`] = js.native
  
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
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var muted: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noValidate: js.UndefOr[Boolean] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var onAbort: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onAbortCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[EventTarget]] = js.native
  
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[EventTarget]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[EventTarget]] = js.native
  
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[EventTarget]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[EventTarget]] = js.native
  
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[EventTarget]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[EventTarget]] = js.native
  
  var onBlurCapture: js.UndefOr[FocusEventHandler[EventTarget]] = js.native
  
  var onCanPlay: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onCanPlayCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onCanPlayThrough: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onCanPlayThroughCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onChange: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onChangeCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onClickCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[EventTarget]] = js.native
  
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[EventTarget]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[EventTarget]] = js.native
  
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[EventTarget]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[EventTarget]] = js.native
  
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[EventTarget]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[EventTarget]] = js.native
  
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[EventTarget]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[EventTarget]] = js.native
  
  var onCutCapture: js.UndefOr[ClipboardEventHandler[EventTarget]] = js.native
  
  var onDblClick: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onDblClickCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragEndCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragEnterCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragExitCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragOverCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDragStartCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDropCapture: js.UndefOr[DragEventHandler[EventTarget]] = js.native
  
  var onDurationChange: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onDurationChangeCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onEmptied: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onEmptiedCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onEncrypted: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onEncryptedCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onEnded: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onEndedCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onError: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onErrorCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[EventTarget]] = js.native
  
  var onFocusCapture: js.UndefOr[FocusEventHandler[EventTarget]] = js.native
  
  var onFormData: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onFormDataCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onInput: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onInputCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onInvalid: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onInvalidCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[EventTarget]] = js.native
  
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[EventTarget]] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[EventTarget]] = js.native
  
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[EventTarget]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[EventTarget]] = js.native
  
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[EventTarget]] = js.native
  
  var onLoad: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLoadCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLoadStart: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLoadStartCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLoadedData: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLoadedDataCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLoadedMetadata: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLoadedMetadataCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseEnterCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseLeaveCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[EventTarget]] = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[EventTarget]] = js.native
  
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[EventTarget]] = js.native
  
  var onPause: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onPauseCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onPlay: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onPlayCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onPlaying: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onPlayingCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerDown: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[EventTarget]] = js.native
  
  var onProgress: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onProgressCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onRateChange: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onRateChangeCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onReset: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onResetCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onScroll: js.UndefOr[UIEventHandler[EventTarget]] = js.native
  
  var onScrollCapture: js.UndefOr[UIEventHandler[EventTarget]] = js.native
  
  var onSearch: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSearchCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSeeked: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSeekedCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSeeking: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSeekingCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSelect: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSelectCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onStalled: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onStalledCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSubmit: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSubmitCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSuspend: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onSuspendCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onTimeUpdate: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onTimeUpdateCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onToggle: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[EventTarget]] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[EventTarget]] = js.native
  
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[EventTarget]] = js.native
  
  var onVolumeChange: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onVolumeChangeCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onWaiting: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onWaitingCapture: js.UndefOr[GenericEventHandler[EventTarget]] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[EventTarget]] = js.native
  
  var onWheelCapture: js.UndefOr[WheelEventHandler[EventTarget]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var optimum: js.UndefOr[Double] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var playsInline: js.UndefOr[Boolean] = js.native
  
  var poster: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var preload: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[Ref[EventTarget]] = js.native
  
  var rel: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var sandbox: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var scoped: js.UndefOr[Boolean] = js.native
  
  var scrolling: js.UndefOr[String] = js.native
  
  var seamless: js.UndefOr[Boolean] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var shape: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var span: js.UndefOr[Double] = js.native
  
  var spellcheck: js.UndefOr[Boolean] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var srcDoc: js.UndefOr[String] = js.native
  
  var srcLang: js.UndefOr[String] = js.native
  
  var srcSet: js.UndefOr[String] = js.native
  
  var srcset: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double | String] = js.native
  
  var style: js.UndefOr[String | CSSProperties] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var useMap: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  
  var vocab: js.UndefOr[String] = js.native
  
  var volume: js.UndefOr[String | Double] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var wmode: js.UndefOr[String] = js.native
  
  var wrap: js.UndefOr[String] = js.native
}
object OmitHTMLAttributesEventTa {
  
  @scala.inline
  def apply(): OmitHTMLAttributesEventTa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitHTMLAttributesEventTa]
  }
  
  @scala.inline
  implicit class OmitHTMLAttributesEventTaOps[Self <: OmitHTMLAttributesEventTa] (val x: Self) extends AnyVal {
    
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
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
    def setChildrenVarargs(value: ComponentChild*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ComponentChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Boolean): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
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
    def setControlsList(value: String): Self = this.set("controlsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlsList: Self = this.set("controlsList", js.undefined)
    
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
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setDir(value: auto | rtl | ltr): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDisableRemotePlayback(value: Boolean): Self = this.set("disableRemotePlayback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRemotePlayback: Self = this.set("disableRemotePlayback", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDownload(value: js.Any): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setEncType(value: String): Self = this.set("encType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncType: Self = this.set("encType", js.undefined)
    
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
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
    def setJsx(value: Boolean): Self = this.set("jsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
    
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
    def setLoading(value: eager | `lazy`): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
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
    def setOnAbort(value: GenericEventHandler[EventTarget]): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAbortCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: AnimationEventHandler[EventTarget]): Self = this.set("onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationEndCapture(value: AnimationEventHandler[EventTarget]): Self = this.set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationEndCapture: Self = this.set("onAnimationEndCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: AnimationEventHandler[EventTarget]): Self = this.set("onAnimationIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationIterationCapture(value: AnimationEventHandler[EventTarget]): Self = this.set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationIterationCapture: Self = this.set("onAnimationIterationCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: AnimationEventHandler[EventTarget]): Self = this.set("onAnimationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAnimationStartCapture(value: AnimationEventHandler[EventTarget]): Self = this.set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationStartCapture: Self = this.set("onAnimationStartCapture", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEventHandler[EventTarget]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnBlurCapture(value: FocusEventHandler[EventTarget]): Self = this.set("onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: GenericEventHandler[EventTarget]): Self = this.set("onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: GenericEventHandler[EventTarget]): Self = this.set("onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayThroughCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    
    @scala.inline
    def setOnChange(value: GenericEventHandler[EventTarget]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChangeCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEventHandler[EventTarget]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClickCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: CompositionEventHandler[EventTarget]): Self = this.set("onCompositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionEndCapture(value: CompositionEventHandler[EventTarget]): Self = this.set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionEndCapture: Self = this.set("onCompositionEndCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: CompositionEventHandler[EventTarget]): Self = this.set("onCompositionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionStartCapture(value: CompositionEventHandler[EventTarget]): Self = this.set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionStartCapture: Self = this.set("onCompositionStartCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEventHandler[EventTarget]): Self = this.set("onCompositionUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdateCapture(value: CompositionEventHandler[EventTarget]): Self = this.set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionUpdateCapture: Self = this.set("onCompositionUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: MouseEventHandler[EventTarget]): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnContextMenuCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    
    @scala.inline
    def setOnCopy(value: ClipboardEventHandler[EventTarget]): Self = this.set("onCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCopyCapture(value: ClipboardEventHandler[EventTarget]): Self = this.set("onCopyCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCopyCapture: Self = this.set("onCopyCapture", js.undefined)
    
    @scala.inline
    def setOnCut(value: ClipboardEventHandler[EventTarget]): Self = this.set("onCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnCutCapture(value: ClipboardEventHandler[EventTarget]): Self = this.set("onCutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCutCapture: Self = this.set("onCutCapture", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: MouseEventHandler[EventTarget]): Self = this.set("onDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    
    @scala.inline
    def setOnDblClickCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onDblClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDblClickCapture: Self = this.set("onDblClickCapture", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEventHandler[EventTarget]): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: DragEventHandler[EventTarget]): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEndCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEventHandler[EventTarget]): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragEnterCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEventHandler[EventTarget]): Self = this.set("onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragExitCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragExitCapture: Self = this.set("onDragExitCapture", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEventHandler[EventTarget]): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragLeaveCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEventHandler[EventTarget]): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragOverCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEventHandler[EventTarget]): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragStartCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEventHandler[EventTarget]): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDropCapture(value: DragEventHandler[EventTarget]): Self = this.set("onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: GenericEventHandler[EventTarget]): Self = this.set("onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnDurationChangeCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: GenericEventHandler[EventTarget]): Self = this.set("onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEmptiedCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: GenericEventHandler[EventTarget]): Self = this.set("onEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEncryptedCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEncryptedCapture: Self = this.set("onEncryptedCapture", js.undefined)
    
    @scala.inline
    def setOnEnded(value: GenericEventHandler[EventTarget]): Self = this.set("onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnEndedCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    
    @scala.inline
    def setOnError(value: GenericEventHandler[EventTarget]): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnErrorCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEventHandler[EventTarget]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnFocusCapture(value: FocusEventHandler[EventTarget]): Self = this.set("onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    
    @scala.inline
    def setOnFormData(value: GenericEventHandler[EventTarget]): Self = this.set("onFormData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFormData: Self = this.set("onFormData", js.undefined)
    
    @scala.inline
    def setOnFormDataCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onFormDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFormDataCapture: Self = this.set("onFormDataCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnGotPointerCapture: Self = this.set("onGotPointerCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCaptureCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnGotPointerCaptureCapture: Self = this.set("onGotPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnInput(value: GenericEventHandler[EventTarget]): Self = this.set("onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInputCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: GenericEventHandler[EventTarget]): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnInvalidCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInvalidCapture: Self = this.set("onInvalidCapture", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEventHandler[EventTarget]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownCapture(value: KeyboardEventHandler[EventTarget]): Self = this.set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: KeyboardEventHandler[EventTarget]): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyPressCapture(value: KeyboardEventHandler[EventTarget]): Self = this.set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEventHandler[EventTarget]): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnKeyUpCapture(value: KeyboardEventHandler[EventTarget]): Self = this.set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    
    @scala.inline
    def setOnLoad(value: GenericEventHandler[EventTarget]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: GenericEventHandler[EventTarget]): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadStartCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: GenericEventHandler[EventTarget]): Self = this.set("onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedDataCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: GenericEventHandler[EventTarget]): Self = this.set("onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadataCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLostPointerCapture: Self = this.set("onLostPointerCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCaptureCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLostPointerCaptureCapture: Self = this.set("onLostPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseDownCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseEnterCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnterCapture: Self = this.set("onMouseEnterCapture", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseLeaveCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeaveCapture: Self = this.set("onMouseLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseMoveCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOutCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseOverCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnMouseUpCapture(value: MouseEventHandler[EventTarget]): Self = this.set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    
    @scala.inline
    def setOnPaste(value: ClipboardEventHandler[EventTarget]): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPasteCapture(value: ClipboardEventHandler[EventTarget]): Self = this.set("onPasteCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPasteCapture: Self = this.set("onPasteCapture", js.undefined)
    
    @scala.inline
    def setOnPause(value: GenericEventHandler[EventTarget]): Self = this.set("onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPauseCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    
    @scala.inline
    def setOnPlay(value: GenericEventHandler[EventTarget]): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlayCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: GenericEventHandler[EventTarget]): Self = this.set("onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPlayingCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerCancelCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerDownCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerEnterCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerLeaveCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerMoveCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOutCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerOverCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnPointerUpCapture(value: PointerEventHandler[EventTarget]): Self = this.set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnProgress(value: GenericEventHandler[EventTarget]): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnProgressCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: GenericEventHandler[EventTarget]): Self = this.set("onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnRateChangeCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnReset(value: GenericEventHandler[EventTarget]): Self = this.set("onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnResetCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEventHandler[EventTarget]): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollCapture(value: UIEventHandler[EventTarget]): Self = this.set("onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    
    @scala.inline
    def setOnSearch(value: GenericEventHandler[EventTarget]): Self = this.set("onSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    
    @scala.inline
    def setOnSearchCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onSearchCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSearchCapture: Self = this.set("onSearchCapture", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: GenericEventHandler[EventTarget]): Self = this.set("onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeekedCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: GenericEventHandler[EventTarget]): Self = this.set("onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSeekingCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    
    @scala.inline
    def setOnSelect(value: GenericEventHandler[EventTarget]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnSelectCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    
    @scala.inline
    def setOnStalled(value: GenericEventHandler[EventTarget]): Self = this.set("onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnStalledCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: GenericEventHandler[EventTarget]): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSubmitCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: GenericEventHandler[EventTarget]): Self = this.set("onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnSuspendCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: GenericEventHandler[EventTarget]): Self = this.set("onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTimeUpdateCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnToggle(value: GenericEventHandler[EventTarget]): Self = this.set("onToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchCancelCapture(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchMoveCapture(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTouchStartCapture(value: TouchEventHandler[EventTarget]): Self = this.set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: TransitionEventHandler[EventTarget]): Self = this.set("onTransitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionEndCapture(value: TransitionEventHandler[EventTarget]): Self = this.set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTransitionEndCapture: Self = this.set("onTransitionEndCapture", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: GenericEventHandler[EventTarget]): Self = this.set("onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnVolumeChangeCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: GenericEventHandler[EventTarget]): Self = this.set("onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWaitingCapture(value: GenericEventHandler[EventTarget]): Self = this.set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    
    @scala.inline
    def setOnWheel(value: WheelEventHandler[EventTarget]): Self = this.set("onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOnWheelCapture(value: WheelEventHandler[EventTarget]): Self = this.set("onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
    
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
    def setRefFunction1(value: /* instance */ EventTarget | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[EventTarget]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
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
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    
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
    def setStyle(value: String | CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    
    @scala.inline
    def setVolume(value: String | Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    
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
  }
}
