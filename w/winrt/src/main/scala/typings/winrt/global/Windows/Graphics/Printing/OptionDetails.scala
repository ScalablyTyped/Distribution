package typings.winrt.global.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Graphics.Printing.OptionDetails.IPrintOptionDetails
import typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates
import typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType
import typings.winrt.Windows.Graphics.Printing.PrintPageDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionDetails {
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails")
  @js.native
  class PrintBindingOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails")
  @js.native
  class PrintCollationOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails")
  @js.native
  class PrintColorModeOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails")
  @js.native
  class PrintCopiesOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var maxValue: Double = js.native
    
    /* CompleteClass */
    var minValue: Double = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails")
  @js.native
  class PrintCustomItemDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails {
    
    /* CompleteClass */
    var itemDisplayName: String = js.native
    
    /* CompleteClass */
    var itemId: String = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails")
  @js.native
  class PrintCustomItemListOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails {
    
    /* CompleteClass */
    override def addItem(itemId: String, displayName: String): Unit = js.native
    
    /* CompleteClass */
    var displayName: String = js.native
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails")
  @js.native
  class PrintCustomTextOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails {
    
    /* CompleteClass */
    var displayName: String = js.native
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var maxCharacters: Double = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails")
  @js.native
  class PrintDuplexOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails")
  @js.native
  class PrintHolePunchOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails")
  @js.native
  class PrintMediaSizeOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails")
  @js.native
  class PrintMediaTypeOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
  @js.native
  object PrintOptionStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates & Double] = js.native
    
    /* 2 */ val constrained: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained & Double = js.native
    
    /* 1 */ val enabled: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
  @js.native
  object PrintOptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType & Double] = js.native
    
    /* 3 */ val itemList: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList & Double = js.native
    
    /* 1 */ val number: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number & Double = js.native
    
    /* 2 */ val text: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails")
  @js.native
  class PrintOrientationOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails")
  @js.native
  class PrintQualityOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails")
  @js.native
  class PrintStapleOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails {
    
    /* CompleteClass */
    var errorText: String = js.native
    
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /* CompleteClass */
    var optionId: String = js.native
    
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs")
  @js.native
  class PrintTaskOptionChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs {
    
    /* CompleteClass */
    var optionId: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
  @js.native
  class PrintTaskOptionDetails ()
    extends StObject
       with typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails {
    
    /* CompleteClass */
    override def createItemListOption(optionId: String, displayName: String): typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails = js.native
    
    /* CompleteClass */
    override def createTextOption(optionId: String, displayName: String): typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails = js.native
    
    /* CompleteClass */
    var displayedOptions: IVector[String] = js.native
    
    /* CompleteClass */
    override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
    
    /* CompleteClass */
    var onbeginvalidation: js.Any = js.native
    
    /* CompleteClass */
    var onoptionchanged: js.Any = js.native
    
    /* CompleteClass */
    var options: IMapView[String, IPrintOptionDetails] = js.native
  }
  /* static members */
  object PrintTaskOptionDetails {
    
    @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFromPrintTaskOptions(printTaskOptions: typings.winrt.Windows.Graphics.Printing.PrintTaskOptions): typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromPrintTaskOptions")(printTaskOptions.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails]
  }
}
