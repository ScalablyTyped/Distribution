package typings.xstream.extraFromDiagramMod

import typings.xstream.xstreamMod.InternalListener
import typings.xstream.xstreamMod.InternalProducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/fromDiagram", "DiagramProducer")
@js.native
class DiagramProducer protected ()
  extends InternalProducer[js.Any] {
  def this(diagram: String) = this()
  def this(diagram: String, opt: FromDiagramOptions) = this()
  var diagram: js.Any = js.native
  var errorVal: js.Any = js.native
  var schedule: js.Any = js.native
  var tasks: js.Any = js.native
  var timeUnit: js.Any = js.native
  var values: js.Any = js.native
  /* CompleteClass */
  override def _start(listener: InternalListener[js.Any]): Unit = js.native
  /* CompleteClass */
  override def _stop(): Unit = js.native
}

