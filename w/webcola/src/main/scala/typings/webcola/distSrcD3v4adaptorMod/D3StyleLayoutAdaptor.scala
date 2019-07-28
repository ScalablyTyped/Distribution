package typings.webcola.distSrcD3v4adaptorMod

import typings.webcola.distSrcD3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.distSrcLayoutMod.Event
import typings.webcola.distSrcLayoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/d3v4adaptor", "D3StyleLayoutAdaptor")
@js.native
class D3StyleLayoutAdaptor protected ()
  extends Layout
     with ID3StyleLayoutAdaptor {
  def this(d3Context: D3Context) = this()
  var d3Context: js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def kick(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def trigger(e: Event): Unit = js.native
}

