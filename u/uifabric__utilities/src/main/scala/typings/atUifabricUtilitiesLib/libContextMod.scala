package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/Context", JSImport.Namespace)
@js.native
object libContextMod extends js.Object {
  def provideContext[TContext, TProps](
    contextTypes: propDashTypesLib.propDashTypesMod.ValidationMap[TContext],
    mapPropsToContext: js.Function1[/* props */ TProps, TContext]
  ): reactLib.reactMod.ReactNs.ComponentType[TProps] = js.native
}

