package typings.vegaDashLite.buildSrcLogMod

import typings.vegaDashUtil.vegaDashUtilMod.LoggerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def debug(`_`: js.Any*): Unit = js.native
  def info(`_`: js.Any*): Unit = js.native
  def reset(): LoggerInterface = js.native
  def set(newLogger: LoggerInterface): LoggerInterface = js.native
  def warn(`_`: js.Any*): Unit = js.native
  def wrap(f: js.Function1[/* logger */ LocalLogger, Unit]): js.Function0[Unit] = js.native
}

