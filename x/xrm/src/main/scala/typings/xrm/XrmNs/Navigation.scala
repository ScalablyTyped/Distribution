package typings.xrm.XrmNs

import typings.xrm.XrmEnumNs.OpenFileOptions
import typings.xrm.XrmNs.AsyncNs.PromiseLike
import typings.xrm.XrmNs.NavigationNs.AlertStrings
import typings.xrm.XrmNs.NavigationNs.ConfirmResult
import typings.xrm.XrmNs.NavigationNs.ConfirmStrings
import typings.xrm.XrmNs.NavigationNs.DialogSizeOptions
import typings.xrm.XrmNs.NavigationNs.EntityFormOptions
import typings.xrm.XrmNs.NavigationNs.ErrorDialogOptions
import typings.xrm.XrmNs.NavigationNs.FileDetails
import typings.xrm.XrmNs.NavigationNs.OpenFormResult
import typings.xrm.XrmNs.NavigationNs.OpenWebresourceOptions
import typings.xrm.XrmNs.UtilityNs.OpenParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Xrm.Navigation API
  */
@js.native
trait Navigation extends js.Object {
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
  def openWebResource(webResourceName: String, windowOptions: OpenWebresourceOptions): Unit = js.native
  def openWebResource(webResourceName: String, windowOptions: OpenWebresourceOptions, data: String): Unit = js.native
}

