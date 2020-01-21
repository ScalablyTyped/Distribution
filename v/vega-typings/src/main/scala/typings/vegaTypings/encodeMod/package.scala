package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object encodeMod {
  type AlignValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.Align]
  type AnchorValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.titleMod.TitleAnchor]
  type ArbitraryValueRef = typings.vegaTypings.encodeMod.NumericValueRef | typings.vegaTypings.encodeMod.ColorValueRef | typings.vegaTypings.encodeMod.ScaledValueRef[js.Any]
  type ArrayValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[js.Array[js.Any]]
  type BooleanValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.colorMod.Color]
    - typings.vegaTypings.AnonValueLinearGradient
    - typings.vegaTypings.AnonCount
    - typings.vegaTypings.AnonColor
  */
  type ColorValueRef = typings.vegaTypings.encodeMod._ColorValueRef | typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.colorMod.Color]
  type Encode[T] = typings.std.Partial[typings.std.Record[typings.vegaTypings.encodeMod.EncodeEntryName, T]]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.encodeMod.DatumFieldRef
    - typings.vegaTypings.encodeMod.GroupFieldRef
    - typings.vegaTypings.encodeMod.ParentFieldRef
  */
  type Field = typings.vegaTypings.encodeMod._Field | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.normal
    - typings.vegaTypings.vegaTypingsStrings.italic
    - typings.vegaTypings.vegaTypingsStrings.oblique
    - java.lang.String
  */
  type FontStyle = typings.vegaTypings.encodeMod._FontStyle | java.lang.String
  type FontStyleValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.FontStyle]
  type FontWeightValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.FontWeight]
  type NumericValueRef = (typings.vegaTypings.encodeMod.ScaledValueRef[scala.Double] | js.Object) with typings.vegaTypings.AnonExponent
  type OrientValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.Orient]
  type ProductionRule[T] = T | (js.Array[typings.vegaTypings.AnonTest with T])
  type RuleEncodeEntry = typings.vegaTypings.encodeMod.EncodeEntry
  type StringValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.circle
    - typings.vegaTypings.vegaTypingsStrings.square
    - typings.vegaTypings.vegaTypingsStrings.cross
    - typings.vegaTypings.vegaTypingsStrings.diamond
    - typings.vegaTypings.vegaTypingsStrings.`triangle-up`
    - typings.vegaTypings.vegaTypingsStrings.`triangle-down`
    - typings.vegaTypings.vegaTypingsStrings.`triangle-right`
    - typings.vegaTypings.vegaTypingsStrings.`triangle-left`
    - typings.vegaTypings.vegaTypingsStrings.arrow
    - typings.vegaTypings.vegaTypingsStrings.triangle
    - typings.vegaTypings.vegaTypingsStrings.wedge
    - typings.vegaTypings.vegaTypingsStrings.stroke
    - java.lang.String
  */
  type SymbolShape = typings.vegaTypings.encodeMod._SymbolShape | java.lang.String
  type SymbolShapeValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.SymbolShape]
  type Text = java.lang.String | js.Array[java.lang.String]
  type TextBaselineValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.TextBaseline]
  type TextValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.Text]
}
