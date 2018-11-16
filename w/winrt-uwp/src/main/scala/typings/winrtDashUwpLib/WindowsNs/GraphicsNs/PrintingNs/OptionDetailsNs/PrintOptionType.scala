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
  
  val itemList: itemList with java.lang.String = js.native
  val number: number with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintOptionType with java.lang.String
  ] = js.native
}

