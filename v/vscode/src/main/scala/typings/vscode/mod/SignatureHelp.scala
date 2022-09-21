package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SignatureHelp")
@js.native
open class SignatureHelp () extends StObject {
  
  /**
    * The active parameter of the active signature.
    */
  var activeParameter: Double = js.native
  
  /**
    * The active signature.
    */
  var activeSignature: Double = js.native
  
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation] = js.native
}
