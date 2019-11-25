package typings.vegaDashTypings.typesSpecMod

import typings.vegaDashTypings.typesSpecAutosizeMod.AutoSize
import typings.vegaDashTypings.typesSpecAxisMod.Axis
import typings.vegaDashTypings.typesSpecBackgroundMod.Background
import typings.vegaDashTypings.typesSpecConfigMod.Config
import typings.vegaDashTypings.typesSpecDataMod.Data
import typings.vegaDashTypings.typesSpecEncodeMod.Encodable
import typings.vegaDashTypings.typesSpecEncodeMod.Encode
import typings.vegaDashTypings.typesSpecEncodeMod.EncodeEntry
import typings.vegaDashTypings.typesSpecLayoutMod.Layout
import typings.vegaDashTypings.typesSpecLegendMod.Legend
import typings.vegaDashTypings.typesSpecMarkMod.Mark
import typings.vegaDashTypings.typesSpecPaddingMod.Padding
import typings.vegaDashTypings.typesSpecProjectionMod.Projection
import typings.vegaDashTypings.typesSpecScaleMod.Scale
import typings.vegaDashTypings.typesSpecScopeMod.Scope
import typings.vegaDashTypings.typesSpecSignalMod.Signal
import typings.vegaDashTypings.typesSpecTitleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec
  extends Scope
     with Encodable[EncodeEntry] {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  var autosize: js.UndefOr[AutoSize] = js.undefined
  var background: js.UndefOr[Background] = js.undefined
  var config: js.UndefOr[Config] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    $schema: String = null,
    autosize: AutoSize = null,
    axes: js.Array[Axis] = null,
    background: Background = null,
    config: Config = null,
    data: js.Array[Data] = null,
    description: String = null,
    encode: Encode[EncodeEntry] = null,
    height: Int | Double = null,
    layout: Layout = null,
    legends: js.Array[Legend] = null,
    marks: js.Array[Mark] = null,
    padding: Padding = null,
    projections: js.Array[Projection] = null,
    scales: js.Array[Scale] = null,
    signals: js.Array[Signal] = null,
    style: String | js.Array[String] = null,
    title: String | Title = null,
    usermeta: js.Object = null,
    width: Int | Double = null
  ): Spec = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (projections != null) __obj.updateDynamic("projections")(projections.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (usermeta != null) __obj.updateDynamic("usermeta")(usermeta.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
}

