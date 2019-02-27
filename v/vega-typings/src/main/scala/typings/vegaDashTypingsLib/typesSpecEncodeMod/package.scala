package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecEncodeMod {
  type Align = vegaDashTypingsLib.vegaDashTypingsLibStrings.left | vegaDashTypingsLib.vegaDashTypingsLibStrings.center | vegaDashTypingsLib.vegaDashTypingsLibStrings.right
  type AlignValueRef = ScaledValueRef[Align]
  type AnchorValueRef = ScaledValueRef[vegaDashTypingsLib.typesSpecTitleMod.TitleAnchor]
  type ArbitraryValueRef = NumericValueRef | ColorValueRef | ScaledValueRef[js.Any]
  type ArrayValueRef = ScaledValueRef[js.Array[js.Any]]
  type BaseValueRef[T] = vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.Anon_Value[T] | vegaDashTypingsLib.Anon_Field | vegaDashTypingsLib.Anon_Range
  type Baseline = vegaDashTypingsLib.vegaDashTypingsLibStrings.top | vegaDashTypingsLib.vegaDashTypingsLibStrings.middle | vegaDashTypingsLib.vegaDashTypingsLibStrings.bottom
  type BooleanValueRef = ScaledValueRef[scala.Boolean]
  type ColorValueRef = ScaledValueRef[java.lang.String] | vegaDashTypingsLib.Anon_Count | vegaDashTypingsLib.Anon_Color
  type Encode[T] = stdLib.Partial[stdLib.Record[EncodeEntryName, T]]
  type EncodeEntryName = vegaDashTypingsLib.vegaDashTypingsLibStrings.enter | vegaDashTypingsLib.vegaDashTypingsLibStrings.update | vegaDashTypingsLib.vegaDashTypingsLibStrings.exit | vegaDashTypingsLib.vegaDashTypingsLibStrings.hover | vegaDashTypingsLib.vegaDashTypingsLibStrings.leave | vegaDashTypingsLib.vegaDashTypingsLibStrings.select | vegaDashTypingsLib.vegaDashTypingsLibStrings.release
  type Field = java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | DatumFieldRef | GroupFieldRef | ParentFieldRef
  type FontStyle = vegaDashTypingsLib.vegaDashTypingsLibStrings.normal | vegaDashTypingsLib.vegaDashTypingsLibStrings.italic | vegaDashTypingsLib.vegaDashTypingsLibStrings.oblique | java.lang.String
  type FontStyleValueRef = ScaledValueRef[FontStyle]
  type FontWeight = vegaDashTypingsLib.vegaDashTypingsLibStrings.normal | vegaDashTypingsLib.vegaDashTypingsLibStrings.bold | vegaDashTypingsLib.vegaDashTypingsLibStrings.lighter | vegaDashTypingsLib.vegaDashTypingsLibStrings.bolder | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`100` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`200` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`300` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`400` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`500` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`600` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`700` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`800` | vegaDashTypingsLib.vegaDashTypingsLibNumbers.`900`
  type FontWeightValueRef = ScaledValueRef[FontWeight]
  type Interpolate = vegaDashTypingsLib.vegaDashTypingsLibStrings.basis | vegaDashTypingsLib.vegaDashTypingsLibStrings.`basis-open` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`basis-closed` | vegaDashTypingsLib.vegaDashTypingsLibStrings.bundle | vegaDashTypingsLib.vegaDashTypingsLibStrings.cardinal | vegaDashTypingsLib.vegaDashTypingsLibStrings.`cardinal-open` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`cardinal-closed` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`catmull-rom` | vegaDashTypingsLib.vegaDashTypingsLibStrings.linear | vegaDashTypingsLib.vegaDashTypingsLibStrings.`linear-closed` | vegaDashTypingsLib.vegaDashTypingsLibStrings.monotone | vegaDashTypingsLib.vegaDashTypingsLibStrings.natural | vegaDashTypingsLib.vegaDashTypingsLibStrings.step | vegaDashTypingsLib.vegaDashTypingsLibStrings.`step-before` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`step-after`
  type NumericValueRef = (ScaledValueRef[scala.Double] | js.Object) with vegaDashTypingsLib.Anon_Exponent
  type Orient = vegaDashTypingsLib.vegaDashTypingsLibStrings.left | vegaDashTypingsLib.vegaDashTypingsLibStrings.right | vegaDashTypingsLib.vegaDashTypingsLibStrings.top | vegaDashTypingsLib.vegaDashTypingsLibStrings.bottom
  type OrientValueRef = ScaledValueRef[Orient]
  type Orientation = vegaDashTypingsLib.vegaDashTypingsLibStrings.horizontal | vegaDashTypingsLib.vegaDashTypingsLibStrings.vertical
  type ProductionRule[T] = T | (js.Array[vegaDashTypingsLib.Anon_Test with T])
  type RuleEncodeEntry = EncodeEntry
  type ScaledValueRef[T] = BaseValueRef[T] | (BaseValueRef[T] with vegaDashTypingsLib.Anon_Scale) | vegaDashTypingsLib.Anon_Band
  type StringValueRef = ScaledValueRef[java.lang.String]
  type SymbolShape = vegaDashTypingsLib.vegaDashTypingsLibStrings.circle | vegaDashTypingsLib.vegaDashTypingsLibStrings.square | vegaDashTypingsLib.vegaDashTypingsLibStrings.cross | vegaDashTypingsLib.vegaDashTypingsLibStrings.diamond | vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-up` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-down` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-right` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-left` | vegaDashTypingsLib.vegaDashTypingsLibStrings.arrow | vegaDashTypingsLib.vegaDashTypingsLibStrings.triangle | vegaDashTypingsLib.vegaDashTypingsLibStrings.wedge | vegaDashTypingsLib.vegaDashTypingsLibStrings.stroke | java.lang.String
  type SymbolShapeValueRef = ScaledValueRef[SymbolShape]
  type TextBaseline = vegaDashTypingsLib.vegaDashTypingsLibStrings.alphabetic | Baseline
  type TextBaselineValueRef = ScaledValueRef[TextBaseline]
  type TextDirection = vegaDashTypingsLib.vegaDashTypingsLibStrings.ltr | vegaDashTypingsLib.vegaDashTypingsLibStrings.rtl
}
