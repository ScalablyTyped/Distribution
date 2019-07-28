package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.behaviorNs.IDblClickZoomOptions
import typings.yandexDashMaps.yandexDashMapsMod.behaviorNs.IDragOptions
import typings.yandexDashMaps.yandexDashMapsMod.behaviorNs.ILeftMouseButtonMagnifierOptions
import typings.yandexDashMaps.yandexDashMapsMod.behaviorNs.IMultiTouchOptions
import typings.yandexDashMaps.yandexDashMapsMod.behaviorNs.IRightMouseButtonMagnifierOptions
import typings.yandexDashMaps.yandexDashMapsMod.behaviorNs.IRulerOptions
import typings.yandexDashMaps.yandexDashMapsMod.behaviorNs.IScrollZoomOptions
import typings.yandexDashMaps.yandexDashMapsMod.routerNs.Route
import typings.yandexDashMaps.yandexDashMapsMod.utilNs.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//[number, number]
//[[number, number], [number, number]]
@JSImport("yandex-maps", "behavior")
@js.native
object behaviorNs extends js.Object {
  @js.native
  class DblClickZoom () extends IBehavior {
    def this(options: IDblClickZoomOptions) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @js.native
  class Drag () extends IBehavior {
    def this(options: IDragOptions) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  trait IDblClickZoomOptions extends IMapMarginOptions {
    var centering: js.UndefOr[Boolean] = js.undefined
    var duration: js.UndefOr[Double] = js.undefined
  }
  
  trait IDragOptions extends js.Object {
    var actionCursor: js.UndefOr[String] = js.undefined
    var cursor: js.UndefOr[String] = js.undefined
    var inertia: js.UndefOr[Boolean] = js.undefined
    var inertiaDuration: js.UndefOr[Double] = js.undefined
    var tremor: js.UndefOr[Double] = js.undefined
  }
  
  trait ILeftMouseButtonMagnifierOptions extends js.Object {
    var actionCursor: js.UndefOr[String] = js.undefined
    var cursor: js.UndefOr[String] = js.undefined
    var duration: js.UndefOr[Double] = js.undefined
  }
  
  trait IMultiTouchOptions extends js.Object {
    var tremor: js.UndefOr[Double] = js.undefined
  }
  
  trait IRightMouseButtonMagnifierOptions extends js.Object {
    var actionCursor: js.UndefOr[String] = js.undefined
    var duration: js.UndefOr[Double] = js.undefined
  }
  
  trait IRulerOptions extends js.Object {
    var balloonAutoPan: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IScrollZoomOptions extends js.Object {
    var maximumDelta: js.UndefOr[Double] = js.undefined
    var speed: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  class LeftMouseButtonMagnifier () extends IBehavior {
    def this(options: ILeftMouseButtonMagnifierOptions) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @js.native
  class MultiTouch () extends IBehavior {
    def this(options: IMultiTouchOptions) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @js.native
  class RightMouseButtonMagnifier () extends IBehavior {
    def this(options: IRightMouseButtonMagnifierOptions) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @js.native
  class RouteEditor () extends IBehavior {
    /* CompleteClass */
    override var events: IEventManager = js.native
    def getRoute(): Route = js.native
    def getState(): String = js.native
    def setParent(parent: IControlParent): this.type = js.native
    def setState(): Unit = js.native
    def setState(state: String): Unit = js.native
  }
  
  @js.native
  class Ruler () extends IBehavior {
    def this(options: IRulerOptions) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def close(): Boolean = js.native
    def getState(): String = js.native
    def setParent(parent: IControlParent): this.type = js.native
    def setState(): Unit = js.native
    def setState(state: String): Unit = js.native
  }
  
  @js.native
  class ScrollZoom () extends IBehavior {
    def this(options: IScrollZoomOptions) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  val storage: Storage = js.native
}

