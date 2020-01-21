package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

/** Represents the style of a font face (for example, normal or italic). */
@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends js.Object {
  /** Represents an italic font style. */
  @js.native
  sealed trait italic extends FontStyle
  
  /** Represents a normal font style. */
  @js.native
  sealed trait normal extends FontStyle
  
  /** Represents an oblique font style. */
  @js.native
  sealed trait oblique extends FontStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
  /* 2 */ @js.native
  object italic extends TopLevel[italic with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object oblique extends TopLevel[oblique with Double]
  
}

