package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.reactNative.mod.ScrollViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Tabs")
@js.native
class Tabs protected ()
  extends Component[TabsProps, js.Object, js.Any] {
  def this(props: TabsProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabsProps, context: js.Any) = this()
}
/* static members */
object Tabs {
  
  @JSImport("tuya-panel-kit", "Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Tabs.TabContent")
  @js.native
  def TabContent: ElementType[TabContentProps] = js.native
  @scala.inline
  def TabContent_=(x: ElementType[TabContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabContent")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Tabs.TabPanel")
  @js.native
  def TabPanel: ElementType[TabPanelProps] = js.native
  @scala.inline
  def TabPanel_=(x: ElementType[TabPanelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabPanel")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Tabs.TabScrollView")
  @js.native
  def TabScrollView: ElementType[ScrollViewProps] = js.native
  @scala.inline
  def TabScrollView_=(x: ElementType[ScrollViewProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabScrollView")(x.asInstanceOf[js.Any])
}
