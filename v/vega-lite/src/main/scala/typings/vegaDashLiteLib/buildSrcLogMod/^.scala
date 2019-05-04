package typings
package vegaDashLiteLib.buildSrcLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def debug(`_`: js.Any*): scala.Unit = js.native
  def info(`_`: js.Any*): scala.Unit = js.native
  def reset(): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  def set(newLogger: vegaDashUtilLib.vegaDashUtilMod.LoggerInterface): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  def warn(`_`: js.Any*): scala.Unit = js.native
  def wrap(f: js.Function1[/* logger */ LocalLogger, scala.Unit]): js.Function0[scala.Unit] = js.native
}

