package typings.winrtUwp.global.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates
import typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extends the basic print task options to enable you to have greater control over the printing experience that you present to your users. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails")
@js.native
object OptionDetails extends js.Object {
  /** Represents the list of print binding options. */
  @js.native
  abstract class PrintBindingOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the print binding options. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID of the print binding option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type of the print binding option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the print binding option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the print binding option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the print binding option.
      * @param value Value for the print binding option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of print collation options. */
  @js.native
  abstract class PrintCollationOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the print collation option. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID of the print collation option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the print collation option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the print collation option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the print collation option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the print collation option.
      * @param value Value for the print collation option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of print color mode options. */
  @js.native
  abstract class PrintColorModeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the print color mode option. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID for the print color mode option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the print color mode option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the print color mode option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the print color mode option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the print color mode option.
      * @param value Value for the print color mode option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the option for the number of printed copies. */
  @js.native
  abstract class PrintCopiesOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the value for the maximum number of printed copies allowed. */
    /* CompleteClass */
    override var maxValue: Double = js.native
    /** Gets the value for the minimum number of printed copies allowed. */
    /* CompleteClass */
    override var minValue: Double = js.native
    /** Gets the ID for the option for the number of printed copies. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the option for the number of printed copies. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the option for the number of printed copies. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the number of copies for a print task. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the print copies option.
      * @param value Value for the print copies option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Allows apps to add a collection of enumerable options to the app print experience. */
  @js.native
  abstract class PrintCustomItemDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails {
    /** Gets or sets the display name of the custom print task option item. */
    /* CompleteClass */
    override var itemDisplayName: String = js.native
    /** Gets the ID of the custom print task option item. */
    /* CompleteClass */
    override var itemId: String = js.native
  }
  
  /** Represents a list of the custom print task option items. */
  @js.native
  abstract class PrintCustomItemListOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails {
    /** Gets or sets the display name of an item in the list of custom print task options. */
    /* CompleteClass */
    override var displayName: String = js.native
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets an item from the list of custom print tasks. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID of a custom print task option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for a custom print task option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the list of custom print task option items. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the value of the list of custom print tasks. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the ID or display name of an item in the list of custom print task options.
      * @param itemId The ID of the option item.
      * @param displayName The display name of the option item.
      */
    /* CompleteClass */
    override def addItem(itemId: String, displayName: String): Unit = js.native
    /**
      * Sets the value for the item ID or the display name of the custom item.
      * @param value Value for the item ID or the display name of the custom item.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents a custom print task option. */
  @js.native
  abstract class PrintCustomTextOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails {
    /** Gets or sets the display name of the custom print task option. */
    /* CompleteClass */
    override var displayName: String = js.native
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets or sets the maximum number of characters for the display name of the custom print task option. */
    /* CompleteClass */
    override var maxCharacters: Double = js.native
    /** Gets the ID of the custom print task option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the custom print task option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of a custom print task option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the value of a custom print task option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the custom print task.
      * @param value Value for the custom print task.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of print duplex options. */
  @js.native
  abstract class PrintDuplexOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of print duplex options. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID of the print duplex option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type of the print duplex option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the print duplex options. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated vlaue of the print duplex option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the duplex option.
      * @param value Value for the duplex option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of punch hole options. */
  @js.native
  abstract class PrintHolePunchOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the hole punch option. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID for the hole punch option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the hole punch option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the hole punch option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the hole punch option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the hole punch option.
      * @param value Value for the hole punch option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of media size options. */
  @js.native
  abstract class PrintMediaSizeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of print media size option items. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID for the print media size option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the option for the number of printed copies. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the option for the number of printed copies. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the number of copies for a print task. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the media size option.
      * @param value Value for the media size option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of print media type options. */
  @js.native
  abstract class PrintMediaTypeOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the print media type options. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID for the print media type option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the print media type option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state for the print media type option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the print media type option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the media type option.
      * @param value Value for the media type option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of print orientation options. */
  @js.native
  abstract class PrintOrientationOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the print media type options. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID for the print orientation option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the print media type option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state for the print media type option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the print media type option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the print orientation option.
      * @param value Value for the print orientation option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents the list of print quality options. */
  @js.native
  abstract class PrintQualityOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the print quality options. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID for the print quality option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the print quality option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the print quality option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the print quality option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the print quality option.
      * @param value Value for the print quality option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Represents a list of the stapling options. */
  @js.native
  abstract class PrintStapleOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails {
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    override var errorText: String = js.native
    /** Gets the list of items for the stapling options. */
    /* CompleteClass */
    override var items: IVectorView[_] = js.native
    /** Gets the ID for the stapling option. */
    /* CompleteClass */
    override var optionId: String = js.native
    /** Gets the option type for the stapling option. */
    /* CompleteClass */
    override var optionType: PrintOptionType = js.native
    /** Gets or sets the state of the stapling option. */
    /* CompleteClass */
    override var state: PrintOptionStates = js.native
    /** Gets or sets the enumerated value of the stapling option. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Sets the value for the staple opiton.
      * @param value Value for the staple opiton.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
  }
  
  /** Called when a print task option has changed. */
  @js.native
  abstract class PrintTaskOptionChangedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs {
    /** Gets the ID of the print task option that changed. */
    /* CompleteClass */
    override var optionId: js.Any = js.native
  }
  
  /** A collection of events, methods and properties for advanced print tasks. */
  @js.native
  abstract class PrintTaskOptionDetails ()
    extends typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails
  
  /** Specifies the print task option states. */
  @js.native
  object PrintOptionStates extends js.Object {
    /* 2 */ val constrained: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained with Double = js.native
    /* 1 */ val enabled: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates with Double
      ] = js.native
  }
  
  /** Specifies the print task option types. */
  @js.native
  object PrintOptionType extends js.Object {
    /* 3 */ val itemList: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList with Double = js.native
    /* 1 */ val number: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number with Double = js.native
    /* 2 */ val text: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text with Double = js.native
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType with Double
      ] = js.native
  }
  
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

