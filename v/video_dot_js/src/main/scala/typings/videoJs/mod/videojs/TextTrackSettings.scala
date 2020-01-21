package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manipulate Text Tracks settings.
  */
@js.native
trait TextTrackSettings extends ModalDialog {
  /**
    * Gets an object of text track settings (or null).
    *
    * @return An object with config values parsed from the DOM or localStorage.
    */
  def getValues(): js.Any = js.native
  /**
    * Restore texttrack settings from localStorage
    */
  def restoreSettings(): Unit = js.native
  /**
    * Save text track settings to localStorage
    */
  def saveSettings(): Unit = js.native
  /**
    * Sets all `<select>` elements to their default values.
    */
  def setDefaults(): Unit = js.native
  /**
    * Sets text track settings from an object of values.
    *
    * @param values
    *        An object with config values parsed from the DOM or localStorage.
    */
  def setValues(values: js.Any): Unit = js.native
  /**
    * Update display of text track settings
    */
  def updateDisplay(): Unit = js.native
}

