package typings.wordpressCustomizeBrowser.customizeMod

import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.std.HTMLElement
import typings.std.Record
import typings.wordpressCustomizeBrowser.classMod.Class
import typings.wordpressCustomizeBrowser.controlConstructorMod.ControlConstructor
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.notificationsMod.Notifications
import typings.wordpressCustomizeBrowser.panelConstructorMod.PanelConstructor
import typings.wordpressCustomizeBrowser.panelMod.Panel
import typings.wordpressCustomizeBrowser.previewerMod.Previewer
import typings.wordpressCustomizeBrowser.sectionConstructorMod.SectionConstructor
import typings.wordpressCustomizeBrowser.sectionMod.Section
import typings.wordpressCustomizeBrowser.settingConstructorMod.SettingConstructor
import typings.wordpressCustomizeBrowser.settingMod.Setting
import typings.wordpressCustomizeBrowser.utilsMod.Utils
import typings.wordpressCustomizeBrowser.valuesMod.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Customize
  extends Values[Setting[js.Any]] {
  
  def _handleSettingValidities(args: HandleSettingValiditiesArgs): Unit = js.native
  
  var _lastSavedRevision: Double = js.native
  
  var _latestRevision: Double = js.native
  
  var _latestSettingRevision: Record[String, Double] = js.native
  
  var control: Values[Control] = js.native
  
  var controlConstructor: ControlConstructor = js.native
  
  @JSName("defaultConstructor")
  var defaultConstructor_Customize: Setting[Class] = js.native
  
  def dirtyValues(): Record[String, _] = js.native
  def dirtyValues(options: DirtyValuesOptions): Record[String, _] = js.native
  
  def ensure(element: String): JQuery[HTMLElement] = js.native
  def ensure(element: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  
  def findControlsForSettings(settingIds: js.Array[String]): Record[String, Control] = js.native
  
  def get(): Record[String, _] = js.native
  
   // TODO
  var l10n: Record[String, String] = js.native
  
  var notifications: Notifications = js.native
  
  var panel: Values[Panel] = js.native
  
  var panelConstructor: PanelConstructor = js.native
  
  var previewer: Previewer[String] = js.native
  
  def reflowPaneContents(): Unit = js.native
  
  def requestChangesetUpdate(): Promise[_, _, _] = js.native
  def requestChangesetUpdate(changes: js.UndefOr[scala.Nothing], args: RequestChangesetUpdateOptions): Promise[_, _, _] = js.native
  def requestChangesetUpdate(changes: Record[String, _]): Promise[_, _, _] = js.native
  def requestChangesetUpdate(changes: Record[String, _], args: RequestChangesetUpdateOptions): Promise[_, _, _] = js.native
  
  var section: Values[Section] = js.native
  
  var sectionConstructor: SectionConstructor = js.native
  
  def setDocumentTitle(documentTitle: String): Unit = js.native
  
  var settingConstructor: SettingConstructor = js.native
  
  var settings: js.Any = js.native
  
  var state: Values[Class] = js.native
  
  // (a: any, b?: any): any; // TODO
  var utils: Utils = js.native
}
