package typings.tusJsClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousUpload extends js.Object {
  var creationTime: String
  var metadata: StringDictionary[String]
  var size: Double | Null
}

object PreviousUpload {
  @scala.inline
  def apply(creationTime: String, metadata: StringDictionary[String], size: Double = null.asInstanceOf[Double]): PreviousUpload = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousUpload]
  }
}

