package typings.urlPattern.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("url-pattern", JSImport.Namespace)
@js.native
class ^ protected () extends UrlPattern {
  def this(pattern: String) = this()
  def this(pattern: RegExp) = this()
  def this(pattern: String, options: UrlPatternOptions) = this()
  def this(pattern: RegExp, groupNames: js.Array[String]) = this()
}
