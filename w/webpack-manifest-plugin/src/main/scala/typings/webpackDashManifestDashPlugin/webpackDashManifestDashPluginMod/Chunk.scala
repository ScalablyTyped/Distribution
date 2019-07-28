package typings.webpackDashManifestDashPlugin.webpackDashManifestDashPluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk
  extends /* propName */ StringDictionary[js.Any] {
  var id: String
  var parents: js.Array[String]
}

object Chunk {
  @scala.inline
  def apply(
    id: String,
    parents: js.Array[String],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Chunk = {
    val __obj = js.Dynamic.literal(id = id, parents = parents)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Chunk]
  }
}

