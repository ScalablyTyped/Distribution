package typings.xstate

import typings.xstate.anon.Src
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InvokeConfig
import typings.xstate.libTypesMod.InvokeDefinition
import typings.xstate.libTypesMod.InvokeSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInvokeUtilsMod {
  
  @JSImport("xstate/lib/invokeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toInvokeDefinition[TContext, TEvent /* <: EventObject */](invokeConfig: (InvokeConfig[TContext, TEvent]) & Src): InvokeDefinition[TContext, TEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeDefinition")(invokeConfig.asInstanceOf[js.Any]).asInstanceOf[InvokeDefinition[TContext, TEvent]]
  
  inline def toInvokeSource(src: String): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
  inline def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvokeSource")(src.asInstanceOf[js.Any]).asInstanceOf[InvokeSourceDefinition]
}
