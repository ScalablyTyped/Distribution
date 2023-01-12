package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.std.Record
import typings.swaggerExpressMiddleware.anon.FieldNameSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MulterOptions extends StObject {
  
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.undefined
  
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.undefined
  
  /** An object specifying the size limits of the following optional properties. This object is passed to busboy directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods */
  var limits: js.UndefOr[FieldNameSize] = js.undefined
  
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}
object MulterOptions {
  
  inline def apply(): MulterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MulterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MulterOptions] (val x: Self) extends AnyVal {
    
    inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
    
    inline def setFileFilter(
      value: (/* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], /* file */ File, /* callback */ js.Function2[/* error */ js.Error, /* acceptFile */ Boolean, Unit]) => Unit
    ): Self = StObject.set(x, "fileFilter", js.Any.fromFunction3(value))
    
    inline def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
    
    inline def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setStorage(value: StorageEngine): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
