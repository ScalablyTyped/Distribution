package typings.xrm.Xrm

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.Xrm.Async.PromiseLike
import typings.xrm.Xrm.Navigation.AlertStrings
import typings.xrm.Xrm.Navigation.ConfirmResult
import typings.xrm.Xrm.Navigation.ConfirmStrings
import typings.xrm.Xrm.Navigation.CustomPage
import typings.xrm.Xrm.Navigation.Dashboard
import typings.xrm.Xrm.Navigation.DialogSizeOptions
import typings.xrm.Xrm.Navigation.EntityFormOptions
import typings.xrm.Xrm.Navigation.ErrorDialogOptions
import typings.xrm.Xrm.Navigation.FileDetails
import typings.xrm.Xrm.Navigation.NavigationOptions
import typings.xrm.Xrm.Navigation.NavigationOptions.SizeValue
import typings.xrm.Xrm.Navigation.OpenFormResult
import typings.xrm.Xrm.Navigation.OpenWebresourceOptions
import typings.xrm.Xrm.Navigation.PageInputEntityList
import typings.xrm.Xrm.Navigation.PageInputEntityRecord
import typings.xrm.Xrm.Navigation.PageInputHtmlWebResource
import typings.xrm.Xrm.Url.NavBarDisplay
import typings.xrm.Xrm.Utility.OpenParameters
import typings.xrm.XrmEnum.OpenFileOptions
import typings.xrm.XrmEnum.RelationshipType
import typings.xrm.XrmEnum.RoleType
import typings.xrm.XrmEnum.WindowPositions
import typings.xrm.xrmInts.`1`
import typings.xrm.xrmInts.`2`
import typings.xrm.xrmStrings.Percentsign
import typings.xrm.xrmStrings.custom
import typings.xrm.xrmStrings.dashboard
import typings.xrm.xrmStrings.entitylist
import typings.xrm.xrmStrings.entityrecord
import typings.xrm.xrmStrings.px
import typings.xrm.xrmStrings.savedquery
import typings.xrm.xrmStrings.userquery
import typings.xrm.xrmStrings.webresource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the Xrm.Navigation API
  */
@js.native
trait Navigation extends StObject {
  
