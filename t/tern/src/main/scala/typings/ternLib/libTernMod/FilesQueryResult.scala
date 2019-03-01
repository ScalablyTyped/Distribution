package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesQueryResult extends js.Object {
  /** The file names. */
  var files: js.Array[java.lang.String]
}

object FilesQueryResult {
  @scala.inline
  def apply(files: js.Array[java.lang.String]): FilesQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[FilesQueryResult]
  }
}

