package typings.winrtUwp.global.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the clock identifiers for the supported clocks, as static properties. */
/* note: abstract class */ @JSGlobal("Windows.Globalization.ClockIdentifiers")
@js.native
open class ClockIdentifiers ()
  extends StObject
     with typings.winrtUwp.Windows.Globalization.ClockIdentifiers
object ClockIdentifiers {
  
  @JSGlobal("Windows.Globalization.ClockIdentifiers")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the identifier for a 12-hour clock. */
  /* static member */
  @JSGlobal("Windows.Globalization.ClockIdentifiers.twelveHour")
  @js.native
  def twelveHour: String = js.native
  inline def twelveHour_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("twelveHour")(x.asInstanceOf[js.Any])
  
  /** Gets the identifier for a 24-hour clock. */
  /* static member */
  @JSGlobal("Windows.Globalization.ClockIdentifiers.twentyFourHour")
  @js.native
  def twentyFourHour: String = js.native
  inline def twentyFourHour_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("twentyFourHour")(x.asInstanceOf[js.Any])
}
