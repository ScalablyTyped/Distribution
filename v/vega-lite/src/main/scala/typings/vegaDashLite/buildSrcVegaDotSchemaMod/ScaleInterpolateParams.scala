package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.`cubehelix-long`
import typings.vegaDashLite.vegaDashLiteStrings.cubehelix
import typings.vegaDashLite.vegaDashLiteStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInterpolateParams extends js.Object {
  var gamma: js.UndefOr[Double] = js.undefined
  var `type`: rgb | cubehelix | `cubehelix-long`
}

object ScaleInterpolateParams {
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long`, gamma: Int | Double = null): ScaleInterpolateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInterpolateParams]
  }
}

