package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Action")
@js.native
open class Action protected ()
  extends Base
     with IAction
     with ILocalizableOwner {
  def this(innerItem: IAction) = this()
  
  @JSName("action")
  def action_MAction(): Unit = js.native
  @JSName("action")
  def action_MAction(context: Any): Unit = js.native
  
  @JSName("active")
  var active_Action: Boolean = js.native
  
  def canShrink: Boolean = js.native
  
  @JSName("component")
  var component_Action: String = js.native
  
  def cssClasses: Any = js.native
  
  var cssClassesValue: Any = js.native
  
  @JSName("css")
  var css_Action: String = js.native
  
  @JSName("disableHide")
  var disableHide_Action: Boolean = js.native
  
  @JSName("disableShrink")
  var disableShrink_Action: Boolean = js.native
  
  @JSName("disableTabStop")
  var disableTabStop_Action: Boolean = js.native
  
  def disabled: Boolean = js.native
  
  @JSName("enabled")
  var enabled_Action: Boolean = js.native
  
  def getActionBarItemCss(): String = js.native
  
  def getActionBarItemTitleCss(): String = js.native
  
  def getActionRootCss(): String = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  def getRendererContext(locStr: Any): Any = js.native
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def hasTitle: Boolean = js.native
  
  @JSName("iconName")
  var iconName_Action: String = js.native
  
  @JSName("iconSize")
  var iconSize_Action: Double = js.native
  
  /*
    * A unique action item identifier.
    */
  /* CompleteClass */
  var id: String = js.native
  
  @JSName("innerCss")
  var innerCss_Action: String = js.native
  
  var innerItem: IAction = js.native
  
  def isVisible: Boolean = js.native
  
  var items: Any = js.native
  
  var locTitleChanged: Any = js.native
  
  @JSName("locTitleName")
  def locTitleName_MAction: String = js.native
  
  var locTitleValue: Any = js.native
  
  @JSName("locTitle")
  def locTitle_MAction: Any = js.native
  
  @JSName("locTooltipName")
  var locTooltipName_Action: String = js.native
  
  @JSName("location")
  var location_Action: String = js.native
  
  var maxDimension: Double = js.native
  
  var minDimension: Double = js.native
  
  @JSName("needSeparator")
  var needSeparator_Action: Boolean = js.native
  
  @JSName("needSpace")
  var needSpace_Action: Boolean = js.native
  
  var owner: Any = js.native
  
  @JSName("pressed")
  var pressed_Action: Boolean = js.native
  
  @JSName("showTitle")
  var showTitle_Action: Boolean = js.native
  
  @JSName("template")
  var template_Action: String = js.native
  
  @JSName("title")
  var title_Action: String = js.native
  
  @JSName("tooltip")
  var tooltip_Action: String = js.native
  
  var updateCallback: Any = js.native
  
  @JSName("visibleIndex")
  var visibleIndex_Action: Double = js.native
  
  @JSName("visible")
  var visible_Action: Boolean = js.native
}
