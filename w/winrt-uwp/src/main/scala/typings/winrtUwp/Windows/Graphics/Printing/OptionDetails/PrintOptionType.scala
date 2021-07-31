package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOptionType extends StObject
/** Specifies the print task option types. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
@js.native
object PrintOptionType extends StObject {
  
  /** A type of option that is a list of items. */
  @js.native
  sealed trait itemList
    extends StObject
       with PrintOptionType
  
  /** A type of option that is numerical. */
  @js.native
  sealed trait number
    extends StObject
       with PrintOptionType
  
  /** A type of option that is a string or some text. */
  @js.native
  sealed trait text
    extends StObject
       with PrintOptionType
  
  /** Unknown option type. */
  @js.native
  sealed trait unknown
    extends StObject
       with PrintOptionType
}
