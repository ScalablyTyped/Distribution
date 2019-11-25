package typings.swaggerDashParser.swaggerDashParserMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  /**
    * The raw file contents, in whatever form they were returned by the resolver that read the file.
    */
  var data: String | Buffer
  /**
    * The lowercase file extension, such as ".json", ".yaml", ".txt", etc.
    */
  var extension: String
  /**
    * The full URL of the file. This could be any type of URL, including "http://", "https://", "file://", "ftp://", "mongodb://", or even a local filesystem path (when running in Node.js).
    */
  var url: String
}

object FileInfo {
  @scala.inline
  def apply(data: String | Buffer, extension: String, url: String): FileInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileInfo]
  }
}

