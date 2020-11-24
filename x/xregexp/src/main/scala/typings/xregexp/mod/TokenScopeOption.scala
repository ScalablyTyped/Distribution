package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Valid token scopes for adding a token to XRegExp.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xregexp.xregexpStrings.all
  - typings.xregexp.xregexpStrings.default
  - typings.xregexp.xregexpStrings.`class`
*/
trait TokenScopeOption extends js.Object
object TokenScopeOption {
  
  @scala.inline
  def all: typings.xregexp.xregexpStrings.all = "all".asInstanceOf[typings.xregexp.xregexpStrings.all]
  
  @scala.inline
  def `class`: typings.xregexp.xregexpStrings.`class` = "class".asInstanceOf[typings.xregexp.xregexpStrings.`class`]
  
  @scala.inline
  def default: typings.xregexp.xregexpStrings.default = "default".asInstanceOf[typings.xregexp.xregexpStrings.default]
}
