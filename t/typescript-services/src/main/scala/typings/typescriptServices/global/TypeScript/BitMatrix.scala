package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IBitMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BitMatrix {
  
  @JSGlobal("TypeScript.BitMatrix")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBitMatrix(allowUndefinedValues: Boolean): IBitMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("getBitMatrix")(allowUndefinedValues.asInstanceOf[js.Any]).asInstanceOf[IBitMatrix]
}
