package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageEngine extends js.Object {
  def _handleFile(
    req: Request_[ParamsDictionary, _, _, Query],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]
  ): Unit = js.native
  def _removeFile(
    req: Request_[ParamsDictionary, _, _, Query],
    file: File,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: (Request_[ParamsDictionary, _, _, Query], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Unit,
    _removeFile: (Request_[ParamsDictionary, _, _, Query], File, js.Function1[/* error */ Error, Unit]) => Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
    __obj.asInstanceOf[StorageEngine]
  }
  @scala.inline
  implicit class StorageEngineOps[Self <: StorageEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_handleFile(
      value: (Request_[ParamsDictionary, _, _, Query], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Unit
    ): Self = this.set("_handleFile", js.Any.fromFunction3(value))
    @scala.inline
    def set_removeFile(
      value: (Request_[ParamsDictionary, _, _, Query], File, js.Function1[/* error */ Error, Unit]) => Unit
    ): Self = this.set("_removeFile", js.Any.fromFunction3(value))
  }
  
}

