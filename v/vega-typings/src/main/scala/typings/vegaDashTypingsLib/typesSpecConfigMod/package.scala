package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecConfigMod {
  type AxisConfig = vegaDashTypingsLib.typesSpecAxisMod.BaseAxis[
    vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
    vegaDashTypingsLib.typesSpecValuesMod.BooleanValue, 
    scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
    vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
    vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
    vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
    vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue, 
    vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
    vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
    vegaDashTypingsLib.typesSpecLayoutMod.LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
    vegaDashTypingsLib.typesSpecAxisMod.LabelOverlap | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
    vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue, 
    vegaDashTypingsLib.typesSpecValuesMod.AnchorValue
  ]
  type DefaultsConfig = stdLib.Record[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.prevent | vegaDashTypingsLib.vegaDashTypingsLibStrings.allow, 
    scala.Boolean | js.Array[vegaDashTypingsLib.typesSpecStreamMod.EventType]
  ]
  type MarkConfigKeys = vegaDashTypingsLib.vegaDashTypingsLibStrings.mark | (/* import warning: ImportType.apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
  type TitleConfig = vegaDashTypingsLib.typesSpecTitleMod.BaseTitle[
    vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
    vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
    vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
    vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
    vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue, 
    vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
    vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
    vegaDashTypingsLib.typesSpecTitleMod.TitleFrame | vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
    vegaDashTypingsLib.typesSpecValuesMod.AnchorValue, 
    vegaDashTypingsLib.typesSpecTitleMod.TitleOrient | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ]
}
