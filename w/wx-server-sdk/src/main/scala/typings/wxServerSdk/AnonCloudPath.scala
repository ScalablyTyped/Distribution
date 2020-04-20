package typings.wxServerSdk

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloudPath extends js.Object {
  var cloudPath: String
  var fileContent: Buffer | ReadStream
}

object AnonCloudPath {
  @scala.inline
  def apply(cloudPath: String, fileContent: Buffer | ReadStream): AnonCloudPath = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloudPath]
  }
}

