package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerStyle extends StObject
/** Specifies the style used to mark the item paragraphs in a list. */
@JSGlobal("Windows.UI.Text.MarkerStyle")
@js.native
object MarkerStyle extends StObject {
  
  /** The item marker is followed by a hyphen (-). */
  @js.native
  sealed trait minus
    extends StObject
       with MarkerStyle
  
  /** The items have no markers. */
  @js.native
  sealed trait noNumber
    extends StObject
       with MarkerStyle
  
  /** The item marker is enclosed in parentheses, as in (1). */
  @js.native
  sealed trait parentheses
    extends StObject
       with MarkerStyle
  
  /** The item marker is followed by a parenthesis, as in 1). */
  @js.native
  sealed trait parenthesis
    extends StObject
       with MarkerStyle
  
  /** The item marker is followed by a period. */
  @js.native
  sealed trait period
    extends StObject
       with MarkerStyle
  
  /** The item marker appears by itself. */
  @js.native
  sealed trait plain
    extends StObject
       with MarkerStyle
  
  /** The marker style is not defined. */
  @js.native
  sealed trait undefined
    extends StObject
       with MarkerStyle
}
