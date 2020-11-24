package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
