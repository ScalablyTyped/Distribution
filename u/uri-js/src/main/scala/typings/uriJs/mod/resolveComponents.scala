package typings.uriJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uri-js", "resolveComponents")
@js.native
object resolveComponents extends js.Object {
  def apply(base: URIComponents, relative: URIComponents): URIComponents = js.native
  def apply(
    base: URIComponents,
    relative: URIComponents,
    options: js.UndefOr[scala.Nothing],
    skipNormalization: Boolean
  ): URIComponents = js.native
  def apply(base: URIComponents, relative: URIComponents, options: URIOptions): URIComponents = js.native
  def apply(base: URIComponents, relative: URIComponents, options: URIOptions, skipNormalization: Boolean): URIComponents = js.native
}

