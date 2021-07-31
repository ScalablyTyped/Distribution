package typings.tableau.global.tableau

import typings.tableau.tableau.SheetSizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.Story")
@js.native
class Story ()
  extends StObject
     with typings.tableau.tableau.Story {
  
  /** Activates the next story point if there is one. If the current story point is the last one, then is stays active. */
  /* CompleteClass */
  override def activateNextStoryPointAsync(): js.Promise[typings.tableau.tableau.StoryPoint] = js.native
  
  /** Activates the previous story point if there is one. If the current story point is the first one, then it stays active. */
  /* CompleteClass */
  override def activatePreviousStoryPointAsync(): js.Promise[typings.tableau.tableau.StoryPoint] = js.native
  
  /**
    * Activates the story point at the specified index and returns a promise of the activated StoryPoint.
    * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
    */
  /* CompleteClass */
  override def activateStoryPointAsync(index: Double): js.Promise[typings.tableau.tableau.StoryPoint] = js.native
  
  /**
    * Sets the size information on a sheet. Note that if the sheet is a Worksheet,
    * only SheetSizeBehavior.AUTOMATIC is allowed since you can’t actually set a Worksheet to a fixed size.
    */
  /* CompleteClass */
  override def changeSizeAsync(options: SheetSizeOptions): js.Promise[SheetSizeOptions] = js.native
  
  /** Gets the currently active story point. */
  /* CompleteClass */
  override def getActiveStoryPoint(): typings.tableau.tableau.StoryPoint = js.native
  
  /** Gets the index of the sheet within the published tabs. Note that hidden tabs are still counted in the ordering, as long as they are published. */
  /* CompleteClass */
  override def getIndex(): Double = js.native
  
  /** Gets a value indicating whether the sheet is the currently active sheet. */
  /* CompleteClass */
  override def getIsActive(): Boolean = js.native
  
  /**
    * Gets a value indicating whether the sheet is hidden in the UI.
    * Note that if the entire tab control is hidden, it does not affect the state of this flag.
    * This sheet may still report that it is visible even when the tabs control is hidden.
    */
  /* CompleteClass */
  override def getIsHidden(): Boolean = js.native
  
  /** Gets the name of the sheet. */
  /* CompleteClass */
  override def getName(): String = js.native
  
  /** Gets the type of the sheet. SheetType is an enum with the following values: WORKSHEET , DASHBOARD and STORY. */
  /* CompleteClass */
  override def getSheetType(): typings.tableau.tableau.SheetType = js.native
  
  /** Gets the size information that the author specified when publishing the workbook. */
  /* CompleteClass */
  override def getSize(): SheetSizeOptions = js.native
  
  /**
    * Gets an array (not a collection) of StoryPointInfo objects.
    * Note that this is not a collection, since we don’t have a unique string key for a story point.
    * We only need ordinal access to the story points (by index).
    */
  /* CompleteClass */
  override def getStoryPointsInfo(): js.Array[typings.tableau.tableau.StoryPointInfo] = js.native
  
  /** Gets the URL for this sheet. */
  /* CompleteClass */
  override def getUrl(): String = js.native
  
  /** Gets the Workbook to which this Sheet belongs. */
  /* CompleteClass */
  override def getWorkbook(): typings.tableau.tableau.Workbook = js.native
  
  /**
    * Reverts the story point at the specified index and returns a promise of the reverted StoryPoint.
    * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
    */
  /* CompleteClass */
  override def revertStoryPointAsync(index: Double): js.Promise[typings.tableau.tableau.StoryPoint] = js.native
}
