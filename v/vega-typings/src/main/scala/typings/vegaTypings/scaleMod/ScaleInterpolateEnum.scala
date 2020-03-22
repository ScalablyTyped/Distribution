package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.rgb
  - typings.vegaTypings.vegaTypingsStrings.lab
  - typings.vegaTypings.vegaTypingsStrings.hcl
  - typings.vegaTypings.vegaTypingsStrings.hsl
  - typings.vegaTypings.vegaTypingsStrings.`hsl-long`
  - typings.vegaTypings.vegaTypingsStrings.`hcl-long`
  - typings.vegaTypings.vegaTypingsStrings.cubehelix
  - typings.vegaTypings.vegaTypingsStrings.`cubehelix-long`
*/
trait ScaleInterpolateEnum extends ScaleInterpolate

object ScaleInterpolateEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cubehelix: typings.vegaTypings.vegaTypingsStrings.cubehelix = this.cast("cubehelix")
  @scala.inline
  def `cubehelix-long`: typings.vegaTypings.vegaTypingsStrings.`cubehelix-long` = this.cast("cubehelix-long")
  @scala.inline
  def hcl: typings.vegaTypings.vegaTypingsStrings.hcl = this.cast("hcl")
  @scala.inline
  def `hcl-long`: typings.vegaTypings.vegaTypingsStrings.`hcl-long` = this.cast("hcl-long")
  @scala.inline
  def hsl: typings.vegaTypings.vegaTypingsStrings.hsl = this.cast("hsl")
  @scala.inline
  def `hsl-long`: typings.vegaTypings.vegaTypingsStrings.`hsl-long` = this.cast("hsl-long")
  @scala.inline
  def lab: typings.vegaTypings.vegaTypingsStrings.lab = this.cast("lab")
  @scala.inline
  def rgb: typings.vegaTypings.vegaTypingsStrings.rgb = this.cast("rgb")
}

