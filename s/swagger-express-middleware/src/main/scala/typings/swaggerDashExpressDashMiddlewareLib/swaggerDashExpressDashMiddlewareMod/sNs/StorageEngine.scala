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

