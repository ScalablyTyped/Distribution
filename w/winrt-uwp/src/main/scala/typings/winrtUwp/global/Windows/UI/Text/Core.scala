package typings.winrtUwp.global.Windows.UI.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult
import typings.winrtUwp.Windows.UI.ViewManagement.UIElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides types for accessing the Windows core text APIs and the text input server. Windows core text is a client-server system that centralizes the processing of keyboard input into a single server. You can use it to manipulate the edit buffer of your custom text input control; the text input server ensures that the contents of your text input control and the contents of its own edit buffer are always in sync via an asynchronous communication channel between the application and the server. */
object Core {
  
  /** Provides data for the CompositionCompleted event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs")
  @js.native
  abstract class CoreTextCompositionCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs {
    
    /** Gets a collection of CoreTextCompositionSegment objects representing the segments in the composition string. Applications can use this property, for example, to get the pre-conversion string for each composition segment. */
    /* CompleteClass */
    var compositionSegments: IVectorView[typings.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionSegment] = js.native
    
    /**
      * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
  }
  
  /** Represents a segment in a composition string. See Remarks for an illustration. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionSegment")
  @js.native
  abstract class CoreTextCompositionSegment ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionSegment {
    
    /** Gets a string that represents the state of the user input after IME-processing but before final conversion. */
    /* CompleteClass */
    var preconversionString: String = js.native
    
    /** Gets an object that represents the range that defines this composition segment. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
  }
  
  /** Provides data for the CompositionStarted event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs")
  @js.native
  abstract class CoreTextCompositionStartedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs {
    
    /**
      * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
  }
  
  /** The primary object used by text input controls to communicate with the text input server. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextEditContext")
  @js.native
  abstract class CoreTextEditContext ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextEditContext
  
  /** Provides data for the FormatUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs")
  @js.native
  abstract class CoreTextFormatUpdatingEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs {
    
    /** Gets a value that represents the background color to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var backgroundColor: UIElementType = js.native
    
    /**
      * Requests that the format update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the format update operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets a value that indicates the range of text that the text input server needs to format. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
    
    /** Gets a value that indicates the reason that the text input server needs to apply formatting to this range of text. The server populates this property before raising the event. */
    /* CompleteClass */
    var reason: CoreTextFormatUpdatingReason = js.native
    
    /** Gets or sets a value that indicates the result of handling the FormatUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
    /* CompleteClass */
    var result: CoreTextFormatUpdatingResult = js.native
    
    /** Gets a value that represents the text color to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var textColor: UIElementType = js.native
    
    /** Gets a value that represents the underline color to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var underlineColor: UIElementType = js.native
    
    /** Gets a value that represents the underline type to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var underlineType: typings.winrtUwp.Windows.UI.Text.UnderlineType = js.native
  }
  
  /** Defines constants that specify the set of state applied during text composition. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingReason")
  @js.native
  object CoreTextFormatUpdatingReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason & Double] = js.native
    
    /* 2 */ val compositionConverted: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionConverted & Double = js.native
    
    /* 4 */ val compositionTargetConverted: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetConverted & Double = js.native
    
    /* 3 */ val compositionTargetUnconverted: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetUnconverted & Double = js.native
    
