package typings.winrtDashUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportPowerSource extends js.Object

/** Specifies the current power source of the source device containing items to be imported. */
@JSGlobal("Windows.Media.Import.PhotoImportPowerSource")
@js.native
object PhotoImportPowerSource extends js.Object {
  /** The current power source is a battery. */
  @js.native
  sealed trait battery extends PhotoImportPowerSource
  
  /** The current power source is external. */
  @js.native
  sealed trait external extends PhotoImportPowerSource
  
  /** The current power source is unknown. */
  @js.native
  sealed trait unknown extends PhotoImportPowerSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportPowerSource with Double] = js.native
  /* 1 */ @js.native
  object battery extends TopLevel[battery with Double]
  
  /* 2 */ @js.native
  object external extends TopLevel[external with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

