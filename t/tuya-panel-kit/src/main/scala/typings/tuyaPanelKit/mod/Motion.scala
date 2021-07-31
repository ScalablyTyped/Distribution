package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Motion")
@js.native
class Motion protected ()
  extends Component[MotionProps, js.Object, js.Any] {
  def this(props: MotionProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MotionProps, context: js.Any) = this()
}
/* static members */
object Motion {
  
  @JSImport("tuya-panel-kit", "Motion")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Motion.Fade")
  @js.native
  def Fade: ElementType[MotionFadeProps] = js.native
  @scala.inline
  def Fade_=(x: ElementType[MotionFadeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fade")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.PullUp")
  @js.native
  def PullUp: ElementType[MotionPullUpProps] = js.native
  @scala.inline
  def PullUp_=(x: ElementType[MotionPullUpProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PullUp")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.PushDown")
  @js.native
  def PushDown: ElementType[MotionPushDownProps] = js.native
  @scala.inline
  def PushDown_=(x: ElementType[MotionPushDownProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PushDown")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.ScaleFadeIn")
  @js.native
  def ScaleFadeIn: ElementType[MotionScaleFadeInProps] = js.native
  @scala.inline
  def ScaleFadeIn_=(x: ElementType[MotionScaleFadeInProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScaleFadeIn")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.ScalePullDown")
  @js.native
  def ScalePullDown: ElementType[MotionScalePullDownProps] = js.native
  @scala.inline
  def ScalePullDown_=(x: ElementType[MotionScalePullDownProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScalePullDown")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.Toast")
  @js.native
  def Toast: ElementType[MotionToastProps] = js.native
  @scala.inline
  def Toast_=(x: ElementType[MotionToastProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toast")(x.asInstanceOf[js.Any])
}
