package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerStyle extends js.Object
/** Specifies the style used to mark the item paragraphs in a list. */
@JSGlobal("Windows.UI.Text.MarkerStyle")
@js.native
object MarkerStyle extends js.Object {
  
  /** The item marker is followed by a hyphen (-). */
  @js.native
  sealed trait minus extends MarkerStyle
  
  /** The items have no markers. */
  @js.native
  sealed trait noNumber extends MarkerStyle
  
  /** The item marker is enclosed in parentheses, as in (1). */
  @js.native
  sealed trait parentheses extends MarkerStyle
  
  /** The item marker is followed by a parenthesis, as in 1). */
  @js.native
  sealed trait parenthesis extends MarkerStyle
  
  /** The item marker is followed by a period. */
  @js.native
  sealed trait period extends MarkerStyle
  
  /** The item marker appears by itself. */
  @js.native
  sealed trait plain extends MarkerStyle
  
  /** The marker style is not defined. */
  @js.native
  sealed trait undefined extends MarkerStyle
}
