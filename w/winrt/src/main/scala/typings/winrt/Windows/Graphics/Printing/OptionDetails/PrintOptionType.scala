package typings.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
