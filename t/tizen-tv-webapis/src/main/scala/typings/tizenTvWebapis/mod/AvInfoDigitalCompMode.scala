package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AvInfoDigitalCompMode extends StObject
@JSImport("tizen-tv-webapis", "AvInfoDigitalCompMode")
@js.native
object AvInfoDigitalCompMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AvInfoDigitalCompMode & Double] = js.native
  
  /**
    * line mode
    *
    * @since 2.3
    */
  @js.native
  sealed trait DOLBY_DIGITAL_COMP_MODE_LINE
    extends StObject
       with AvInfoDigitalCompMode
  /* 0 */ val DOLBY_DIGITAL_COMP_MODE_LINE: typings.tizenTvWebapis.mod.AvInfoDigitalCompMode.DOLBY_DIGITAL_COMP_MODE_LINE & Double = js.native
  
  /**
    * rf mode
    *
    * @since 2.3
    */
  @js.native
  sealed trait DOLBY_DIGITAL_COMP_MODE_RF
    extends StObject
       with AvInfoDigitalCompMode
  /* 1 */ val DOLBY_DIGITAL_COMP_MODE_RF: typings.tizenTvWebapis.mod.AvInfoDigitalCompMode.DOLBY_DIGITAL_COMP_MODE_RF & Double = js.native
}
