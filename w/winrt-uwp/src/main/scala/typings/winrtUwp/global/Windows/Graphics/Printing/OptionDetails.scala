package typings.winrtUwp.global.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extends the basic print task options to enable you to have greater control over the printing experience that you present to your users. */
object OptionDetails {
  
  /** Represents the list of print binding options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails")
  @js.native
  abstract class PrintBindingOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails
  
  /** Represents the list of print collation options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails")
  @js.native
  abstract class PrintCollationOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails
  
  /** Represents the list of print color mode options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails")
  @js.native
  abstract class PrintColorModeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails
  
  /** Represents the option for the number of printed copies. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails")
  @js.native
  abstract class PrintCopiesOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails
  
  /** Allows apps to add a collection of enumerable options to the app print experience. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails")
  @js.native
  abstract class PrintCustomItemDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails
  
  /** Represents a list of the custom print task option items. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails")
  @js.native
  abstract class PrintCustomItemListOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails
  
  /** Represents a custom print task option. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails")
  @js.native
  abstract class PrintCustomTextOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails
  
  /** Represents the list of print duplex options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails")
  @js.native
  abstract class PrintDuplexOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails
  
  /** Represents the list of punch hole options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails")
  @js.native
  abstract class PrintHolePunchOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails
  
  /** Represents the list of media size options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails")
  @js.native
  abstract class PrintMediaSizeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails
  
  /** Represents the list of print media type options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails")
  @js.native
  abstract class PrintMediaTypeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails
  
  /** Specifies the print task option states. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
  @js.native
  object PrintOptionStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates with Double
      ] = js.native
    
    /* 2 */ val constrained: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained with Double = js.native
    
    /* 1 */ val enabled: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none with Double = js.native
  }
  
  /** Specifies the print task option types. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
  @js.native
  object PrintOptionType extends StObject {
    
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
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails")
  @js.native
  abstract class PrintOrientationOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails
  
  /** Represents the list of print quality options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails")
  @js.native
  abstract class PrintQualityOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails
  
  /** Represents a list of the stapling options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails")
  @js.native
  abstract class PrintStapleOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails
  
  /** Called when a print task option has changed. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs")
  @js.native
  abstract class PrintTaskOptionChangedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs
  
  /** A collection of events, methods and properties for advanced print tasks. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
  @js.native
  abstract class PrintTaskOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails
  object PrintTaskOptionDetails {
    
    /**
      * Used to retrieve the available options for a print task.
      * @param printTaskOptions Pointer to a PrintTaskOptions object.
      * @return Pointer to a PrintTaskOptionDetails object.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails.getFromPrintTaskOptions")
    @js.native
    def getFromPrintTaskOptions(printTaskOptions: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskOptions): typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails = js.native
  }
}
