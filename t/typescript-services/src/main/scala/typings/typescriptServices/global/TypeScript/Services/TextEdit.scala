package typings.typescriptServices.global.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.TextEdit")
@js.native
class TextEdit protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.TextEdit {
  def this(minChar: Double, limChar: Double, text: String) = this()
  
  /* CompleteClass */
  var limChar: Double = js.native
  
  /* CompleteClass */
  var minChar: Double = js.native
  
  /* CompleteClass */
  var text: String = js.native
}
object TextEdit {
  
  @JSGlobal("TypeScript.Services.TextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createDelete(minChar: Double, limChar: Double): typings.typescriptServices.TypeScript.Services.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelete")(minChar.asInstanceOf[js.Any], limChar.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.TextEdit]
  
  /* static member */
  inline def createInsert(pos: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInsert")(pos.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.TextEdit]
  
  /* static member */
  inline def createReplace(minChar: Double, limChar: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("createReplace")(minChar.asInstanceOf[js.Any], limChar.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.TextEdit]
}
