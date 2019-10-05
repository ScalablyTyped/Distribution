package typings.winrt.Windows.Graphics.Printing.OptionDetails

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
  
  /* 3 */ val itemList: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList with Double = js.native
  /* 1 */ val number: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number with Double = js.native
  /* 2 */ val text: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text with Double = js.native
  /* 0 */ val unknown: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionType with Double] = js.native
}

