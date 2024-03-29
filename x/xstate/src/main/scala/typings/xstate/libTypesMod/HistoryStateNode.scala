package typings.xstate.libTypesMod

import typings.xstate.anon.Context
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryStateNode[TContext] extends StateNode[TContext, Any, EventObject, Context[TContext], ServiceMap, TypegenDisabled] {
  
  @JSName("history")
  var history_HistoryStateNode: shallow | deep = js.native
  
  @JSName("target")
  var target_FHistoryStateNode: js.UndefOr[StateValue] = js.native
}
