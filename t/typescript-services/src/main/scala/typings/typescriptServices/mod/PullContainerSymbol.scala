package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullContainerSymbol")
@js.native
class PullContainerSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullContainerSymbol {
  def this(name: String, kind: typings.typescriptServices.TypeScript.PullElementKind) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullContainerSymbol {
  
  @JSImport("typescript-services", "PullContainerSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def usedAsSymbol(
    containerSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    symbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("usedAsSymbol")(containerSymbol.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
