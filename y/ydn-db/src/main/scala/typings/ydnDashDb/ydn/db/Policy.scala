package typings.ydnDashDb.ydn.db

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Policy extends js.Object

@JSGlobal("ydn.db.Policy")
@js.native
object Policy extends js.Object {
  @js.native
  sealed trait all extends Policy
  
  @js.native
  sealed trait atomic extends Policy
  
  @js.native
  sealed trait multi extends Policy
  
  @js.native
  sealed trait repeat extends Policy
  
  @js.native
  sealed trait single extends Policy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Policy with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object atomic extends TopLevel[atomic with Double]
  
  /* 2 */ @js.native
  object multi extends TopLevel[multi with Double]
  
  /* 3 */ @js.native
  object repeat extends TopLevel[repeat with Double]
  
  /* 4 */ @js.native
  object single extends TopLevel[single with Double]
  
}

