package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.align
import typings.vegaDashLite.vegaDashLiteStrings.angle
import typings.vegaDashLite.vegaDashLiteStrings.baseline
import typings.vegaDashLite.vegaDashLiteStrings.cornerRadius
import typings.vegaDashLite.vegaDashLiteStrings.cursor
import typings.vegaDashLite.vegaDashLiteStrings.dir
import typings.vegaDashLite.vegaDashLiteStrings.dx
import typings.vegaDashLite.vegaDashLiteStrings.dy
import typings.vegaDashLite.vegaDashLiteStrings.ellipsis
import typings.vegaDashLite.vegaDashLiteStrings.fill
import typings.vegaDashLite.vegaDashLiteStrings.fillOpacity
import typings.vegaDashLite.vegaDashLiteStrings.font
import typings.vegaDashLite.vegaDashLiteStrings.fontSize
import typings.vegaDashLite.vegaDashLiteStrings.fontStyle
import typings.vegaDashLite.vegaDashLiteStrings.fontWeight
import typings.vegaDashLite.vegaDashLiteStrings.href
import typings.vegaDashLite.vegaDashLiteStrings.interpolate
import typings.vegaDashLite.vegaDashLiteStrings.limit
import typings.vegaDashLite.vegaDashLiteStrings.opacity
import typings.vegaDashLite.vegaDashLiteStrings.orient
import typings.vegaDashLite.vegaDashLiteStrings.radius
import typings.vegaDashLite.vegaDashLiteStrings.shape
import typings.vegaDashLite.vegaDashLiteStrings.size
import typings.vegaDashLite.vegaDashLiteStrings.stroke
import typings.vegaDashLite.vegaDashLiteStrings.strokeCap
import typings.vegaDashLite.vegaDashLiteStrings.strokeDash
import typings.vegaDashLite.vegaDashLiteStrings.strokeDashOffset
import typings.vegaDashLite.vegaDashLiteStrings.strokeJoin
import typings.vegaDashLite.vegaDashLiteStrings.strokeMiterLimit
import typings.vegaDashLite.vegaDashLiteStrings.strokeOpacity
import typings.vegaDashLite.vegaDashLiteStrings.strokeWidth
import typings.vegaDashLite.vegaDashLiteStrings.tension
import typings.vegaDashLite.vegaDashLiteStrings.text
import typings.vegaDashLite.vegaDashLiteStrings.theta
import typings.vegaDashLite.vegaDashLiteStrings.tooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/vega.schema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VG_MARK_CONFIGS: js.Array[
    dir | font | text | shape | orient | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
  ] = js.native
  def isDataRefDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgDataRef */ Boolean = js.native
  def isDataRefUnionedDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.DataRefUnionDomain */ Boolean = js.native
  def isFieldRefUnionDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgFieldRefUnionDomain */ Boolean = js.native
  def isSignalRefDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgSignalRef */ Boolean = js.native
  def isVgRangeStep(range: VgRange): /* is vega-lite.vega-lite/build/src/vega.schema.VgRangeStep */ Boolean = js.native
  def isVgSignalRef(o: js.Any): /* is vega-lite.vega-lite/build/src/vega.schema.VgSignalRef */ Boolean = js.native
}

