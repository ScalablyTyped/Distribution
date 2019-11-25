package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.truncatedNormal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.normal
  - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.uniform
  - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.truncatedNormal_
*/
trait Distribution extends js.Object

object Distribution {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.normal = this.cast("normal")
  @scala.inline
  def truncatedNormal: truncatedNormal_ = this.cast("truncatedNormal")
  @scala.inline
  def uniform: typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.uniform = this.cast("uniform")
}

