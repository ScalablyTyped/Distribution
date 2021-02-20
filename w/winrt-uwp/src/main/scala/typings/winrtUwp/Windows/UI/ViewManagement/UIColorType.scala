package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UIColorType extends StObject
/** Defines constants that specify known system color values. */
@JSGlobal("Windows.UI.ViewManagement.UIColorType")
@js.native
object UIColorType extends StObject {
  
  /** The accent color. */
  @js.native
  sealed trait accent extends UIColorType
  
  /** The dark accent color. */
  @js.native
  sealed trait accentDark1 extends UIColorType
  
  /** The darker accent color. */
  @js.native
  sealed trait accentDark2 extends UIColorType
  
  /** The darkest accent color. */
  @js.native
  sealed trait accentDark3 extends UIColorType
  
  /** The light accent color. */
  @js.native
  sealed trait accentLight1 extends UIColorType
  
  /** The lighter accent color. */
  @js.native
  sealed trait accentLight2 extends UIColorType
  
  /** The lightest accent color. */
  @js.native
  sealed trait accentLight3 extends UIColorType
  
  /** The background color. */
  @js.native
  sealed trait background extends UIColorType
  
  /** The complement color. */
  @js.native
  sealed trait complement extends UIColorType
  
  /** The foreground color. */
  @js.native
  sealed trait foreground extends UIColorType
}
