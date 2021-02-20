package typings.xrm.Xrm

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.Xrm.Async.PromiseLike
import typings.xrm.Xrm.Navigation.AlertStrings
import typings.xrm.Xrm.Navigation.ConfirmResult
import typings.xrm.Xrm.Navigation.ConfirmStrings
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
import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import typings.xrm.xrmStrings.Percentsign
import typings.xrm.xrmStrings.entitylist
import typings.xrm.xrmStrings.entityrecord
import typings.xrm.xrmStrings.px
import typings.xrm.xrmStrings.savedquery
import typings.xrm.xrmStrings.userquery
import typings.xrm.xrmStrings.webresource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the Xrm.Navigation API
  */
@js.native
trait Navigation extends StObject {
  
  def navigateTo(pageInput: PageInputEntityList): PromiseLike[_] = js.native
  def navigateTo(pageInput: PageInputEntityList, navigationOptions: NavigationOptions): PromiseLike[_] = js.native
  /**
    * Navigates to the specified page.
    * @param pageInput Input about the page to navigate to. The object definition changes depending on the type of page to navigate to: entity list or HTML web resource.
    * @param navigationOptions Options for navigating to a page: whether to open inline or in a dialog. If you don't specify this parameter, page is opened inline by default.
    */
  def navigateTo(pageInput: PageInputEntityRecord): PromiseLike[_] = js.native
  def navigateTo(pageInput: PageInputEntityRecord, navigationOptions: NavigationOptions): PromiseLike[_] = js.native
  def navigateTo(pageInput: PageInputHtmlWebResource): PromiseLike[_] = js.native
  def navigateTo(pageInput: PageInputHtmlWebResource, navigationOptions: NavigationOptions): PromiseLike[_] = js.native
  
  /**
    * Displays an alert dialog containing a message and a button.
    * @param alertStrings The strings to be used in the alert dialog.
    * @param alertOptions The height and width options for alert dialog
    */
  def openAlertDialog(alertStrings: AlertStrings): PromiseLike[_] = js.native
  def openAlertDialog(alertStrings: AlertStrings, alertOptions: DialogSizeOptions): PromiseLike[_] = js.native
  
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
  def openErrorDialog(errorOptions: ErrorDialogOptions): PromiseLike[_] = js.native
  
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
  def openWebResource(webResourceName: String, windowOptions: js.UndefOr[scala.Nothing], data: String): Unit = js.native
  def openWebResource(webResourceName: String, windowOptions: OpenWebresourceOptions): Unit = js.native
  def openWebResource(webResourceName: String, windowOptions: OpenWebresourceOptions, data: String): Unit = js.native
}
/**
  * Namespace to hold Xrm.Navigation related types
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-navigation External Link: Xrm.Navigation (Client API reference)}
  */
object Navigation {
  
  @js.native
  trait AlertStrings extends StObject {
    
    /**
      * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
      */
    var confirmButtonLabel: js.UndefOr[String] = js.native
    
    /**
      *  The message to be displyed in the alert dialog.
      */
    var text: String = js.native
    
    /**
      * (Optional) The title of the alert dialog.
      */
    var title: js.UndefOr[String] = js.native
  }
  object AlertStrings {
    
