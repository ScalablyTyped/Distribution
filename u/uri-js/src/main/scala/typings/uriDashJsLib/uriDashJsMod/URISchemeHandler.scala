package typings
package uriDashJsLib.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends js.Object {
  var absolutePath: js.UndefOr[scala.Boolean] = js.undefined
  var domainHost: js.UndefOr[scala.Boolean] = js.undefined
  var scheme: java.lang.String
  var unicodeSupport: js.UndefOr[scala.Boolean] = js.undefined
  def parse(components: ParentComponents, options: Options): Components
  def serialize(components: Components, options: Options): ParentComponents
}

