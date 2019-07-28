package typings.typeahead

import typings.jquery.JQueryEventObject
import typings.typeahead.TwitterNs.TypeaheadNs.Dataset
import typings.typeahead.TwitterNs.TypeaheadNs.Options
import typings.typeahead.typeaheadStrings.`typeahead:active`
import typings.typeahead.typeaheadStrings.`typeahead:asynccancel`
import typings.typeahead.typeaheadStrings.`typeahead:asyncreceive`
import typings.typeahead.typeaheadStrings.`typeahead:asyncrequest`
import typings.typeahead.typeaheadStrings.`typeahead:autocomplete`
import typings.typeahead.typeaheadStrings.`typeahead:change`
import typings.typeahead.typeaheadStrings.`typeahead:close`
import typings.typeahead.typeaheadStrings.`typeahead:cursorchange`
import typings.typeahead.typeaheadStrings.`typeahead:idle`
import typings.typeahead.typeaheadStrings.`typeahead:open`
import typings.typeahead.typeaheadStrings.`typeahead:render`
import typings.typeahead.typeaheadStrings.`typeahead:select`
import typings.typeahead.typeaheadStrings.`val`
import typings.typeahead.typeaheadStrings.close
import typings.typeahead.typeaheadStrings.destroy
import typings.typeahead.typeaheadStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Remove an event handler.
    *
    * @param events typeahead:active event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadactive(events: `typeahead:active`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:active event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadactive(events: `typeahead:active`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadactive(events: `typeahead:active`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadactive(
    events: `typeahead:active`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:asynccancel event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadasynccancel(events: `typeahead:asynccancel`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:asynccancel event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadasynccancel(events: `typeahead:asynccancel`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadasynccancel(events: `typeahead:asynccancel`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadasynccancel(
    events: `typeahead:asynccancel`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:asyncreceive event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadasyncreceive(events: `typeahead:asyncreceive`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:asyncreceive event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadasyncreceive(events: `typeahead:asyncreceive`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadasyncreceive(events: `typeahead:asyncreceive`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadasyncreceive(
    events: `typeahead:asyncreceive`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:asyncrequest event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadasyncrequest(events: `typeahead:asyncrequest`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:asyncrequest event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadasyncrequest(events: `typeahead:asyncrequest`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadasyncrequest(events: `typeahead:asyncrequest`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadasyncrequest(
    events: `typeahead:asyncrequest`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:autocomplete event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadautocomplete(events: `typeahead:autocomplete`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:autocomplete event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadautocomplete(events: `typeahead:autocomplete`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadautocomplete(events: `typeahead:autocomplete`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadautocomplete(
    events: `typeahead:autocomplete`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:change event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadchange(events: `typeahead:change`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:change event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadchange(events: `typeahead:change`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadchange(events: `typeahead:change`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadchange(
    events: `typeahead:change`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:close event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadclose(events: `typeahead:close`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:close event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadclose(events: `typeahead:close`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadclose(events: `typeahead:close`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadclose(
    events: `typeahead:close`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:cursorchange event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadcursorchange(events: `typeahead:cursorchange`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:cursorchange event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadcursorchange(events: `typeahead:cursorchange`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadcursorchange(events: `typeahead:cursorchange`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadcursorchange(
    events: `typeahead:cursorchange`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:idle event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadidle(events: `typeahead:idle`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:idle event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadidle(events: `typeahead:idle`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadidle(events: `typeahead:idle`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadidle(
    events: `typeahead:idle`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:open event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadopen(events: `typeahead:open`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:open event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadopen(events: `typeahead:open`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadopen(events: `typeahead:open`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadopen(
    events: `typeahead:open`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:render event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadrender(events: `typeahead:render`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:render event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadrender(events: `typeahead:render`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadrender(events: `typeahead:render`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadrender(
    events: `typeahead:render`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:select event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadselect(events: `typeahead:select`): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events typeahead:select event.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    */
  @JSName("off")
  def off_typeaheadselect(events: `typeahead:select`, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  @JSName("off")
  def off_typeaheadselect(events: `typeahead:select`, selector: String): JQuery = js.native
  @JSName("off")
  def off_typeaheadselect(
    events: `typeahead:select`,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:active event to the selected elements.
    *
    * @param events typeahead:active event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadactive(
    events: `typeahead:active`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:active event to the selected elements.
    *
    * @param events typeahead:active event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadactive(
    events: `typeahead:active`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:active event to the selected elements.
    *
    * @param events typeahead:active event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadactive(
    events: `typeahead:active`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:active event to the selected elements.
    *
    * @param events typeahead:active event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadactive(
    events: `typeahead:active`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asynccancel event to the selected elements.
    *
    * @param events typeahead:asynccancel event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasynccancel(
    events: `typeahead:asynccancel`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asynccancel event to the selected elements.
    *
    * @param events typeahead:asynccancel event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadasynccancel(
    events: `typeahead:asynccancel`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asynccancel event to the selected elements.
    *
    * @param events typeahead:asynccancel event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasynccancel(
    events: `typeahead:asynccancel`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asynccancel event to the selected elements.
    *
    * @param events typeahead:asynccancel event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasynccancel(
    events: `typeahead:asynccancel`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncreceive event to the selected elements.
    *
    * @param events typeahead:asyncreceive event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasyncreceive(
    events: `typeahead:asyncreceive`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncreceive event to the selected elements.
    *
    * @param events typeahead:asyncreceive event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadasyncreceive(
    events: `typeahead:asyncreceive`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncreceive event to the selected elements.
    *
    * @param events typeahead:asyncreceive event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasyncreceive(
    events: `typeahead:asyncreceive`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncreceive event to the selected elements.
    *
    * @param events typeahead:asyncreceive event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasyncreceive(
    events: `typeahead:asyncreceive`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncrequest event to the selected elements.
    *
    * @param events typeahead:asyncrequest event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasyncrequest(
    events: `typeahead:asyncrequest`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncrequest event to the selected elements.
    *
    * @param events typeahead:asyncrequest event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadasyncrequest(
    events: `typeahead:asyncrequest`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncrequest event to the selected elements.
    *
    * @param events typeahead:asyncrequest event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasyncrequest(
    events: `typeahead:asyncrequest`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:asyncrequest event to the selected elements.
    *
    * @param events typeahead:asyncrequest event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadasyncrequest(
    events: `typeahead:asyncrequest`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:autocomplete event to the selected elements.
    *
    * @param events typeahead:autocomplete event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadautocomplete(
    events: `typeahead:autocomplete`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:autocomplete event to the selected elements.
    *
    * @param events typeahead:autocomplete event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadautocomplete(
    events: `typeahead:autocomplete`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:autocomplete event to the selected elements.
    *
    * @param events typeahead:autocomplete event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadautocomplete(
    events: `typeahead:autocomplete`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:autocomplete event to the selected elements.
    *
    * @param events typeahead:autocomplete event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadautocomplete(
    events: `typeahead:autocomplete`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:change event to the selected elements.
    *
    * @param events typeahead:change event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadchange(
    events: `typeahead:change`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:change event to the selected elements.
    *
    * @param events typeahead:change event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadchange(
    events: `typeahead:change`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:change event to the selected elements.
    *
    * @param events typeahead:change event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadchange(
    events: `typeahead:change`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:change event to the selected elements.
    *
    * @param events typeahead:change event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadchange(
    events: `typeahead:change`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:close event to the selected elements.
    *
    * @param events typeahead:close event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadclose(
    events: `typeahead:close`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:close event to the selected elements.
    *
    * @param events typeahead:close event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadclose(
    events: `typeahead:close`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:close event to the selected elements.
    *
    * @param events typeahead:close event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadclose(
    events: `typeahead:close`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:close event to the selected elements.
    *
    * @param events typeahead:close event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadclose(
    events: `typeahead:close`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:cursorchange event to the selected elements.
    *
    * @param events typeahead:cursorchange event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadcursorchange(
    events: `typeahead:cursorchange`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:cursorchange event to the selected elements.
    *
    * @param events typeahead:cursorchange event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadcursorchange(
    events: `typeahead:cursorchange`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:cursorchange event to the selected elements.
    *
    * @param events typeahead:cursorchange event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadcursorchange(
    events: `typeahead:cursorchange`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:cursorchange event to the selected elements.
    *
    * @param events typeahead:cursorchange event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadcursorchange(
    events: `typeahead:cursorchange`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:idle event to the selected elements.
    *
    * @param events typeahead:idle event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadidle(
    events: `typeahead:idle`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:idle event to the selected elements.
    *
    * @param events typeahead:idle event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadidle(
    events: `typeahead:idle`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:idle event to the selected elements.
    *
    * @param events typeahead:idle event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadidle(
    events: `typeahead:idle`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:idle event to the selected elements.
    *
    * @param events typeahead:idle event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadidle(
    events: `typeahead:idle`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:open event to the selected elements.
    *
    * @param events typeahead:open event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadopen(
    events: `typeahead:open`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:open event to the selected elements.
    *
    * @param events typeahead:open event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadopen(
    events: `typeahead:open`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:open event to the selected elements.
    *
    * @param events typeahead:open event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadopen(
    events: `typeahead:open`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:open event to the selected elements.
    *
    * @param events typeahead:open event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadopen(
    events: `typeahead:open`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:render event to the selected elements.
    *
    * @param events typeahead:render event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadrender(
    events: `typeahead:render`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:render event to the selected elements.
    *
    * @param events typeahead:render event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadrender(
    events: `typeahead:render`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:render event to the selected elements.
    *
    * @param events typeahead:render event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadrender(
    events: `typeahead:render`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:render event to the selected elements.
    *
    * @param events typeahead:render event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadrender(
    events: `typeahead:render`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:select event to the selected elements.
    *
    * @param events typeahead:select event fired when the typeahead moves to active state.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadselect(
    events: `typeahead:select`,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:select event to the selected elements.
    *
    * @param events typeahead:select event fired when the typeahead moves to active state.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    */
  @JSName("on")
  def on_typeaheadselect(
    events: `typeahead:select`,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:select event to the selected elements.
    *
    * @param events typeahead:select event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadselect(
    events: `typeahead:select`,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for typeahead:select event to the selected elements.
    *
    * @param events typeahead:select event fired when the typeahead moves to active state.
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_typeaheadselect(
    events: `typeahead:select`,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Accommodates the val overload.
    *
    * @constructor
    * @param methodName Method 'val'
    */
  def typeahead(methodName: String): String = js.native
  /**
    * Accommodates the set val overload.
    *
    * @constructor
    * @param methodName Method 'val'
    * @param val The value to be set
    */
  def typeahead(methodName: String, `val`: String): JQuery = js.native
  /**
    * For a given input[type="text"], enables typeahead functionality.
    *
    * @constructor
    * @param options Options hash that's used for configuration
    * @param datasets Array of datasets
    */
  def typeahead[T](options: Options, datasets: js.Array[Dataset[T]]): JQuery = js.native
  /**
    * For a given input[type="text"], enables typeahead functionality.
    *
    * @constructor
    * @param options Options hash that's used for configuration
    * @param dataset At least one dataset is required
    * @param datasets Rest of the datasets.
    */
  def typeahead[T](options: Options, dataset: Dataset[T], datasets: Dataset[T]*): JQuery = js.native
  /**
    * Closes the suggestion menu.
    *
    * @constructor
    * @param methodName Method 'close'
    */
  @JSName("typeahead")
  def typeahead_close(methodName: close): JQuery = js.native
  /**
    * Removes typeahead functionality and reverts the input element back to its original state.
    *
    * @constructor
    * @param methodName Method 'destroy'
    */
  @JSName("typeahead")
  def typeahead_destroy(methodName: destroy): JQuery = js.native
  /**
    * Opens the suggestion menu.
    *
    * @constructor
    * @param methodName Method 'open'
    */
  @JSName("typeahead")
  def typeahead_open(methodName: open): JQuery = js.native
  /**
    * Returns the current value of the typeahead.
    * The value is the text the user has entered into the input element.
    *
    * @constructor
    * @param methodName Method 'val'
    */
  @JSName("typeahead")
  def typeahead_val(methodName: `val`): String = js.native
  /**
    * Sets the value of the typeahead. This should be used in place of jQuery#val.
    *
    * @constructor
    * @param methodName Method 'val'
    * @param val The value to be set
    */
  @JSName("typeahead")
  def typeahead_val(methodName: `val`, `val`: String): JQuery = js.native
}

