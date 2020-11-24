package typings.urijs.uritemplateMod

import typings.urijs.mod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URITemplate extends js.Object {
  
  def expand(data: URITemplateInput): URI = js.native
  def expand(data: URITemplateInput, opts: js.Object): URI = js.native
  
  def parse(): this.type = js.native
  
  /**
    * @description The parsed parts of the URI Template. Only present after calling
    *              `parse()` first.
    */
  var parts: js.UndefOr[js.Array[URITemplatePart]] = js.native
}
