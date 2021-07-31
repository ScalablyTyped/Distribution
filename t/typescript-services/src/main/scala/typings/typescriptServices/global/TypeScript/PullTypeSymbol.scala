package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullTypeSymbol")
@js.native
class PullTypeSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullTypeSymbol {
  def this(name: String, kind: typings.typescriptServices.TypeScript.PullElementKind) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* InferMemberOverrides */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
