package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandResult extends js.Object {
  var fileNames: js.Array[java.lang.String] = js.native
  var wildcardDirectories: MapLike[WatchDirectoryFlags] = js.native
}

object ExpandResult {
  @scala.inline
  def apply(fileNames: js.Array[java.lang.String], wildcardDirectories: MapLike[WatchDirectoryFlags]): ExpandResult = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], wildcardDirectories = wildcardDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandResult]
  }
  @scala.inline
  implicit class ExpandResultOps[Self <: ExpandResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileNamesVarargs(value: java.lang.String*): Self = this.set("fileNames", js.Array(value :_*))
    @scala.inline
    def setFileNames(value: js.Array[java.lang.String]): Self = this.set("fileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = this.set("wildcardDirectories", value.asInstanceOf[js.Any])
  }
  
}

