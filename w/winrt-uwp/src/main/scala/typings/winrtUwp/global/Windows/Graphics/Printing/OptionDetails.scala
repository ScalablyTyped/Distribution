package typings.winrtUwp.global.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates
import typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extends the basic print task options to enable you to have greater control over the printing experience that you present to your users. */
object OptionDetails {
  
  /** Represents the list of print binding options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails")
  @js.native
  abstract class PrintBindingOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the print binding options. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID of the print binding option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type of the print binding option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the print binding option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the print binding option.
      * @param value Value for the print binding option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the print binding option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the list of print collation options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails")
  @js.native
  abstract class PrintCollationOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the print collation option. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID of the print collation option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the print collation option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the print collation option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the print collation option.
      * @param value Value for the print collation option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the print collation option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the list of print color mode options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails")
  @js.native
  abstract class PrintColorModeOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the print color mode option. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID for the print color mode option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the print color mode option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the print color mode option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the print color mode option.
      * @param value Value for the print color mode option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the print color mode option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the option for the number of printed copies. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails")
  @js.native
  abstract class PrintCopiesOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the value for the maximum number of printed copies allowed. */
    /* CompleteClass */
    var maxValue: Double = js.native
    
    /** Gets the value for the minimum number of printed copies allowed. */
    /* CompleteClass */
    var minValue: Double = js.native
    
    /** Gets the ID for the option for the number of printed copies. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the option for the number of printed copies. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the option for the number of printed copies. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the print copies option.
      * @param value Value for the print copies option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the number of copies for a print task. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Allows apps to add a collection of enumerable options to the app print experience. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails")
  @js.native
  abstract class PrintCustomItemDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails {
    
    /** Gets or sets the display name of the custom print task option item. */
    /* CompleteClass */
    var itemDisplayName: String = js.native
    
    /** Gets the ID of the custom print task option item. */
    /* CompleteClass */
    var itemId: String = js.native
  }
  
  /** Represents a list of the custom print task option items. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails")
  @js.native
  abstract class PrintCustomItemListOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails {
    
    /**
      * Sets the ID or display name of an item in the list of custom print task options.
      * @param itemId The ID of the option item.
      * @param displayName The display name of the option item.
      */
    /* CompleteClass */
    override def addItem(itemId: String, displayName: String): Unit = js.native
    
    /** Gets or sets the display name of an item in the list of custom print task options. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets an item from the list of custom print tasks. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID of a custom print task option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for a custom print task option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the list of custom print task option items. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the item ID or the display name of the custom item.
      * @param value Value for the item ID or the display name of the custom item.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the value of the list of custom print tasks. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents a custom print task option. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails")
  @js.native
  abstract class PrintCustomTextOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails {
    
    /** Gets or sets the display name of the custom print task option. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets or sets the maximum number of characters for the display name of the custom print task option. */
    /* CompleteClass */
    var maxCharacters: Double = js.native
    
    /** Gets the ID of the custom print task option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the custom print task option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of a custom print task option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the custom print task.
      * @param value Value for the custom print task.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the value of a custom print task option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the list of print duplex options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails")
  @js.native
  abstract class PrintDuplexOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of print duplex options. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID of the print duplex option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type of the print duplex option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the print duplex options. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the duplex option.
      * @param value Value for the duplex option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated vlaue of the print duplex option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the list of punch hole options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails")
  @js.native
  abstract class PrintHolePunchOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the hole punch option. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID for the hole punch option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the hole punch option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the hole punch option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the hole punch option.
      * @param value Value for the hole punch option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the hole punch option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the list of media size options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails")
  @js.native
  abstract class PrintMediaSizeOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of print media size option items. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID for the print media size option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the option for the number of printed copies. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the option for the number of printed copies. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the media size option.
      * @param value Value for the media size option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the number of copies for a print task. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the list of print media type options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails")
  @js.native
  abstract class PrintMediaTypeOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the print media type options. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID for the print media type option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the print media type option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state for the print media type option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the media type option.
      * @param value Value for the media type option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the print media type option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Specifies the print task option states. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionStates")
  @js.native
  object PrintOptionStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates & Double
      ] = js.native
    
    /* 2 */ val constrained: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.constrained & Double = js.native
    
    /* 1 */ val enabled: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.enabled & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionStates.none & Double = js.native
  }
  
  /** Specifies the print task option types. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
  @js.native
  object PrintOptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType & Double
      ] = js.native
    
    /* 3 */ val itemList: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.itemList & Double = js.native
    
    /* 1 */ val number: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.number & Double = js.native
    
    /* 2 */ val text: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.text & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOptionType.unknown & Double = js.native
  }
  
  /** Represents the list of print orientation options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails")
  @js.native
  abstract class PrintOrientationOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintOrientationOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the print media type options. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID for the print orientation option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the print media type option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state for the print media type option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the print orientation option.
      * @param value Value for the print orientation option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the print media type option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents the list of print quality options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails")
  @js.native
  abstract class PrintQualityOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the print quality options. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID for the print quality option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the print quality option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the print quality option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the print quality option.
      * @param value Value for the print quality option.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the print quality option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Represents a list of the stapling options. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails")
  @js.native
  abstract class PrintStapleOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails {
    
    /** Gets or sets the string for an error condition. */
    /* CompleteClass */
    var errorText: String = js.native
    
    /** Gets the list of items for the stapling options. */
    /* CompleteClass */
    var items: IVectorView[js.Any] = js.native
    
    /** Gets the ID for the stapling option. */
    /* CompleteClass */
    var optionId: String = js.native
    
    /** Gets the option type for the stapling option. */
    /* CompleteClass */
    var optionType: PrintOptionType = js.native
    
    /** Gets or sets the state of the stapling option. */
    /* CompleteClass */
    var state: PrintOptionStates = js.native
    
    /**
      * Sets the value for the staple opiton.
      * @param value Value for the staple opiton.
      * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
      */
    /* CompleteClass */
    override def trySetValue(value: js.Any): Boolean = js.native
    
    /** Gets or sets the enumerated value of the stapling option. */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /** Called when a print task option has changed. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs")
  @js.native
  abstract class PrintTaskOptionChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs {
    
    /** Gets the ID of the print task option that changed. */
    /* CompleteClass */
    var optionId: js.Any = js.native
  }
  
  /** A collection of events, methods and properties for advanced print tasks. */
  @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
  @js.native
  abstract class PrintTaskOptionDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails
  object PrintTaskOptionDetails {
    
    @JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to retrieve the available options for a print task.
      * @param printTaskOptions Pointer to a PrintTaskOptions object.
      * @return Pointer to a PrintTaskOptionDetails object.
      */
    /* static member */
    inline def getFromPrintTaskOptions(printTaskOptions: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskOptions): typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromPrintTaskOptions")(printTaskOptions.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails]
  }
}
