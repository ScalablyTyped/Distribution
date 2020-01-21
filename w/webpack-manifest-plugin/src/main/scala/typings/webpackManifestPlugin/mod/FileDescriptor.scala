package typings.webpackManifestPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptor extends js.Object {
  /** Only available is isChunk is true. */
  var chunk: js.UndefOr[Chunk] = js.undefined
  var isAsset: Boolean
  var isChunk: Boolean
  /** Is required to run you app. Cannot be true if isChunk is false. */
  var isInitial: Boolean
  /** Is required by a module. Cannot be true if isAsset is false. */
  var isModuleAsset: Boolean
  var name: String | Null
  var path: String
}

object FileDescriptor {
  @scala.inline
  def apply(
    isAsset: Boolean,
    isChunk: Boolean,
    isInitial: Boolean,
    isModuleAsset: Boolean,
    path: String,
    chunk: Chunk = null,
    name: String = null
  ): FileDescriptor = {
    val __obj = js.Dynamic.literal(isAsset = isAsset.asInstanceOf[js.Any], isChunk = isChunk.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isModuleAsset = isModuleAsset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (chunk != null) __obj.updateDynamic("chunk")(chunk.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
}

