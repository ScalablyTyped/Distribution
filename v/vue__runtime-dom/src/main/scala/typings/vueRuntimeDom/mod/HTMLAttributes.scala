package typings.vueRuntimeDom.mod

import typings.vueRuntimeDom.vueRuntimeDomStrings.`additions text`
import typings.vueRuntimeDom.vueRuntimeDomStrings.`inline`
import typings.vueRuntimeDom.vueRuntimeDomStrings.additions
import typings.vueRuntimeDom.vueRuntimeDomStrings.all
import typings.vueRuntimeDom.vueRuntimeDomStrings.ascending
import typings.vueRuntimeDom.vueRuntimeDomStrings.assertive
import typings.vueRuntimeDom.vueRuntimeDomStrings.both
import typings.vueRuntimeDom.vueRuntimeDomStrings.copy
import typings.vueRuntimeDom.vueRuntimeDomStrings.date
import typings.vueRuntimeDom.vueRuntimeDomStrings.decimal
import typings.vueRuntimeDom.vueRuntimeDomStrings.descending
import typings.vueRuntimeDom.vueRuntimeDomStrings.dialog
import typings.vueRuntimeDom.vueRuntimeDomStrings.email
import typings.vueRuntimeDom.vueRuntimeDomStrings.execute
import typings.vueRuntimeDom.vueRuntimeDomStrings.grammar
import typings.vueRuntimeDom.vueRuntimeDomStrings.grid
import typings.vueRuntimeDom.vueRuntimeDomStrings.horizontal
import typings.vueRuntimeDom.vueRuntimeDomStrings.inherit
import typings.vueRuntimeDom.vueRuntimeDomStrings.link
import typings.vueRuntimeDom.vueRuntimeDomStrings.list
import typings.vueRuntimeDom.vueRuntimeDomStrings.listbox
import typings.vueRuntimeDom.vueRuntimeDomStrings.location
import typings.vueRuntimeDom.vueRuntimeDomStrings.menu
import typings.vueRuntimeDom.vueRuntimeDomStrings.mixed
import typings.vueRuntimeDom.vueRuntimeDomStrings.move
import typings.vueRuntimeDom.vueRuntimeDomStrings.no
import typings.vueRuntimeDom.vueRuntimeDomStrings.none
import typings.vueRuntimeDom.vueRuntimeDomStrings.numeric
import typings.vueRuntimeDom.vueRuntimeDomStrings.off
import typings.vueRuntimeDom.vueRuntimeDomStrings.on
import typings.vueRuntimeDom.vueRuntimeDomStrings.other
import typings.vueRuntimeDom.vueRuntimeDomStrings.page
import typings.vueRuntimeDom.vueRuntimeDomStrings.polite
import typings.vueRuntimeDom.vueRuntimeDomStrings.popup
import typings.vueRuntimeDom.vueRuntimeDomStrings.removals
import typings.vueRuntimeDom.vueRuntimeDomStrings.search
import typings.vueRuntimeDom.vueRuntimeDomStrings.spelling
import typings.vueRuntimeDom.vueRuntimeDomStrings.step
import typings.vueRuntimeDom.vueRuntimeDomStrings.tel
import typings.vueRuntimeDom.vueRuntimeDomStrings.text
import typings.vueRuntimeDom.vueRuntimeDomStrings.time
import typings.vueRuntimeDom.vueRuntimeDomStrings.tree
import typings.vueRuntimeDom.vueRuntimeDomStrings.url
import typings.vueRuntimeDom.vueRuntimeDomStrings.vertical
import typings.vueRuntimeDom.vueRuntimeDomStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @vue/runtime-dom.@vue/runtime-dom.AriaAttributes */
/* Inlined parent @vue/runtime-dom.@vue/runtime-dom.EventHandlers<@vue/runtime-dom.@vue/runtime-dom.Events> */
trait HTMLAttributes extends StObject {
  
  var about: js.UndefOr[String] = js.undefined
  
