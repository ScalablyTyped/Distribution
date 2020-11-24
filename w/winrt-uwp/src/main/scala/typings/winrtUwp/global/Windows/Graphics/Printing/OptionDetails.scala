package typings.winrtUwp.global.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extends the basic print task options to enable you to have greater control over the printing experience that you present to your users. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails")
@js.native
object OptionDetails extends js.Object {
  
  /** Represents the list of print binding options. */
  @js.native
  abstract class PrintBindingOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails
  
  /** Represents the list of print collation options. */
  @js.native
  abstract class PrintCollationOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails
  
  /** Represents the list of print color mode options. */
  @js.native
  abstract class PrintColorModeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails
  
  /** Represents the option for the number of printed copies. */
  @js.native
  abstract class PrintCopiesOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails
  
  /** Allows apps to add a collection of enumerable options to the app print experience. */
  @js.native
  abstract class PrintCustomItemDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails
  
  /** Represents a list of the custom print task option items. */
  @js.native
  abstract class PrintCustomItemListOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails
  
  /** Represents a custom print task option. */
  @js.native
  abstract class PrintCustomTextOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails
  
  /** Represents the list of print duplex options. */
  @js.native
  abstract class PrintDuplexOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails
  
  /** Represents the list of punch hole options. */
  @js.native
  abstract class PrintHolePunchOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails
  
  /** Represents the list of media size options. */
  @js.native
  abstract class PrintMediaSizeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails
  
  /** Represents the list of print media type options. */
  @js.native
  abstract class PrintMediaTypeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails
  
  /** Specifies the print task option states. */
  @js.native
  object PrintOptionStates extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates with Double
      ] = js.native
    
    /* 2 */ val constrained: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained with Double = js.native
    
    /* 1 */ val enabled: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none with Double = js.native
  }
  
  /** Specifies the print task option types. */
  @js.native
  object PrintOptionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType with Double
      ] = js.native
    
    /* 3 */ val itemList: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList with Double = js.native
    
    /* 1 */ val number: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number with Double = js.native
    
    /* 2 */ val text: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown with Double = js.native
  }
  
  /** Represents the list of print orientation options. */
  @js.native
  abstract class PrintOrientationOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails
  
  /** Represents the list of print quality options. */
  @js.native
  abstract class PrintQualityOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails
  
  /** Represents a list of the stapling options. */
  @js.native
  abstract class PrintStapleOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails
  
  /** Called when a print task option has changed. */
  @js.native
  abstract class PrintTaskOptionChangedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs
  
  /** A collection of events, methods and properties for advanced print tasks. */
  @js.native
  abstract class PrintTaskOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails
  /* static members */
  @js.native
  object PrintTaskOptionDetails extends js.Object {
    
    /**
      * Used to retrieve the available options for a print task.
      * @param printTaskOptions Pointer to a PrintTaskOptions object.
      * @return Pointer to a PrintTaskOptionDetails object.
      */
    def getFromPrintTaskOptions(printTaskOptions: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskOptions): typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails = js.native
  }
}
