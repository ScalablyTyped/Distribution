package typings
package xrmLib.XrmNs

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
  def openAlertDialog(alertStrings: xrmLib.XrmNs.NavigationNs.AlertStrings): xrmLib.XrmNs.AsyncNs.PromiseLike[_] = js.native
  def openAlertDialog(
    alertStrings: xrmLib.XrmNs.NavigationNs.AlertStrings,
    alertOptions: xrmLib.XrmNs.NavigationNs.DialogSizeOptions
  ): xrmLib.XrmNs.AsyncNs.PromiseLike[_] = js.native
  /**
    * Displays a confirmation dialog box containing a message and two buttons.
    * @param confirmStrings The strings to be used in the confirm dialog.
    * @param confirmOptions The height and width options for alert dialog
    */
  def openConfirmDialog(confirmStrings: xrmLib.XrmNs.NavigationNs.ConfirmStrings): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.NavigationNs.ConfirmResult] = js.native
  def openConfirmDialog(
    confirmStrings: xrmLib.XrmNs.NavigationNs.ConfirmStrings,
    confirmOptions: xrmLib.XrmNs.NavigationNs.DialogSizeOptions
  ): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.NavigationNs.ConfirmResult] = js.native
  /**
    * Displays an error dialog.
    * @param confirmStrings The strings to be used in the confirm dialog.
    * @param confirmOptions The height and width options for alert dialog
    */
  def openErrorDialog(errorOptions: xrmLib.XrmNs.NavigationNs.ErrorDialogOptions): xrmLib.XrmNs.AsyncNs.PromiseLike[_] = js.native
  /**
    * Opens a file.
    */
  def openFile(file: xrmLib.XrmNs.NavigationNs.FileDetails): scala.Unit = js.native
  def openFile(file: xrmLib.XrmNs.NavigationNs.FileDetails, openFileOptions: xrmLib.XrmEnumNs.OpenFileOptions): scala.Unit = js.native
  /**
    * Opens an entity form or a quick create form.
    */
  def openForm(entityFormOptions: xrmLib.XrmNs.NavigationNs.EntityFormOptions): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.NavigationNs.OpenFormResult] = js.native
  def openForm(
    entityFormOptions: xrmLib.XrmNs.NavigationNs.EntityFormOptions,
    formParameters: xrmLib.XrmNs.UtilityNs.OpenParameters
  ): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.NavigationNs.OpenFormResult] = js.native
  /**
    * Opens a URL, including file URLs.
    * @param url URL to open.
    * @param openUrlOptions Options to open the URL
    */
  def openUrl(url: java.lang.String): scala.Unit = js.native
  def openUrl(url: java.lang.String, openUrlOptions: xrmLib.XrmNs.NavigationNs.DialogSizeOptions): scala.Unit = js.native
  /**
    * Opens an HTML web resource.
    * @param webResourceName Name of the HTML web resource.
    * @param windowOptions (Optional) Window options for opening the web resource.
    *                                                 It is advised to use encodeURIcomponent() to encode the value.
    */
  def openWebResource(webResourceName: java.lang.String): scala.Unit = js.native
  def openWebResource(webResourceName: java.lang.String, windowOptions: xrmLib.XrmNs.NavigationNs.OpenWebresourceOptions): scala.Unit = js.native
  def openWebResource(
    webResourceName: java.lang.String,
    windowOptions: xrmLib.XrmNs.NavigationNs.OpenWebresourceOptions,
    data: java.lang.String
  ): scala.Unit = js.native
}

