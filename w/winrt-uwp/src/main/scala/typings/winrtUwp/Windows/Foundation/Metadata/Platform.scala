package typings.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Platform extends js.Object

/** Specifies the platforms that a specified type should be supported in, as used by Windows Runtime attributes and metadata. */
@JSGlobal("Windows.Foundation.Metadata.Platform")
@js.native
object Platform extends js.Object {
  /** For use by Windows metadata. */
  @js.native
  sealed trait windows extends Platform
  
  /** For use by Windows Phone metadata. */
  @js.native
  sealed trait windowsPhone extends Platform
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Platform with Double] = js.native
  /* 0 */ @js.native
  object windows extends TopLevel[windows with Double]
  
  /* 1 */ @js.native
  object windowsPhone extends TopLevel[windowsPhone with Double]
  
}

