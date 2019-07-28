package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected ()
  extends typings.typescriptDashServices.TypeScriptNs.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
object PullInstantiatedTypeReferenceSymbol extends js.Object {
  def create(
    resolver: typings.typescriptDashServices.TypeScriptNs.PullTypeResolver,
    `type`: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typings.typescriptDashServices.TypeScriptNs.PullInstantiatedTypeReferenceSymbol = js.native
}

