package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
open class PullInstantiatedTypeReferenceSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullInstantiatedTypeReferenceSymbol {
  
  @JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(
    resolver: typings.typescriptServices.TypeScript.PullTypeResolver,
    `type`: typings.typescriptServices.TypeScript.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typings.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(resolver.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], typeParameterArgumentMap.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol]
}
