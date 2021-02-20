package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import typings.swaggerExpressMiddleware.anon.FieldNameSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MulterOptions extends StObject {
  
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.native
  
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.native
  
  /** An object specifying the size limits of the following optional properties. This object is passed to busboy directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods */
  var limits: js.UndefOr[FieldNameSize] = js.native
  
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.native
}
object MulterOptions {
  
  @scala.inline
  def apply(): MulterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MulterOptions]
  }
  
  @scala.inline
  implicit class MulterOptionsMutableBuilder[Self <: MulterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
    
    @scala.inline
    def setFileFilter(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ Error, /* acceptFile */ Boolean, Unit]) => Unit
    ): Self = StObject.set(x, "fileFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
    
    @scala.inline
    def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setStorage(value: StorageEngine): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
