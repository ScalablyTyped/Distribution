package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEngine extends js.Object {
  def _handleFile(
    req: expressLib.expressMod.eNs.Request,
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], scala.Unit]
  ): scala.Unit
  def _removeFile(
    req: expressLib.expressMod.eNs.Request,
    file: File,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: js.Function3[
      expressLib.expressMod.eNs.Request, 
      File, 
      js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], scala.Unit], 
      scala.Unit
    ],
    _removeFile: js.Function3[
      expressLib.expressMod.eNs.Request, 
      File, 
      js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ]
  ): StorageEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_handleFile")(_handleFile)
    __obj.updateDynamic("_removeFile")(_removeFile)
    __obj.asInstanceOf[StorageEngine]
  }
}

