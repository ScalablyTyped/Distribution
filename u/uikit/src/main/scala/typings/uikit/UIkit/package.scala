package typings.uikit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UIkit {
  import typings.jquery.JQuery
  import typings.std.HTMLElement

  /**
    * Create a list of items, allowing each item's content to be expanded and collapsed by clicking its header.
    * Documentation {@link http://getuikit.org/docs/accordion.html}
    * <h2>Events</h2>
    * <table class="uk-table uk-table-striped uk-text-nowrap">
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>toggle.uk.accordion</code></td>
    * <td>event, active, toggle, content</td>
    * <td>On item toggle</td>
    * </tr>
    * </table>
    */
  type Accordion = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ AccordionOptions, js.Any]
  /**
    * Create inputs that allow users to choose from a list of pre-generated values while typing
    * Documentation {@link http://getuikit.org/docs/autocomplete.html}
    * <h2>Events</h2>
    * <table>
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>selectitem.uk.autocomplete</code></td>
    * <td>event, data, acobject</td>
    * <td>On item selected</td>
    * </tr>
    * <tr>
    * <td><code>show.uk.autocomplete</code></td>
    * <td>event</td>
    * <td>On autocomplete dropdown show</td>
    * </tr>
    * </table>
    */
  type AutoComplete = js.Function2[
    /* element */ String | JQuery[HTMLElement], 
    /* options */ js.UndefOr[AutoCompleteOptions], 
    js.Any
  ]
  type CallbackAutoComplete = js.Function0[String]
  /**
    * Create a toggleable dropdown with an datepicker
    * Documentation {@link http://getuikit.org/docs/datepicker.html}
    * <h2>Events</h2>
    * <table>
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>show.uk.datepicker</code></td>
    * <td>event</td>
    * <td>On datepicker dropdown show</td>
    * </tr>
    * <tr>
    * <td><code>hide.uk.datepicker</code></td>
    * <td>event</td>
    * <td>On datepicker dropdown hide</td>
    * </tr>
    * <tr>
    * <td><code>update.uk.datepicker</code></td>
    * <td>event</td>
    * <td>On calendar rendering</td>
    * </tr>
    * </table>
    */
  type DatePicker = js.Function2[
    /* element */ String | JQuery[HTMLElement], 
    /* options */ js.UndefOr[DatePickerOptions], 
    js.Any
  ]
  /**
    * Create a toggleable dropdown with different styles
    * Documentation: {@link http://getuikit.org/docs/dropdown.html}
    *
    * Events:
    * Name               Description
    * show.uk.dropdown   Triggered on dropdown show
    * hide.uk.dropdown   Triggered on dropdown hide
    * stack.uk.dropdown  Triggered when a dropdown stacks to fit into screen
    */
  type Dropdown = js.Function2[
    /* selector */ String | JQuery[HTMLElement], 
    /* options */ js.UndefOr[DropdownOptions], 
    DropdownElement
  ]
  /**
    * Create a rich HTML or markdown editor with an immediate preview and syntax highlighting
    * Documentation {@link http://getuikit.org/docs/htmleditor.html}
    */
  type HtmlEditor = js.Function2[
    /* element */ String | JQuery[HTMLElement], 
    /* options */ js.UndefOr[HtmlEditorOptions], 
    js.Any
  ]
  /**
    * Create nestable lists that can be sorted by drag and drop.
    * Documentation {@link http://getuikit.org/docs/nestable.html}
    * <h2>Events</h2>
    * <table>
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>start.uk.nestable</code></td>
    * <td>event, nestable object</td>
    * <td>On nestable drag start</td>
    * </tr>
    * <tr>
    * <td><code>move.uk.nestable</code></td>
    * <td>event, nestable object</td>
    * <td>On nestable move item</td>
    * </tr>
    * <tr>
    * <td><code>stop.uk.nestable</code></td>
    * <td>event, nestable object</td>
    * <td>On nestable stop dragging</td>
    * </tr>
    * <tr>
    * <td><code>change.uk.nestable</code></td>
    * <td>event, sortable object, dragged element, action</td>
    * <td>On nestable change item</td>
    * </tr>
    * </table>
    */
  type Nestable = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ NestableOptions, js.Any]
  /**
    * Animate CSS properties depending on the scroll position of the document.
    * Documentation {@link http://getuikit.org/docs/parallax.html}
    */
  type Parallax = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ ParallaxOptions, js.Any]
  /**
    * Easily create a nicely looking search.
    * Documentation {@link http://getuikit.org/docs/search.html}
    */
  type Search = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ SearchOptions, js.Any]
  /**
    * Create sets and groups of items, allowing to loop through the sets.
    * Documentation {@link http://getuikit.org/docs/slideset.html}
    * <h2>Events</h2>
    * <table>
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>show.uk.slideset</code></td>
    * <td>event, set</td>
    * <td>On set show</td>
    * </tr>
    * </table>
    */
  type SlideSet = js.Function2[
    /* element */ String | JQuery[HTMLElement], 
    /* options */ js.UndefOr[SlideSetOptions], 
    js.Any
  ]
  /**
    * Create a responsive image or video slideshow with stunning transition effects, fullscreen mode and overlays.
    * Documentation {@link http://getuikit.org/docs/slideshow.html}
    * <h2>Events</h2>
    * <table>
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>show.uk.slideshow</code></td>
    * <td>event, next slide</td>
    * <td>On showing a new slide (after animation is finished)</td>
    * </tr>
    * </table>
    */
  type SlideShow = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ SlideShowOptions, js.Any]
  /**
    * Create a list of items to use as a responsive carousel slider
    * Documentation {@link http://getuikit.org/docs/slider.html}
    * <h2>Events</h2>
    * <table class="uk-table uk-table-striped uk-text-nowrap">
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>focusitem.uk.slider</code></td>
    * <td>event, index, item</td>
    * <td>On item focus</td>
    * </tr>
    * </table>
    */
  type Slider = js.Function2[
    /* element */ String | JQuery[HTMLElement], 
    /* options */ js.UndefOr[SliderOptions], 
    js.Any
  ]
  /**
    * Create sortable grids and lists to rearrange the order of its elements.
    * Documentation {@link http://getuikit.org/docs/sortable.html}
    * <h2>Events</h2>
    * <table class="uk-table uk-table-striped uk-text-nowrap">
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>start.uk.sortable</code></td>
    * <td>event, sortable object, dragged element</td>
    * <td>On sortable drag start</td>
    * </tr>
    * <tr>
    * <td><code>move.uk.sortable</code></td>
    * <td>event, sortable object</td>
    * <td>On sortable move item</td>
    * </tr>
    * <tr>
    * <td><code>stop.uk.sortable</code></td>
    * <td>event, sortable object, dragged element</td>
    * <td>On sortable stop dragging</td>
    * </tr>
    * <tr>
    * <td><code>change.uk.sortable</code></td>
    * <td>event, sortable object, dragged element, action</td>
    * <td>On sortable change item</td>
    * </tr>
    * </table>
    */
  type Sortable = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ SortableOptions, js.Any]
  /**
    * Make elements remain at the top of the viewport, like a sticky navbar.
    * Documentation {@link http://getuikit.org/docs/sticky.html}
    * <h2>Events</h2>
    * <table class="uk-table uk-table-striped uk-text-nowrap">
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * <th>Description</th>
    * </tr>
    * <tr>
    * <td><code>active.uk.sticky</code></td>
    * <td>event</td>
    * <td>Element getting sticky</td>
    * </tr>
    * <tr>
    * <td><code>inactive.uk.sticky</code></td>
    * <td>event</td>
    * <td>Element leaving sticky mode</td>
    * </tr>
    * </table>
    */
  type Sticky = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ StickyOptions, js.Any]
  /**
    * Create a timepicker which can easily be used by selecting a time value from a pre filled dropdown.
    * Documentation {@link http://getuikit.org/docs/timepicker.html}
    */
  type Timepicker = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ TimepickerOptions, js.Any]
  /**
    * Easily create a nicely looking tooltip.
    * Documentation {@link http://getuikit.org/docs/tooltip.html}
    */
  type Tooltip = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ TooltipOptions, js.Any]
  /**
    * Allow users to upload files through a file input form element or a placeholder area.
    * Documentation {@link http://getuikit.org/docs/upload.html}
    * <h2>Callbacks</h2>
    * <table class="uk-table uk-table-striped">
    * <tr>
    * <th>Name</th>
    * <th>Parameter</th>
    * </tr>
    * <tr>
    * <td><code>before</code></td>
    * <td>settings, files</td>
    * </tr>
    * <tr>
    * <td><code>beforeAll</code></td>
    * <td>files</td>
    * </tr>
    * <tr>
    * <td><code>beforeSend</code></td>
    * <td>xhr</td>
    * </tr>
    * <tr>
    * <td><code>progress</code></td>
    * <td>percent</td>
    * </tr>
    * <tr>
    * <td><code>complete</code></td>
    * <td>response, xhr</td>
    * </tr>
    * <tr>
    * <td><code>allcomplete</code></td>
    * <td>response, xhr</td>
    * </tr>
    * <tr>
    * <td><code>notallowed</code></td>
    * <td>file, settings</td>
    * </tr>
    * <tr>
    * <td><code>loadstart</code></td>
    * <td>event</td>
    * </tr>
    * <tr>
    * <td><code>load</code></td>
    * <td>event</td>
    * </tr>
    * <tr>
    * <td><code>loadend</code></td>
    * <td>event</td>
    * </tr>
    * <tr>
    * <td><code>error</code></td>
    * <td>event</td>
    * </tr>
    * <tr>
    * <td><code>abort</code></td>
    * <td>event</td>
    * </tr>
    * <tr>
    * <td><code>readystatechange</code></td>
    * <td>event</td>
    * </tr>
    * </table>
    */
  type Upload = js.Function2[/* element */ String | JQuery[HTMLElement], /* options */ UploadOptions, js.Any]
}
