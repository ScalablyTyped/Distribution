package typings.vegaTypings.runtimeMod

import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.vegaTypings.AnonBottom
import typings.vegaTypings.AnonData
import typings.vegaTypings.AnonDataSignals
import typings.vegaTypings.dataflowMod.Changeset_
import typings.vegaTypings.encodeMod.EncodeEntryName
import typings.vegaTypings.rendererMod.Renderers
import typings.vegaTypings.signalMod.SignalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "View")
@js.native
class View protected () extends js.Object {
  def this(runtime: Runtime) = this()
  def this(runtime: Runtime, config: js.Any) = this()
  def addDataListener(name: String, handler: DataListenerHandler): this.type = js.native
  def addEventListener(`type`: String, handler: EventListenerHandler): this.type = js.native
  def addResizeListener(handler: ResizeHandler): this.type = js.native
  def addSignalListener(name: String, handler: SignalListenerHandler): this.type = js.native
  def change(name: String, changeset: Changeset_): this.type = js.native
  def changeset(): js.Any = js.native
  def container(): HTMLElement | Null = js.native
  def data(name: String): js.Array[_] = js.native
  def data(name: String, tuples: js.Any): this.type = js.native
  def getState(): AnonDataSignals = js.native
  def getState(options: AnonData): AnonDataSignals = js.native
  def height(): Double = js.native
  def height(h: Double): this.type = js.native
  def hover(): this.type = js.native
  def hover(hoverSet: EncodeEntryName): this.type = js.native
  def hover(hoverSet: EncodeEntryName, leaveSet: EncodeEntryName): this.type = js.native
  def initialize(): this.type = js.native
  def initialize(dom: String): this.type = js.native
  def initialize(dom: Element): this.type = js.native
  def insert(name: String, tuples: js.Any): this.type = js.native
  def loader(loader: Loader_): this.type = js.native
  def logLevel(level: Double): this.type = js.native
  def origin(): js.Tuple2[Double, Double] = js.native
  def padding(p: Double): this.type = js.native
  def padding(p: AnonBottom): this.type = js.native
  def remove(name: String, tuples: js.Any): this.type = js.native
  def removeDataListener(name: String, handler: DataListenerHandler): this.type = js.native
  def removeEventListener(`type`: String, handler: EventListenerHandler): this.type = js.native
  def removeResizeListener(handler: ResizeHandler): this.type = js.native
  def removeSignalListener(name: String, handler: SignalListenerHandler): this.type = js.native
  def renderer(renderer: Renderers): this.type = js.native
  def resize(): this.type = js.native
  def run(): this.type = js.native
  def run(encode: String): this.type = js.native
  def runAfter(callback: js.Function1[/* view */ this.type, Unit]): this.type = js.native
  def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean): this.type = js.native
  def runAfter(callback: js.Function1[/* view */ this.type, Unit], enqueue: Boolean, priority: Double): this.type = js.native
  def runAsync(): js.Promise[View] = js.native
  def setState(state: AnonDataSignals): this.type = js.native
  def signal(name: String): SignalValue = js.native
  def signal(name: String, value: SignalValue): this.type = js.native
  def toCanvas(): js.Promise[HTMLCanvasElement] = js.native
  def toImageURL(`type`: String): js.Promise[String] = js.native
  def toImageURL(`type`: String, scaleFactor: Double): js.Promise[String] = js.native
  def toSVG(): js.Promise[String] = js.native
  def tooltip(handler: TooltipHandler): this.type = js.native
  def width(): Double = js.native
  def width(w: Double): this.type = js.native
}

