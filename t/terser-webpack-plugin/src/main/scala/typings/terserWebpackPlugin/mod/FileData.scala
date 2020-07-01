package typings.terserWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileData extends js.Object {
  val basename: String
  val filename: String
  val hash: String
  val query: String
}

object FileData {
  @scala.inline
  def apply(basename: String, filename: String, hash: String, query: String): FileData = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileData]
  }
}

