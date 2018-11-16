package typings
package tarDashStreamLib.tarDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extract
  extends nodeLib.streamMod.Writable {
  @JSName("on")
  def on_entry(
    event: tarDashStreamLib.tarDashStreamLibStrings.entry,
    listener: js.Function3[
      /* headers */ Headers, 
      /* stream */ nodeLib.streamMod.PassThrough, 
      /* next */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
}

