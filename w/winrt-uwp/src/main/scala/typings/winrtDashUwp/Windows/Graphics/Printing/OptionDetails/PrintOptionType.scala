package typings.winrtDashUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList
import typings.winrtDashUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number
import typings.winrtDashUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text
import typings.winrtDashUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptionType with Double] = js.native
  /* 3 */ @js.native
  object itemList extends TopLevel[itemList with Double]
  
  /* 1 */ @js.native
  object number extends TopLevel[number with Double]
  
  /* 2 */ @js.native
  object text extends TopLevel[text with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