  var accesskey: js.UndefOr[String] = js.undefined
  
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Booleanish | mixed] = js.undefined
  
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Booleanish | page | step | location | date | time] = js.undefined
  
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Booleanish | menu | listbox | tree | grid | dialog] = js.undefined
  
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Booleanish | grammar | spelling] = js.undefined
  
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Numberish] = js.undefined
  
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
  
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Booleanish | mixed] = js.undefined
  
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Booleanish] = js.undefined
  
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Numberish] = js.undefined
  
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Numberish] = js.undefined
  
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Numberish] = js.undefined
  
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Numberish] = js.undefined
  
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  var autocapitalize: js.UndefOr[String] = js.undefined
  
  var autocorrect: js.UndefOr[String] = js.undefined
  
  var autosave: js.UndefOr[String] = js.undefined
  
  var `class`: js.UndefOr[Any] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var contenteditable: js.UndefOr[Booleanish | inherit] = js.undefined
  
  var contextmenu: js.UndefOr[String] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Booleanish] = js.undefined
  
  var hidden: js.UndefOr[Booleanish] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[Any] = js.undefined
  
  var innerHTML: js.UndefOr[String] = js.undefined
  
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.undefined
  
  var itemid: js.UndefOr[String] = js.undefined
  
  var itemprop: js.UndefOr[String] = js.undefined
  
  var itemref: js.UndefOr[String] = js.undefined
  
  var itemscope: js.UndefOr[Booleanish] = js.undefined
  
  var itemtype: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var onAbort: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onAnimationend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.AnimationEvent extends (args : any): any ? std.AnimationEvent : (payload : std.AnimationEvent): void */ js.Any
  ] = js.undefined
  
  var onAnimationiteration: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.AnimationEvent extends (args : any): any ? std.AnimationEvent : (payload : std.AnimationEvent): void */ js.Any
  ] = js.undefined
  
  var onAnimationstart: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.AnimationEvent extends (args : any): any ? std.AnimationEvent : (payload : std.AnimationEvent): void */ js.Any
  ] = js.undefined
  
  var onAuxclick: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onBeforeinput: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onBlur: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
  ] = js.undefined
  
  var onCanplay: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onCanplaythrough: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onChange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onClick: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onCompositionend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.CompositionEvent extends (args : any): any ? std.CompositionEvent : (payload : std.CompositionEvent): void */ js.Any
  ] = js.undefined
  
  var onCompositionstart: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.CompositionEvent extends (args : any): any ? std.CompositionEvent : (payload : std.CompositionEvent): void */ js.Any
  ] = js.undefined
  
  var onCompositionupdate: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.CompositionEvent extends (args : any): any ? std.CompositionEvent : (payload : std.CompositionEvent): void */ js.Any
  ] = js.undefined
  
  var onContextmenu: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onCopy: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.ClipboardEvent extends (args : any): any ? std.ClipboardEvent : (payload : std.ClipboardEvent): void */ js.Any
  ] = js.undefined
  
  var onCut: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.ClipboardEvent extends (args : any): any ? std.ClipboardEvent : (payload : std.ClipboardEvent): void */ js.Any
  ] = js.undefined
  
  var onDblclick: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onDrag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDragend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDragenter: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDragexit: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDragleave: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDragover: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDragstart: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDrop: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
  ] = js.undefined
  
  var onDurationchange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onEmptied: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onEncrypted: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onEnded: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onError: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onFocus: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
  ] = js.undefined
  
  var onFocusin: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
  ] = js.undefined
  
  var onFocusout: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
  ] = js.undefined
  
  var onInput: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onInvalid: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onKeydown: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.KeyboardEvent extends (args : any): any ? std.KeyboardEvent : (payload : std.KeyboardEvent): void */ js.Any
  ] = js.undefined
  
  var onKeypress: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.KeyboardEvent extends (args : any): any ? std.KeyboardEvent : (payload : std.KeyboardEvent): void */ js.Any
  ] = js.undefined
  
  var onKeyup: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.KeyboardEvent extends (args : any): any ? std.KeyboardEvent : (payload : std.KeyboardEvent): void */ js.Any
  ] = js.undefined
  
  var onLoad: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onLoadeddata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onLoadedmetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onLoadstart: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onMousedown: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onMouseenter: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onMouseleave: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onMousemove: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onMouseout: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onMouseover: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onMouseup: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
  ] = js.undefined
  
  var onPaste: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.ClipboardEvent extends (args : any): any ? std.ClipboardEvent : (payload : std.ClipboardEvent): void */ js.Any
  ] = js.undefined
  
  var onPause: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onPlay: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onPlaying: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onPointercancel: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onPointerdown: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onPointerenter: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onPointerleave: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onPointermove: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onPointerout: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onPointerover: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onPointerup: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
  ] = js.undefined
  
  var onProgress: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onRatechange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onReset: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onScroll: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.UIEvent extends (args : any): any ? std.UIEvent : (payload : std.UIEvent): void */ js.Any
  ] = js.undefined
  
  var onSeeked: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onSeeking: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onSelect: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onStalled: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onSubmit: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onSuspend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onTimeupdate: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onTouchcancel: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
  ] = js.undefined
  
  var onTouchend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
  ] = js.undefined
  
  var onTouchmove: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
  ] = js.undefined
  
  var onTouchstart: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
  ] = js.undefined
  
  var onTransitionend: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.TransitionEvent extends (args : any): any ? std.TransitionEvent : (payload : std.TransitionEvent): void */ js.Any
  ] = js.undefined
  
  var onTransitionstart: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.TransitionEvent extends (args : any): any ? std.TransitionEvent : (payload : std.TransitionEvent): void */ js.Any
  ] = js.undefined
  
  var onVolumechange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onWaiting: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
  ] = js.undefined
  
  var onWheel: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.WheelEvent extends (args : any): any ? std.WheelEvent : (payload : std.WheelEvent): void */ js.Any
  ] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var radiogroup: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Numberish] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var spellcheck: js.UndefOr[Booleanish] = js.undefined
  
  var style: js.UndefOr[StyleValue] = js.undefined
  
  var tabindex: js.UndefOr[Numberish] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var translate: js.UndefOr[yes | no] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr[on | off] = js.undefined
  
  var vocab: js.UndefOr[String] = js.undefined
}
object HTMLAttributes {
  
