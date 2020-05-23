package typings.winrt.global.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Graphics.Printing.OptionDetails.IPrintOptionDetails
import typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates
import typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType
import typings.winrt.Windows.Graphics.Printing.PrintPageDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails")
@js.native
object OptionDetails extends js.Object {
  @js.native
  class PrintBindingOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintCollationOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintColorModeOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintCopiesOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var maxValue: Double = js.native
    /* CompleteClass */
    override var minValue: Double = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintCustomItemDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails {
    /* CompleteClass */
    override var itemDisplayName: String = js.native
    /* CompleteClass */
    override var itemId: String = js.native
  }
  
  @js.native
  class PrintCustomItemListOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails {
    /* CompleteClass */
    override var displayName: String = js.native
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def addItem(itemId: String, displayName: String): Unit = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintCustomTextOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails {
    /* CompleteClass */
    override var displayName: String = js.native
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var maxCharacters: Double = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintDuplexOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintHolePunchOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintMediaSizeOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintMediaTypeOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintOrientationOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintQualityOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintStapleOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails {
    /* CompleteClass */
    override var errorText: String = js.native
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /* CompleteClass */
    override var optionId: String = js.native
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  @js.native
  class PrintTaskOptionChangedEventArgs ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs {
    /* CompleteClass */
    override var optionId: js.Any = js.native
  }
  
  @js.native
  class PrintTaskOptionDetails ()
    extends typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails {
    /* CompleteClass */
    override var displayedOptions: IVector[String] = js.native
    /* CompleteClass */
    override var onbeginvalidation: js.Any = js.native
    /* CompleteClass */
    override var onoptionchanged: js.Any = js.native
    /* CompleteClass */
    override var options: IMapView[String, IPrintOptionDetails] = js.native
    /* CompleteClass */
    override def createItemListOption(optionId: String, displayName: String): typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails = js.native
    /* CompleteClass */
    override def createTextOption(optionId: String, displayName: String): typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails = js.native
    /* CompleteClass */
    override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
  }
  
  @js.native
  object PrintOptionStates extends js.Object {
    /* 2 */ val constrained: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained with Double = js.native
    /* 1 */ val enabled: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionStates with Double
      ] = js.native
  }
  
  @js.native
  object PrintOptionType extends js.Object {
    /* 3 */ val itemList: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList with Double = js.native
    /* 1 */ val number: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number with Double = js.native
    /* 2 */ val text: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text with Double = js.native
    /* 0 */ val unknown: typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintOptionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object PrintTaskOptionDetails extends js.Object {
    def getFromPrintTaskOptions(printTaskOptions: typings.winrt.Windows.Graphics.Printing.PrintTaskOptions): typings.winrt.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails = js.native
  }
  
}

