package typings.whatwgUrl.mod

import typings.whatwgUrl.anon.BaseURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whatwg-url", "parseURL")
@js.native
object parseURL extends js.Object {
  
  def apply(input: String): URLRecord | Null = js.native
  def apply(input: String, options: BaseURL): URLRecord | Null = js.native
}
