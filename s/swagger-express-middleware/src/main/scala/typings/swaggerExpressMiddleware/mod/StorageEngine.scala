package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageEngine extends StObject {
  
  def _handleFile(
    req: Request_[ParamsDictionary, js.Any, js.Any, Query],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]
  ): Unit
  
  def _removeFile(
    req: Request_[ParamsDictionary, js.Any, js.Any, Query],
    file: File,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit
}
object StorageEngine {
  
  inline def apply(
    _handleFile: (Request_[ParamsDictionary, js.Any, js.Any, Query], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Unit,
    _removeFile: (Request_[ParamsDictionary, js.Any, js.Any, Query], File, js.Function1[/* error */ Error, Unit]) => Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
    __obj.asInstanceOf[StorageEngine]
  }
  
  extension [Self <: StorageEngine](x: Self) {
    
    inline def set_handleFile(
      value: (Request_[ParamsDictionary, js.Any, js.Any, Query], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Unit
    ): Self = StObject.set(x, "_handleFile", js.Any.fromFunction3(value))
    
    inline def set_removeFile(
      value: (Request_[ParamsDictionary, js.Any, js.Any, Query], File, js.Function1[/* error */ Error, Unit]) => Unit
    ): Self = StObject.set(x, "_removeFile", js.Any.fromFunction3(value))
  }
}
