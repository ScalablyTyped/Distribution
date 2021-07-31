package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleAction extends StObject
@JSGlobal("TypeScript.Services.Formatting.RuleAction")
@js.native
object RuleAction extends StObject {
  
  @js.native
  sealed trait Delete
    extends StObject
       with RuleAction
  
  @js.native
  sealed trait Ignore
    extends StObject
       with RuleAction
  
  @js.native
  sealed trait NewLine
    extends StObject
       with RuleAction
  
  @js.native
  sealed trait Space
    extends StObject
       with RuleAction
}
