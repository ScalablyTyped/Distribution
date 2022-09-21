package typings.tableauJsApi

import typings.tableauJsApi.enumsMod.FieldAggregationType
import typings.tableauJsApi.enumsMod.FieldRoleType
import typings.tableauJsApi.parameterMod.Parameter
import typings.tableauJsApi.sheetMod.Sheet
import typings.tableauJsApi.sheetMod.SheetInfo
import typings.tableauJsApi.vizMod.Viz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workbookMod {
  
  @JSImport("tableau-js-api/workbook", "CustomView")
  @js.native
  open class CustomView () extends StObject {
    
    def getAdvertised(): Boolean = js.native
    
    def getDefault(): Boolean = js.native
    
    // properties
    def getName(): String = js.native
    
    def getOwnerName(): String = js.native
    
    def getUrl(): String = js.native
    
    def getWorkbook(): Workbook = js.native
    
    // methods
    def saveAsync(): js.Promise[CustomView] = js.native
    
    def setAdvertised(advertised: Boolean): Boolean = js.native
    
    def setName(name: String): String = js.native
  }
  
  @JSImport("tableau-js-api/workbook", "DataSource")
  @js.native
  open class DataSource () extends StObject {
    
    def getFields(): js.Array[Field] = js.native
    
    def getIsPrimary(): Boolean = js.native
    
    // properties
    def getName(): String = js.native
  }
  
  @JSImport("tableau-js-api/workbook", "Field")
  @js.native
  open class Field () extends StObject {
    
    def getAggregation(): FieldAggregationType = js.native
    
    def getDataSource(): DataSource = js.native
    
    // properties
    def getName(): String = js.native
    
    def getRole(): FieldRoleType = js.native
  }
  
  @JSImport("tableau-js-api/workbook", "Workbook")
  @js.native
  open class Workbook () extends StObject {
    
    def activateSheetAsync(sheetNameOrIndex: String): js.Promise[Sheet] = js.native
    // methods
    def activateSheetAsync(sheetNameOrIndex: Double): js.Promise[Sheet] = js.native
    
    def changeParameterValueAsync(name: String, value: Any): js.Promise[Parameter] = js.native
    
    def getActiveCustomView(): CustomView = js.native
    
    def getActiveSheet(): Sheet = js.native
    
    def getCustomViewAsync(customViewName: String): js.Promise[CustomView] = js.native
    
    def getName(): String = js.native
    
    def getParametersAsync(): js.Promise[js.Array[Parameter]] = js.native
    
    def getPublishedSheetsInfo(): js.Array[SheetInfo] = js.native
    
    // properties
    def getViz(): Viz = js.native
    
    def rememberCustomViewAsync(customViewName: String): js.Promise[CustomView] = js.native
    
    def removeCustomViewAsync(customViewName: String): js.Promise[CustomView] = js.native
    
    def revertAllAsync(): js.Promise[Unit] = js.native
    
    def setActiveCustomViewAsDefaultAsync(): js.Promise[Unit] = js.native
  }
}
