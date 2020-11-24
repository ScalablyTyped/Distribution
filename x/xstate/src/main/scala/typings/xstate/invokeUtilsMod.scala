package typings.xstate

import typings.xstate.anon.Src
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InvokeConfig
import typings.xstate.typesMod.InvokeDefinition
import typings.xstate.typesMod.InvokeSourceDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/invokeUtils", JSImport.Namespace)
@js.native
object invokeUtilsMod extends js.Object {
  
  def toInvokeDefinition[TContext, TEvent /* <: EventObject */](invokeConfig: (InvokeConfig[TContext, TEvent]) with Src): InvokeDefinition[TContext, TEvent] = js.native
  
  def toInvokeSource(src: String): InvokeSourceDefinition = js.native
  def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = js.native
}
