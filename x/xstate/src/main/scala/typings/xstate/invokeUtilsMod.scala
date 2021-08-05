package typings.xstate

import typings.xstate.anon.Src
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InvokeConfig
import typings.xstate.typesMod.InvokeDefinition
import typings.xstate.typesMod.InvokeSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeUtilsMod {
  
  @JSImport("xstate/lib/invokeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toInvokeDefinition[TContext, TEvent /* <: EventObject */](invokeConfig: (InvokeConfig[TContext, TEvent]) & Src): InvokeDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeDefinition")(invokeConfig.asInstanceOf[js.Any]).asInstanceOf[InvokeDefinition[TContext, TEvent]]
  
  inline def toInvokeSource(src: String): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
  inline def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
}
