package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region types
/**
  * Valid token scopes used as an argument to the token handler closure passed to `XRegExp.addToken`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xregexp.xregexpStrings.default
  - typings.xregexp.xregexpStrings.`class`
*/
trait TokenScope extends js.Object
object TokenScope {
  
  @scala.inline
  def `class`: typings.xregexp.xregexpStrings.`class` = "class".asInstanceOf[typings.xregexp.xregexpStrings.`class`]
  
  @scala.inline
  def default: typings.xregexp.xregexpStrings.default = "default".asInstanceOf[typings.xregexp.xregexpStrings.default]
}
