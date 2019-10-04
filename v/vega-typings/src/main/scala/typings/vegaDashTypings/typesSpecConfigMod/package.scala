package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecConfigMod {
  import typings.std.Record
  import typings.vegaDashTypings.typesSpecAxisMod.BaseAxis
  import typings.vegaDashTypings.typesSpecAxisMod.LabelOverlap
  import typings.vegaDashTypings.typesSpecLayoutMod.LayoutAlign
  import typings.vegaDashTypings.typesSpecProjectionMod.BaseProjection
  import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
  import typings.vegaDashTypings.typesSpecStreamMod.EventType
  import typings.vegaDashTypings.typesSpecTitleMod.BaseTitle
  import typings.vegaDashTypings.typesSpecTitleMod.TitleFrame
  import typings.vegaDashTypings.typesSpecTitleMod.TitleOrient
  import typings.vegaDashTypings.typesSpecValuesMod.AlignValue
  import typings.vegaDashTypings.typesSpecValuesMod.AnchorValue
  import typings.vegaDashTypings.typesSpecValuesMod.BooleanValue
  import typings.vegaDashTypings.typesSpecValuesMod.ColorValue
  import typings.vegaDashTypings.typesSpecValuesMod.DashArrayValue
  import typings.vegaDashTypings.typesSpecValuesMod.FontStyleValue
  import typings.vegaDashTypings.typesSpecValuesMod.FontWeightValue
  import typings.vegaDashTypings.typesSpecValuesMod.NumberValue
  import typings.vegaDashTypings.typesSpecValuesMod.StringValue
  import typings.vegaDashTypings.typesSpecValuesMod.TextBaselineValue
  import typings.vegaDashTypings.vegaDashTypingsStrings.allow
  import typings.vegaDashTypings.vegaDashTypingsStrings.mark
  import typings.vegaDashTypings.vegaDashTypingsStrings.prevent

  type AxisConfig = BaseAxis[
    NumberValue, 
    Double | SignalRef, 
    BooleanValue, 
    Double | Boolean | SignalRef, 
    StringValue, 
    ColorValue, 
    FontWeightValue, 
    FontStyleValue, 
    AlignValue, 
    TextBaselineValue, 
    LayoutAlign | SignalRef, 
    LabelOverlap | SignalRef, 
    DashArrayValue, 
    AnchorValue
  ]
  type DefaultsConfig = Record[prevent | allow, Boolean | js.Array[EventType]]
  type MarkConfigKeys = mark | (/* import warning: ImportType.apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
  type ProjectionConfig = BaseProjection
  type TitleConfig = BaseTitle[
    NumberValue, 
    StringValue, 
    ColorValue, 
    FontWeightValue, 
    FontStyleValue, 
    AlignValue, 
    TextBaselineValue, 
    TitleFrame | StringValue, 
    AnchorValue, 
    TitleOrient | SignalRef
  ]
}