    /* 1 */ val compositionUnconverted: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionUnconverted & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.none & Double = js.native
  }
  
  /** Defines constants that specify the result of handling the FormatUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingResult")
  @js.native
  object CoreTextFormatUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult & Double] = js.native
    
    /* 1 */ val failed: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.failed & Double = js.native
    
    /* 0 */ val succeeded: typings.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.succeeded & Double = js.native
  }
  
  /** Defines constants that specify whether the input pane should be shown automatically when focus enters your text input control. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy")
  @js.native
  object CoreTextInputPaneDisplayPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy & Double] = js.native
    
    /* 0 */ val automatic: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.automatic & Double = js.native
    
    /* 1 */ val manual: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.manual & Double = js.native
  }
  
  /** Defines constants that specify the set of input scope names. Input scope is used by the text input server and input processors to determine the layout of the Soft Input Panel (SIP), and what type of language model to use. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextInputScope")
  @js.native
  object CoreTextInputScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.default & Double = js.native
    
    /* 13 */ val address: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.address & Double = js.native
    
    /* 17 */ val addressCity: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCity & Double = js.native
    
    /* 18 */ val addressCountryName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCountryName & Double = js.native
    
    /* 19 */ val addressCountryShortName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCountryShortName & Double = js.native
    
    /* 14 */ val addressPostalCode: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressPostalCode & Double = js.native
    
    /* 16 */ val addressStateOrProvince: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressStateOrProvince & Double = js.native
    
    /* 15 */ val addressStreet: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressStreet & Double = js.native
    
    /* 40 */ val alphanumericFullWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.alphanumericFullWidth & Double = js.native
    
    /* 39 */ val alphanumericHalfWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.alphanumericHalfWidth & Double = js.native
    
    /* 42 */ val bopomofo: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.bopomofo & Double = js.native
    
    /* 56 */ val chat: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chat & Double = js.native
    
    /* 53 */ val chineseFullWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chineseFullWidth & Double = js.native
    
    /* 52 */ val chineseHalfWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chineseHalfWidth & Double = js.native
    
    /* 21 */ val currencyAmount: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyAmount & Double = js.native
    
    /* 20 */ val currencyAmountAndSymbol: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyAmountAndSymbol & Double = js.native
    
    /* 41 */ val currencyChinese: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyChinese & Double = js.native
    
    /* 22 */ val date: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.date & Double = js.native
    
    /* 24 */ val dateDay: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateDay & Double = js.native
    
    /* 27 */ val dateDayName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateDayName & Double = js.native
    
    /* 23 */ val dateMonth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateMonth & Double = js.native
    
    /* 26 */ val dateMonthName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateMonthName & Double = js.native
    
    /* 25 */ val dateYear: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateYear & Double = js.native
    
    /* 5 */ val emailAddress: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailAddress & Double = js.native
    
    /* 4 */ val emailUserName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailUserName & Double = js.native
    
    /* 58 */ val emailUserNameOrAddress: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailUserNameOrAddress & Double = js.native
    
    /* 3 */ val fileName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.fileName & Double = js.native
    
    /* 2 */ val filePath: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.filePath & Double = js.native
    
    /* 50 */ val formula: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.formula & Double = js.native
    
    /* 62 */ val formulaNumber: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.formulaNumber & Double = js.native
    
    /* 48 */ val hangulFullWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hangulFullWidth & Double = js.native
    
    /* 47 */ val hangulHalfWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hangulHalfWidth & Double = js.native
    
    /* 46 */ val hanja: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hanja & Double = js.native
    
    /* 43 */ val hiragana: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hiragana & Double = js.native
    
    /* 45 */ val katakanaFullWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.katakanaFullWidth & Double = js.native
    
    /* 44 */ val katakanaHalfWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.katakanaHalfWidth & Double = js.native
    
    /* 60 */ val maps: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.maps & Double = js.native
    
    /* 57 */ val nameOrPhoneNumber: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.nameOrPhoneNumber & Double = js.native
    
    /* 54 */ val nativeScript: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.nativeScript & Double = js.native
    
    /* 28 */ val number: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.number & Double = js.native
    
    /* 38 */ val numberFullWidth: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.numberFullWidth & Double = js.native
    
    /* 30 */ val password: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.password & Double = js.native
    
    /* 61 */ val passwordNumeric: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.passwordNumeric & Double = js.native
    
    /* 7 */ val personalFullName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalFullName & Double = js.native
    
    /* 9 */ val personalGivenName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalGivenName & Double = js.native
    
    /* 10 */ val personalMiddleName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalMiddleName & Double = js.native
    
    /* 8 */ val personalNamePrefix: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalNamePrefix & Double = js.native
    
    /* 12 */ val personalNameSuffix: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalNameSuffix & Double = js.native
    
    /* 11 */ val personalSurname: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalSurname & Double = js.native
    
    /* 59 */ val `private`: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.`private` & Double = js.native
    
    /* 49 */ val search: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.search & Double = js.native
    
    /* 51 */ val searchIncremental: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.searchIncremental & Double = js.native
    
    /* 29 */ val singleCharacter: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.singleCharacter & Double = js.native
    
    /* 33 */ val telephoneAreaCode: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneAreaCode & Double = js.native
    
    /* 32 */ val telephoneCountryCode: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneCountryCode & Double = js.native
    
    /* 34 */ val telephoneLocalNumber: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneLocalNumber & Double = js.native
    
    /* 31 */ val telephoneNumber: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneNumber & Double = js.native
    
    /* 55 */ val text: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.text & Double = js.native
    
    /* 35 */ val time: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.time & Double = js.native
    
    /* 36 */ val timeHour: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.timeHour & Double = js.native
    
    /* 37 */ val timeMinuteOrSecond: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.timeMinuteOrSecond & Double = js.native
    
    /* 1 */ val url: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.url & Double = js.native
    
    /* 6 */ val userName: typings.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.userName & Double = js.native
  }
  
  /** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutBounds")
  @js.native
  abstract class CoreTextLayoutBounds ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutBounds {
    
    /** Gets or sets the bounding box in screen coordinates of a text input control. */
    /* CompleteClass */
    var controlBounds: Rect = js.native
    
    /** Gets or sets the bounding box in screen coordinates of a range of text. */
    /* CompleteClass */
    var textBounds: Rect = js.native
  }
  
  /** Represents information about a LayoutRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequest")
  @js.native
  abstract class CoreTextLayoutRequest ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequest {
    
    /**
      * Requests that the layout request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the layout request operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets an object that represents the layout bounds information requested by the text input server. The application should populate the properties of this object to the layout bounds being requested before returning from the event handler. */
    /* CompleteClass */
    var layoutBounds: typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutBounds = js.native
    
    /** Gets a value that indicates the range of text whose bounding box is being requested by the text input server. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
  }
  
  /** Provides data for the LayoutRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequestedEventArgs")
  @js.native
  abstract class CoreTextLayoutRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequestedEventArgs {
    
    /** Gets information about a LayoutRequested event. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequest = js.native
  }
  
  /** Represents information about a SelectionRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequest")
  @js.native
  abstract class CoreTextSelectionRequest ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequest {
    
    /**
      * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the selection request operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
    /* CompleteClass */
    var selection: CoreTextRange = js.native
  }
  
  /** Provides data for the SelectionRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequestedEventArgs")
  @js.native
  abstract class CoreTextSelectionRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequestedEventArgs {
    
    /** Gets information about a SelectionRequested event. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequest = js.native
  }
  
  /** Provides data for the SelectionUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs")
  @js.native
  abstract class CoreTextSelectionUpdatingEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs {
    
    /**
      * Requests that the selection update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the selection update operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets or sets a value that indicates the result of handling the SelectionUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
    /* CompleteClass */
    var result: CoreTextSelectionUpdatingResult = js.native
    
    /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
    /* CompleteClass */
    var selection: CoreTextRange = js.native
  }
  
  /** Defines constants that specify the result of handling the SelectionUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingResult")
  @js.native
  object CoreTextSelectionUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult & Double] = js.native
    
    /* 1 */ val failed: typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.failed & Double = js.native
    
    /* 0 */ val succeeded: typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.succeeded & Double = js.native
  }
  
  /** Provides constant values for use with the Windows core text APIs and the text input server. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants")
  @js.native
  abstract class CoreTextServicesConstants ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextServicesConstants
  object CoreTextServicesConstants {
    
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a value to use to replace hidden data inside a text stream before returning the text to the text input server. */
    /* static member */
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants.hiddenCharacter")
    @js.native
    def hiddenCharacter: String = js.native
    @scala.inline
    def hiddenCharacter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hiddenCharacter")(x.asInstanceOf[js.Any])
  }
  
  /** The entry point to all services provided by the Windows core text APIs and the text input server. This object is associated with an application's UI thread (the thread that CoreWindow runs on). */
  @JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
  @js.native
  abstract class CoreTextServicesManager ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager
  object CoreTextServicesManager {
    
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the CoreTextServicesManager object for the currently active view.
      * @return A CoreTextServicesManager instance, which can be used to create further objects to support the app's text input scenarios.
      */
    /* static member */
    @scala.inline
    def getForCurrentView(): typings.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager]
  }
  
  /** Represents information about a TextRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextRequest")
  @js.native
  abstract class CoreTextTextRequest ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequest {
    
    /**
      * Requests that the text request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the text request operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets a value that indicates the range of text being requested by the text input server. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
    
    /** Gets or sets the text that the text input server is requesting. The application should set the text being requested before returning from the event handler. */
    /* CompleteClass */
    var text: String = js.native
  }
  
  /** Provides data for the TextRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextRequestedEventArgs")
  @js.native
  abstract class CoreTextTextRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequestedEventArgs {
    
    /** Gets information about a TextRequested event. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequest = js.native
  }
  
  /** Provides data for the TextUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs")
  @js.native
  abstract class CoreTextTextUpdatingEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs {
    
    /**
      * Requests that the text update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a Language object representing the current input language. */
    /* CompleteClass */
    var inputLanguage: Language = js.native
    
    /** Gets a value that indicates whether the text update operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
    /* CompleteClass */
    var newSelection: CoreTextRange = js.native
    
    /** Gets a value that indicates the range of text that the text input server needs to modify. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
    
    /** Gets or sets a value that indicates the result of handling the TextUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
    /* CompleteClass */
    var result: CoreTextTextUpdatingResult = js.native
    
    /** Gets the text that the text input server is requesting to be set into the modified range. The server populates this property before raising the event. */
    /* CompleteClass */
    var text: String = js.native
  }
  
  /** Defines constants that specify the result of handling the TextUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingResult")
  @js.native
  object CoreTextTextUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult & Double] = js.native
    
    /* 1 */ val failed: typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.failed & Double = js.native
    
    /* 0 */ val succeeded: typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.succeeded & Double = js.native
  }
}
