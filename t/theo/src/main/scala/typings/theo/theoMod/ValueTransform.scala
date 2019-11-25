package typings.theo.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.theo.theoStrings.`color/rgb`
  - typings.theo.theoStrings.`color/hex`
  - typings.theo.theoStrings.`color/hex8rgba`
  - typings.theo.theoStrings.`color/hex8argb`
  - typings.theo.theoStrings.`percentage/float`
  - typings.theo.theoStrings.`relative/pixel`
  - typings.theo.theoStrings.`relative/pixelValue`
*/
trait ValueTransform extends js.Object

object ValueTransform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `color/hex`: typings.theo.theoStrings.`color/hex` = this.cast("color/hex")
  @scala.inline
  def `color/hex8argb`: typings.theo.theoStrings.`color/hex8argb` = this.cast("color/hex8argb")
  @scala.inline
  def `color/hex8rgba`: typings.theo.theoStrings.`color/hex8rgba` = this.cast("color/hex8rgba")
  @scala.inline
  def `color/rgb`: typings.theo.theoStrings.`color/rgb` = this.cast("color/rgb")
  @scala.inline
  def `percentage/float`: typings.theo.theoStrings.`percentage/float` = this.cast("percentage/float")
  @scala.inline
  def `relative/pixel`: typings.theo.theoStrings.`relative/pixel` = this.cast("relative/pixel")
  @scala.inline
  def `relative/pixelValue`: typings.theo.theoStrings.`relative/pixelValue` = this.cast("relative/pixelValue")
}

