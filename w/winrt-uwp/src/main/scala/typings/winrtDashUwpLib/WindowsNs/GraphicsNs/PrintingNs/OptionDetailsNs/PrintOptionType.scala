package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptionType extends js.Object

/** Specifies the print task option types. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
@js.native
object PrintOptionType extends js.Object {
  /** A type of option that is a list of items. */
  @js.native
  sealed trait itemList
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  /** A type of option that is numerical. */
  @js.native
  sealed trait number
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  /** A type of option that is a string or some text. */
  @js.native
  sealed trait text
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  /** Unknown option type. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  /* 3 */ val itemList: itemList with scala.Double = js.native
  /* 1 */ val number: number with scala.Double = js.native
  /* 2 */ val text: text with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType with scala.Double
  ] = js.native
}

