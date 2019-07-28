package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptionType extends js.Object

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
@js.native
object PrintOptionType extends js.Object {
  @js.native
  sealed trait itemList extends PrintOptionType
  
  @js.native
  sealed trait number extends PrintOptionType
  
  @js.native
  sealed trait text extends PrintOptionType
  
  @js.native
  sealed trait unknown extends PrintOptionType
  
  /* 3 */ val itemList: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.itemList with Double = js.native
  /* 1 */ val number: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.number with Double = js.native
  /* 2 */ val text: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.text with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionType with Double] = js.native
}

