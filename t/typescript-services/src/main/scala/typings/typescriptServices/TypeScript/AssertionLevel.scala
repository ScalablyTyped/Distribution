package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AssertionLevel extends js.Object

@JSGlobal("TypeScript.AssertionLevel")
@js.native
object AssertionLevel extends js.Object {
  @js.native
  sealed trait Aggressive extends AssertionLevel
  
  @js.native
  sealed trait None extends AssertionLevel
  
  @js.native
  sealed trait Normal extends AssertionLevel
  
  @js.native
  sealed trait VeryAggressive extends AssertionLevel
  
}

