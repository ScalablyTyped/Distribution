package typings.titanium.global.Titanium.UI

import typings.titanium.Dictionary
import typings.titanium.Matrix2DCreationDict
import typings.titanium.Matrix3DCreationDict
import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.UI")
@js.native
object ^ extends js.Object {
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  /**
    * Sets the background color of the master view (when there are no windows or other top-level
    * controls displayed).
    */
  var backgroundColor: String = js.native
  /**
    * Local path or URL to an image file for setting a background for the master view (when there
    * are no windows or other top-level controls displayed).
    */
  var backgroundImage: String = js.native
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  /**
    * When running on Android, iOS 10 or lower, or Windows the value to return form the applications colorset.
    */
  var semanticColorType: String = js.native
  /**
    * Sets the global tint color of the application. It is inherited by the child views and can be
    * overwritten by them using the `tintColor` property.
    */
  var tintColor: String = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  /**
    * Converts one type of unit to another using the metrics of the main display.
    */
  def convertUnits(convertFromValue: String, convertToUnits: Double): Double = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.2DMatrix>.
    * @deprecated Use [Titanium.UI.createMatrix2D](Titanium.UI.createMatrix2D) instead.
    */
  def create2DMatrix(): typings.titanium.Titanium.UI.Matrix2D = js.native
  def create2DMatrix(parameters: Matrix2DCreationDict): typings.titanium.Titanium.UI.Matrix2D = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.3DMatrix>.
    * @deprecated Use [Titanium.UI.createMatrix3D](Titanium.UI.createMatrix3D) instead.
    */
  def create3DMatrix(): typings.titanium.Titanium.UI.Matrix3D = js.native
  def create3DMatrix(parameters: Matrix3DCreationDict): typings.titanium.Titanium.UI.Matrix3D = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ActivityIndicator>.
    */
  def createActivityIndicator(): typings.titanium.Titanium.UI.ActivityIndicator = js.native
  def createActivityIndicator(parameters: Dictionary[typings.titanium.Titanium.UI.ActivityIndicator]): typings.titanium.Titanium.UI.ActivityIndicator = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.AlertDialog>.
    */
  def createAlertDialog(): typings.titanium.Titanium.UI.AlertDialog = js.native
  def createAlertDialog(parameters: Dictionary[typings.titanium.Titanium.UI.AlertDialog]): typings.titanium.Titanium.UI.AlertDialog = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Animation>.
    */
  def createAnimation(): typings.titanium.Titanium.UI.Animation = js.native
  def createAnimation(parameters: Dictionary[typings.titanium.Titanium.UI.Animation]): typings.titanium.Titanium.UI.Animation = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.AttributedString>.
    */
  def createAttributedString(): typings.titanium.Titanium.UI.AttributedString = js.native
  def createAttributedString(parameters: Dictionary[typings.titanium.Titanium.UI.AttributedString]): typings.titanium.Titanium.UI.AttributedString = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Button>.
    */
  def createButton(): typings.titanium.Titanium.UI.Button = js.native
  def createButton(parameters: Dictionary[typings.titanium.Titanium.UI.Button]): typings.titanium.Titanium.UI.Button = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ButtonBar>.
    */
  def createButtonBar(): typings.titanium.Titanium.UI.ButtonBar = js.native
  def createButtonBar(parameters: Dictionary[typings.titanium.Titanium.UI.ButtonBar]): typings.titanium.Titanium.UI.ButtonBar = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.DashboardItem>.
    */
  def createDashboardItem(): typings.titanium.Titanium.UI.DashboardItem = js.native
  def createDashboardItem(parameters: Dictionary[typings.titanium.Titanium.UI.DashboardItem]): typings.titanium.Titanium.UI.DashboardItem = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.DashboardView>.
    */
  def createDashboardView(): typings.titanium.Titanium.UI.DashboardView = js.native
  def createDashboardView(parameters: Dictionary[typings.titanium.Titanium.UI.DashboardView]): typings.titanium.Titanium.UI.DashboardView = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.EmailDialog>.
    */
  def createEmailDialog(): typings.titanium.Titanium.UI.EmailDialog = js.native
  def createEmailDialog(parameters: Dictionary[typings.titanium.Titanium.UI.EmailDialog]): typings.titanium.Titanium.UI.EmailDialog = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ImageView>.
    */
  def createImageView(): typings.titanium.Titanium.UI.ImageView = js.native
  def createImageView(parameters: Dictionary[typings.titanium.Titanium.UI.ImageView]): typings.titanium.Titanium.UI.ImageView = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Label>.
    */
  def createLabel(): typings.titanium.Titanium.UI.Label = js.native
  def createLabel(parameters: Dictionary[typings.titanium.Titanium.UI.Label]): typings.titanium.Titanium.UI.Label = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ListSection>.
    */
  def createListSection(): typings.titanium.Titanium.UI.ListSection = js.native
  def createListSection(parameters: Dictionary[typings.titanium.Titanium.UI.ListSection]): typings.titanium.Titanium.UI.ListSection = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ListView>.
    */
  def createListView(): typings.titanium.Titanium.UI.ListView = js.native
  def createListView(parameters: Dictionary[typings.titanium.Titanium.UI.ListView]): typings.titanium.Titanium.UI.ListView = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.MaskedImage>.
    */
  def createMaskedImage(): typings.titanium.Titanium.UI.MaskedImage = js.native
  def createMaskedImage(parameters: Dictionary[typings.titanium.Titanium.UI.MaskedImage]): typings.titanium.Titanium.UI.MaskedImage = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Matrix2D>.
    */
  def createMatrix2D(): typings.titanium.Titanium.UI.Matrix2D = js.native
  def createMatrix2D(parameters: Matrix2DCreationDict): typings.titanium.Titanium.UI.Matrix2D = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Matrix3D>.
    */
  def createMatrix3D(): typings.titanium.Titanium.UI.Matrix3D = js.native
  def createMatrix3D(parameters: Matrix3DCreationDict): typings.titanium.Titanium.UI.Matrix3D = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.NavigationWindow>.
    */
  def createNavigationWindow(): typings.titanium.Titanium.UI.NavigationWindow = js.native
  def createNavigationWindow(parameters: Dictionary[typings.titanium.Titanium.UI.NavigationWindow]): typings.titanium.Titanium.UI.NavigationWindow = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Notification>.
    */
  def createNotification(): typings.titanium.Titanium.UI.Notification = js.native
  def createNotification(parameters: Dictionary[typings.titanium.Titanium.UI.Notification]): typings.titanium.Titanium.UI.Notification = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.OptionDialog>.
    */
  def createOptionDialog(): typings.titanium.Titanium.UI.OptionDialog = js.native
  def createOptionDialog(parameters: Dictionary[typings.titanium.Titanium.UI.OptionDialog]): typings.titanium.Titanium.UI.OptionDialog = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Picker>.
    */
  def createPicker(): typings.titanium.Titanium.UI.Picker = js.native
  def createPicker(parameters: Dictionary[typings.titanium.Titanium.UI.Picker]): typings.titanium.Titanium.UI.Picker = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.PickerColumn>.
    */
  def createPickerColumn(): typings.titanium.Titanium.UI.PickerColumn = js.native
  def createPickerColumn(parameters: Dictionary[typings.titanium.Titanium.UI.PickerColumn]): typings.titanium.Titanium.UI.PickerColumn = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.PickerRow>.
    */
  def createPickerRow(): typings.titanium.Titanium.UI.PickerRow = js.native
  def createPickerRow(parameters: Dictionary[typings.titanium.Titanium.UI.PickerRow]): typings.titanium.Titanium.UI.PickerRow = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ProgressBar>.
    */
  def createProgressBar(): typings.titanium.Titanium.UI.ProgressBar = js.native
  def createProgressBar(parameters: Dictionary[typings.titanium.Titanium.UI.ProgressBar]): typings.titanium.Titanium.UI.ProgressBar = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.RefreshControl>.
    */
  def createRefreshControl(): typings.titanium.Titanium.UI.RefreshControl = js.native
  def createRefreshControl(parameters: Dictionary[typings.titanium.Titanium.UI.RefreshControl]): typings.titanium.Titanium.UI.RefreshControl = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ScrollView>.
    */
  def createScrollView(): typings.titanium.Titanium.UI.ScrollView = js.native
  def createScrollView(parameters: Dictionary[typings.titanium.Titanium.UI.ScrollView]): typings.titanium.Titanium.UI.ScrollView = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ScrollableView>.
    */
  def createScrollableView(): typings.titanium.Titanium.UI.ScrollableView = js.native
  def createScrollableView(parameters: Dictionary[typings.titanium.Titanium.UI.ScrollableView]): typings.titanium.Titanium.UI.ScrollableView = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.SearchBar>.
    */
  def createSearchBar(): typings.titanium.Titanium.UI.SearchBar = js.native
  def createSearchBar(parameters: Dictionary[typings.titanium.Titanium.UI.SearchBar]): typings.titanium.Titanium.UI.SearchBar = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.ShortcutItem>.
    */
  def createShortcutItem(): typings.titanium.Titanium.UI.ShortcutItem = js.native
  def createShortcutItem(parameters: Dictionary[typings.titanium.Titanium.UI.ShortcutItem]): typings.titanium.Titanium.UI.ShortcutItem = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Slider>.
    */
  def createSlider(): typings.titanium.Titanium.UI.Slider = js.native
  def createSlider(parameters: Dictionary[typings.titanium.Titanium.UI.Slider]): typings.titanium.Titanium.UI.Slider = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Switch>.
    */
  def createSwitch(): typings.titanium.Titanium.UI.Switch = js.native
  def createSwitch(parameters: Dictionary[typings.titanium.Titanium.UI.Switch]): typings.titanium.Titanium.UI.Switch = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Tab>.
    */
  def createTab(): typings.titanium.Titanium.UI.Tab = js.native
  def createTab(parameters: Dictionary[typings.titanium.Titanium.UI.Tab]): typings.titanium.Titanium.UI.Tab = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.TabGroup>.
    */
  def createTabGroup(): typings.titanium.Titanium.UI.TabGroup = js.native
  def createTabGroup(parameters: Dictionary[typings.titanium.Titanium.UI.TabGroup]): typings.titanium.Titanium.UI.TabGroup = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.TabbedBar>.
    */
  def createTabbedBar(): typings.titanium.Titanium.UI.TabbedBar = js.native
  def createTabbedBar(parameters: Dictionary[typings.titanium.Titanium.UI.TabbedBar]): typings.titanium.Titanium.UI.TabbedBar = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.TableView>.
    */
  def createTableView(): typings.titanium.Titanium.UI.TableView = js.native
  def createTableView(parameters: Dictionary[typings.titanium.Titanium.UI.TableView]): typings.titanium.Titanium.UI.TableView = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.TableViewRow>.
    */
  def createTableViewRow(): typings.titanium.Titanium.UI.TableViewRow = js.native
  def createTableViewRow(parameters: Dictionary[typings.titanium.Titanium.UI.TableViewRow]): typings.titanium.Titanium.UI.TableViewRow = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.TableViewSection>.
    */
  def createTableViewSection(): typings.titanium.Titanium.UI.TableViewSection = js.native
  def createTableViewSection(parameters: Dictionary[typings.titanium.Titanium.UI.TableViewSection]): typings.titanium.Titanium.UI.TableViewSection = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.TextArea>.
    */
  def createTextArea(): typings.titanium.Titanium.UI.TextArea = js.native
  def createTextArea(parameters: Dictionary[typings.titanium.Titanium.UI.TextArea]): typings.titanium.Titanium.UI.TextArea = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.TextField>.
    */
  def createTextField(): typings.titanium.Titanium.UI.TextField = js.native
  def createTextField(parameters: Dictionary[typings.titanium.Titanium.UI.TextField]): typings.titanium.Titanium.UI.TextField = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Toolbar>.
    */
  def createToolbar(): typings.titanium.Titanium.UI.Toolbar = js.native
  def createToolbar(parameters: Dictionary[typings.titanium.Titanium.UI.Toolbar]): typings.titanium.Titanium.UI.Toolbar = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.View>.
    */
  def createView(): typings.titanium.Titanium.UI.View = js.native
  def createView(parameters: Dictionary[typings.titanium.Titanium.UI.View]): typings.titanium.Titanium.UI.View = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.WebView>.
    */
  def createWebView(): typings.titanium.Titanium.UI.WebView = js.native
  def createWebView(parameters: Dictionary[typings.titanium.Titanium.UI.WebView]): typings.titanium.Titanium.UI.WebView = js.native
  /**
    * Creates and returns an instance of <Titanium.UI.Window>.
    */
  def createWindow(): typings.titanium.Titanium.UI.Window = js.native
  def createWindow(parameters: Dictionary[typings.titanium.Titanium.UI.Window]): typings.titanium.Titanium.UI.Window = js.native
  /**
    * Fetches the correct color to be used with a UI element dependent on the users current dark mode setting on iOS 13 and above, or the [Titanium.UI.semanticColorType](Titanium.UI.semanticColorType) setting in other instances.
    */
  def fetchSemanticColor(colorName: String): String = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.apiName> property.
    * @deprecated Access <Titanium.UI.apiName> instead.
    */
  def getApiName(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.backgroundColor> property.
    * @deprecated Access <Titanium.UI.backgroundColor> instead.
    */
  def getBackgroundColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.backgroundImage> property.
    * @deprecated Access <Titanium.UI.backgroundImage> instead.
    */
  def getBackgroundImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.bubbleParent> property.
    * @deprecated Access <Titanium.UI.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.lifecycleContainer> property.
    * @deprecated Access <Titanium.UI.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  /**
    * Gets the value of the <Titanium.UI.semanticColorType> property.
    * @deprecated Access <Titanium.UI.semanticColorType> instead.
    */
  def getSemanticColorType(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.tintColor> property.
    * @deprecated Access <Titanium.UI.tintColor> instead.
    */
  def getTintColor(): String = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.backgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.backgroundColor> instead.
    */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.backgroundImage> property.
    * @deprecated Set the value using <Titanium.UI.backgroundImage> instead.
    */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.bubbleParent> property.
    * @deprecated Set the value using <Titanium.UI.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.UI.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.Window): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.semanticColorType> property.
    * @deprecated Set the value using <Titanium.UI.semanticColorType> instead.
    */
  def setSemanticColorType(semanticColorType: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.tintColor> property.
    * @deprecated Set the value using <Titanium.UI.tintColor> instead.
    */
  def setTintColor(tintColor: String): Unit = js.native
}

