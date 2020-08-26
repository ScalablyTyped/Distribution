package typings.tizenCommonWeb.tvwindowMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MeasurementUnit extends js.Object

@JSImport("tizen-common-web/tvwindow", "MeasurementUnit")
@js.native
object MeasurementUnit extends js.Object {
  @js.native
  sealed trait Percentsign extends MeasurementUnit
  
  @js.native
  sealed trait px extends MeasurementUnit
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MeasurementUnit with String] = js.native
  /* "%" */ @js.native
  object Percentsign extends TopLevel[Percentsign with String]
  
  /* "px" */ @js.native
  object px extends TopLevel[px with String]
  
}

