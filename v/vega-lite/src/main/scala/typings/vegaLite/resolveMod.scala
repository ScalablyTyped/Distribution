package typings.vegaLite

import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcResolveMod.Resolve
import typings.vegaLite.srcResolveMod.ResolveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("vega-lite/build/src/compile/resolve", "defaultScaleResolve")
  @js.native
  def defaultScaleResolve(channel: ScaleChannel, model: Model): ResolveMode = js.native
  
  @JSImport("vega-lite/build/src/compile/resolve", "parseGuideResolve")
  @js.native
  def parseGuideResolve(resolve: Resolve, channel: ScaleChannel): ResolveMode = js.native
}
