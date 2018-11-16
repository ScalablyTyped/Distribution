package typings
package urijsLib.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URITemplate extends js.Object {
  /**
         * @description The parsed parts of the URI Template. Only present after calling
         *              `parse()` first.
         */
  var parts: js.UndefOr[js.Array[URITemplatePart]] = js.native
  def expand(data: URITemplateInput): URI = js.native
  def expand(data: URITemplateInput, opts: js.Object): URI = js.native
  def parse(): this.type = js.native
}

