package typings.typescriptServices.global.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.EditorOptions")
@js.native
open class EditorOptions ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.EditorOptions {
  
  /* CompleteClass */
  var ConvertTabsToSpaces: Boolean = js.native
  
  /* CompleteClass */
  var IndentSize: Double = js.native
  
  /* CompleteClass */
  var NewLineCharacter: String = js.native
  
  /* CompleteClass */
  var TabSize: Double = js.native
}
object EditorOptions {
  
  @JSGlobal("TypeScript.Services.EditorOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(objectToClone: typings.typescriptServices.TypeScript.Services.EditorOptions): typings.typescriptServices.TypeScript.Services.EditorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(objectToClone.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Services.EditorOptions]
}
