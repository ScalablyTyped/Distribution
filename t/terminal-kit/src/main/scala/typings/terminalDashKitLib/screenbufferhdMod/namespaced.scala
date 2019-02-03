package typings
package terminalDashKitLib.screenbufferhdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
class namespaced protected () extends ScreenBufferHD {
  def this(options: terminalDashKitLib.Anon_Blending) = this()
  def this(options: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Options) = this()
}

/* static members */
@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def loadImage(
    url: java.lang.String,
    calback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* image */ js.UndefOr[terminalDashKitLib.screenbufferhdMod.ScreenBufferHD], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadImage(
    url: java.lang.String,
    options: terminalDashKitLib.Anon_Shrink,
    callback: js.Function2[
      /* error */ js.Any, 
      /* image */ terminalDashKitLib.screenbufferhdMod.ScreenBufferHD, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

