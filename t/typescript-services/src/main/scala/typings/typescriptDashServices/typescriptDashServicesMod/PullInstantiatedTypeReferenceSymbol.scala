package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected ()
  extends typings.typescriptDashServices.TypeScript.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typings.typescriptDashServices.TypeScript.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
object PullInstantiatedTypeReferenceSymbol extends js.Object {
  def create(
    resolver: typings.typescriptDashServices.TypeScript.PullTypeResolver,
    `type`: typings.typescriptDashServices.TypeScript.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typings.typescriptDashServices.TypeScript.PullInstantiatedTypeReferenceSymbol = js.native
}

