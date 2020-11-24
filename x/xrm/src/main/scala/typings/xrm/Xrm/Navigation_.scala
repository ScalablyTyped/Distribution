package typings.xrm.Xrm

import typings.xrm.Xrm.Async.PromiseLike
import typings.xrm.Xrm.Navigation.AlertStrings
import typings.xrm.Xrm.Navigation.ConfirmResult
import typings.xrm.Xrm.Navigation.ConfirmStrings
import typings.xrm.Xrm.Navigation.DialogSizeOptions
import typings.xrm.Xrm.Navigation.EntityFormOptions
import typings.xrm.Xrm.Navigation.ErrorDialogOptions
import typings.xrm.Xrm.Navigation.FileDetails
import typings.xrm.Xrm.Navigation.NavigationOptions
import typings.xrm.Xrm.Navigation.OpenFormResult
import typings.xrm.Xrm.Navigation.OpenWebresourceOptions
import typings.xrm.Xrm.Navigation.PageInputEntityList
import typings.xrm.Xrm.Navigation.PageInputEntityRecord
import typings.xrm.Xrm.Navigation.PageInputHtmlWebResource
import typings.xrm.Xrm.Utility.OpenParameters
import typings.xrm.XrmEnum.OpenFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the Xrm.Navigation API
  */
@js.native
trait Navigation_ extends js.Object {
  
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
