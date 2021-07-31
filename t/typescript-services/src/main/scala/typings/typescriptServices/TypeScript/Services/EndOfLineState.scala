package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLineState extends StObject
@JSGlobal("TypeScript.Services.EndOfLineState")
@js.native
object EndOfLineState extends StObject {
  
  @js.native
  sealed trait InDoubleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait Start
    extends StObject
       with EndOfLineState
}
