package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.theo.theoStrings.colorSlashrgb
  - typings.theo.theoStrings.colorSlashhex
  - typings.theo.theoStrings.colorSlashhex8rgba
  - typings.theo.theoStrings.colorSlashhex8argb
  - typings.theo.theoStrings.percentageSlashfloat
  - typings.theo.theoStrings.relativeSlashpixel
  - typings.theo.theoStrings.relativeSlashpixelValue
*/
trait ValueTransform extends js.Object

object ValueTransform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def colorSlashhex: typings.theo.theoStrings.colorSlashhex = this.cast("color/hex")
  @scala.inline
  def colorSlashhex8argb: typings.theo.theoStrings.colorSlashhex8argb = this.cast("color/hex8argb")
  @scala.inline
  def colorSlashhex8rgba: typings.theo.theoStrings.colorSlashhex8rgba = this.cast("color/hex8rgba")
  @scala.inline
  def colorSlashrgb: typings.theo.theoStrings.colorSlashrgb = this.cast("color/rgb")
  @scala.inline
  def percentageSlashfloat: typings.theo.theoStrings.percentageSlashfloat = this.cast("percentage/float")
  @scala.inline
  def relativeSlashpixel: typings.theo.theoStrings.relativeSlashpixel = this.cast("relative/pixel")
  @scala.inline
  def relativeSlashpixelValue: typings.theo.theoStrings.relativeSlashpixelValue = this.cast("relative/pixelValue")
}

