package typings.winrt.global.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionDetails {
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails")
  @js.native
  class PrintBindingOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails")
  @js.native
  class PrintCollationOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails")
  @js.native
  class PrintColorModeOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails")
  @js.native
  class PrintCopiesOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails")
  @js.native
  class PrintCustomItemDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails")
  @js.native
  class PrintCustomItemListOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails")
  @js.native
  class PrintCustomTextOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails")
  @js.native
  class PrintDuplexOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails")
  @js.native
  class PrintHolePunchOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails")
  @js.native
  class PrintMediaSizeOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails")
  @js.native
  class PrintMediaTypeOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
  @js.native
  object PrintOptionStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates with Double
      ] = js.native
    
    /* 2 */ val constrained: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained with Double = js.native
    
    /* 1 */ val enabled: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
  @js.native
  object PrintOptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType with Double
      ] = js.native
    
    /* 3 */ val itemList: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList with Double = js.native
    
    /* 1 */ val number: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number with Double = js.native
    
    /* 2 */ val text: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text with Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails")
  @js.native
  class PrintOrientationOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails")
  @js.native
  class PrintQualityOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails")
  @js.native
  class PrintStapleOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs")
  @js.native
  class PrintTaskOptionChangedEventArgs ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
  @js.native
  class PrintTaskOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails
  /* static members */
  object PrintTaskOptionDetails {
    
    @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails.getFromPrintTaskOptions")
    @js.native
    def getFromPrintTaskOptions(printTaskOptions: typings.winrt.Windows.Graphics.Printing.PrintTaskOptions): typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails = js.native
  }
}
