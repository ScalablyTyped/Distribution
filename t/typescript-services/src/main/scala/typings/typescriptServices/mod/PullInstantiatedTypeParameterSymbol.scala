package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullInstantiatedTypeParameterSymbol")
@js.native
open class PullInstantiatedTypeParameterSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullInstantiatedTypeParameterSymbol {
  def this(
    rootTypeParameter: typings.typescriptServices.TypeScript.PullTypeSymbol,
    constraintType: typings.typescriptServices.TypeScript.PullTypeSymbol
  ) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
