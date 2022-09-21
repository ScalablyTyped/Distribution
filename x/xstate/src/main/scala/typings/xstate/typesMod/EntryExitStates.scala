package typings.xstate.typesMod

import typings.std.Set
import typings.xstate.anon.Context
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.typegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryExitStates[TContext] extends StObject {
  
  var entry: Set[
    StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
  ]
  
  var exit: Set[
    StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
  ]
}
object EntryExitStates {
  
  inline def apply[TContext](
    entry: Set[
      StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
    ],
    exit: Set[
      StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
    ]
  ): EntryExitStates[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStates[TContext]]
  }
  
  extension [Self <: EntryExitStates[?], TContext](x: Self & EntryExitStates[TContext]) {
    
    inline def setEntry(
      value: Set[
          StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
        ]
    ): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setExit(
      value: Set[
          StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
        ]
    ): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
