package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def astral: typings.xregexp.xregexpStrings.astral = this.cast("astral")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def namespacing: typings.xregexp.xregexpStrings.namespacing = this.cast("namespacing")
}

