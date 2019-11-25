package typings.atWordpressApiDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: String
  var height: Double
  var mime_type: String
  var source_url: String
  var width: Double
}

object Anon_File {
  @scala.inline
  def apply(file: String, height: Double, mime_type: String, source_url: String, width: Double): Anon_File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], source_url = source_url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_File]
  }
}

