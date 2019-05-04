package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInterpolateParams extends js.Object {
  var gamma: js.UndefOr[scala.Double] = js.undefined
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.rgb | vegaDashLiteLib.vegaDashLiteLibStrings.cubehelix | vegaDashLiteLib.vegaDashLiteLibStrings.`cubehelix-long`
}

object ScaleInterpolateParams {
  @scala.inline
  def apply(
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.rgb | vegaDashLiteLib.vegaDashLiteLibStrings.cubehelix | vegaDashLiteLib.vegaDashLiteLibStrings.`cubehelix-long`,
    gamma: scala.Int | scala.Double = null
  ): ScaleInterpolateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInterpolateParams]
  }
}

