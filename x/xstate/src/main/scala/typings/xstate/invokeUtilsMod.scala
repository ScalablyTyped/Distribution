package typings.xstate

import typings.xstate.anon.Src
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InvokeConfig
import typings.xstate.typesMod.InvokeDefinition
import typings.xstate.typesMod.InvokeSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeUtilsMod {
  
  @JSImport("xstate/lib/invokeUtils", "toInvokeDefinition")
  @js.native
  def toInvokeDefinition[TContext, TEvent /* <: EventObject */](invokeConfig: (InvokeConfig[TContext, TEvent]) with Src): InvokeDefinition[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/invokeUtils", "toInvokeSource")
  @js.native
  def toInvokeSource(src: String): InvokeSourceDefinition = js.native
  @JSImport("xstate/lib/invokeUtils", "toInvokeSource")
  @js.native
  def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = js.native
}
