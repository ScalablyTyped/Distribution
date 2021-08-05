package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IBitVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BitVector {
  
  @JSGlobal("TypeScript.BitVector")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBitVector(allowUndefinedValues: Boolean): IBitVector = ^.asInstanceOf[js.Dynamic].applyDynamic("getBitVector")(allowUndefinedValues.asInstanceOf[js.Any]).asInstanceOf[IBitVector]
}
