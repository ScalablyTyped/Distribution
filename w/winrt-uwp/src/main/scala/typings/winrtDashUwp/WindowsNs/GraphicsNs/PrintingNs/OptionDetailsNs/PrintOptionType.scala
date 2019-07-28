package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

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
  sealed trait itemList extends PrintOptionType
  
  /** A type of option that is numerical. */
  @js.native
  sealed trait number extends PrintOptionType
  
  /** A type of option that is a string or some text. */
  @js.native
  sealed trait text extends PrintOptionType
  
  /** Unknown option type. */
  @js.native
  sealed trait unknown extends PrintOptionType
  
  /* 3 */ val itemList: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.itemList with Double = js.native
  /* 1 */ val number: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.number with Double = js.native
  /* 2 */ val text: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.text with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionType with Double] = js.native
}

