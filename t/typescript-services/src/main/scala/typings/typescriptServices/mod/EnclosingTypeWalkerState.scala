package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "EnclosingTypeWalkerState")
@js.native
open class EnclosingTypeWalkerState ()
  extends StObject
     with typings.typescriptServices.TypeScript.EnclosingTypeWalkerState {
  
  /* CompleteClass */
  var _currentSymbols: js.Array[typings.typescriptServices.TypeScript.PullSymbol] = js.native
  
  /* CompleteClass */
  var _hasSetEnclosingType: Boolean = js.native
}
object EnclosingTypeWalkerState {
  
  @JSImport("typescript-services", "EnclosingTypeWalkerState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getDefaultEnclosingTypeWalkerState(): typings.typescriptServices.TypeScript.EnclosingTypeWalkerState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultEnclosingTypeWalkerState")().asInstanceOf[typings.typescriptServices.TypeScript.EnclosingTypeWalkerState]
  
  /* static member */
  inline def getGenericEnclosingTypeWalkerState(genericEnclosingType: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.EnclosingTypeWalkerState = ^.asInstanceOf[js.Dynamic].applyDynamic("getGenericEnclosingTypeWalkerState")(genericEnclosingType.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.EnclosingTypeWalkerState]
  
  /* static member */
  inline def getNonGenericEnclosingTypeWalkerState(): typings.typescriptServices.TypeScript.EnclosingTypeWalkerState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNonGenericEnclosingTypeWalkerState")().asInstanceOf[typings.typescriptServices.TypeScript.EnclosingTypeWalkerState]
}
