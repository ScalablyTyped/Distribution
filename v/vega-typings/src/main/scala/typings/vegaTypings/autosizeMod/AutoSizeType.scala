package typings.vegaTypings.autosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.pad
  - typings.vegaTypings.vegaTypingsStrings.fit
  - typings.vegaTypings.vegaTypingsStrings.`fit-x`
  - typings.vegaTypings.vegaTypingsStrings.`fit-y`
  - typings.vegaTypings.vegaTypingsStrings.none
*/
trait AutoSizeType extends AutoSize

object AutoSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fit: typings.vegaTypings.vegaTypingsStrings.fit = this.cast("fit")
  @scala.inline
  def `fit-x`: typings.vegaTypings.vegaTypingsStrings.`fit-x` = this.cast("fit-x")
  @scala.inline
  def `fit-y`: typings.vegaTypings.vegaTypingsStrings.`fit-y` = this.cast("fit-y")
  @scala.inline
  def none: typings.vegaTypings.vegaTypingsStrings.none = this.cast("none")
  @scala.inline
  def pad: typings.vegaTypings.vegaTypingsStrings.pad = this.cast("pad")
}

