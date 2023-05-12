package typings.xstate.anon

import typings.std.Record
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined xstate.xstate/lib/typegenTypes.TypegenMeta & {  indexedActions :std.Record<string, xstate.xstate/lib/types.BaseActionObject>,   indexedEvents :std.Record<string, xstate.xstate/lib/types.EventObject>} */
trait TypegenMetaindexedActions extends StObject {
  
  @JSName("@@xstate/typegen")
  var `@@xstateSlashtypegen`: `true`
  
  /**
    * Keeps track of which events lead to which
    * actions.
    *
    * Key: 'EVENT_NAME'
    * Value: 'actionName' | 'otherActionName'
    */
  var eventsCausingActions: Record[String, String]
  
  /**
    * Keeps track of which events lead to which
    * delays.
    *
    * Key: 'EVENT_NAME'
    * Value: 'delayName' | 'otherDelayName'
    */
  var eventsCausingDelays: Record[String, String]
  
  /**
    * Keeps track of which events lead to which
    * guards.
    *
    * Key: 'EVENT_NAME'
    * Value: 'guardName' | 'otherGuardName'
    */
  var eventsCausingGuards: Record[String, String]
  
  /**
    * Keeps track of which events lead to which
    * services.
    *
    * Key: 'EVENT_NAME'
    * Value: 'serviceName' | 'otherServiceName'
    */
  var eventsCausingServices: Record[String, String]
  
  var indexedActions: Record[String, BaseActionObject]
  
  var indexedEvents: Record[String, EventObject]
  
  /**
    * Maps the name of the service to the event type
    * of the done.invoke action
    *
    * key: 'invokeSrc'
    * value: 'done.invoke.invokeName'
    */
  var invokeSrcNameMap: Record[String, String]
  
  /**
    * Allows you to specify all the results of state.matches
    */
  var matchesStates: String | js.Object
  
  /**
    * Allows you to specify all the missing implementations
    * of the machine
    */
  var missingImplementations: Delays
  
  /**
    * Allows you to specify all tags used by the machine
    */
  var tags: String
}
object TypegenMetaindexedActions {
  
  inline def apply(
    eventsCausingActions: Record[String, String],
    eventsCausingDelays: Record[String, String],
    eventsCausingGuards: Record[String, String],
    eventsCausingServices: Record[String, String],
    indexedActions: Record[String, BaseActionObject],
    indexedEvents: Record[String, EventObject],
    invokeSrcNameMap: Record[String, String],
    matchesStates: String | js.Object,
    missingImplementations: Delays,
    tags: String
  ): TypegenMetaindexedActions = {
    val __obj = js.Dynamic.literal(eventsCausingActions = eventsCausingActions.asInstanceOf[js.Any], eventsCausingDelays = eventsCausingDelays.asInstanceOf[js.Any], eventsCausingGuards = eventsCausingGuards.asInstanceOf[js.Any], eventsCausingServices = eventsCausingServices.asInstanceOf[js.Any], indexedActions = indexedActions.asInstanceOf[js.Any], indexedEvents = indexedEvents.asInstanceOf[js.Any], invokeSrcNameMap = invokeSrcNameMap.asInstanceOf[js.Any], matchesStates = matchesStates.asInstanceOf[js.Any], missingImplementations = missingImplementations.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("@@xstate/typegen")(true)
    __obj.asInstanceOf[TypegenMetaindexedActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypegenMetaindexedActions] (val x: Self) extends AnyVal {
    
    inline def `set@@xstateSlashtypegen`(value: `true`): Self = StObject.set(x, "@@xstate/typegen", value.asInstanceOf[js.Any])
    
    inline def setEventsCausingActions(value: Record[String, String]): Self = StObject.set(x, "eventsCausingActions", value.asInstanceOf[js.Any])
    
    inline def setEventsCausingDelays(value: Record[String, String]): Self = StObject.set(x, "eventsCausingDelays", value.asInstanceOf[js.Any])
    
    inline def setEventsCausingGuards(value: Record[String, String]): Self = StObject.set(x, "eventsCausingGuards", value.asInstanceOf[js.Any])
    
    inline def setEventsCausingServices(value: Record[String, String]): Self = StObject.set(x, "eventsCausingServices", value.asInstanceOf[js.Any])
    
    inline def setIndexedActions(value: Record[String, BaseActionObject]): Self = StObject.set(x, "indexedActions", value.asInstanceOf[js.Any])
    
    inline def setIndexedEvents(value: Record[String, EventObject]): Self = StObject.set(x, "indexedEvents", value.asInstanceOf[js.Any])
    
    inline def setInvokeSrcNameMap(value: Record[String, String]): Self = StObject.set(x, "invokeSrcNameMap", value.asInstanceOf[js.Any])
    
    inline def setMatchesStates(value: String | js.Object): Self = StObject.set(x, "matchesStates", value.asInstanceOf[js.Any])
    
    inline def setMissingImplementations(value: Delays): Self = StObject.set(x, "missingImplementations", value.asInstanceOf[js.Any])
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
