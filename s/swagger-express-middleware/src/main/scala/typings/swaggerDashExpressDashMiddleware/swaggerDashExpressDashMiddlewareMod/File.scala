package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** A Buffer of the entire file (MemoryStorage) */
  var buffer: Buffer
  /** The folder to which the file has been saved (DiskStorage) */
  var destination: String
  /** Encoding type of the file */
  var encoding: String
  /** Field name specified in the form */
  var fieldname: String
  /** The name of the file within the destination (DiskStorage) */
  var filename: String
  /** Mime type of the file */
  var mimetype: String
  /** Name of the file on the user's computer */
  var originalname: String
  /** Location of the uploaded file (DiskStorage) */
  var path: String
  /** Size of the file in bytes */
  var size: Double
}

object File {
  @scala.inline
  def apply(
    buffer: Buffer,
    destination: String,
    encoding: String,
    fieldname: String,
    filename: String,
    mimetype: String,
    originalname: String,
    path: String,
    size: Double
  ): File = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[File]
  }
}

