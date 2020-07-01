package typings.webpackSources.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "CachedSource")
@js.native
class CachedSource protected () extends Source {
  def this(source: Source) = this()
  def source(): String | ArrayBuffer = js.native
}

