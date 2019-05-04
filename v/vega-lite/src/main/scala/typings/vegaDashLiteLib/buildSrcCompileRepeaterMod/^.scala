package typings
package vegaDashLiteLib.buildSrcCompileRepeaterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/repeater", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def replaceRepeaterInEncoding(
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
    repeater: RepeaterValue
  ): vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String] = js.native
  def replaceRepeaterInFacet(
    facet: vegaDashLiteLib.buildSrcFacetMod.FacetMapping[vegaDashLiteLib.buildSrcFielddefMod.Field],
    repeater: RepeaterValue
  ): vegaDashLiteLib.buildSrcFacetMod.FacetMapping[java.lang.String] = js.native
}

