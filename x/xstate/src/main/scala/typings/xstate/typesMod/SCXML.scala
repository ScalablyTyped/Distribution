package typings.xstate.typesMod

import typings.xstate.xstateStrings.external
import typings.xstate.xstateStrings.internal
import typings.xstate.xstateStrings.platform
import typings.xstate.xstateStrings.scxml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SCXML {
  
  trait Event[TEvent /* <: EventObject */] extends StObject {
    
    /**
      * @private
      */
    @JSName("$$type")
    var DollarDollartype: scxml
    
    /**
      * This field contains whatever data the sending entity chose to include in this event.
      * The receiving SCXML Processor should reformat this data to match its data model,
      * but must not otherwise modify it.
      *
      * If the conversion is not possible, the Processor must leave the field blank
      * and must place an error 'error.execution' in the internal event queue.
      */
    var data: TEvent
    
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
    def apply[TEvent /* <: EventObject */](data: TEvent, name: String, `type`: platform | internal | external): typings.xstate.typesMod.SCXML.Event[TEvent] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("$$type")("scxml")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.xstate.typesMod.SCXML.Event[TEvent]]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: typings.xstate.typesMod.SCXML.Event[?], TEvent /* <: EventObject */] (val x: Self & typings.xstate.typesMod.SCXML.Event[TEvent]) extends AnyVal {
      
      @scala.inline
      def setData(value: TEvent): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDollarDollartype(value: scxml): Self = StObject.set(x, "$$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeid(value: String): Self = StObject.set(x, "invokeid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeidUndefined: Self = StObject.set(x, "invokeid", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOrigintype(value: String): Self = StObject.set(x, "origintype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigintypeUndefined: Self = StObject.set(x, "origintype", js.undefined)
      
      @scala.inline
      def setSendid(value: String): Self = StObject.set(x, "sendid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendidUndefined: Self = StObject.set(x, "sendid", js.undefined)
      
      @scala.inline
      def setType(value: platform | internal | external): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
