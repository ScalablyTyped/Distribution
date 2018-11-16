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
  
  val itemList: itemList with java.lang.String = js.native
  val number: number with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType with java.lang.String
  ] = js.native
}

