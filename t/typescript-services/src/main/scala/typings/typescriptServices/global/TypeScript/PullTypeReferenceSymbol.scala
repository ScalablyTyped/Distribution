package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullTypeReferenceSymbol")
@js.native
class PullTypeReferenceSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullTypeReferenceSymbol {
  def this(referencedTypeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullTypeReferenceSymbol {
  
  @JSGlobal("TypeScript.PullTypeReferenceSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createTypeReference(`type`: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.PullTypeReferenceSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeReference")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.PullTypeReferenceSymbol]
}
