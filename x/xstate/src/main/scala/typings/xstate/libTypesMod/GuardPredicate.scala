package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuardPredicate[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  def predicate(context: TContext, event: TEvent, meta: GuardMeta[TContext, TEvent]): Boolean
  @JSName("predicate")
  var predicate_Original: ConditionPredicate[TContext, TEvent]
  
  var `type`: DefaultGuardType
}
object GuardPredicate {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    predicate: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean,
    `type`: DefaultGuardType
  ): GuardPredicate[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(predicate = js.Any.fromFunction3(predicate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuardPredicate[TContext, TEvent]]
  }
  
  extension [Self <: GuardPredicate[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (GuardPredicate[TContext, TEvent])) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPredicate(value: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction3(value))
    
    inline def setType(value: DefaultGuardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
