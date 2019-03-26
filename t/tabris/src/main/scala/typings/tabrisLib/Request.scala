package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type definitions for fetch API
// Source: https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/56295f5058cac7ae458540423c50ac2dcf9fc711/whatwg-fetch/whatwg-fetch.d.ts
// Project: https://github.com/github/fetch
// Definitions by: Ryan Graham <https://github.com/ryan-codingintrigue>
@JSGlobal("Request")
@js.native
class Request protected () extends Body {
  def this(input: java.lang.String) = this()
  def this(input: Request) = this()
  def this(input: java.lang.String, init: RequestInit) = this()
  def this(input: Request, init: RequestInit) = this()
  var cache: RequestCache = js.native
  var context: RequestContext = js.native
  var credentials: RequestCredentials = js.native
  var headers: Headers = js.native
  var method: java.lang.String = js.native
  var mode: RequestMode = js.native
  var referrer: java.lang.String = js.native
  var url: java.lang.String = js.native
}

