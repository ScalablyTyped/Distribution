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
  type MarkConfigKeys = vegaDashTypingsLib.vegaDashTypingsLibStrings.mark | (js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.arc | vegaDashTypingsLib.vegaDashTypingsLibStrings.area | vegaDashTypingsLib.vegaDashTypingsLibStrings.image | vegaDashTypingsLib.vegaDashTypingsLibStrings.group | vegaDashTypingsLib.vegaDashTypingsLibStrings.line | vegaDashTypingsLib.vegaDashTypingsLibStrings.path | vegaDashTypingsLib.vegaDashTypingsLibStrings.rect | vegaDashTypingsLib.vegaDashTypingsLibStrings.rule | vegaDashTypingsLib.vegaDashTypingsLibStrings.shape | vegaDashTypingsLib.vegaDashTypingsLibStrings.symbol | vegaDashTypingsLib.vegaDashTypingsLibStrings.text | vegaDashTypingsLib.vegaDashTypingsLibStrings.trail
  ])
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
