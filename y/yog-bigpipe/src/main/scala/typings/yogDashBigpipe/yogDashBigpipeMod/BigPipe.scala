package typings.yogDashBigpipe.yogDashBigpipeMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import typings.yogDashBigpipe.Anon_Key
import typings.yogDashBigpipe.yogDashBigpipeMod.PageletNs.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-bigpipe", "BigPipe")
@js.native
class BigPipe () extends Readable {
  def this(option: BigPipeOption) = this()
  var Pagelet: PageletConstructor[typings.yogDashBigpipe.yogDashBigpipeMod.Pagelet] = js.native
  var map: StringDictionary[Pagelet] = js.native
  var pagelets: js.Array[Pagelet] = js.native
  var parentQuicklings: js.Array[String] = js.native
  var pipelines: js.Array[Pagelet] = js.native
  var rendered: js.Array[Pagelet] = js.native
  var state: status = js.native
  def _checkFinish(): Unit = js.native
  def _markPageletRendered(pagelet: Pagelet): Unit = js.native
  def _onPageletDone(pagelet: Pagelet): Unit = js.native
  def addPagelet(obj: AddPageletConfig): Unit = js.native
  def addQuicklingPagelets(pagelets: js.Array[String]): Unit = js.native
  def bind(id: String, fn: Callback): BigPipe = js.native
  def bindPageOnly(fn: Callback): Unit = js.native
  def format(pagelet: Pagelet): String = js.native
  def isQuickingMode(): Boolean = js.native
  def isQuicklingMode(): Boolean = js.native
  def isQuicklingWidget(item: Anon_Key): Unit = js.native
  def outputPagelet(pagelet: Pagelet): Unit = js.native
  def prepareAllSources(): js.Promise[_] = js.native
  def preparePageOnly(): js.Promise[_] = js.native
  def render(): Unit = js.native
  def renderPagelet(pagelet: Pagelet): Unit = js.native
}

