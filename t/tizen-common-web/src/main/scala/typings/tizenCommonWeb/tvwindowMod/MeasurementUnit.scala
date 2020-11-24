package typings.tizenCommonWeb.tvwindowMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MeasurementUnit extends js.Object
@JSImport("tizen-common-web/tvwindow", "MeasurementUnit")
@js.native
object MeasurementUnit extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MeasurementUnit with String] = js.native
  
  @js.native
  sealed trait Percentsign extends MeasurementUnit
  /* "%" */ @js.native
  object Percentsign extends TopLevel[Percentsign with String]
  
  @js.native
  sealed trait px extends MeasurementUnit
  /* "px" */ @js.native
  object px extends TopLevel[px with String]
}
