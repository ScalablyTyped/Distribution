package typings.xstate.libTypesMod

import typings.xstate.anon.Context
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryExitStateArrays[TContext] extends StObject {
  
  var entry: js.Array[
    StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
  ]
  
  var exit: js.Array[
    StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
  ]
}
object EntryExitStateArrays {
  
  inline def apply[TContext](
    entry: js.Array[
      StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
    ],
    exit: js.Array[
      StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
    ]
  ): EntryExitStateArrays[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStateArrays[TContext]]
  }
  
  extension [Self <: EntryExitStateArrays[?], TContext](x: Self & EntryExitStateArrays[TContext]) {
    
    inline def setEntry(
      value: js.Array[
          StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
        ]
    ): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryVarargs(value: (StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled])*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setExit(
      value: js.Array[
          StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled]
        ]
    ): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitVarargs(value: (StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled])*): Self = StObject.set(x, "exit", js.Array(value*))
  }
}
