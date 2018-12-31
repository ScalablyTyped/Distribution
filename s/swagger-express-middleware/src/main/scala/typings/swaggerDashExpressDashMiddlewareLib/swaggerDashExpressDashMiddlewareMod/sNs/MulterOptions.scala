package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulterOptions extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ nodeLib.Error, /* acceptFile */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /** An object specifying the size limits of the following optional properties. This object is passed to busboy directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods */
  var limits: js.UndefOr[swaggerDashExpressDashMiddlewareLib.Anon_FieldNameSize] = js.undefined
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}

