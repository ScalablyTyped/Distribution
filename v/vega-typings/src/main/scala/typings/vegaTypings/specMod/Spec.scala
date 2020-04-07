package typings.vegaTypings.specMod

import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.dataMod.Data
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.Encode
import typings.vegaTypings.encodeMod.EncodeEntry
import typings.vegaTypings.layoutMod.Layout
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.markMod.Mark
import typings.vegaTypings.paddingMod.Padding
import typings.vegaTypings.projectionMod.Projection
import typings.vegaTypings.scaleMod.Scale
import typings.vegaTypings.scopeMod.Scope
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec
  extends Scope
     with Encodable[EncodeEntry] {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  var autosize: js.UndefOr[AutoSize | SignalRef] = js.undefined
  var background: js.UndefOr[Color | SignalRef] = js.undefined
  var config: js.UndefOr[Config] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | SignalRef] = js.undefined
  var padding: js.UndefOr[Padding | SignalRef] = js.undefined
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  var width: js.UndefOr[Double | SignalRef] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    $schema: String = null,
    autosize: AutoSize | SignalRef = null,
    axes: js.Array[Axis] = null,
    background: Color | SignalRef = null,
    config: Config = null,
    data: js.Array[Data] = null,
    description: String = null,
    encode: Encode[EncodeEntry] = null,
    height: Double | SignalRef = null,
    layout: Layout = null,
    legends: js.Array[Legend] = null,
    marks: js.Array[Mark] = null,
    padding: Padding | SignalRef = null,
    projections: js.Array[Projection] = null,
    scales: js.Array[Scale] = null,
    signals: js.Array[Signal] = null,
    style: String | js.Array[String] = null,
    title: String | Title = null,
    usermeta: js.Object = null,
    width: Double | SignalRef = null
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

