package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LaunchQuerySupportType extends js.Object

/** Specifies the type of activation to query for. */
@JSGlobal("Windows.System.LaunchQuerySupportType")
@js.native
object LaunchQuerySupportType extends js.Object {
  /** Activate by URI but do not return a result to the calling app. This is the default. */
  @js.native
  sealed trait uri extends LaunchQuerySupportType
  
  /** Activate by URI and return a result to the calling app. */
  @js.native
  sealed trait uriForResults extends LaunchQuerySupportType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LaunchQuerySupportType with Double] = js.native
  /* 0 */ @js.native
  object uri extends TopLevel[uri with Double]
  
  /* 1 */ @js.native
  object uriForResults extends TopLevel[uriForResults with Double]
  
}

