package typings.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Syntax feature options.
  * An error will be thrown if you use `only` more than once
  */
/* Rewritten from type alias, can be one of: 
  - typings.styleSearch.styleSearchStrings.skip
  - typings.styleSearch.styleSearchStrings.check
  - typings.styleSearch.styleSearchStrings.only
*/
trait SyntaxFeatureOption extends js.Object

object SyntaxFeatureOption {
  @scala.inline
  def check: typings.styleSearch.styleSearchStrings.check = "check".asInstanceOf[typings.styleSearch.styleSearchStrings.check]
  @scala.inline
  def only: typings.styleSearch.styleSearchStrings.only = "only".asInstanceOf[typings.styleSearch.styleSearchStrings.only]
  @scala.inline
  def skip: typings.styleSearch.styleSearchStrings.skip = "skip".asInstanceOf[typings.styleSearch.styleSearchStrings.skip]
}

