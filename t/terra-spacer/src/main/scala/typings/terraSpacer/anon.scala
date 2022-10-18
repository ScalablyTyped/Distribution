package typings.terraSpacer

import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
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
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.terraSpacer.libSpacerMod.SpacerSizes
import typings.terraSpacer.terraSpacerStrings.`additions removals`
import typings.terraSpacer.terraSpacerStrings.`additions text`
import typings.terraSpacer.terraSpacerStrings.`inline`
import typings.terraSpacer.terraSpacerStrings.`removals additions`
import typings.terraSpacer.terraSpacerStrings.`removals text`
import typings.terraSpacer.terraSpacerStrings.`small-1`
import typings.terraSpacer.terraSpacerStrings.`small-2`
import typings.terraSpacer.terraSpacerStrings.`text additions`
import typings.terraSpacer.terraSpacerStrings.`text removals`
import typings.terraSpacer.terraSpacerStrings.additions
import typings.terraSpacer.terraSpacerStrings.all
import typings.terraSpacer.terraSpacerStrings.ascending
import typings.terraSpacer.terraSpacerStrings.assertive
import typings.terraSpacer.terraSpacerStrings.both
import typings.terraSpacer.terraSpacerStrings.copy
import typings.terraSpacer.terraSpacerStrings.date
import typings.terraSpacer.terraSpacerStrings.decimal
import typings.terraSpacer.terraSpacerStrings.descending
import typings.terraSpacer.terraSpacerStrings.dialog
import typings.terraSpacer.terraSpacerStrings.email
import typings.terraSpacer.terraSpacerStrings.execute
import typings.terraSpacer.terraSpacerStrings.grammar
import typings.terraSpacer.terraSpacerStrings.grid
import typings.terraSpacer.terraSpacerStrings.horizontal
import typings.terraSpacer.terraSpacerStrings.inherit
import typings.terraSpacer.terraSpacerStrings.large
import typings.terraSpacer.terraSpacerStrings.largePlussign1
import typings.terraSpacer.terraSpacerStrings.largePlussign2
import typings.terraSpacer.terraSpacerStrings.largePlussign3
import typings.terraSpacer.terraSpacerStrings.largePlussign4
import typings.terraSpacer.terraSpacerStrings.link
import typings.terraSpacer.terraSpacerStrings.list
import typings.terraSpacer.terraSpacerStrings.listbox
import typings.terraSpacer.terraSpacerStrings.location
import typings.terraSpacer.terraSpacerStrings.medium
import typings.terraSpacer.terraSpacerStrings.menu
import typings.terraSpacer.terraSpacerStrings.mixed
import typings.terraSpacer.terraSpacerStrings.move
import typings.terraSpacer.terraSpacerStrings.no
import typings.terraSpacer.terraSpacerStrings.none
import typings.terraSpacer.terraSpacerStrings.numeric
import typings.terraSpacer.terraSpacerStrings.off
import typings.terraSpacer.terraSpacerStrings.on
import typings.terraSpacer.terraSpacerStrings.other
import typings.terraSpacer.terraSpacerStrings.page
import typings.terraSpacer.terraSpacerStrings.polite
import typings.terraSpacer.terraSpacerStrings.popup
import typings.terraSpacer.terraSpacerStrings.removals
import typings.terraSpacer.terraSpacerStrings.search
import typings.terraSpacer.terraSpacerStrings.small
import typings.terraSpacer.terraSpacerStrings.spelling
import typings.terraSpacer.terraSpacerStrings.step
import typings.terraSpacer.terraSpacerStrings.tel
import typings.terraSpacer.terraSpacerStrings.text
import typings.terraSpacer.terraSpacerStrings.time
import typings.terraSpacer.terraSpacerStrings.tree
import typings.terraSpacer.terraSpacerStrings.url
import typings.terraSpacer.terraSpacerStrings.vertical
import typings.terraSpacer.terraSpacerStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<terra-spacer.terra-spacer/lib/Spacer.SpacerProps> */
  trait PartialSpacerProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var isInlineBlock: js.UndefOr[Boolean] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ] = js.undefined
    
    var marginBottom: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var marginLeft: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var marginRight: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var marginTop: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.undefined
    
    var padding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ] = js.undefined
    
    var paddingBottom: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var paddingLeft: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var paddingRight: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var paddingTop: js.UndefOr[
        largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object PartialSpacerProps {
    
    inline def apply(): PartialSpacerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSpacerProps]
    }
    
    extension [Self <: PartialSpacerProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
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
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
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
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
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
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
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
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsInlineBlock(value: Boolean): Self = StObject.set(x, "isInlineBlock", value.asInstanceOf[js.Any])
      
      inline def setIsInlineBlockUndefined: Self = StObject.set(x, "isInlineBlock", js.undefined)
      
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
      
      inline def setMargin(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand */ Any
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(
        value: largePlussign2 | `small-2` | `small-1` | none | large | medium | small | largePlussign4 | largePlussign3 | largePlussign1
      ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  trait Sizes extends StObject {
    
    var Sizes: SpacerSizes
  }
  object Sizes {
    
    inline def apply(Sizes: SpacerSizes): Sizes = {
      val __obj = js.Dynamic.literal(Sizes = Sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sizes]
    }
    
    extension [Self <: Sizes](x: Self) {
      
      inline def setSizes(value: SpacerSizes): Self = StObject.set(x, "Sizes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.WeakValidationMap<terra-spacer.terra-spacer/lib/Spacer.SpacerProps> */
  trait WeakValidationMapSpacerPr extends StObject {
    
    var about: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var accessKey: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-atomic`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'inline' | 'list' | 'both' | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | null | undefined> : undefined extends 'none' | 'inline' | 'list' | 'both' | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | null | undefined> : react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-busy`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-checked`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-colcount`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-colindex`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-colspan`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-controls`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-current`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-describedby`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-details`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-disabled`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | null | undefined> : undefined extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | null | undefined> : react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-expanded`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-flowto`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-hidden`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-invalid`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-label`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-level`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-live`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'off' | 'assertive' | 'polite' | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | null | undefined> : undefined extends 'off' | 'assertive' | 'polite' | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | null | undefined> : react.react.Validator<'off' | 'assertive' | 'polite' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-modal`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-multiline`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-orientation`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'horizontal' | 'vertical' | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | null | undefined> : undefined extends 'horizontal' | 'vertical' | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | null | undefined> : react.react.Validator<'horizontal' | 'vertical' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-owns`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-posinset`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-pressed`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-readonly`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | null | undefined> : undefined extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | null | undefined> : react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-selected`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-setsize`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-sort`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'ascending' | 'descending' | 'other' | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | null | undefined> : undefined extends 'none' | 'ascending' | 'descending' | 'other' | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | null | undefined> : react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var autoCapitalize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var autoCorrect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var autoSave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ] = js.undefined
    
    var className: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var contentEditable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | 'inherit' | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | null | undefined> : undefined extends react.react.Booleanish | 'inherit' | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | 'inherit' | undefined> */ js.Any
      ] = js.undefined
    
    var contextMenu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.anon.Html | undefined ? react.react.Validator<react.anon.Html | undefined | null | undefined> : undefined extends react.anon.Html | undefined ? react.react.Validator<react.anon.Html | undefined | null | undefined> : react.react.Validator<react.anon.Html | undefined> */ js.Any
      ] = js.undefined
    
    var datatype: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var defaultChecked: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var defaultValue: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | number | std.ReadonlyArray<string> | undefined ? react.react.Validator<string | number | std.ReadonlyArray<string> | undefined | null | undefined> : undefined extends string | number | std.ReadonlyArray<string> | undefined ? react.react.Validator<string | number | std.ReadonlyArray<string> | undefined | null | undefined> : react.react.Validator<string | number | std.ReadonlyArray<string> | undefined> */ js.Any
      ] = js.undefined
    
    var dir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var draggable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var hidden: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var id: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var inlist: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : undefined extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : react.react.Validator<any | undefined> */ js.Any
      ] = js.undefined
    
    var inputMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | null | undefined> : undefined extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | null | undefined> : react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined> */ js.Any
      ] = js.undefined
    
    var is: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var isInlineBlock: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var itemID: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var itemProp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var itemRef: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var itemScope: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var itemType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var lang: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var margin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : undefined extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined> */ js.Any
      ] = js.undefined
    
    var marginBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var marginLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var marginRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var marginTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var onAbort: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onAnimationEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onAnimationIteration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onAnimationStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onAuxClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onBeforeInput: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onBlur: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCanPlay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCompositionEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCompositionStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onContextMenu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCopy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onCut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDoubleClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDrag: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDragEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDragEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDragExit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDragLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDragOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDragStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDrop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onDurationChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onEmptied: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onEncrypted: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onEnded: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onError: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onInput: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onInvalid: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onLoad: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onLoadStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onLoadedData: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseOut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onMouseUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPaste: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPause: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPlay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPlaying: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerCancel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerOut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onPointerUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onProgress: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onRateChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onReset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onScroll: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.UIEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.UIEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.UIEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onSeeked: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onSeeking: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onStalled: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onSubmit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onSuspend: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onTimeUpdate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchCancel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onTouchStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onTransitionEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TransitionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TransitionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TransitionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onVolumeChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onWaiting: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var onWheel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.WheelEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.WheelEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.WheelEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ] = js.undefined
    
    var padding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : undefined extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined> */ js.Any
      ] = js.undefined
    
    var paddingBottom: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var paddingLeft: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var paddingRight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var paddingTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ] = js.undefined
    
    var placeholder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var prefix: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var property: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var radioGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var resource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var results: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var role: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AriaRole | undefined ? react.react.Validator<react.react.AriaRole | undefined | null | undefined> : undefined extends react.react.AriaRole | undefined ? react.react.Validator<react.react.AriaRole | undefined | null | undefined> : react.react.Validator<react.react.AriaRole | undefined> */ js.Any
      ] = js.undefined
    
    var security: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var slot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var spellCheck: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : undefined extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : react.react.Validator<react.react.CSSProperties | undefined> */ js.Any
      ] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var tabIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ] = js.undefined
    
    var title: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var translate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'yes' | 'no' | undefined ? react.react.Validator<'yes' | 'no' | undefined | null | undefined> : undefined extends 'yes' | 'no' | undefined ? react.react.Validator<'yes' | 'no' | undefined | null | undefined> : react.react.Validator<'yes' | 'no' | undefined> */ js.Any
      ] = js.undefined
    
    var typeof: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var unselectable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'on' | 'off' | undefined ? react.react.Validator<'on' | 'off' | undefined | null | undefined> : undefined extends 'on' | 'off' | undefined ? react.react.Validator<'on' | 'off' | undefined | null | undefined> : react.react.Validator<'on' | 'off' | undefined> */ js.Any
      ] = js.undefined
    
    var vocab: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
  }
  object WeakValidationMapSpacerPr {
    
    inline def apply(): WeakValidationMapSpacerPr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapSpacerPr]
    }
    
    extension [Self <: WeakValidationMapSpacerPr](x: Self) {
      
      inline def setAbout(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def `setAria-activedescendant`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'inline' | 'list' | 'both' | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | null | undefined> : undefined extends 'none' | 'inline' | 'list' | 'both' | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | null | undefined> : react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | null | undefined> : undefined extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | null | undefined> : react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'off' | 'assertive' | 'polite' | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | null | undefined> : undefined extends 'off' | 'assertive' | 'polite' | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | null | undefined> : react.react.Validator<'off' | 'assertive' | 'polite' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'horizontal' | 'vertical' | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | null | undefined> : undefined extends 'horizontal' | 'vertical' | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | null | undefined> : react.react.Validator<'horizontal' | 'vertical' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | null | undefined> : undefined extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | null | undefined> : react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'ascending' | 'descending' | 'other' | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | null | undefined> : undefined extends 'none' | 'ascending' | 'descending' | 'other' | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | null | undefined> : react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | 'inherit' | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | null | undefined> : undefined extends react.react.Booleanish | 'inherit' | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | 'inherit' | undefined> */ js.Any
      ): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.anon.Html | undefined ? react.react.Validator<react.anon.Html | undefined | null | undefined> : undefined extends react.anon.Html | undefined ? react.react.Validator<react.anon.Html | undefined | null | undefined> : react.react.Validator<react.anon.Html | undefined> */ js.Any
      ): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | number | std.ReadonlyArray<string> | undefined ? react.react.Validator<string | number | std.ReadonlyArray<string> | undefined | null | undefined> : undefined extends string | number | std.ReadonlyArray<string> | undefined ? react.react.Validator<string | number | std.ReadonlyArray<string> | undefined | null | undefined> : react.react.Validator<string | number | std.ReadonlyArray<string> | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDir(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setHidden(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : undefined extends any | undefined ? react.react.Validator<any | undefined | null | undefined> : react.react.Validator<any | undefined> */ js.Any
      ): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | null | undefined> : undefined extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | null | undefined> : react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined> */ js.Any
      ): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsInlineBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "isInlineBlock", value.asInstanceOf[js.Any])
      
      inline def setIsInlineBlockUndefined: Self = StObject.set(x, "isInlineBlock", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : undefined extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined> */ js.Any
      ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnAbort(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThrough(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.UIEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.UIEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.UIEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TransitionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.TransitionEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.TransitionEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.WheelEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLDivElement> | undefined | null | undefined> : undefined extends react.react.WheelEventHandler<std.HTMLDivElement> | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLDivElement> | undefined | null | undefined> : react.react.Validator<react.react.WheelEventHandler<std.HTMLDivElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : undefined extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined ? react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined | null | undefined> : react.react.Validator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpacerShorthand * / any | undefined> */ js.Any
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : undefined extends 'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined ? react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined | null | undefined> : react.react.Validator<'large+2' | 'small-2' | 'small-1' | 'none' | 'large' | 'medium' | 'small' | 'large+4' | 'large+3' | 'large+1' | undefined> */ js.Any
      ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPlaceholder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setResource(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AriaRole | undefined ? react.react.Validator<react.react.AriaRole | undefined | null | undefined> : undefined extends react.react.AriaRole | undefined ? react.react.Validator<react.react.AriaRole | undefined | null | undefined> : react.react.Validator<react.react.AriaRole | undefined> */ js.Any
      ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined ? react.react.Validator<react.react.Booleanish | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined> */ js.Any
      ): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : undefined extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : react.react.Validator<react.react.CSSProperties | undefined> */ js.Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : undefined extends number | undefined ? react.react.Validator<number | undefined | null | undefined> : react.react.Validator<number | undefined> */ js.Any
      ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'yes' | 'no' | undefined ? react.react.Validator<'yes' | 'no' | undefined | null | undefined> : undefined extends 'yes' | 'no' | undefined ? react.react.Validator<'yes' | 'no' | undefined | null | undefined> : react.react.Validator<'yes' | 'no' | undefined> */ js.Any
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'on' | 'off' | undefined ? react.react.Validator<'on' | 'off' | undefined | null | undefined> : undefined extends 'on' | 'off' | undefined ? react.react.Validator<'on' | 'off' | undefined | null | undefined> : react.react.Validator<'on' | 'off' | undefined> */ js.Any
      ): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
}
