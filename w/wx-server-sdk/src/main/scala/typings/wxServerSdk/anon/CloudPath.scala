package typings.wxServerSdk.anon

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudPath extends js.Object {
  var cloudPath: String
  var fileContent: Buffer | ReadStream
}

object CloudPath {
  @scala.inline
  def apply(cloudPath: String, fileContent: Buffer | ReadStream): CloudPath = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudPath]
  }
}

