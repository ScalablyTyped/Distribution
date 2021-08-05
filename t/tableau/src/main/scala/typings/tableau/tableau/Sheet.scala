package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet extends StObject {
  
  /**
    * Sets the size information on a sheet. Note that if the sheet is a Worksheet,
    * only SheetSizeBehavior.AUTOMATIC is allowed since you can’t actually set a Worksheet to a fixed size.
    */
  def changeSizeAsync(options: SheetSizeOptions): js.Promise[SheetSizeOptions]
  
  /** Gets the index of the sheet within the published tabs. Note that hidden tabs are still counted in the ordering, as long as they are published. */
  def getIndex(): Double
  
  /** Gets a value indicating whether the sheet is the currently active sheet. */
  def getIsActive(): Boolean
  
  /**
    * Gets a value indicating whether the sheet is hidden in the UI.
    * Note that if the entire tab control is hidden, it does not affect the state of this flag.
    * This sheet may still report that it is visible even when the tabs control is hidden.
    */
  def getIsHidden(): Boolean
  
  /** Gets the name of the sheet. */
  def getName(): String
  
  /** Gets the type of the sheet. SheetType is an enum with the following values: WORKSHEET , DASHBOARD and STORY. */
  def getSheetType(): SheetType
  
  /** Gets the size information that the author specified when publishing the workbook. */
  def getSize(): SheetSizeOptions
  
  /** Gets the URL for this sheet. */
  def getUrl(): String
  
  /** Gets the Workbook to which this Sheet belongs. */
  def getWorkbook(): Workbook
}
object Sheet {
  
  inline def apply(
    changeSizeAsync: SheetSizeOptions => js.Promise[SheetSizeOptions],
    getIndex: () => Double,
    getIsActive: () => Boolean,
    getIsHidden: () => Boolean,
    getName: () => String,
    getSheetType: () => SheetType,
    getSize: () => SheetSizeOptions,
    getUrl: () => String,
    getWorkbook: () => Workbook
  ): Sheet = {
    val __obj = js.Dynamic.literal(changeSizeAsync = js.Any.fromFunction1(changeSizeAsync), getIndex = js.Any.fromFunction0(getIndex), getIsActive = js.Any.fromFunction0(getIsActive), getIsHidden = js.Any.fromFunction0(getIsHidden), getName = js.Any.fromFunction0(getName), getSheetType = js.Any.fromFunction0(getSheetType), getSize = js.Any.fromFunction0(getSize), getUrl = js.Any.fromFunction0(getUrl), getWorkbook = js.Any.fromFunction0(getWorkbook))
    __obj.asInstanceOf[Sheet]
  }
  
  extension [Self <: Sheet](x: Self) {
    
    inline def setChangeSizeAsync(value: SheetSizeOptions => js.Promise[SheetSizeOptions]): Self = StObject.set(x, "changeSizeAsync", js.Any.fromFunction1(value))
    
    inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetIsActive(value: () => Boolean): Self = StObject.set(x, "getIsActive", js.Any.fromFunction0(value))
    
    inline def setGetIsHidden(value: () => Boolean): Self = StObject.set(x, "getIsHidden", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetSheetType(value: () => SheetType): Self = StObject.set(x, "getSheetType", js.Any.fromFunction0(value))
    
    inline def setGetSize(value: () => SheetSizeOptions): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setGetWorkbook(value: () => Workbook): Self = StObject.set(x, "getWorkbook", js.Any.fromFunction0(value))
  }
}
