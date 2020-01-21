package typings.twoJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Commands extends js.Object

@JSImport("two.js", "Commands")
@js.native
object Commands extends js.Object {
  @js.native
  sealed trait arc extends Commands
  
  @js.native
  sealed trait close extends Commands
  
  @js.native
  sealed trait curve extends Commands
  
  @js.native
  sealed trait line extends Commands
  
  @js.native
  sealed trait move extends Commands
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Commands with Double] = js.native
  /* 3 */ @js.native
  object arc extends TopLevel[arc with Double]
  
  /* 4 */ @js.native
  object close extends TopLevel[close with Double]
  
  /* 2 */ @js.native
  object curve extends TopLevel[curve with Double]
  
  /* 1 */ @js.native
  object line extends TopLevel[line with Double]
  
  /* 0 */ @js.native
  object move extends TopLevel[move with Double]
  
}

