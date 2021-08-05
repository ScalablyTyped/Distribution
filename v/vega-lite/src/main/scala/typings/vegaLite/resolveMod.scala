package typings.vegaLite

import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcResolveMod.Resolve
import typings.vegaLite.srcResolveMod.ResolveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("vega-lite/build/src/compile/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultScaleResolve(channel: ScaleChannel, model: Model): ResolveMode = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultScaleResolve")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[ResolveMode]
  
  inline def parseGuideResolve(resolve: Resolve, channel: ScaleChannel): ResolveMode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGuideResolve")(resolve.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[ResolveMode]
}
