package typings.tuyaPanelKit

import typings.react.mod.Context
import typings.tuyaPanelKit.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/core/CurrentRenderContext", JSImport.Namespace)
@js.native
object currentRenderContextMod extends js.Object {
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  val default: Context[js.UndefOr[Options]] = js.native
}
