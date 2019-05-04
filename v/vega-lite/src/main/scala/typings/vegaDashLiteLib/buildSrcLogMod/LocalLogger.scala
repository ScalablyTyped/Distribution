package typings
package vegaDashLiteLib.buildSrcLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/log", "LocalLogger")
@js.native
class LocalLogger ()
  extends vegaDashUtilLib.vegaDashUtilMod.LoggerInterface {
  var debugs: js.Array[_] = js.native
  var infos: js.Array[_] = js.native
  var warns: js.Array[_] = js.native
  /* CompleteClass */
  override def debug(args: js.Any*): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  /* CompleteClass */
  override def error(args: js.Any*): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  /* CompleteClass */
  override def info(args: js.Any*): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  def level(): this.type = js.native
  /* CompleteClass */
  override def level(`_`: scala.Double): scala.Double | vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  /* CompleteClass */
  override def warn(args: js.Any*): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
}

