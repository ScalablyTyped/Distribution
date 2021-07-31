package typings.xstate

import typings.std.Partial
import typings.std.Record
import typings.xstate.anon.Initial
import typings.xstate.anon.TypeTEventType
import typings.xstate.typesMod.AtomicStateNodeConfig
import typings.xstate.typesMod.Event
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternsMod {
  
  @JSImport("xstate/lib/patterns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sequence_states[TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](
    items: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ]
  ): Initial[TStateSchema, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(items.asInstanceOf[js.Any]).asInstanceOf[Initial[TStateSchema, TEvent]]
  @scala.inline
  def sequence_states[TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](
    items: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ],
    options: Partial[SequencePatternOptions[TEvent]]
  ): Initial[TStateSchema, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Initial[TStateSchema, TEvent]]
  
  @scala.inline
  def toggle[TEventType /* <: String */](onState: String, offState: String, eventType: TEventType): Record[String, AtomicStateNodeConfig[js.Any, TypeTEventType[TEventType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(onState.asInstanceOf[js.Any], offState.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Record[String, AtomicStateNodeConfig[js.Any, TypeTEventType[TEventType]]]]
  
  trait SequencePatternOptions[TEvent /* <: EventObject */] extends StObject {
    
    var nextEvent: js.UndefOr[Event[TEvent]] = js.undefined
    
    var prevEvent: js.UndefOr[Event[TEvent]] = js.undefined
  }
  object SequencePatternOptions {
    
    @scala.inline
    def apply[TEvent /* <: EventObject */](): SequencePatternOptions[TEvent] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequencePatternOptions[TEvent]]
    }
    
    @scala.inline
    implicit class SequencePatternOptionsMutableBuilder[Self <: SequencePatternOptions[?], TEvent /* <: EventObject */] (val x: Self & SequencePatternOptions[TEvent]) extends AnyVal {
      
      @scala.inline
      def setNextEvent(value: Event[TEvent]): Self = StObject.set(x, "nextEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextEventUndefined: Self = StObject.set(x, "nextEvent", js.undefined)
      
      @scala.inline
      def setPrevEvent(value: Event[TEvent]): Self = StObject.set(x, "prevEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevEventUndefined: Self = StObject.set(x, "prevEvent", js.undefined)
    }
  }
}
