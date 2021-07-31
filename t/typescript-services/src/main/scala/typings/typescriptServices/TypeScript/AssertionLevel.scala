package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AssertionLevel extends StObject
@JSGlobal("TypeScript.AssertionLevel")
@js.native
object AssertionLevel extends StObject {
  
  @js.native
  sealed trait Aggressive
    extends StObject
       with AssertionLevel
  
  @js.native
  sealed trait None
    extends StObject
       with AssertionLevel
  
  @js.native
  sealed trait Normal
    extends StObject
       with AssertionLevel
  
  @js.native
  sealed trait VeryAggressive
    extends StObject
       with AssertionLevel
}
