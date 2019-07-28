package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandResult extends js.Object {
  var fileNames: js.Array[String]
  var wildcardDirectories: MapLike[WatchDirectoryFlags]
}

object ExpandResult {
  @scala.inline
  def apply(fileNames: js.Array[String], wildcardDirectories: MapLike[WatchDirectoryFlags]): ExpandResult = {
    val __obj = js.Dynamic.literal(fileNames = fileNames, wildcardDirectories = wildcardDirectories)
  
    __obj.asInstanceOf[ExpandResult]
  }
}

