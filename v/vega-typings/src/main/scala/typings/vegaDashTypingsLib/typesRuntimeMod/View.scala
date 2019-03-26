package typings
package vegaDashTypingsLib.typesRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "View")
@js.native
class View protected () extends js.Object {
  def this(runtime: Runtime) = this()
  def this(runtime: Runtime, config: js.Any) = this()
  def addDataListener(name: java.lang.String, handler: DataListenerHandler): this.type = js.native
  def addEventListener(`type`: java.lang.String, handler: EventListenerHandler): this.type = js.native
  def addResizeListener(handler: ResizeHandler): this.type = js.native
  def addSignalListener(name: java.lang.String, handler: SignalListenerHandler): this.type = js.native
  def change(name: java.lang.String, changeset: Changeset): this.type = js.native
  def changeset(): js.Any = js.native
  def container(): stdLib.HTMLElement | scala.Null = js.native
  def data(name: java.lang.String): js.Array[_] = js.native
  def getState(): vegaDashTypingsLib.Anon_DataSignals = js.native
  def getState(options: vegaDashTypingsLib.Anon_Data): vegaDashTypingsLib.Anon_DataSignals = js.native
  def height(): scala.Double = js.native
  def height(h: scala.Double): this.type = js.native
  def hover(): this.type = js.native
  def hover(hoverSet: vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntryName): this.type = js.native
  def hover(
    hoverSet: vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntryName,
    leaveSet: vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntryName
  ): this.type = js.native
  def initialize(): this.type = js.native
  def initialize(dom: java.lang.String): this.type = js.native
  def initialize(dom: stdLib.Element): this.type = js.native
  def insert(name: java.lang.String, tuples: js.Any): this.type = js.native
  def loader(loader: Loader): this.type = js.native
  def logLevel(level: scala.Double): this.type = js.native
  def origin(): js.Tuple2[scala.Double, scala.Double] = js.native
  def padding(p: scala.Double): this.type = js.native
  def padding(p: vegaDashTypingsLib.Anon_Bottom): this.type = js.native
  def remove(name: java.lang.String, tuples: js.Any): this.type = js.native
  def removeDataListener(name: java.lang.String, handler: DataListenerHandler): this.type = js.native
  def removeEventListener(`type`: java.lang.String, handler: EventListenerHandler): this.type = js.native
  def removeResizeListener(handler: ResizeHandler): this.type = js.native
  def removeSignalListener(name: java.lang.String, handler: SignalListenerHandler): this.type = js.native
  def renderer(renderer: vegaDashTypingsLib.typesRuntimeRendererMod.Renderers): this.type = js.native
  def resize(): this.type = js.native
  def run(): this.type = js.native
  def run(encode: java.lang.String): this.type = js.native
  def runAfter(callback: js.Function1[/* view */ this.type, scala.Unit]): this.type = js.native
  def runAfter(callback: js.Function1[/* view */ this.type, scala.Unit], enqueue: scala.Boolean): this.type = js.native
  def runAfter(
    callback: js.Function1[/* view */ this.type, scala.Unit],
    enqueue: scala.Boolean,
    priority: scala.Double
  ): this.type = js.native
  def runAsync(): js.Promise[View] = js.native
  def setState(state: vegaDashTypingsLib.Anon_DataSignals): this.type = js.native
  def signal(name: java.lang.String): vegaDashTypingsLib.typesSpecSignalMod.SignalValue = js.native
  def signal(name: java.lang.String, value: vegaDashTypingsLib.typesSpecSignalMod.SignalValue): this.type = js.native
  def toCanvas(): js.Promise[stdLib.HTMLCanvasElement] = js.native
  def toImageURL(`type`: java.lang.String): js.Promise[java.lang.String] = js.native
  def toImageURL(`type`: java.lang.String, scaleFactor: scala.Double): js.Promise[java.lang.String] = js.native
  def toSVG(): js.Promise[java.lang.String] = js.native
  def tooltip(handler: TooltipHandler): this.type = js.native
  def width(): scala.Double = js.native
  def width(w: scala.Double): this.type = js.native
}

