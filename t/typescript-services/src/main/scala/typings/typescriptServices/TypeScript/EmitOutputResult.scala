package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitOutputResult extends StObject
@JSGlobal("TypeScript.EmitOutputResult")
@js.native
object EmitOutputResult extends StObject {
  
  @js.native
  sealed trait FailedBecauseOfCompilerOptionsErrors
    extends StObject
       with EmitOutputResult
  
  @js.native
  sealed trait FailedBecauseOfSyntaxErrors
    extends StObject
       with EmitOutputResult
  
  @js.native
  sealed trait FailedToGenerateDeclarationsBecauseOfSemanticErrors
    extends StObject
       with EmitOutputResult
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with EmitOutputResult
}