    @scala.inline
    def apply(text: String): AlertStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertStrings]
    }
    
    @scala.inline
    implicit class AlertStringsMutableBuilder[Self <: AlertStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
    */
  @js.native
  trait ConfirmResult extends StObject {
    
    /**
      * true if the confirm button was clicked to close the dialog.
      */
    var confirmed: Boolean = js.native
  }
  object ConfirmResult {
    
    @scala.inline
    def apply(confirmed: Boolean): ConfirmResult = {
      val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmResult]
    }
    
    @scala.inline
    implicit class ConfirmResultMutableBuilder[Self <: ConfirmResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfirmStrings extends StObject {
    
    /**
      * (Optional) The cancel button label. If you do not specify the cancel button label, Cancel is used as the button label.
      */
    var cancelButtonLabel: js.UndefOr[String] = js.native
    
    /**
      * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
      */
    var confirmButtonLabel: js.UndefOr[String] = js.native
    
    /**
      * (Optional) The subtitle to be displayed in the confirmation dialog.
      */
    var subtitle: js.UndefOr[String] = js.native
    
    /**
      * The message to be displyed in the alert dialog.
      */
    var text: String = js.native
    
    /**
      * (Optional) The title to be displyed in the confirmation dialog.
      */
    var title: js.UndefOr[String] = js.native
  }
  object ConfirmStrings {
    
    @scala.inline
    def apply(text: String): ConfirmStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmStrings]
    }
    
    @scala.inline
    implicit class ConfirmStringsMutableBuilder[Self <: ConfirmStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
      
      @scala.inline
      def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait DialogSizeOptions extends StObject {
    
    /**
      * Height of the alert dialog in pixels.
      */
    var height: Double = js.native
    
    /**
      * Width of the alert dialog pixels.
      */
    var width: Double = js.native
  }
  object DialogSizeOptions {
    
    @scala.inline
    def apply(height: Double, width: Double): DialogSizeOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogSizeOptions]
    }
    
    @scala.inline
    implicit class DialogSizeOptionsMutableBuilder[Self <: DialogSizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Entity form options for opening the form
    */
  @js.native
  trait EntityFormOptions extends StObject {
    
    /**
      * Indicates whether to display the command bar.If you do not specify this parameter, the command bar is displayed by default.
      */
    var cmdbar: js.UndefOr[Boolean] = js.native
    
    /**
      * Designates a record that will provide default values based on mapped attribute values.The lookup object has the following String properties: entityType, id, and name (optional).
      */
    var createFromEntity: js.UndefOr[LookupValue] = js.native
    
    /**
      * ID of the entity record to display the form for.
      */
    var entityId: js.UndefOr[String] = js.native
    
    /**
      * Logical name of the entity to display the form for.
      */
    var entityName: js.UndefOr[String] = js.native
    
    /**
      * ID of the form instance to be displayed.
      */
    var formId: js.UndefOr[String] = js.native
    
    /**
      * Height of the form window to be displayed in pixels.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Undocumented at this time
      */
    var isCrossEntityNavigate: js.UndefOr[Boolean] = js.native
    
    /**
      * Undocumented at this time
      */
    var isOfflineSyncError: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls whether the navigation bar is displayed and whether application navigation is available using the areas and subareas defined in the sitemap.Valid vlaues are: "on", "off", or "entity".
      * * on: The navigation bar is displayed.This is the default behavior if the navBar parameter is not used.
      * * off: The navigation bar is not displayed.People can navigate using other user interface elements or the back and forward buttons.
      * * entity: On an entity form, only the navigation options for related entities are available.After navigating to a related entity, a back button is displayed in the navigation bar to allow returning to the original record.
      */
    var navBar: js.UndefOr[NavBarDisplay] = js.native
    
    /**
      * Indicates whether to display form in a new window.
      */
    var openInNewWindow: js.UndefOr[Boolean] = js.native
    
    /**
      * ID of the business process to be displayed on the form.
      */
    var processId: js.UndefOr[String] = js.native
    
    /**
      * ID of the business process instance to be displayed on the form.
      */
    var processInstanceId: js.UndefOr[String] = js.native
    
    /**
      * Define a relationship object to display the related records on the form.
      */
    var relationship: js.UndefOr[Relationship] = js.native
    
    /**
      * ID of the selected stage in business process instance.
      */
    var selectedStageId: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether to open a quick create form.
      */
    var useQuickCreateForm: js.UndefOr[Boolean] = js.native
    
    /**
      * Width of the form window to be displayed in pixels.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Specify one of the following values for the window position of the form on the screen:
      * * 1:center
      * * 2:side
      */
    var windowPosition: js.UndefOr[WindowPositions] = js.native
  }
  object EntityFormOptions {
    
    @scala.inline
    def apply(): EntityFormOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityFormOptions]
    }
    
    @scala.inline
    implicit class EntityFormOptionsMutableBuilder[Self <: EntityFormOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmdbar(value: Boolean): Self = StObject.set(x, "cmdbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdbarUndefined: Self = StObject.set(x, "cmdbar", js.undefined)
      
      @scala.inline
      def setCreateFromEntity(value: LookupValue): Self = StObject.set(x, "createFromEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromEntityUndefined: Self = StObject.set(x, "createFromEntity", js.undefined)
      
      @scala.inline
      def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      @scala.inline
      def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
      
      @scala.inline
      def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsCrossEntityNavigate(value: Boolean): Self = StObject.set(x, "isCrossEntityNavigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCrossEntityNavigateUndefined: Self = StObject.set(x, "isCrossEntityNavigate", js.undefined)
      
      @scala.inline
      def setIsOfflineSyncError(value: Boolean): Self = StObject.set(x, "isOfflineSyncError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOfflineSyncErrorUndefined: Self = StObject.set(x, "isOfflineSyncError", js.undefined)
      
      @scala.inline
      def setNavBar(value: NavBarDisplay): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavBarUndefined: Self = StObject.set(x, "navBar", js.undefined)
      
      @scala.inline
      def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenInNewWindowUndefined: Self = StObject.set(x, "openInNewWindow", js.undefined)
      
      @scala.inline
      def setProcessId(value: String): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      @scala.inline
      def setProcessInstanceId(value: String): Self = StObject.set(x, "processInstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessInstanceIdUndefined: Self = StObject.set(x, "processInstanceId", js.undefined)
      
      @scala.inline
      def setRelationship(value: Relationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
      
      @scala.inline
      def setSelectedStageId(value: String): Self = StObject.set(x, "selectedStageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStageIdUndefined: Self = StObject.set(x, "selectedStageId", js.undefined)
      
      @scala.inline
      def setUseQuickCreateForm(value: Boolean): Self = StObject.set(x, "useQuickCreateForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseQuickCreateFormUndefined: Self = StObject.set(x, "useQuickCreateForm", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: WindowPositions): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
    }
  }
  
  /**
    * Details to show in the Error dialog
    */
  @js.native
  trait ErrorDialogOptions extends StObject {
    
    /**
      * Details about the error. When you specify this, the Download Log File button is available in the error message,
      * and clicking it will let users download a text file with the content specified in this attribute.
      */
    var details: js.UndefOr[String] = js.native
    
    /**
      * The error code. If you just set errorCode, the message for the error code is automatically
      * retrieved from the server and displayed in the error dialog.
      * If you specify an invalid errorCode value, an error dialog with a default error message is displyed.
      */
    var errorCode: js.UndefOr[Double] = js.native
    
    /**
      *  The message to be displayed in the error dialog.
      */
    var message: js.UndefOr[String] = js.native
  }
  object ErrorDialogOptions {
    
    @scala.inline
    def apply(): ErrorDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorDialogOptions]
    }
    
    @scala.inline
    implicit class ErrorDialogOptionsMutableBuilder[Self <: ErrorDialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait FileDetails extends StObject {
    
    /**
      * Contents of the file.
      */
    var fileContent: String = js.native
    
    /**
      * Name of the file.
      */
    var fileName: String = js.native
    
    /**
      * Size of the file in KB.
      */
    var fileSize: Double = js.native
    
    /**
      * String. MIME type of the file.
      */
    var mimeType: String = js.native
  }
  object FileDetails {
    
    @scala.inline
    def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): FileDetails = {
      val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDetails]
    }
    
    @scala.inline
    implicit class FileDetailsMutableBuilder[Self <: FileDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options for navigating to a page: whether to open inline or in a dialog. If you don't specify this parameter, page is opened inline by default.
    * */
  @js.native
  trait NavigationOptions extends StObject {
    
    /**
      * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
      * */
    var height: js.UndefOr[Double | SizeValue] = js.native
    
    /**
      * Specify 1 to open the dialog in center; 2 to open the dialog on the side. Default is 1 (center).
      * */
    var position: js.UndefOr[`1` | `2`] = js.native
    
    /**
      * Specify 1 to open the page inline; 2 to open the page in a dialog.
      * Entity lists can only be opened inline; web resources can be opened either inline or in a dialog.
      * */
    var target: `1` | `2` = js.native
    
    /**
      * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
      * */
    var width: js.UndefOr[Double | SizeValue] = js.native
  }
  object NavigationOptions {
    
    @scala.inline
    def apply(target: `1` | `2`): NavigationOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationOptions]
    }
    
    @scala.inline
    implicit class NavigationOptionsMutableBuilder[Self <: NavigationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double | SizeValue): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPosition(value: `1` | `2`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTarget(value: `1` | `2`): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double | SizeValue): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
    
    @js.native
    trait SizeValue extends StObject {
      
      /**
        * The unit of measurement. Specify "%" or "px". Default value is "px"
        * */
      var unit: Percentsign | px = js.native
      
      /**
        * The numerical value
        * */
      var value: Double = js.native
    }
    object SizeValue {
      
      @scala.inline
      def apply(unit: Percentsign | px, value: Double): SizeValue = {
        val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[SizeValue]
      }
      
      @scala.inline
      implicit class SizeValueMutableBuilder[Self <: SizeValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUnit(value: Percentsign | px): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait OpenFormResult extends StObject {
    
    /**
      * Identifies the record displayed or created
      */
    var savedEntityReference: js.Array[LookupValue] = js.native
  }
  object OpenFormResult {
    
    @scala.inline
    def apply(savedEntityReference: js.Array[LookupValue]): OpenFormResult = {
      val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFormResult]
    }
    
    @scala.inline
    implicit class OpenFormResultMutableBuilder[Self <: OpenFormResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSavedEntityReference(value: js.Array[LookupValue]): Self = StObject.set(x, "savedEntityReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedEntityReferenceVarargs(value: LookupValue*): Self = StObject.set(x, "savedEntityReference", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OpenWebresourceOptions extends DialogSizeOptions {
    
    /**
      * Indicates whether to open the web resource in a new window.
      */
    var openInNewWindow: Boolean = js.native
  }
  object OpenWebresourceOptions {
    
    @scala.inline
    def apply(height: Double, openInNewWindow: Boolean, width: Double): OpenWebresourceOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], openInNewWindow = openInNewWindow.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenWebresourceOptions]
    }
    
    @scala.inline
    implicit class OpenWebresourceOptionsMutableBuilder[Self <: OpenWebresourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageInputEntityList extends StObject {
    
    /**
      * The logical name of the entity to load in the list control.
      * */
    var entityName: String = js.native
    
    var pageType: entitylist = js.native
    
    /**
      * The ID of the view to load. If you don't specify it, navigates to the default main view for the entity.
      * */
    var viewId: js.UndefOr[String] = js.native
    
    /**
      * Type of view to load. Specify "savedquery" or "userquery".
      * */
    var viewType: js.UndefOr[savedquery | userquery] = js.native
  }
  object PageInputEntityList {
    
    @scala.inline
    def apply(entityName: String, pageType: entitylist): PageInputEntityList = {
      val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInputEntityList]
    }
    
    @scala.inline
    implicit class PageInputEntityListMutableBuilder[Self <: PageInputEntityList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageType(value: entitylist): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      
      @scala.inline
      def setViewType(value: savedquery | userquery): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  @js.native
  trait PageInputEntityRecord extends StObject {
    
    /**
      * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name (optional).
      */
    var createFromEntity: js.UndefOr[Boolean] = js.native
    
    /**
      * A dictionary object that passes extra parameters to the form. Invalid parameters will cause an error.
      */
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * ID of the entity record to display the form for. If you don't specify this value, the form will be opened in create mode.
      * */
    var entityId: js.UndefOr[String] = js.native
    
    /**
      * Logical name of the entity to display the form for.
      * */
    var entityName: String = js.native
    
    /**
      * ID of the form instance to be displayed.
      */
    var formId: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether the form is navigated to from a different entity using cross-entity business process flow.
      */
    var isCrossEntityNavigate: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates whether there are any offline sync errors.
      */
    var isOfflineSyncError: js.UndefOr[Boolean] = js.native
    
    var pageType: entityrecord = js.native
    
    /**
      * ID of the business process to be displayed on the form.
      */
    var processId: js.UndefOr[String] = js.native
    
    /**
      * ID of the business process instance to be displayed on the form.
      */
    var processInstanceId: js.UndefOr[String] = js.native
    
    /**
      * Define a relationship object to display the related records on the form.
      */
    var relationship: js.UndefOr[Relationship] = js.native
    
    /**
      * ID of the selected stage in business process instance.
      */
    var selectedStageId: js.UndefOr[String] = js.native
  }
  object PageInputEntityRecord {
    
    @scala.inline
    def apply(entityName: String, pageType: entityrecord): PageInputEntityRecord = {
      val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInputEntityRecord]
    }
    
    @scala.inline
    implicit class PageInputEntityRecordMutableBuilder[Self <: PageInputEntityRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateFromEntity(value: Boolean): Self = StObject.set(x, "createFromEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromEntityUndefined: Self = StObject.set(x, "createFromEntity", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      @scala.inline
      def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
      
      @scala.inline
      def setIsCrossEntityNavigate(value: Boolean): Self = StObject.set(x, "isCrossEntityNavigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCrossEntityNavigateUndefined: Self = StObject.set(x, "isCrossEntityNavigate", js.undefined)
      
      @scala.inline
      def setIsOfflineSyncError(value: Boolean): Self = StObject.set(x, "isOfflineSyncError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOfflineSyncErrorUndefined: Self = StObject.set(x, "isOfflineSyncError", js.undefined)
      
      @scala.inline
      def setPageType(value: entityrecord): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: String): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      @scala.inline
      def setProcessInstanceId(value: String): Self = StObject.set(x, "processInstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessInstanceIdUndefined: Self = StObject.set(x, "processInstanceId", js.undefined)
      
      @scala.inline
      def setRelationship(value: Relationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
      
      @scala.inline
      def setSelectedStageId(value: String): Self = StObject.set(x, "selectedStageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStageIdUndefined: Self = StObject.set(x, "selectedStageId", js.undefined)
    }
  }
  
  @js.native
  trait PageInputHtmlWebResource extends StObject {
    
    /**
      * The data to pass to the web resource.
      * */
    var data: js.UndefOr[String] = js.native
    
    var pageType: webresource = js.native
    
    /**
      * The name of the web resource to load.
      * */
    var webresourceName: String = js.native
  }
  object PageInputHtmlWebResource {
    
    @scala.inline
    def apply(pageType: webresource, webresourceName: String): PageInputHtmlWebResource = {
      val __obj = js.Dynamic.literal(pageType = pageType.asInstanceOf[js.Any], webresourceName = webresourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInputHtmlWebResource]
    }
    
    @scala.inline
    implicit class PageInputHtmlWebResourceMutableBuilder[Self <: PageInputHtmlWebResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setPageType(value: webresource): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebresourceName(value: String): Self = StObject.set(x, "webresourceName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Relationship extends StObject {
    
    /**
      * Name of the attribute used for relationship.
      */
    var attributeName: String = js.native
    
    /**
      * Name of the relationship.
      */
    var name: String = js.native
    
    /**
      * Name of the navigation property for this relationship.
      */
    var navigationPropertyName: js.UndefOr[String] = js.native
    
    /**
      * Relationship type.Specify one of the following values:
      * * 0:OneToMany
      * * 1:ManyToMany
      */
    var relationshipType: js.UndefOr[RelationshipType] = js.native
    
    //
    /**
      * Role type in relationship.Specify one of the following values:
      * * 1:Referencing
      * * 2:AssociationEntity
      */
    var roleType: js.UndefOr[RoleType] = js.native
  }
  object Relationship {
    
    @scala.inline
    def apply(attributeName: String, name: String): Relationship = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Relationship]
    }
    
    @scala.inline
    implicit class RelationshipMutableBuilder[Self <: Relationship] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationPropertyName(value: String): Self = StObject.set(x, "navigationPropertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationPropertyNameUndefined: Self = StObject.set(x, "navigationPropertyName", js.undefined)
      
      @scala.inline
      def setRelationshipType(value: RelationshipType): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationshipTypeUndefined: Self = StObject.set(x, "relationshipType", js.undefined)
      
      @scala.inline
      def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleTypeUndefined: Self = StObject.set(x, "roleType", js.undefined)
    }
  }
}
