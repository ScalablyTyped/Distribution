package typings.twoJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("two.js", "Events")
@js.native
object Events extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
  
  @js.native
  sealed trait change extends Events
  /* 0 */ @js.native
  object change extends TopLevel[change with Double]
  
  @js.native
  sealed trait insert extends Events
  /* 1 */ @js.native
  object insert extends TopLevel[insert with Double]
  
  @js.native
  sealed trait load extends Events
  /* 2 */ @js.native
  object load extends TopLevel[load with Double]
  
  @js.native
  sealed trait order extends Events
  /* 3 */ @js.native
  object order extends TopLevel[order with Double]
  
  @js.native
  sealed trait pause extends Events
  /* 4 */ @js.native
  object pause extends TopLevel[pause with Double]
  
  @js.native
  sealed trait play extends Events
  /* 5 */ @js.native
  object play extends TopLevel[play with Double]
  
  @js.native
  sealed trait remove extends Events
  /* 6 */ @js.native
  object remove extends TopLevel[remove with Double]
  
  @js.native
  sealed trait render extends Events
  /* 7 */ @js.native
  object render extends TopLevel[render with Double]
  
  @js.native
  sealed trait resize extends Events
  /* 8 */ @js.native
  object resize extends TopLevel[resize with Double]
  
  @js.native
  sealed trait update extends Events
  /* 9 */ @js.native
  object update extends TopLevel[update with Double]
}
