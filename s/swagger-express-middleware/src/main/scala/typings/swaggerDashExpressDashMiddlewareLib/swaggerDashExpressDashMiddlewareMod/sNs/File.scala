package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** A Buffer of the entire file (MemoryStorage) */
  var buffer: nodeLib.Buffer
  /** The folder to which the file has been saved (DiskStorage) */
  var destination: java.lang.String
  /** Encoding type of the file */
  var encoding: java.lang.String
  /** Field name specified in the form */
  var fieldname: java.lang.String
  /** The name of the file within the destination (DiskStorage) */
  var filename: java.lang.String
  /** Mime type of the file */
  var mimetype: java.lang.String
  /** Name of the file on the user's computer */
  var originalname: java.lang.String
  /** Location of the uploaded file (DiskStorage) */
  var path: java.lang.String
  /** Size of the file in bytes */
  var size: scala.Double
}

object File {
  @scala.inline
  def apply(
    buffer: nodeLib.Buffer,
    destination: java.lang.String,
    encoding: java.lang.String,
    fieldname: java.lang.String,
    filename: java.lang.String,
    mimetype: java.lang.String,
    originalname: java.lang.String,
    path: java.lang.String,
    size: scala.Double
  ): File = {
    val __obj = js.Dynamic.literal(buffer = buffer, destination = destination, encoding = encoding, fieldname = fieldname, filename = filename, mimetype = mimetype, originalname = originalname, path = path, size = size)
  
    __obj.asInstanceOf[File]
  }
}

