package typings.wordpressCustomizeBrowser.controlMod

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.classMod.Class
import typings.wordpressCustomizeBrowser.containerMod.ContainerArguments
import typings.wordpressCustomizeBrowser.containerMod.ContainerDeferred
import typings.wordpressCustomizeBrowser.notificationsMod.Notifications
import typings.wordpressCustomizeBrowser.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Control", "Control")
@js.native
class Control () extends Class {
  
  def _toggleActive(active: Boolean, params: ContainerArguments): Boolean = js.native
  
  def activate(params: ContainerArguments): Boolean = js.native
  
  var active: Value[Boolean] = js.native
  
  var activeArgumentsQueue: js.Array[ContainerArguments] = js.native
  
  def addNewPage(): Unit = js.native
  
  var container: JQuery[HTMLElement] = js.native
  
  def deactivate(params: ContainerArguments): Boolean = js.native
  
  var defaultActiveArguments: ContainerArguments = js.native
  
  var defaults: ControlParams = js.native
  
  var deferred: ContainerDeferred = js.native
  
  def dropdownInit(): Unit = js.native
  
  var elements: js.Array[Element] = js.native
  
  def embed(): Unit = js.native
  
  def expand(params: ContainerArguments): Unit = js.native
  
  def focus(): Unit = js.native
  def focus(params: js.Any): Unit = js.native
  
  def getNotificationsContainerElement(): JQuery[HTMLElement] = js.native
  
  var id: String = js.native
  
  def initialize(): Unit = js.native
  def initialize(id: js.UndefOr[scala.Nothing], options: ControlParams): Unit = js.native
  def initialize(id: String): Unit = js.native
  def initialize(id: String, options: ControlParams): Unit = js.native
  
  def linkElements(): Unit = js.native
  
  var notifications: Notifications = js.native
  
   // TODO
  def onChangeActive(active: Boolean, args: ContainerArguments): Unit = js.native
  
  var params: ControlParams = js.native
  
  var priority: Value[Double] = js.native
  
  def ready(): Unit = js.native
  
  def renderContent(): Unit = js.native
  
  def renderNotifications(): Unit = js.native
  
  var section: Value[String] = js.native
  
  var selector: String = js.native
  
  var settings: ControlSettings = js.native
  
  def setupNotifications(): Unit = js.native
  
  var templateSelector: String = js.native
  
  def toggle(active: Boolean): Unit = js.native
}
/* static members */
@JSImport("@wordpress/customize-browser/Control", "Control")
@js.native
object Control extends js.Object {
  
  var instanceCounter: js.UndefOr[Double] = js.native
}
