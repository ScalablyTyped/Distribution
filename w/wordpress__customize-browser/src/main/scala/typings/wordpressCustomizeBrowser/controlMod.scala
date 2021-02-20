package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import typings.wordpressCustomizeBrowser.anon.Default
import typings.wordpressCustomizeBrowser.classMod.Class
import typings.wordpressCustomizeBrowser.containerMod.ContainerArguments
import typings.wordpressCustomizeBrowser.containerMod.ContainerDeferred
import typings.wordpressCustomizeBrowser.notificationsMod.Notifications
import typings.wordpressCustomizeBrowser.settingMod.Setting
import typings.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("@wordpress/customize-browser/Control", "Control")
  @js.native
  class Control protected () extends Class {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
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
  object Control {
    
    @JSImport("@wordpress/customize-browser/Control", "Control")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/customize-browser/Control", "Control.instanceCounter")
    @js.native
    def instanceCounter: js.UndefOr[Double] = js.native
    @scala.inline
    def instanceCounter_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instanceCounter")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ControlParams extends StObject {
    
    var active: Boolean = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var description: String = js.native
    
    var instanceNumber: js.UndefOr[Double] = js.native
    
    var label: String = js.native
    
    var params: js.UndefOr[ControlParams] = js.native
    
    var priority: Double = js.native
    
    var section: String = js.native
    
    var setting: js.UndefOr[String | Setting[_]] = js.native
    
    var settings: ControlSettings = js.native
    
    var templateId: js.UndefOr[String] = js.native
    
    var `type`: js.Any = js.native
  }
  object ControlParams {
    
    @scala.inline
    def apply(
      active: Boolean,
      description: String,
      label: String,
      priority: Double,
      section: String,
      settings: ControlSettings,
      `type`: js.Any
    ): ControlParams = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlParams]
    }
    
    @scala.inline
    implicit class ControlParamsMutableBuilder[Self <: ControlParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceNumber(value: Double): Self = StObject.set(x, "instanceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceNumberUndefined: Self = StObject.set(x, "instanceNumber", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: ControlParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetting(value: String | Setting[_]): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
      
      @scala.inline
      def setSettings(value: ControlSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ControlSettings = ((Record[String, Setting[_] | Value[_]]) | (js.Array[Setting[_] | Value[_]])) with Default
}
