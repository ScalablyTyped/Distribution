package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: java.lang.String
  var height: scala.Double
  var mime_type: java.lang.String
  var source_url: java.lang.String
  var width: scala.Double
}

object Anon_File {
  @scala.inline
  def apply(
    file: java.lang.String,
    height: scala.Double,
    mime_type: java.lang.String,
    source_url: java.lang.String,
    width: scala.Double
  ): Anon_File = {
    val __obj = js.Dynamic.literal(file = file, height = height, mime_type = mime_type, source_url = source_url, width = width)
  
    __obj.asInstanceOf[Anon_File]
  }
}

