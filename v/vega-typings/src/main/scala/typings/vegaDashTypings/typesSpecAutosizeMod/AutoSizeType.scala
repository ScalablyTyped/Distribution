package typings.vegaDashTypings.typesSpecAutosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.pad
  - typings.vegaDashTypings.vegaDashTypingsStrings.fit
  - typings.vegaDashTypings.vegaDashTypingsStrings.`fit-x`
  - typings.vegaDashTypings.vegaDashTypingsStrings.`fit-y`
  - typings.vegaDashTypings.vegaDashTypingsStrings.none
*/
trait AutoSizeType extends AutoSize

object AutoSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fit: typings.vegaDashTypings.vegaDashTypingsStrings.fit = this.cast("fit")
  @scala.inline
  def `fit-x`: typings.vegaDashTypings.vegaDashTypingsStrings.`fit-x` = this.cast("fit-x")
  @scala.inline
  def `fit-y`: typings.vegaDashTypings.vegaDashTypingsStrings.`fit-y` = this.cast("fit-y")
  @scala.inline
  def none: typings.vegaDashTypings.vegaDashTypingsStrings.none = this.cast("none")
  @scala.inline
  def pad: typings.vegaDashTypings.vegaDashTypingsStrings.pad = this.cast("pad")
}