  def navigateTo(pageInput: CustomPage): PromiseLike[Any] = js.native
  def navigateTo(pageInput: CustomPage, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
  def navigateTo(pageInput: Dashboard): PromiseLike[Any] = js.native
  def navigateTo(pageInput: Dashboard, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
  def navigateTo(pageInput: PageInputEntityList): PromiseLike[Any] = js.native
  def navigateTo(pageInput: PageInputEntityList, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
  /**
    * Navigates to the specified page.
    * @param pageInput Input about the page to navigate to. The object definition changes depending on the type of page to navigate to: entity list or HTML web resource.
    * @param navigationOptions Options for navigating to a page: whether to open inline or in a dialog. If you don't specify this parameter, page is opened inline by default.
    */
  def navigateTo(pageInput: PageInputEntityRecord): PromiseLike[Any] = js.native
  def navigateTo(pageInput: PageInputEntityRecord, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
  def navigateTo(pageInput: PageInputHtmlWebResource): PromiseLike[Any] = js.native
  def navigateTo(pageInput: PageInputHtmlWebResource, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
  
  /**
    * Displays an alert dialog containing a message and a button.
    * @param alertStrings The strings to be used in the alert dialog.
    * @param alertOptions The height and width options for alert dialog
    */
  def openAlertDialog(alertStrings: AlertStrings): PromiseLike[Any] = js.native
  def openAlertDialog(alertStrings: AlertStrings, alertOptions: DialogSizeOptions): PromiseLike[Any] = js.native
  
  /**
    * Displays a confirmation dialog box containing a message and two buttons.
    * @param confirmStrings The strings to be used in the confirm dialog.
    * @param confirmOptions The height and width options for alert dialog
    */
  def openConfirmDialog(confirmStrings: ConfirmStrings): PromiseLike[ConfirmResult] = js.native
  def openConfirmDialog(confirmStrings: ConfirmStrings, confirmOptions: DialogSizeOptions): PromiseLike[ConfirmResult] = js.native
  
  /**
    * Displays an error dialog.
    * @param errorOptions An object to specify the options for error dialog.
    */
  def openErrorDialog(errorOptions: ErrorDialogOptions): PromiseLike[Any] = js.native
  
  /**
    * Opens a file.
    */
  def openFile(file: FileDetails): Unit = js.native
  def openFile(file: FileDetails, openFileOptions: OpenFileOptions): Unit = js.native
  
  /**
    * Opens an entity form or a quick create form.
    */
  def openForm(entityFormOptions: EntityFormOptions): PromiseLike[OpenFormResult] = js.native
  def openForm(entityFormOptions: EntityFormOptions, formParameters: OpenParameters): PromiseLike[OpenFormResult] = js.native
  
  /**
    * Opens a URL, including file URLs.
    * @param url URL to open.
    * @param openUrlOptions Options to open the URL
    */
  def openUrl(url: String): Unit = js.native
  def openUrl(url: String, openUrlOptions: DialogSizeOptions): Unit = js.native
  
  /**
    * Opens an HTML web resource.
    * @param webResourceName Name of the HTML web resource.
    * @param windowOptions (Optional) Window options for opening the web resource.
    *                                                 It is advised to use encodeURIcomponent() to encode the value.
    */
  def openWebResource(webResourceName: String): Unit = js.native
  def openWebResource(webResourceName: String, windowOptions: Unit, data: String): Unit = js.native
  def openWebResource(webResourceName: String, windowOptions: OpenWebresourceOptions): Unit = js.native
  def openWebResource(webResourceName: String, windowOptions: OpenWebresourceOptions, data: String): Unit = js.native
}
/**
  * Namespace to hold Xrm.Navigation related types
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-navigation External Link: Xrm.Navigation (Client API reference)}
  */
object Navigation {
  
  trait AlertStrings extends StObject {
    
    /**
      * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
      */
    var confirmButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      *  The message to be displyed in the alert dialog.
      */
    var text: String
    
    /**
      * (Optional) The title of the alert dialog.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object AlertStrings {
    
    inline def apply(text: String): AlertStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertStrings]
    }
    
    extension [Self <: AlertStrings](x: Self) {
      
      inline def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
    */
  trait ConfirmResult extends StObject {
    
    /**
      * true if the confirm button was clicked to close the dialog.
      */
    var confirmed: Boolean
  }
  object ConfirmResult {
    
    inline def apply(confirmed: Boolean): ConfirmResult = {
      val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmResult]
    }
    
    extension [Self <: ConfirmResult](x: Self) {
      
      inline def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfirmStrings extends StObject {
    
    /**
      * (Optional) The cancel button label. If you do not specify the cancel button label, Cancel is used as the button label.
      */
    var cancelButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
      */
    var confirmButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) The subtitle to be displayed in the confirmation dialog.
      */
    var subtitle: js.UndefOr[String] = js.undefined
    
    /**
      * The message to be displyed in the alert dialog.
      */
    var text: String
    
    /**
      * (Optional) The title to be displyed in the confirmation dialog.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object ConfirmStrings {
    
    inline def apply(text: String): ConfirmStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmStrings]
    }
    
    extension [Self <: ConfirmStrings](x: Self) {
      
      inline def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
      
      inline def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CustomPage extends StObject {
    
    /**
      * The logical name of the table to be made available in the custom page via Param("entityName").
      * */
    var entityName: js.UndefOr[String] = js.undefined
    
    /**
      * The logic name o the custom page to open.
      */
    var name: String
    
    var pageType: custom
    
    /**
      * ID of the table record to be made available in the custom page via Param("recordId").
      * */
    var recordId: js.UndefOr[String] = js.undefined
  }
  object CustomPage {
    
    inline def apply(name: String): CustomPage = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pageType = "custom")
      __obj.asInstanceOf[CustomPage]
    }
    
    extension [Self <: CustomPage](x: Self) {
      
      inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      inline def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPageType(value: custom): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      inline def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
      
      inline def setRecordIdUndefined: Self = StObject.set(x, "recordId", js.undefined)
    }
  }
  
  trait Dashboard extends StObject {
    
    /**
      * The GUID of the dashboard to load. If not specified, navigates to the default dashboard
      */
    var dashboardId: js.UndefOr[String] = js.undefined
    
    var pageType: dashboard
  }
  object Dashboard {
    
    inline def apply(): Dashboard = {
      val __obj = js.Dynamic.literal(pageType = "dashboard")
      __obj.asInstanceOf[Dashboard]
    }
    
    extension [Self <: Dashboard](x: Self) {
      
      inline def setDashboardId(value: String): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
      
      inline def setDashboardIdUndefined: Self = StObject.set(x, "dashboardId", js.undefined)
      
      inline def setPageType(value: dashboard): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogSizeOptions extends StObject {
    
    /**
      * Height of the alert dialog in pixels.
      */
    var height: Double
    
    /**
      * Width of the alert dialog pixels.
      */
    var width: Double
  }
  object DialogSizeOptions {
    
    inline def apply(height: Double, width: Double): DialogSizeOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogSizeOptions]
    }
    
    extension [Self <: DialogSizeOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Entity form options for opening the form
    */
  trait EntityFormOptions extends StObject {
    
    /**
      * Indicates whether to display the command bar.If you do not specify this parameter, the command bar is displayed by default.
      */
    var cmdbar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Designates a record that will provide default values based on mapped attribute values.The lookup object has the following String properties: entityType, id, and name (optional).
      */
    var createFromEntity: js.UndefOr[LookupValue] = js.undefined
    
    /**
      * ID of the entity record to display the form for.
      */
    var entityId: js.UndefOr[String] = js.undefined
    
    /**
      * Logical name of the entity to display the form for.
      */
    var entityName: js.UndefOr[String] = js.undefined
    
    /**
      * ID of the form instance to be displayed.
      */
    var formId: js.UndefOr[String] = js.undefined
    
    /**
      * Height of the form window to be displayed in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Undocumented at this time
      */
    var isCrossEntityNavigate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Undocumented at this time
      */
    var isOfflineSyncError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether the navigation bar is displayed and whether application navigation is available using the areas and subareas defined in the sitemap.Valid vlaues are: "on", "off", or "entity".
      * * on: The navigation bar is displayed.This is the default behavior if the navBar parameter is not used.
      * * off: The navigation bar is not displayed.People can navigate using other user interface elements or the back and forward buttons.
      * * entity: On an entity form, only the navigation options for related entities are available.After navigating to a related entity, a back button is displayed in the navigation bar to allow returning to the original record.
      */
    var navBar: js.UndefOr[NavBarDisplay] = js.undefined
    
    /**
      * Indicates whether to display form in a new window.
      */
    var openInNewWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ID of the business process to be displayed on the form.
      */
    var processId: js.UndefOr[String] = js.undefined
    
    /**
      * ID of the business process instance to be displayed on the form.
      */
    var processInstanceId: js.UndefOr[String] = js.undefined
    
    /**
      * Define a relationship object to display the related records on the form.
      */
    var relationship: js.UndefOr[Relationship] = js.undefined
    
    /**
      * ID of the selected stage in business process instance.
      */
    var selectedStageId: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether to open a quick create form.
      */
    var useQuickCreateForm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width of the form window to be displayed in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify one of the following values for the window position of the form on the screen:
      * * 1:center
      * * 2:side
      */
    var windowPosition: js.UndefOr[WindowPositions] = js.undefined
  }
  object EntityFormOptions {
    
    inline def apply(): EntityFormOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityFormOptions]
    }
    
    extension [Self <: EntityFormOptions](x: Self) {
      
      inline def setCmdbar(value: Boolean): Self = StObject.set(x, "cmdbar", value.asInstanceOf[js.Any])
      
      inline def setCmdbarUndefined: Self = StObject.set(x, "cmdbar", js.undefined)
      
      inline def setCreateFromEntity(value: LookupValue): Self = StObject.set(x, "createFromEntity", value.asInstanceOf[js.Any])
      
      inline def setCreateFromEntityUndefined: Self = StObject.set(x, "createFromEntity", js.undefined)
      
      inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      inline def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
      
      inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsCrossEntityNavigate(value: Boolean): Self = StObject.set(x, "isCrossEntityNavigate", value.asInstanceOf[js.Any])
      
      inline def setIsCrossEntityNavigateUndefined: Self = StObject.set(x, "isCrossEntityNavigate", js.undefined)
      
      inline def setIsOfflineSyncError(value: Boolean): Self = StObject.set(x, "isOfflineSyncError", value.asInstanceOf[js.Any])
      
      inline def setIsOfflineSyncErrorUndefined: Self = StObject.set(x, "isOfflineSyncError", js.undefined)
      
      inline def setNavBar(value: NavBarDisplay): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
      
      inline def setNavBarUndefined: Self = StObject.set(x, "navBar", js.undefined)
      
      inline def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
      
      inline def setOpenInNewWindowUndefined: Self = StObject.set(x, "openInNewWindow", js.undefined)
      
      inline def setProcessId(value: String): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      inline def setProcessInstanceId(value: String): Self = StObject.set(x, "processInstanceId", value.asInstanceOf[js.Any])
      
      inline def setProcessInstanceIdUndefined: Self = StObject.set(x, "processInstanceId", js.undefined)
      
      inline def setRelationship(value: Relationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
      
      inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
      
      inline def setSelectedStageId(value: String): Self = StObject.set(x, "selectedStageId", value.asInstanceOf[js.Any])
      
      inline def setSelectedStageIdUndefined: Self = StObject.set(x, "selectedStageId", js.undefined)
      
      inline def setUseQuickCreateForm(value: Boolean): Self = StObject.set(x, "useQuickCreateForm", value.asInstanceOf[js.Any])
      
      inline def setUseQuickCreateFormUndefined: Self = StObject.set(x, "useQuickCreateForm", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWindowPosition(value: WindowPositions): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      inline def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
    }
  }
  
  /**
    * Details to show in the Error dialog
    */
  trait ErrorDialogOptions extends StObject {
    
    /**
      * Details about the error. When you specify this, the Download Log File button is available in the error message,
      * and clicking it will let users download a text file with the content specified in this attribute.
      */
    var details: js.UndefOr[String] = js.undefined
    
    /**
      * The error code. If you just set errorCode, the message for the error code is automatically
      * retrieved from the server and displayed in the error dialog.
      * If you specify an invalid errorCode value, an error dialog with a default error message is displyed.
      */
    var errorCode: js.UndefOr[Double] = js.undefined
    
    /**
      *  The message to be displayed in the error dialog.
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ErrorDialogOptions {
    
    inline def apply(): ErrorDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorDialogOptions]
    }
    
    extension [Self <: ErrorDialogOptions](x: Self) {
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait FileDetails extends StObject {
    
    /**
      * Contents of the file.
      */
    var fileContent: String
    
    /**
      * Name of the file.
      */
    var fileName: String
    
    /**
      * Size of the file in KB.
      */
    var fileSize: Double
    
    /**
      * String. MIME type of the file.
      */
    var mimeType: String
  }
  object FileDetails {
    
    inline def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): FileDetails = {
      val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDetails]
    }
    
    extension [Self <: FileDetails](x: Self) {
      
      inline def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options for navigating to a page: whether to open inline or in a dialog. If you don't specify this parameter, page is opened inline by default.
    * */
  trait NavigationOptions extends StObject {
    
    /**
      * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
      * */
    var height: js.UndefOr[Double | SizeValue] = js.undefined
    
    /**
      * Specify 1 to open the dialog in center; 2 to open the dialog on the side. Default is 1 (center).
      * */
    var position: js.UndefOr[`1` | `2`] = js.undefined
    
    /**
      * Specify 1 to open the page inline; 2 to open the page in a dialog.
      * Entity lists can only be opened inline; web resources can be opened either inline or in a dialog.
      * */
    var target: `1` | `2`
    
    /*
      * The dialog title on top of the center or side dialog.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
      * */
    var width: js.UndefOr[Double | SizeValue] = js.undefined
  }
  object NavigationOptions {
    
    inline def apply(target: `1` | `2`): NavigationOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationOptions]
    }
    
    extension [Self <: NavigationOptions](x: Self) {
      
      inline def setHeight(value: Double | SizeValue): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPosition(value: `1` | `2`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTarget(value: `1` | `2`): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double | SizeValue): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
    
    trait SizeValue extends StObject {
      
      /**
        * The unit of measurement. Specify "%" or "px". Default value is "px"
        * */
      var unit: Percentsign | px
      
      /**
        * The numerical value
        * */
      var value: Double
    }
    object SizeValue {
      
      inline def apply(unit: Percentsign | px, value: Double): SizeValue = {
        val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[SizeValue]
      }
      
      extension [Self <: SizeValue](x: Self) {
        
        inline def setUnit(value: Percentsign | px): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait OpenFormResult extends StObject {
    
    /**
      * Identifies the record displayed or created
      */
    var savedEntityReference: js.Array[LookupValue]
  }
  object OpenFormResult {
    
    inline def apply(savedEntityReference: js.Array[LookupValue]): OpenFormResult = {
      val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFormResult]
    }
    
    extension [Self <: OpenFormResult](x: Self) {
      
      inline def setSavedEntityReference(value: js.Array[LookupValue]): Self = StObject.set(x, "savedEntityReference", value.asInstanceOf[js.Any])
      
      inline def setSavedEntityReferenceVarargs(value: LookupValue*): Self = StObject.set(x, "savedEntityReference", js.Array(value*))
    }
  }
  
  trait OpenWebresourceOptions
    extends StObject
       with DialogSizeOptions {
    
    /**
      * Indicates whether to open the web resource in a new window.
      */
    var openInNewWindow: Boolean
  }
  object OpenWebresourceOptions {
    
    inline def apply(height: Double, openInNewWindow: Boolean, width: Double): OpenWebresourceOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], openInNewWindow = openInNewWindow.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenWebresourceOptions]
    }
    
    extension [Self <: OpenWebresourceOptions](x: Self) {
      
      inline def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageInputEntityList extends StObject {
    
    /**
      * The logical name of the entity to load in the list control.
      * */
    var entityName: String
    
    var pageType: entitylist
    
    /**
      * The ID of the view to load. If you don't specify it, navigates to the default main view for the entity.
      * */
    var viewId: js.UndefOr[String] = js.undefined
    
    /**
      * Type of view to load. Specify "savedquery" or "userquery".
      * */
    var viewType: js.UndefOr[savedquery | userquery] = js.undefined
  }
  object PageInputEntityList {
    
    inline def apply(entityName: String): PageInputEntityList = {
      val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = "entitylist")
      __obj.asInstanceOf[PageInputEntityList]
    }
    
    extension [Self <: PageInputEntityList](x: Self) {
      
      inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      inline def setPageType(value: entitylist): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
      
      inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      
      inline def setViewType(value: savedquery | userquery): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  trait PageInputEntityRecord extends StObject {
    
    /**
      * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name (optional).
      */
    var createFromEntity: js.UndefOr[LookupValue] = js.undefined
    
    /**
      * A dictionary object that passes extra parameters to the form. Invalid parameters will cause an error.
      */
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * ID of the entity record to display the form for. If you don't specify this value, the form will be opened in create mode.
      * */
    var entityId: js.UndefOr[String] = js.undefined
    
    /**
      * Logical name of the entity to display the form for.
      * */
    var entityName: String
    
    /**
      * ID of the form instance to be displayed.
      */
    var formId: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether the form is navigated to from a different entity using cross-entity business process flow.
      */
    var isCrossEntityNavigate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether there are any offline sync errors.
      */
    var isOfflineSyncError: js.UndefOr[Boolean] = js.undefined
    
    var pageType: entityrecord
    
    /**
      * ID of the business process to be displayed on the form.
      */
    var processId: js.UndefOr[String] = js.undefined
    
    /**
      * ID of the business process instance to be displayed on the form.
      */
    var processInstanceId: js.UndefOr[String] = js.undefined
    
    /**
      * Define a relationship object to display the related records on the form.
      */
    var relationship: js.UndefOr[Relationship] = js.undefined
    
    /**
      * ID of the selected stage in business process instance.
      */
    var selectedStageId: js.UndefOr[String] = js.undefined
  }
  object PageInputEntityRecord {
    
    inline def apply(entityName: String): PageInputEntityRecord = {
      val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = "entityrecord")
      __obj.asInstanceOf[PageInputEntityRecord]
    }
    
    extension [Self <: PageInputEntityRecord](x: Self) {
      
      inline def setCreateFromEntity(value: LookupValue): Self = StObject.set(x, "createFromEntity", value.asInstanceOf[js.Any])
      
      inline def setCreateFromEntityUndefined: Self = StObject.set(x, "createFromEntity", js.undefined)
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
      
      inline def setIsCrossEntityNavigate(value: Boolean): Self = StObject.set(x, "isCrossEntityNavigate", value.asInstanceOf[js.Any])
      
      inline def setIsCrossEntityNavigateUndefined: Self = StObject.set(x, "isCrossEntityNavigate", js.undefined)
      
      inline def setIsOfflineSyncError(value: Boolean): Self = StObject.set(x, "isOfflineSyncError", value.asInstanceOf[js.Any])
      
      inline def setIsOfflineSyncErrorUndefined: Self = StObject.set(x, "isOfflineSyncError", js.undefined)
      
      inline def setPageType(value: entityrecord): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      inline def setProcessId(value: String): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      inline def setProcessInstanceId(value: String): Self = StObject.set(x, "processInstanceId", value.asInstanceOf[js.Any])
      
      inline def setProcessInstanceIdUndefined: Self = StObject.set(x, "processInstanceId", js.undefined)
      
      inline def setRelationship(value: Relationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
      
      inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
      
      inline def setSelectedStageId(value: String): Self = StObject.set(x, "selectedStageId", value.asInstanceOf[js.Any])
      
      inline def setSelectedStageIdUndefined: Self = StObject.set(x, "selectedStageId", js.undefined)
    }
  }
  
  trait PageInputHtmlWebResource extends StObject {
    
    /**
      * The data to pass to the web resource.
      * */
    var data: js.UndefOr[String] = js.undefined
    
    var pageType: webresource
    
    /**
      * The name of the web resource to load.
      * */
    var webresourceName: String
  }
  object PageInputHtmlWebResource {
    
    inline def apply(webresourceName: String): PageInputHtmlWebResource = {
      val __obj = js.Dynamic.literal(pageType = "webresource", webresourceName = webresourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInputHtmlWebResource]
    }
    
    extension [Self <: PageInputHtmlWebResource](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPageType(value: webresource): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      inline def setWebresourceName(value: String): Self = StObject.set(x, "webresourceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Relationship extends StObject {
    
    /**
      * Name of the attribute used for relationship.
      */
    var attributeName: String
    
    /**
      * Name of the relationship.
      */
    var name: String
    
    /**
      * Name of the navigation property for this relationship.
      */
    var navigationPropertyName: js.UndefOr[String] = js.undefined
    
    /**
      * Relationship type.Specify one of the following values:
      * * 0:OneToMany
      * * 1:ManyToMany
      */
    var relationshipType: js.UndefOr[RelationshipType] = js.undefined
    
    //
    /**
      * Role type in relationship.Specify one of the following values:
      * * 1:Referencing
      * * 2:AssociationEntity
      */
    var roleType: js.UndefOr[RoleType] = js.undefined
  }
  object Relationship {
    
    inline def apply(attributeName: String, name: String): Relationship = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Relationship]
    }
    
    extension [Self <: Relationship](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNavigationPropertyName(value: String): Self = StObject.set(x, "navigationPropertyName", value.asInstanceOf[js.Any])
      
      inline def setNavigationPropertyNameUndefined: Self = StObject.set(x, "navigationPropertyName", js.undefined)
      
      inline def setRelationshipType(value: RelationshipType): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
      
      inline def setRelationshipTypeUndefined: Self = StObject.set(x, "relationshipType", js.undefined)
      
      inline def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
      
      inline def setRoleTypeUndefined: Self = StObject.set(x, "roleType", js.undefined)
    }
  }
}
