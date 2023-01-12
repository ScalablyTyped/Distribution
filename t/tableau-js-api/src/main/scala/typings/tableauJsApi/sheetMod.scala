package typings.tableauJsApi

import org.scalablytyped.runtime.StringDictionary
import typings.tableauJsApi.enumsMod.DashboardObjectType
import typings.tableauJsApi.enumsMod.FilterUpdateType
import typings.tableauJsApi.enumsMod.SelectionUpdateType
import typings.tableauJsApi.enumsMod.SheetType
import typings.tableauJsApi.filteringMod.Filter
import typings.tableauJsApi.filteringMod.FilterOptions
import typings.tableauJsApi.filteringMod.HierarchicalFilterOptions
import typings.tableauJsApi.filteringMod.RangeFilterOptions
import typings.tableauJsApi.filteringMod.RelativeDateFilterOptions
import typings.tableauJsApi.marksMod.Mark
import typings.tableauJsApi.otherMod.Point
import typings.tableauJsApi.otherMod.Size
import typings.tableauJsApi.tableauJsApiStrings.EXACTLY
import typings.tableauJsApi.tableauJsApiStrings.RANGE
import typings.tableauJsApi.workbookMod.DataSource
import typings.tableauJsApi.workbookMod.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetMod {
  
  @JSImport("tableau-js-api/sheet", "Column")
  @js.native
  open class Column () extends StObject {
    
    def getDataType(): String = js.native
    
    def getFieldName(): String = js.native
    
    def getIndex(): Double = js.native
    
    def getIsReferenced(): Boolean = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "Dashboard")
  @js.native
  open class Dashboard () extends Sheet {
    
    def applyFilterAsync(fieldName: String, values: js.Array[js.Object], updateType: FilterUpdateType): js.Promise[String] = js.native
    def applyFilterAsync(
      fieldName: String,
      values: js.Array[js.Object],
      updateType: FilterUpdateType,
      options: FilterOptions
    ): js.Promise[String] = js.native
    def applyFilterAsync(fieldName: String, values: js.Object, updateType: FilterUpdateType): js.Promise[String] = js.native
    def applyFilterAsync(fieldName: String, values: js.Object, updateType: FilterUpdateType, options: FilterOptions): js.Promise[String] = js.native
    
    // filtering
    def getFiltersAsync(): js.Promise[js.Array[Filter]] = js.native
    
    // properties
    def getObjects(): js.Array[DashboardObject] = js.native
    
    def getParentStoryPoint(): StoryPoint = js.native
    
    def getWorksheets(): js.Array[Worksheet] = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "DashboardObject")
  @js.native
  open class DashboardObject () extends StObject {
    
    def getDashboard(): Dashboard = js.native
    
    // properties
    def getObjectType(): DashboardObjectType = js.native
    
    def getPosition(): Point = js.native
    
    def getSize(): Size = js.native
    
    def getWorksheet(): Worksheet = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "DataTable")
  @js.native
  open class DataTable () extends StObject {
    
    def getColumns(): js.Array[Column] = js.native
    
    def getData(): js.Array[js.Array[Any]] = js.native
    
    def getIsSummaryData(): Boolean = js.native
    
    def getName(): String = js.native
    
    def getTotalRowCount(): Double = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "LogicalTable")
  @js.native
  open class LogicalTable () extends StObject {
    
    def getCaption(): String = js.native
    
    def getTableId(): String = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "Sheet")
  @js.native
  open class Sheet () extends SheetInfo {
    
    // methods
    def changeSizeAsync(options: SheetSizeOptions): js.Promise[SheetSize] = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "SheetInfo")
  @js.native
  open class SheetInfo () extends StObject {
    
    def getIndex(): Double = js.native
    
    def getIsActive(): Boolean = js.native
    
    def getIsHidden(): Boolean = js.native
    
    // properties
    def getName(): String = js.native
    
    def getSheetType(): SheetType = js.native
    
    def getSize(): SheetSize = js.native
    
    def getUrl(): String = js.native
    
    def getWorkbook(): Workbook = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "Story")
  @js.native
  open class Story () extends Sheet {
    
    def activateNextStoryPointAsync(): js.Promise[StoryPoint] = js.native
    
    def activatePreviousStoryPoint(): js.Promise[StoryPoint] = js.native
    
    // methods
    def activateStoryPointAsync(index: Double): js.Promise[StoryPoint] = js.native
    
    def getActiveStoryPoint(): StoryPoint = js.native
    
    // properties
    def getStoryPointsInfo(): js.Array[StoryPointInfo] = js.native
    
    def revertStoryPointAsync(): js.Promise[StoryPoint] = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "StoryPoint")
  @js.native
  open class StoryPoint () extends StObject {
    
    def getCaption(): String = js.native
    
    def getContainedSheet(): Sheet | Null = js.native
    
    def getIndex(): Double = js.native
    
    def getIsActive(): Boolean = js.native
    
    def getIsUpdated(): Boolean = js.native
    
    def getParentStory(): Story = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "StoryPointInfo")
  @js.native
  open class StoryPointInfo () extends StObject {
    
    def getCaption(): String = js.native
    
    def getIndex(): Double = js.native
    
    def getIsActive(): Boolean = js.native
    
    def getIsUpdated(): Boolean = js.native
    
    def getParentStory(): Story = js.native
  }
  
  @JSImport("tableau-js-api/sheet", "Worksheet")
  @js.native
  open class Worksheet () extends Sheet {
    
    def applyFilterAsync(fieldName: String, values: js.Array[js.Object], updateType: FilterUpdateType): js.Promise[String] = js.native
    def applyFilterAsync(
      fieldName: String,
      values: js.Array[js.Object],
      updateType: FilterUpdateType,
      options: FilterOptions
    ): js.Promise[String] = js.native
    def applyFilterAsync(fieldName: String, values: js.Object, updateType: FilterUpdateType): js.Promise[String] = js.native
    def applyFilterAsync(fieldName: String, values: js.Object, updateType: FilterUpdateType, options: FilterOptions): js.Promise[String] = js.native
    
    def applyHierarchicalFilterAsync(fieldName: String, values: js.Array[Any], options: HierarchicalFilterOptions): js.Promise[String] = js.native
    def applyHierarchicalFilterAsync(fieldName: String, values: js.Object, options: HierarchicalFilterOptions): js.Promise[String] = js.native
    
    def applyRangeFilterAsync(fieldName: String, range: RangeFilterOptions): js.Promise[String] = js.native
    
    def applyRelativeDateFilterAsync(fieldName: String, options: RelativeDateFilterOptions): js.Promise[String] = js.native
    
    def clearFilterAsync(fieldName: String): js.Promise[String] = js.native
    
    // marks selection
    def clearSelectedMarksAsync(): js.Promise[Unit] = js.native
    
    // methods
    def getDataSourcesAsync(): js.Promise[js.Array[DataSource]] = js.native
    
    // filtering
    def getFiltersAsync(): js.Promise[js.Array[Filter]] = js.native
    
    // properties
    def getParentDashboard(): Dashboard = js.native
    
    def getParentStoryPoint(): StoryPoint = js.native
    
    def getSelectedMarksAsync(): js.Promise[js.Array[Mark]] = js.native
    
    def getSummaryDataAsync(options: GetSummaryDataOptions): js.Promise[DataTable] = js.native
    def getSummaryDataAsync(options: GetUnderlyingDataOptions): js.Promise[DataTable] = js.native
    
    def getUnderlyingTableDataAsync(tableId: String, options: GetUnderlyingDataOptions): js.Promise[DataTable] = js.native
    
    def getUnderlyingTablesAsync(): js.Promise[js.Array[LogicalTable]] = js.native
    
    def selectMarksAsync(fieldName: String, value: js.Array[js.Object], updateType: SelectionUpdateType): js.Promise[Unit] = js.native
    def selectMarksAsync(fieldName: String, value: js.Object, updateType: SelectionUpdateType): js.Promise[Unit] = js.native
    def selectMarksAsync(fieldValueMap: StringDictionary[js.Array[Any]], updateType: SelectionUpdateType): js.Promise[Unit] = js.native
    // tslint:disable-next-line:unified-signatures
    def selectMarksAsync(marks: js.Array[Mark], updateType: SelectionUpdateType): js.Promise[Unit] = js.native
  }
  
  trait GetSummaryDataOptions extends StObject {
    
    var ignoreAliases: Boolean
    
    var ignoreSelection: Boolean
    
    var maxRows: Double
  }
  object GetSummaryDataOptions {
    
    inline def apply(ignoreAliases: Boolean, ignoreSelection: Boolean, maxRows: Double): GetSummaryDataOptions = {
      val __obj = js.Dynamic.literal(ignoreAliases = ignoreAliases.asInstanceOf[js.Any], ignoreSelection = ignoreSelection.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSummaryDataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetSummaryDataOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreAliases(value: Boolean): Self = StObject.set(x, "ignoreAliases", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSelection(value: Boolean): Self = StObject.set(x, "ignoreSelection", value.asInstanceOf[js.Any])
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetUnderlyingDataOptions
    extends StObject
       with GetSummaryDataOptions {
    
    var includeAllColumns: Boolean
  }
  object GetUnderlyingDataOptions {
    
    inline def apply(ignoreAliases: Boolean, ignoreSelection: Boolean, includeAllColumns: Boolean, maxRows: Double): GetUnderlyingDataOptions = {
      val __obj = js.Dynamic.literal(ignoreAliases = ignoreAliases.asInstanceOf[js.Any], ignoreSelection = ignoreSelection.asInstanceOf[js.Any], includeAllColumns = includeAllColumns.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUnderlyingDataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetUnderlyingDataOptions] (val x: Self) extends AnyVal {
      
      inline def setIncludeAllColumns(value: Boolean): Self = StObject.set(x, "includeAllColumns", value.asInstanceOf[js.Any])
    }
  }
  
  type SheetSize = Size
  
  /* Rewritten from type alias, can be one of: 
    - typings.tableauJsApi.anon.Behavior
    - typings.tableauJsApi.anon.MaxSize
    - typings.tableauJsApi.anon.BehaviorMaxSize
    - typings.tableauJsApi.anon.MinSize
  */
  trait SheetSizeOptions extends StObject
  object SheetSizeOptions {
    
    inline def Behavior(): typings.tableauJsApi.anon.Behavior = {
      val __obj = js.Dynamic.literal(behavior = "AUTOMATIC")
      __obj.asInstanceOf[typings.tableauJsApi.anon.Behavior]
    }
    
    inline def BehaviorMaxSize(maxSize: SheetSize): typings.tableauJsApi.anon.BehaviorMaxSize = {
      val __obj = js.Dynamic.literal(behavior = "ATMOST", maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tableauJsApi.anon.BehaviorMaxSize]
    }
    
    inline def MaxSize(behavior: EXACTLY | RANGE, maxSize: SheetSize, minSize: SheetSize): typings.tableauJsApi.anon.MaxSize = {
      val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tableauJsApi.anon.MaxSize]
    }
    
    inline def MinSize(minSize: SheetSize): typings.tableauJsApi.anon.MinSize = {
      val __obj = js.Dynamic.literal(behavior = "ATLEAST", minSize = minSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tableauJsApi.anon.MinSize]
    }
  }
}
