package typings.twoJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

@JSImport("two.js", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait change extends Events
  
  @js.native
  sealed trait insert extends Events
  
  @js.native
  sealed trait load extends Events
  
  @js.native
  sealed trait order extends Events
  
  @js.native
  sealed trait pause extends Events
  
  @js.native
  sealed trait play extends Events
  
  @js.native
  sealed trait remove extends Events
  
  @js.native
  sealed trait render extends Events
  
  @js.native
  sealed trait resize extends Events
  
  @js.native
  sealed trait update extends Events
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
  /* 0 */ @js.native
  object change extends TopLevel[change with Double]
  
  /* 1 */ @js.native
  object insert extends TopLevel[insert with Double]
  
  /* 2 */ @js.native
  object load extends TopLevel[load with Double]
  
  /* 3 */ @js.native
  object order extends TopLevel[order with Double]
  
  /* 4 */ @js.native
  object pause extends TopLevel[pause with Double]
  
  /* 5 */ @js.native
  object play extends TopLevel[play with Double]
  
  /* 6 */ @js.native
  object remove extends TopLevel[remove with Double]
  
  /* 7 */ @js.native
  object render extends TopLevel[render with Double]
  
  /* 8 */ @js.native
  object resize extends TopLevel[resize with Double]
  
  /* 9 */ @js.native
  object update extends TopLevel[update with Double]
  
}