  inline def apply(): HTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccesskey(value: String): Self = StObject.set(x, "accesskey", value.asInstanceOf[js.Any])
    
    inline def setAccesskeyUndefined: Self = StObject.set(x, "accesskey", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    inline def `setAria-checked`(value: Booleanish | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    inline def `setAria-colcount`(value: Numberish): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    inline def `setAria-colindex`(value: Numberish): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    inline def `setAria-colspan`(value: Numberish): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-current`(value: Booleanish | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-haspopup`(value: Booleanish | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    inline def `setAria-invalid`(value: Booleanish | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-level`(value: Numberish): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-posinset`(value: Numberish): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    inline def `setAria-pressed`(value: Booleanish | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Numberish): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Numberish): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Numberish): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Numberish): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Numberish): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    inline def `setAria-valuemin`(value: Numberish): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    inline def `setAria-valuenow`(value: Numberish): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutocapitalizeUndefined: Self = StObject.set(x, "autocapitalize", js.undefined)
    
    inline def setAutocorrect(value: String): Self = StObject.set(x, "autocorrect", value.asInstanceOf[js.Any])
    
    inline def setAutocorrectUndefined: Self = StObject.set(x, "autocorrect", js.undefined)
    
    inline def setAutosave(value: String): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
    
    inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
    
