package typings.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOptionType extends StObject
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
@js.native
object PrintOptionType extends StObject {
  
  @js.native
  sealed trait itemList extends PrintOptionType
  
  @js.native
  sealed trait number extends PrintOptionType
  
  @js.native
  sealed trait text extends PrintOptionType
  
  @js.native
  sealed trait unknown extends PrintOptionType
}
