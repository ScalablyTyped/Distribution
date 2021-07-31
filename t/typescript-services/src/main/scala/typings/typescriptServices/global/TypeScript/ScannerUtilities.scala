package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ScannerUtilities")
@js.native
class ScannerUtilities ()
  extends StObject
     with typings.typescriptServices.TypeScript.ScannerUtilities
object ScannerUtilities {
  
  @JSGlobal("TypeScript.ScannerUtilities")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def identifierKind(array: js.Array[Double], startIndex: Double, length: Double): typings.typescriptServices.TypeScript.SyntaxKind = (^.asInstanceOf[js.Dynamic].applyDynamic("identifierKind")(array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxKind]
}
