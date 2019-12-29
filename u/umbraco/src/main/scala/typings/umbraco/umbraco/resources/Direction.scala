package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

/**
  * Can be Ascending or Descending - Default: Ascending
  */
@JSGlobal("umbraco.resources.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait Ascending extends Direction
  
  @js.native
  sealed trait Descending extends Direction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

