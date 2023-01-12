package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageEngine extends StObject {
  
  def _handleFile(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]
  ): Unit
  
  def _removeFile(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    file: File,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit
}
object StorageEngine {
  
  inline def apply(
    _handleFile: (Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => Unit,
    _removeFile: (Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], File, js.Function1[/* error */ js.Error, Unit]) => Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
    __obj.asInstanceOf[StorageEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageEngine] (val x: Self) extends AnyVal {
    
    inline def set_handleFile(
      value: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => Unit
    ): Self = StObject.set(x, "_handleFile", js.Any.fromFunction3(value))
    
    inline def set_removeFile(
      value: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], File, js.Function1[/* error */ js.Error, Unit]) => Unit
    ): Self = StObject.set(x, "_removeFile", js.Any.fromFunction3(value))
  }
}
