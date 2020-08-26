package typings.webpackManifestPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chunk
  extends /* propName */ StringDictionary[js.Any] {
  var id: String = js.native
  var parents: js.Array[String] = js.native
}

object Chunk {
  @scala.inline
  def apply(id: String, parents: js.Array[String]): Chunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  @scala.inline
  implicit class ChunkOps[Self <: Chunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
  }
  
}

