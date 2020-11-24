package typings.twineSugarcube.uiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIAPI extends js.Object {
  
  /**
    * Opens the built-in alert dialog, displaying the given message to the player.
    * @param message The message to display to the player.
    * @param options The options object. @see Dialog.addClickHandler() for more information.
    * @param closeFn The function to execute whenever the dialog is closed.
    * @since 2.0.0
    */
  def alert(message: String): Unit = js.native
  def alert(message: String, options: js.UndefOr[scala.Nothing], closeFn: js.Function0[Unit]): Unit = js.native
  def alert(message: String, options: DialogOptions): Unit = js.native
  def alert(message: String, options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Opens the built-in jump to dialog, which is populated via the bookmark tag.
    * @param options The options object. @see Dialog.addClickHandler() for more information.
    * @param closeFn The function to execute whenever the dialog is closed.
    * @since 2.0.0
    */
  def jumpto(): Unit = js.native
  def jumpto(options: js.UndefOr[scala.Nothing], closeFn: js.Function0[Unit]): Unit = js.native
  def jumpto(options: DialogOptions): Unit = js.native
  def jumpto(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Opens the built-in restart dialog, prompting the player to restart the story.
    * @param options The options object. @see Dialog.addClickHandler() for more information.
    * @since 2.0.0
    */
  def restart(): Unit = js.native
  def restart(options: DialogOptions): Unit = js.native
  
  /**
    * Opens the built-in saves dialog.
    * @param options The options object. See Dialog.addClickHandler() for more information.
    * @param closeFn The function to execute whenever the dialog is closed.
    * @since 2.0.0
    */
  def saves(): Unit = js.native
  def saves(options: js.UndefOr[scala.Nothing], closeFn: js.Function0[Unit]): Unit = js.native
  def saves(options: DialogOptions): Unit = js.native
  def saves(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Opens the built-in settings dialog, which is populated from the Setting API.
    * @param options The options object. See Dialog.addClickHandler() for more information.
    * @param closeFn The function to execute whenever the dialog is closed.
    * @sine 2.0.0
    *
    */
  def settings(): Unit = js.native
  def settings(options: js.UndefOr[scala.Nothing], closeFn: js.Function0[Unit]): Unit = js.native
  def settings(options: DialogOptions): Unit = js.native
  def settings(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Opens the built-in share dialog, which is populated from the StoryShare passage.
    * @param options The options object. See Dialog.addClickHandler() for more information.
    * @param closeFn The function to execute whenever the dialog is closed.
    * @since 2.0.0
    */
  def share(): Unit = js.native
  def share(options: js.UndefOr[scala.Nothing], closeFn: js.Function0[Unit]): Unit = js.native
  def share(options: DialogOptions): Unit = js.native
  def share(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
}
