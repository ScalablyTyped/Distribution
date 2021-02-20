package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintColorMode extends StObject
/** Specifies the color mode option. */
@JSGlobal("Windows.Graphics.Printing.PrintColorMode")
@js.native
object PrintColorMode extends StObject {
  
  /** The default color mode option. */
  @js.native
  sealed trait default extends PrintColorMode
  
  /** An option to indicate that the printed output will be in color. */
  @js.native
  sealed trait color extends PrintColorMode
  
  /** An option to indicate that the printed output will be in shades of gray. */
  @js.native
  sealed trait grayscale extends PrintColorMode
  
  /** An option to indicate that the printed output will be in one shade of a single color. */
  @js.native
  sealed trait monochrome extends PrintColorMode
  
  /** An unsupported color mode option. */
  @js.native
  sealed trait notAvailable extends PrintColorMode
  
  /** A custom color mode option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintColorMode
}
