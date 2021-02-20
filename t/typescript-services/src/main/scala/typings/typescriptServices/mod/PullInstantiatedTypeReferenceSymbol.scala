package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
}
object PullInstantiatedTypeReferenceSymbol {
  
  /* static member */
  @JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol.create")
  @js.native
  def create(
    resolver: typings.typescriptServices.TypeScript.PullTypeResolver,
    `type`: typings.typescriptServices.TypeScript.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typings.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol = js.native
}
