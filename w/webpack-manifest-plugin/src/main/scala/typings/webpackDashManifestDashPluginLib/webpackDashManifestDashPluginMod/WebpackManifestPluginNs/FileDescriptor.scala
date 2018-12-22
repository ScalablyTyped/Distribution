package typings
package webpackDashManifestDashPluginLib.webpackDashManifestDashPluginMod.WebpackManifestPluginNs

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

