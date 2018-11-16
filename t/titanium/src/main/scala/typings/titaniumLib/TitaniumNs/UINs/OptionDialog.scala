package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An option dialog is a modal view that includes a message and one or more option items positioned
		 * in the middle of the display on Android and at the bottom edge on iOS. On Android, buttons may
		 * be added below the options.
		 */
@js.native
trait OptionDialog extends View {
  /**
  			 * View to load inside the message area, to create a custom layout.
  			 */
  var androidView: View = js.native
  /**
  			 * List of button names.
  			 */
  var buttonNames: js.Array[java.lang.String] = js.native
  /**
  			 * Index to define the cancel option.
  			 */
  var cancel: scala.Double = js.native
  /**
  			 * Index to define the destructive option, indicated by a visual cue when rendered.
  			 */
  var destructive: scala.Double = js.native
  /**
  			 * Boolean value indicating if the option dialog should have an opaque background.
  			 */
  var opaquebackground: scala.Boolean = js.native
  /**
  			 * List of option names to display in the dialog.
  			 */
  var options: js.Array[java.lang.String] = js.native
  /**
  			 * Boolean value indicating if the option dialog should only be cancelled by user gesture or by hide method.
  			 */
  var persistent: scala.Boolean = js.native
  /**
  			 * Defines the default selected option.
  			 */
  var selectedIndex: scala.Double = js.native
  /**
  			 * Title of the dialog.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the title text.
  			 */
  var titleid: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.androidView> property.
  			 */
  def getAndroidView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.buttonNames> property.
  			 */
  def getButtonNames(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.cancel> property.
  			 */
  def getCancel(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.destructive> property.
  			 */
  def getDestructive(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.opaquebackground> property.
  			 */
  def getOpaquebackground(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.options> property.
  			 */
  def getOptions(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.persistent> property.
  			 */
  def getPersistent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.selectedIndex> property.
  			 */
  def getSelectedIndex(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.titleid> property.
  			 */
  def getTitleid(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.androidView> property.
  			 */
  def setAndroidView(androidView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.buttonNames> property.
  			 */
  def setButtonNames(buttonNames: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.cancel> property.
  			 */
  def setCancel(cancel: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.destructive> property.
  			 */
  def setDestructive(destructive: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.opaquebackground> property.
  			 */
  def setOpaquebackground(opaquebackground: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.options> property.
  			 */
  def setOptions(options: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.persistent> property.
  			 */
  def setPersistent(persistent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.selectedIndex> property.
  			 */
  def setSelectedIndex(selectedIndex: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.titleid> property.
  			 */
  def setTitleid(titleid: java.lang.String): scala.Unit = js.native
}

