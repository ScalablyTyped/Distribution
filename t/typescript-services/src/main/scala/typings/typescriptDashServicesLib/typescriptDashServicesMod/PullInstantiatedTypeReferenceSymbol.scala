package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected ()
  extends typescriptDashServicesLib.TypeScriptNs.PullInstantiatedTypeReferenceSymbol {
  def this(referencedTypeSymbol: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol, _typeParameterArgumentMap: typescriptDashServicesLib.TypeScriptNs.TypeArgumentMap, isInstanceReferenceType: scala.Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
object PullInstantiatedTypeReferenceSymbol extends js.Object {
  def create(
    resolver: typescriptDashServicesLib.TypeScriptNs.PullTypeResolver,
    `type`: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol,
    typeParameterArgumentMap: typescriptDashServicesLib.TypeScriptNs.TypeArgumentMap
  ): typescriptDashServicesLib.TypeScriptNs.PullInstantiatedTypeReferenceSymbol = js.native
}