    inline def setClass(value: Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContenteditable(value: Booleanish | inherit): Self = StObject.set(x, "contenteditable", value.asInstanceOf[js.Any])
    
    inline def setContenteditableUndefined: Self = StObject.set(x, "contenteditable", js.undefined)
    
    inline def setContextmenu(value: String): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHidden(value: Booleanish): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
    
    inline def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
    
    inline def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
    
    inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemid(value: String): Self = StObject.set(x, "itemid", value.asInstanceOf[js.Any])
    
    inline def setItemidUndefined: Self = StObject.set(x, "itemid", js.undefined)
    
    inline def setItemprop(value: String): Self = StObject.set(x, "itemprop", value.asInstanceOf[js.Any])
    
    inline def setItempropUndefined: Self = StObject.set(x, "itemprop", js.undefined)
    
    inline def setItemref(value: String): Self = StObject.set(x, "itemref", value.asInstanceOf[js.Any])
    
    inline def setItemrefUndefined: Self = StObject.set(x, "itemref", js.undefined)
    
    inline def setItemscope(value: Booleanish): Self = StObject.set(x, "itemscope", value.asInstanceOf[js.Any])
    
    inline def setItemscopeUndefined: Self = StObject.set(x, "itemscope", js.undefined)
    
    inline def setItemtype(value: String): Self = StObject.set(x, "itemtype", value.asInstanceOf[js.Any])
    
    inline def setItemtypeUndefined: Self = StObject.set(x, "itemtype", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOnAbort(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.AnimationEvent extends (args : any): any ? std.AnimationEvent : (payload : std.AnimationEvent): void */ js.Any
    ): Self = StObject.set(x, "onAnimationend", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationendUndefined: Self = StObject.set(x, "onAnimationend", js.undefined)
    
    inline def setOnAnimationiteration(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.AnimationEvent extends (args : any): any ? std.AnimationEvent : (payload : std.AnimationEvent): void */ js.Any
    ): Self = StObject.set(x, "onAnimationiteration", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationiterationUndefined: Self = StObject.set(x, "onAnimationiteration", js.undefined)
    
    inline def setOnAnimationstart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.AnimationEvent extends (args : any): any ? std.AnimationEvent : (payload : std.AnimationEvent): void */ js.Any
    ): Self = StObject.set(x, "onAnimationstart", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationstartUndefined: Self = StObject.set(x, "onAnimationstart", js.undefined)
    
    inline def setOnAuxclick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onAuxclick", value.asInstanceOf[js.Any])
    
    inline def setOnAuxclickUndefined: Self = StObject.set(x, "onAuxclick", js.undefined)
    
    inline def setOnBeforeinput(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onBeforeinput", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeinputUndefined: Self = StObject.set(x, "onBeforeinput", js.undefined)
    
    inline def setOnBlur(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanplay(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onCanplay", value.asInstanceOf[js.Any])
    
    inline def setOnCanplayUndefined: Self = StObject.set(x, "onCanplay", js.undefined)
    
    inline def setOnCanplaythrough(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onCanplaythrough", value.asInstanceOf[js.Any])
    
    inline def setOnCanplaythroughUndefined: Self = StObject.set(x, "onCanplaythrough", js.undefined)
    
    inline def setOnChange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.CompositionEvent extends (args : any): any ? std.CompositionEvent : (payload : std.CompositionEvent): void */ js.Any
    ): Self = StObject.set(x, "onCompositionend", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionendUndefined: Self = StObject.set(x, "onCompositionend", js.undefined)
    
    inline def setOnCompositionstart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.CompositionEvent extends (args : any): any ? std.CompositionEvent : (payload : std.CompositionEvent): void */ js.Any
    ): Self = StObject.set(x, "onCompositionstart", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionstartUndefined: Self = StObject.set(x, "onCompositionstart", js.undefined)
    
    inline def setOnCompositionupdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.CompositionEvent extends (args : any): any ? std.CompositionEvent : (payload : std.CompositionEvent): void */ js.Any
    ): Self = StObject.set(x, "onCompositionupdate", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionupdateUndefined: Self = StObject.set(x, "onCompositionupdate", js.undefined)
    
    inline def setOnContextmenu(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onContextmenu", value.asInstanceOf[js.Any])
    
    inline def setOnContextmenuUndefined: Self = StObject.set(x, "onContextmenu", js.undefined)
    
    inline def setOnCopy(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.ClipboardEvent extends (args : any): any ? std.ClipboardEvent : (payload : std.ClipboardEvent): void */ js.Any
    ): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.ClipboardEvent extends (args : any): any ? std.ClipboardEvent : (payload : std.ClipboardEvent): void */ js.Any
    ): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDblclick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onDblclick", value.asInstanceOf[js.Any])
    
    inline def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
    
    inline def setOnDrag(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDragend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDragend", value.asInstanceOf[js.Any])
    
    inline def setOnDragendUndefined: Self = StObject.set(x, "onDragend", js.undefined)
    
    inline def setOnDragenter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDragenter", value.asInstanceOf[js.Any])
    
    inline def setOnDragenterUndefined: Self = StObject.set(x, "onDragenter", js.undefined)
    
    inline def setOnDragexit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDragexit", value.asInstanceOf[js.Any])
    
    inline def setOnDragexitUndefined: Self = StObject.set(x, "onDragexit", js.undefined)
    
    inline def setOnDragleave(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDragleave", value.asInstanceOf[js.Any])
    
    inline def setOnDragleaveUndefined: Self = StObject.set(x, "onDragleave", js.undefined)
    
    inline def setOnDragover(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDragover", value.asInstanceOf[js.Any])
    
    inline def setOnDragoverUndefined: Self = StObject.set(x, "onDragover", js.undefined)
    
    inline def setOnDragstart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDragstart", value.asInstanceOf[js.Any])
    
    inline def setOnDragstartUndefined: Self = StObject.set(x, "onDragstart", js.undefined)
    
    inline def setOnDrop(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.DragEvent extends (args : any): any ? std.DragEvent : (payload : std.DragEvent): void */ js.Any
    ): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationchange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onDurationchange", value.asInstanceOf[js.Any])
    
    inline def setOnDurationchangeUndefined: Self = StObject.set(x, "onDurationchange", js.undefined)
    
    inline def setOnEmptied(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnFocusin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
    ): Self = StObject.set(x, "onFocusin", value.asInstanceOf[js.Any])
    
    inline def setOnFocusinUndefined: Self = StObject.set(x, "onFocusin", js.undefined)
    
    inline def setOnFocusout(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.FocusEvent extends (args : any): any ? std.FocusEvent : (payload : std.FocusEvent): void */ js.Any
    ): Self = StObject.set(x, "onFocusout", value.asInstanceOf[js.Any])
    
    inline def setOnFocusoutUndefined: Self = StObject.set(x, "onFocusout", js.undefined)
    
    inline def setOnInput(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeydown(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.KeyboardEvent extends (args : any): any ? std.KeyboardEvent : (payload : std.KeyboardEvent): void */ js.Any
    ): Self = StObject.set(x, "onKeydown", value.asInstanceOf[js.Any])
    
    inline def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
    
    inline def setOnKeypress(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.KeyboardEvent extends (args : any): any ? std.KeyboardEvent : (payload : std.KeyboardEvent): void */ js.Any
    ): Self = StObject.set(x, "onKeypress", value.asInstanceOf[js.Any])
    
    inline def setOnKeypressUndefined: Self = StObject.set(x, "onKeypress", js.undefined)
    
    inline def setOnKeyup(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.KeyboardEvent extends (args : any): any ? std.KeyboardEvent : (payload : std.KeyboardEvent): void */ js.Any
    ): Self = StObject.set(x, "onKeyup", value.asInstanceOf[js.Any])
    
    inline def setOnKeyupUndefined: Self = StObject.set(x, "onKeyup", js.undefined)
    
    inline def setOnLoad(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadeddata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onLoadeddata", value.asInstanceOf[js.Any])
    
    inline def setOnLoadeddataUndefined: Self = StObject.set(x, "onLoadeddata", js.undefined)
    
    inline def setOnLoadedmetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onLoadedmetadata", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedmetadataUndefined: Self = StObject.set(x, "onLoadedmetadata", js.undefined)
    
    inline def setOnLoadstart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onLoadstart", value.asInstanceOf[js.Any])
    
    inline def setOnLoadstartUndefined: Self = StObject.set(x, "onLoadstart", js.undefined)
    
    inline def setOnMousedown(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onMousedown", value.asInstanceOf[js.Any])
    
    inline def setOnMousedownUndefined: Self = StObject.set(x, "onMousedown", js.undefined)
    
    inline def setOnMouseenter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onMouseenter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseenterUndefined: Self = StObject.set(x, "onMouseenter", js.undefined)
    
    inline def setOnMouseleave(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onMouseleave", value.asInstanceOf[js.Any])
    
    inline def setOnMouseleaveUndefined: Self = StObject.set(x, "onMouseleave", js.undefined)
    
    inline def setOnMousemove(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onMousemove", value.asInstanceOf[js.Any])
    
    inline def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
    
    inline def setOnMouseout(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onMouseout", value.asInstanceOf[js.Any])
    
    inline def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
    
    inline def setOnMouseover(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onMouseover", value.asInstanceOf[js.Any])
    
    inline def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
    
    inline def setOnMouseup(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.MouseEvent extends (args : any): any ? std.MouseEvent : (payload : std.MouseEvent): void */ js.Any
    ): Self = StObject.set(x, "onMouseup", value.asInstanceOf[js.Any])
    
    inline def setOnMouseupUndefined: Self = StObject.set(x, "onMouseup", js.undefined)
    
    inline def setOnPaste(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.ClipboardEvent extends (args : any): any ? std.ClipboardEvent : (payload : std.ClipboardEvent): void */ js.Any
    ): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointercancel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointercancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointercancelUndefined: Self = StObject.set(x, "onPointercancel", js.undefined)
    
    inline def setOnPointerdown(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointerdown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerdownUndefined: Self = StObject.set(x, "onPointerdown", js.undefined)
    
    inline def setOnPointerenter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointerenter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerenterUndefined: Self = StObject.set(x, "onPointerenter", js.undefined)
    
    inline def setOnPointerleave(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointerleave", value.asInstanceOf[js.Any])
    
    inline def setOnPointerleaveUndefined: Self = StObject.set(x, "onPointerleave", js.undefined)
    
    inline def setOnPointermove(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointermove", value.asInstanceOf[js.Any])
    
    inline def setOnPointermoveUndefined: Self = StObject.set(x, "onPointermove", js.undefined)
    
    inline def setOnPointerout(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointerout", value.asInstanceOf[js.Any])
    
    inline def setOnPointeroutUndefined: Self = StObject.set(x, "onPointerout", js.undefined)
    
    inline def setOnPointerover(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointerover", value.asInstanceOf[js.Any])
    
    inline def setOnPointeroverUndefined: Self = StObject.set(x, "onPointerover", js.undefined)
    
    inline def setOnPointerup(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.PointerEvent extends (args : any): any ? std.PointerEvent : (payload : std.PointerEvent): void */ js.Any
    ): Self = StObject.set(x, "onPointerup", value.asInstanceOf[js.Any])
    
    inline def setOnPointerupUndefined: Self = StObject.set(x, "onPointerup", js.undefined)
    
    inline def setOnProgress(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRatechange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onRatechange", value.asInstanceOf[js.Any])
    
    inline def setOnRatechangeUndefined: Self = StObject.set(x, "onRatechange", js.undefined)
    
    inline def setOnReset(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.UIEvent extends (args : any): any ? std.UIEvent : (payload : std.UIEvent): void */ js.Any
    ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeupdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onTimeupdate", value.asInstanceOf[js.Any])
    
    inline def setOnTimeupdateUndefined: Self = StObject.set(x, "onTimeupdate", js.undefined)
    
    inline def setOnTouchcancel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
    ): Self = StObject.set(x, "onTouchcancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchcancelUndefined: Self = StObject.set(x, "onTouchcancel", js.undefined)
    
    inline def setOnTouchend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
    ): Self = StObject.set(x, "onTouchend", value.asInstanceOf[js.Any])
    
    inline def setOnTouchendUndefined: Self = StObject.set(x, "onTouchend", js.undefined)
    
    inline def setOnTouchmove(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
    ): Self = StObject.set(x, "onTouchmove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchmoveUndefined: Self = StObject.set(x, "onTouchmove", js.undefined)
    
    inline def setOnTouchstart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.TouchEvent extends (args : any): any ? std.TouchEvent : (payload : std.TouchEvent): void */ js.Any
    ): Self = StObject.set(x, "onTouchstart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchstartUndefined: Self = StObject.set(x, "onTouchstart", js.undefined)
    
    inline def setOnTransitionend(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.TransitionEvent extends (args : any): any ? std.TransitionEvent : (payload : std.TransitionEvent): void */ js.Any
    ): Self = StObject.set(x, "onTransitionend", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionendUndefined: Self = StObject.set(x, "onTransitionend", js.undefined)
    
    inline def setOnTransitionstart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.TransitionEvent extends (args : any): any ? std.TransitionEvent : (payload : std.TransitionEvent): void */ js.Any
    ): Self = StObject.set(x, "onTransitionstart", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionstartUndefined: Self = StObject.set(x, "onTransitionstart", js.undefined)
    
    inline def setOnVolumechange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onVolumechange", value.asInstanceOf[js.Any])
    
    inline def setOnVolumechangeUndefined: Self = StObject.set(x, "onVolumechange", js.undefined)
    
    inline def setOnWaiting(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Event extends (args : any): any ? std.Event : (payload : std.Event): void */ js.Any
    ): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.WheelEvent extends (args : any): any ? std.WheelEvent : (payload : std.WheelEvent): void */ js.Any
    ): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadiogroup(value: String): Self = StObject.set(x, "radiogroup", value.asInstanceOf[js.Any])
    
    inline def setRadiogroupUndefined: Self = StObject.set(x, "radiogroup", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Numberish): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSpellcheck(value: Booleanish): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setStyle(value: StyleValue): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Any*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setTabindex(value: Numberish): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
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
