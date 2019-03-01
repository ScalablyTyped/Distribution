package typings
package vegaDashTypingsLib.typesSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec
  extends vegaDashTypingsLib.typesSpecScopeMod.Scope
     with vegaDashTypingsLib.typesSpecEncodeMod.Encodable[vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntry] {
  @JSName("$schema")
  var $schema: js.UndefOr[java.lang.String] = js.undefined
  var autosize: js.UndefOr[vegaDashTypingsLib.typesSpecAutosizeMod.AutoSize] = js.undefined
  var background: js.UndefOr[vegaDashTypingsLib.typesSpecBackgroundMod.Background] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[vegaDashTypingsLib.typesSpecPaddingMod.Padding] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    $schema: java.lang.String = null,
    autosize: vegaDashTypingsLib.typesSpecAutosizeMod.AutoSize = null,
    axes: js.Array[vegaDashTypingsLib.typesSpecAxisMod.Axis] = null,
    background: vegaDashTypingsLib.typesSpecBackgroundMod.Background = null,
    config: js.Any = null,
    data: js.Array[vegaDashTypingsLib.typesSpecDataMod.Data] = null,
    description: java.lang.String = null,
    encode: vegaDashTypingsLib.typesSpecEncodeMod.Encode[vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntry] = null,
    height: scala.Int | scala.Double = null,
    layout: vegaDashTypingsLib.typesSpecLayoutMod.Layout = null,
    legends: js.Array[vegaDashTypingsLib.typesSpecLegendMod.Legend] = null,
    marks: js.Array[vegaDashTypingsLib.typesSpecMarkMod.Mark] = null,
    padding: vegaDashTypingsLib.typesSpecPaddingMod.Padding = null,
    projections: js.Array[vegaDashTypingsLib.typesSpecProjectionMod.Projection] = null,
    scales: js.Array[vegaDashTypingsLib.typesSpecScaleMod.Scale] = null,
    signals: js.Array[vegaDashTypingsLib.typesSpecSignalMod.Signal] = null,
    title: java.lang.String | vegaDashTypingsLib.typesSpecTitleMod.Title = null,
    width: scala.Int | scala.Double = null
  ): Spec = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    if (autosize != null) __obj.updateDynamic("autosize")(autosize)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (background != null) __obj.updateDynamic("background")(background)
    if (config != null) __obj.updateDynamic("config")(config)
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (projections != null) __obj.updateDynamic("projections")(projections)
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (signals != null) __obj.updateDynamic("signals")(signals)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
}

