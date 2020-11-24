package typings.tizenTvWebapis.avinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AvInfoDigitalCompMode extends js.Object
@JSImport("tizen-tv-webapis/avinfo", "AvInfoDigitalCompMode")
@js.native
object AvInfoDigitalCompMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AvInfoDigitalCompMode with Double] = js.native
  
  /**
    * line mode
    * @since 2.3
    */
  @js.native
  sealed trait DOLBY_DIGITAL_COMP_MODE_LINE extends AvInfoDigitalCompMode
  /* 0 */ @js.native
  object DOLBY_DIGITAL_COMP_MODE_LINE extends TopLevel[DOLBY_DIGITAL_COMP_MODE_LINE with Double]
  
  /**
    * rf mode
    * @since 2.3
    */
  @js.native
  sealed trait DOLBY_DIGITAL_COMP_MODE_RF extends AvInfoDigitalCompMode
  /* 1 */ @js.native
  object DOLBY_DIGITAL_COMP_MODE_RF extends TopLevel[DOLBY_DIGITAL_COMP_MODE_RF with Double]
}
