package typings
package webpackDashManifestDashPluginLib.webpackDashManifestDashPluginMod.WebpackManifestPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var id: java.lang.String
  var parents: js.Array[java.lang.String]
}

object Chunk {
  @scala.inline
  def apply(
    id: java.lang.String,
    parents: js.Array[java.lang.String],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Chunk = {
    val __obj = js.Dynamic.literal(id = id, parents = parents)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Chunk]
  }
}

