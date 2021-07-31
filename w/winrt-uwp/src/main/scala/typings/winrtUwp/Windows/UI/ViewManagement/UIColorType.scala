package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UIColorType extends StObject
/** Defines constants that specify known system color values. */
@JSGlobal("Windows.UI.ViewManagement.UIColorType")
@js.native
object UIColorType extends StObject {
  
  /** The accent color. */
  @js.native
  sealed trait accent
    extends StObject
       with UIColorType
  
  /** The dark accent color. */
  @js.native
  sealed trait accentDark1
    extends StObject
       with UIColorType
  
  /** The darker accent color. */
  @js.native
  sealed trait accentDark2
    extends StObject
       with UIColorType
  
  /** The darkest accent color. */
  @js.native
  sealed trait accentDark3
    extends StObject
       with UIColorType
  
  /** The light accent color. */
  @js.native
  sealed trait accentLight1
    extends StObject
       with UIColorType
  
  /** The lighter accent color. */
  @js.native
  sealed trait accentLight2
    extends StObject
       with UIColorType
  
  /** The lightest accent color. */
  @js.native
  sealed trait accentLight3
    extends StObject
       with UIColorType
  
  /** The background color. */
  @js.native
  sealed trait background
    extends StObject
       with UIColorType
  
  /** The complement color. */
  @js.native
  sealed trait complement
    extends StObject
       with UIColorType
  
  /** The foreground color. */
  @js.native
  sealed trait foreground
    extends StObject
       with UIColorType
}
