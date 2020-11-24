package typings.wordpressCustomizeBrowser.containerMod

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.classMod.Class
import typings.wordpressCustomizeBrowser.notificationsMod.Notifications
import typings.wordpressCustomizeBrowser.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Container", "Container")
@js.native
abstract class Container () extends Class {
  
  def _animateChangeExpanded(completeCallback: js.Function0[Unit]): Unit = js.native
  
  def _children(parentType: String, childType: String): js.Array[_] = js.native
  
  def _toggleActive(active: Boolean): Boolean = js.native
  def _toggleActive(active: Boolean, params: ContainerArguments): Boolean = js.native
  
  def _toggleExpanded(expanded: Boolean, params: ContainerArguments): Boolean = js.native
  
  def activate(): Boolean = js.native
  def activate(params: ContainerArguments): Boolean = js.native
  
  var active: Value[Boolean] = js.native
  
  var activeArgumentsQueue: js.Array[ContainerArguments] = js.native
  
  def collapse(params: ContainerArguments): Boolean = js.native
  
  var container: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  var containerType: String = js.native
  
  var contentContainer: js.UndefOr[String] = js.native
  
  def deactivate(): Boolean = js.native
  def deactivate(params: ContainerArguments): Boolean = js.native
  
  var defaultActiveArguments: ContainerArguments = js.native
  
  var defaultExpandedArguments: ContainerArguments = js.native
  
  var defaults: ContainerParams = js.native
  
  var deferred: ContainerDeferred = js.native
  
  def expand(params: ContainerArguments): Boolean = js.native
  
  var expanded: Value[Boolean] = js.native
  
  var expandedArgumentsQueue: js.Array[ContainerArguments] = js.native
  
  def focus(): Unit = js.native
  
  def getContainer(): String = js.native
  
  def getContent(): JQuery[HTMLElement] = js.native
  
  def getNotificationsContainerElement(): JQuery[HTMLElement] = js.native
  
  var headContainer: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  def initialize(): Unit = js.native
  def initialize(id: js.UndefOr[scala.Nothing], options: ContainerParams): Unit = js.native
  def initialize(id: String): Unit = js.native
  def initialize(id: String, options: ContainerParams): Unit = js.native
  
  def isContextuallyActive(): Boolean | scala.Nothing = js.native
  
  var notifications: js.UndefOr[Notifications] = js.native
  
  def onChangeActive(active: Boolean): Unit = js.native
  def onChangeActive(active: Boolean, args: ContainerArguments): Unit = js.native
  
  def onChangeExpanded(expanded: Boolean, args: ContainerArguments): Unit | scala.Nothing = js.native
  
  var priority: Value[Double] = js.native
  
  def ready(): Unit = js.native
  
  def setupNotifications(): Unit = js.native
  
  var templateSelector: js.UndefOr[String] = js.native
}
/* static members */
@JSImport("@wordpress/customize-browser/Container", "Container")
@js.native
object Container extends js.Object {
  
  var instanceCounter: js.UndefOr[Double] = js.native
}
