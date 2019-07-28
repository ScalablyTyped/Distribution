package typings.vegaDashLite.buildSrcCompileRepeaterMod

import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcFacetMod.FacetMapping
import typings.vegaDashLite.buildSrcFielddefMod.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/repeater", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def replaceRepeaterInEncoding(encoding: Encoding[Field], repeater: RepeaterValue): Encoding[String] = js.native
  def replaceRepeaterInFacet(facet: FacetMapping[Field], repeater: RepeaterValue): FacetMapping[String] = js.native
}

