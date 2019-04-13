package typings
package webpackDashManifestDashPluginLib.webpackDashManifestDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptor extends js.Object {
  /** Only available is isChunk is true. */
  var chunk: js.UndefOr[Chunk] = js.undefined
  var isAsset: scala.Boolean
  var isChunk: scala.Boolean
  /** Is required to run you app. Cannot be true if isChunk is false. */
  var isInitial: scala.Boolean
  /** Is required by a module. Cannot be true if isAsset is false. */
  var isModuleAsset: scala.Boolean
  var name: java.lang.String | scala.Null
  var path: java.lang.String
}

object FileDescriptor {
  @scala.inline
  def apply(
    isAsset: scala.Boolean,
    isChunk: scala.Boolean,
    isInitial: scala.Boolean,
    isModuleAsset: scala.Boolean,
    path: java.lang.String,
    chunk: Chunk = null,
    name: java.lang.String = null
  ): FileDescriptor = {
    val __obj = js.Dynamic.literal(isAsset = isAsset, isChunk = isChunk, isInitial = isInitial, isModuleAsset = isModuleAsset, path = path)
    if (chunk != null) __obj.updateDynamic("chunk")(chunk)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FileDescriptor]
  }
}

