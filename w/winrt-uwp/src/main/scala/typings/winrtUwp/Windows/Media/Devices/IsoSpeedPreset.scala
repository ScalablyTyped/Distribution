package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IsoSpeedPreset extends js.Object

/** Defines the possible values for ISO speed presets. */
@JSGlobal("Windows.Media.Devices.IsoSpeedPreset")
@js.native
object IsoSpeedPreset extends js.Object {
  /** The film speed is automatically set. */
  @js.native
  sealed trait auto extends IsoSpeedPreset
  
  /** The film speed is set to 100 ISO. */
  @js.native
  sealed trait iso100 extends IsoSpeedPreset
  
  /** The film speed is set to 12800 ISO. */
  @js.native
  sealed trait iso12800 extends IsoSpeedPreset
  
  /** The film speed is set to 1600 ISO. */
  @js.native
  sealed trait iso1600 extends IsoSpeedPreset
  
  /** The film speed is set to 200 ISO. */
  @js.native
  sealed trait iso200 extends IsoSpeedPreset
  
  /** The film speed is set to 25600 ISO. */
  @js.native
  sealed trait iso25600 extends IsoSpeedPreset
  
  /** The film speed is set to 3200 ISO. */
  @js.native
  sealed trait iso3200 extends IsoSpeedPreset
  
  /** The film speed is set to 400 ISO. */
  @js.native
  sealed trait iso400 extends IsoSpeedPreset
  
  /** The film speed is set to 50 ISO. */
  @js.native
  sealed trait iso50 extends IsoSpeedPreset
  
  /** The film speed is set to 6400 ISO. */
  @js.native
  sealed trait iso6400 extends IsoSpeedPreset
  
  /** The film speed is set to 80 ISO. */
  @js.native
  sealed trait iso80 extends IsoSpeedPreset
  
  /** The film speed is set to 800 ISO. */
  @js.native
  sealed trait iso800 extends IsoSpeedPreset
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IsoSpeedPreset with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 3 */ @js.native
  object iso100 extends TopLevel[iso100 with Double]
  
  /* 10 */ @js.native
  object iso12800 extends TopLevel[iso12800 with Double]
  
  /* 7 */ @js.native
  object iso1600 extends TopLevel[iso1600 with Double]
  
  /* 4 */ @js.native
  object iso200 extends TopLevel[iso200 with Double]
  
  /* 11 */ @js.native
  object iso25600 extends TopLevel[iso25600 with Double]
  
  /* 8 */ @js.native
  object iso3200 extends TopLevel[iso3200 with Double]
  
  /* 5 */ @js.native
  object iso400 extends TopLevel[iso400 with Double]
  
  /* 1 */ @js.native
  object iso50 extends TopLevel[iso50 with Double]
  
  /* 9 */ @js.native
  object iso6400 extends TopLevel[iso6400 with Double]
  
  /* 2 */ @js.native
  object iso80 extends TopLevel[iso80 with Double]
  
  /* 6 */ @js.native
  object iso800 extends TopLevel[iso800 with Double]
  
}

