package typings.tern.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesQueryResult extends js.Object {
  /** The file names. */
  var files: js.Array[String]
}

object FilesQueryResult {
  @scala.inline
  def apply(files: js.Array[String]): FilesQueryResult = {
    val __obj = js.Dynamic.literal(files = files)
  
    __obj.asInstanceOf[FilesQueryResult]
  }
}

