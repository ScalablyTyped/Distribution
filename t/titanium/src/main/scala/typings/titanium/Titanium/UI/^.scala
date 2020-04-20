package typings.titanium.Titanium.UI

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
  var lifecycleContainer: Window | TabGroup = js.native
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
  def create2DMatrix(): Matrix2D = js.native
  def create2DMatrix(parameters: Matrix2DCreationDict): Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.3DMatrix>.
  		 * @deprecated Use [Titanium.UI.createMatrix3D](Titanium.UI.createMatrix3D) instead.
  		 */
  def create3DMatrix(): Matrix3D = js.native
  def create3DMatrix(parameters: Matrix3DCreationDict): Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ActivityIndicator>.
  		 */
  def createActivityIndicator(): ActivityIndicator = js.native
  def createActivityIndicator(parameters: Dictionary[ActivityIndicator]): ActivityIndicator = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AlertDialog>.
  		 */
  def createAlertDialog(): AlertDialog = js.native
  def createAlertDialog(parameters: Dictionary[AlertDialog]): AlertDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Animation>.
  		 */
  def createAnimation(): Animation = js.native
  def createAnimation(parameters: Dictionary[Animation]): Animation = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.AttributedString>.
  		 */
  def createAttributedString(): AttributedString = js.native
  def createAttributedString(parameters: Dictionary[AttributedString]): AttributedString = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Button>.
  		 */
  def createButton(): Button = js.native
  def createButton(parameters: Dictionary[Button]): Button = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ButtonBar>.
  		 */
  def createButtonBar(): ButtonBar = js.native
  def createButtonBar(parameters: Dictionary[ButtonBar]): ButtonBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardItem>.
  		 */
  def createDashboardItem(): DashboardItem = js.native
  def createDashboardItem(parameters: Dictionary[DashboardItem]): DashboardItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.DashboardView>.
  		 */
  def createDashboardView(): DashboardView = js.native
  def createDashboardView(parameters: Dictionary[DashboardView]): DashboardView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.EmailDialog>.
  		 */
  def createEmailDialog(): EmailDialog = js.native
  def createEmailDialog(parameters: Dictionary[EmailDialog]): EmailDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ImageView>.
  		 */
  def createImageView(): ImageView = js.native
  def createImageView(parameters: Dictionary[ImageView]): ImageView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Label>.
  		 */
  def createLabel(): Label = js.native
  def createLabel(parameters: Dictionary[Label]): Label = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListSection>.
  		 */
  def createListSection(): ListSection = js.native
  def createListSection(parameters: Dictionary[ListSection]): ListSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ListView>.
  		 */
  def createListView(): ListView = js.native
  def createListView(parameters: Dictionary[ListView]): ListView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.MaskedImage>.
  		 */
  def createMaskedImage(): MaskedImage = js.native
  def createMaskedImage(parameters: Dictionary[MaskedImage]): MaskedImage = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix2D>.
  		 */
  def createMatrix2D(): Matrix2D = js.native
  def createMatrix2D(parameters: Matrix2DCreationDict): Matrix2D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Matrix3D>.
  		 */
  def createMatrix3D(): Matrix3D = js.native
  def createMatrix3D(parameters: Matrix3DCreationDict): Matrix3D = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.NavigationWindow>.
  		 */
  def createNavigationWindow(): NavigationWindow = js.native
  def createNavigationWindow(parameters: Dictionary[NavigationWindow]): NavigationWindow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Notification>.
  		 */
  def createNotification(): Notification = js.native
  def createNotification(parameters: Dictionary[Notification]): Notification = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.OptionDialog>.
  		 */
  def createOptionDialog(): OptionDialog = js.native
  def createOptionDialog(parameters: Dictionary[OptionDialog]): OptionDialog = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Picker>.
  		 */
  def createPicker(): Picker = js.native
  def createPicker(parameters: Dictionary[Picker]): Picker = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerColumn>.
  		 */
  def createPickerColumn(): PickerColumn = js.native
  def createPickerColumn(parameters: Dictionary[PickerColumn]): PickerColumn = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.PickerRow>.
  		 */
  def createPickerRow(): PickerRow = js.native
  def createPickerRow(parameters: Dictionary[PickerRow]): PickerRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ProgressBar>.
  		 */
  def createProgressBar(): ProgressBar = js.native
  def createProgressBar(parameters: Dictionary[ProgressBar]): ProgressBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.RefreshControl>.
  		 */
  def createRefreshControl(): RefreshControl = js.native
  def createRefreshControl(parameters: Dictionary[RefreshControl]): RefreshControl = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollView>.
  		 */
  def createScrollView(): ScrollView = js.native
  def createScrollView(parameters: Dictionary[ScrollView]): ScrollView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ScrollableView>.
  		 */
  def createScrollableView(): ScrollableView = js.native
  def createScrollableView(parameters: Dictionary[ScrollableView]): ScrollableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.SearchBar>.
  		 */
  def createSearchBar(): SearchBar = js.native
  def createSearchBar(parameters: Dictionary[SearchBar]): SearchBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.ShortcutItem>.
  		 */
  def createShortcutItem(): ShortcutItem = js.native
  def createShortcutItem(parameters: Dictionary[ShortcutItem]): ShortcutItem = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Slider>.
  		 */
  def createSlider(): Slider = js.native
  def createSlider(parameters: Dictionary[Slider]): Slider = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Switch>.
  		 */
  def createSwitch(): Switch = js.native
  def createSwitch(parameters: Dictionary[Switch]): Switch = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Tab>.
  		 */
  def createTab(): Tab = js.native
  def createTab(parameters: Dictionary[Tab]): Tab = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabGroup>.
  		 */
  def createTabGroup(): TabGroup = js.native
  def createTabGroup(parameters: Dictionary[TabGroup]): TabGroup = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TabbedBar>.
  		 */
  def createTabbedBar(): TabbedBar = js.native
  def createTabbedBar(parameters: Dictionary[TabbedBar]): TabbedBar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableView>.
  		 */
  def createTableView(): TableView = js.native
  def createTableView(parameters: Dictionary[TableView]): TableView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewRow>.
  		 */
  def createTableViewRow(): TableViewRow = js.native
  def createTableViewRow(parameters: Dictionary[TableViewRow]): TableViewRow = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TableViewSection>.
  		 */
  def createTableViewSection(): TableViewSection = js.native
  def createTableViewSection(parameters: Dictionary[TableViewSection]): TableViewSection = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextArea>.
  		 */
  def createTextArea(): TextArea = js.native
  def createTextArea(parameters: Dictionary[TextArea]): TextArea = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.TextField>.
  		 */
  def createTextField(): TextField = js.native
  def createTextField(parameters: Dictionary[TextField]): TextField = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Toolbar>.
  		 */
  def createToolbar(): Toolbar = js.native
  def createToolbar(parameters: Dictionary[Toolbar]): Toolbar = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.View>.
  		 */
  def createView(): View = js.native
  def createView(parameters: Dictionary[View]): View = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.WebView>.
  		 */
  def createWebView(): WebView = js.native
  def createWebView(parameters: Dictionary[WebView]): WebView = js.native
  /**
  		 * Creates and returns an instance of <Titanium.UI.Window>.
  		 */
  def createWindow(): Window = js.native
  def createWindow(parameters: Dictionary[Window]): Window = js.native
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
  def getLifecycleContainer(): Window | TabGroup = js.native
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
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.UI.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.UI.lifecycleContainer> instead.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
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

