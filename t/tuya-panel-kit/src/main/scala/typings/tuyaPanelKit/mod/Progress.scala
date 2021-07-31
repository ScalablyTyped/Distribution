package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Progress")
@js.native
class Progress protected ()
  extends Component[ProgressBasicProps, js.Object, js.Any] {
  def this(props: ProgressBasicProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ProgressBasicProps, context: js.Any) = this()
}
/* static members */
object Progress {
  
  @JSImport("tuya-panel-kit", "Progress")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Progress.Compose")
  @js.native
  def Compose: ElementType[ComposeProps] = js.native
  @scala.inline
  def Compose_=(x: ElementType[ComposeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Compose")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Progress.Double")
  @js.native
  def Double: ElementType[DoubleProps] = js.native
  @scala.inline
  def Double_=(x: ElementType[DoubleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Double")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Progress.Space")
  @js.native
  def Space: ElementType[SpaceProps] = js.native
  @scala.inline
  def Space_=(x: ElementType[SpaceProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Space")(x.asInstanceOf[js.Any])
}
