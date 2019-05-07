package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//[number, number]
//[[number, number], [number, number]]
@JSImport("yandex-maps", "behavior")
@js.native
object behaviorNs extends js.Object {
  @js.native
  class DblClickZoom ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    def this(options: IDblClickZoomOptions) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  @js.native
  class Drag ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    def this(options: IDragOptions) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  trait IDblClickZoomOptions
    extends yandexDashMapsLib.yandexDashMapsMod.IMapMarginOptions {
    var centering: js.UndefOr[scala.Boolean] = js.undefined
    var duration: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IDragOptions extends js.Object {
    var actionCursor: js.UndefOr[java.lang.String] = js.undefined
    var cursor: js.UndefOr[java.lang.String] = js.undefined
    var inertia: js.UndefOr[scala.Boolean] = js.undefined
    var inertiaDuration: js.UndefOr[scala.Double] = js.undefined
    var tremor: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait ILeftMouseButtonMagnifierOptions extends js.Object {
    var actionCursor: js.UndefOr[java.lang.String] = js.undefined
    var cursor: js.UndefOr[java.lang.String] = js.undefined
    var duration: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IMultiTouchOptions extends js.Object {
    var tremor: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IRightMouseButtonMagnifierOptions extends js.Object {
    var actionCursor: js.UndefOr[java.lang.String] = js.undefined
    var duration: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait IRulerOptions extends js.Object {
    var balloonAutoPan: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IScrollZoomOptions extends js.Object {
    var maximumDelta: js.UndefOr[scala.Double] = js.undefined
    var speed: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  class LeftMouseButtonMagnifier ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    def this(options: ILeftMouseButtonMagnifierOptions) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  @js.native
  class MultiTouch ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    def this(options: IMultiTouchOptions) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  @js.native
  class RightMouseButtonMagnifier ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    def this(options: IRightMouseButtonMagnifierOptions) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  @js.native
  class RouteEditor ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def getRoute(): yandexDashMapsLib.yandexDashMapsMod.routerNs.Route = js.native
    def getState(): java.lang.String = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
    def setState(): scala.Unit = js.native
    def setState(state: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class Ruler ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    def this(options: IRulerOptions) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def close(): scala.Boolean = js.native
    def getState(): java.lang.String = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
    def setState(): scala.Unit = js.native
    def setState(state: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class ScrollZoom ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBehavior {
    def this(options: IScrollZoomOptions) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  val storage: yandexDashMapsLib.yandexDashMapsMod.utilNs.Storage = js.native
}

