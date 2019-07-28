package typings.xstate.esTypesMod.SCXMLNs

import typings.std.Record
import typings.xstate.xstateStrings.external
import typings.xstate.xstateStrings.internal
import typings.xstate.xstateStrings.platform
import typings.xstate.xstateStrings.scxml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * @private
    */
  @JSName("$$type")
  var $$type: scxml
  /**
    * This field contains whatever data the sending entity chose to include in this event.
    * The receiving SCXML Processor should reformat this data to match its data model,
    * but must not otherwise modify it.
    *
    * If the conversion is not possible, the Processor must leave the field blank
    * and must place an error 'error.execution' in the internal event queue.
    */
  var data: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * If this event is generated from an invoked child process, the SCXML Processor
    * must set this field to the invoke id of the invocation that triggered the child process.
    * Otherwise it must leave it blank.
    */
  var invokeid: js.UndefOr[String] = js.undefined
  /**
    * This is a character string giving the name of the event.
    * The SCXML Processor must set the name field to the name of this event.
    * It is what is matched against the 'event' attribute of <transition>.
    * Note that transitions can do additional tests by using the value of this field
    * inside boolean expressions in the 'cond' attribute.
    */
  var name: String
  /**
    * This is a URI, equivalent to the 'target' attribute on the <send> element.
    * For external events, the SCXML Processor should set this field to a value which,
    * when used as the value of 'target', will allow the receiver of the event to <send>
    * a response back to the originating entity via the Event I/O Processor specified in 'origintype'.
    * For internal and platform events, the Processor must leave this field blank.
    */
  var origin: js.UndefOr[String] = js.undefined
  /**
    * This is equivalent to the 'type' field on the <send> element.
    * For external events, the SCXML Processor should set this field to a value which,
    * when used as the value of 'type', will allow the receiver of the event to <send>
    * a response back to the originating entity at the URI specified by 'origin'.
    * For internal and platform events, the Processor must leave this field blank.
    */
  var origintype: js.UndefOr[String] = js.undefined
  /**
    * If the sending entity has specified a value for this, the Processor must set this field to that value
    * (see C Event I/O Processors for details).
    * Otherwise, in the case of error events triggered by a failed attempt to send an event,
    * the Processor must set this field to the send id of the triggering <send> element.
    * Otherwise it must leave it blank.
    */
  var sendid: js.UndefOr[String] = js.undefined
  /**
    * This field describes the event type.
    * The SCXML Processor must set it to: "platform" (for events raised by the platform itself, such as error events),
    * "internal" (for events raised by <raise> and <send> with target '_internal')
    * or "external" (for all other events).
    */
  var `type`: platform | internal | external
}

object Event {
  @scala.inline
  def apply(
    $$type: scxml,
    name: String,
    `type`: platform | internal | external,
    data: Record[String, _] = null,
    invokeid: String = null,
    origin: String = null,
    origintype: String = null,
    sendid: String = null
  ): Event = {
    val __obj = js.Dynamic.literal($$type = $$type, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (invokeid != null) __obj.updateDynamic("invokeid")(invokeid)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (origintype != null) __obj.updateDynamic("origintype")(origintype)
    if (sendid != null) __obj.updateDynamic("sendid")(sendid)
    __obj.asInstanceOf[Event]
  }
}

