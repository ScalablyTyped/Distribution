package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Valid features that are installable on RegExp.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xregexp.xregexpStrings.astral
  - typings.xregexp.xregexpStrings.namespacing
*/
trait Feature extends FeatureOptions
object Feature {
  
  @scala.inline
  def astral: typings.xregexp.xregexpStrings.astral = "astral".asInstanceOf[typings.xregexp.xregexpStrings.astral]
  
  @scala.inline
  def namespacing: typings.xregexp.xregexpStrings.namespacing = "namespacing".asInstanceOf[typings.xregexp.xregexpStrings.namespacing]
}
