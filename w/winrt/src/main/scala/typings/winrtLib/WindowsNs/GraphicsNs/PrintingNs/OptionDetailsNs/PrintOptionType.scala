package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptionType extends js.Object

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
@js.native
object PrintOptionType extends js.Object {
  @js.native
  sealed trait itemList
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  @js.native
  sealed trait number
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  @js.native
  sealed trait text
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType
  
  /* 3 */ val itemList: itemList with scala.Double = js.native
  /* 1 */ val number: number with scala.Double = js.native
  /* 2 */ val text: text with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType with scala.Double
  ] = js.native
}

