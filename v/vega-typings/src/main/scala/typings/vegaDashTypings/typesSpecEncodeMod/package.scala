package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecEncodeMod {
  import typings.std.Partial
  import typings.std.Record
  import typings.vegaDashTypings.Anon_Exponent
  import typings.vegaDashTypings.Anon_Test
  import typings.vegaDashTypings.typesSpecColorMod.Color
  import typings.vegaDashTypings.typesSpecTitleMod.TitleAnchor

  type AlignValueRef = ScaledValueRef[Align]
  type AnchorValueRef = ScaledValueRef[TitleAnchor]
  type ArbitraryValueRef = NumericValueRef | ColorValueRef | ScaledValueRef[js.Any]
  type ArrayValueRef = ScaledValueRef[js.Array[js.Any]]
  type BooleanValueRef = ScaledValueRef[Boolean]
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecEncodeMod.ScaledValueRef[typings.vegaDashTypings.typesSpecColorMod.Color]
    - typings.vegaDashTypings.Anon_ValueLinearGradient
    - typings.vegaDashTypings.Anon_Count
    - typings.vegaDashTypings.Anon_Color
  */
  type ColorValueRef = _ColorValueRef | ScaledValueRef[Color]
  type Encode[T] = Partial[Record[EncodeEntryName, T]]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
    - typings.vegaDashTypings.typesSpecEncodeMod.DatumFieldRef
    - typings.vegaDashTypings.typesSpecEncodeMod.GroupFieldRef
    - typings.vegaDashTypings.typesSpecEncodeMod.ParentFieldRef
  */
  type Field = _Field | String
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.vegaDashTypingsStrings.normal
    - typings.vegaDashTypings.vegaDashTypingsStrings.italic
    - typings.vegaDashTypings.vegaDashTypingsStrings.oblique
    - java.lang.String
  */
  type FontStyle = _FontStyle | String
  type FontStyleValueRef = ScaledValueRef[FontStyle]
  type FontWeightValueRef = ScaledValueRef[FontWeight]
  type NumericValueRef = (ScaledValueRef[Double] | js.Object) with Anon_Exponent
  type OrientValueRef = ScaledValueRef[Orient]
  type ProductionRule[T] = T | (js.Array[Anon_Test with T])
  type RuleEncodeEntry = EncodeEntry
  type StringValueRef = ScaledValueRef[String]
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.vegaDashTypingsStrings.circle
    - typings.vegaDashTypings.vegaDashTypingsStrings.square
    - typings.vegaDashTypings.vegaDashTypingsStrings.cross
    - typings.vegaDashTypings.vegaDashTypingsStrings.diamond
    - typings.vegaDashTypings.vegaDashTypingsStrings.`triangle-up`
    - typings.vegaDashTypings.vegaDashTypingsStrings.`triangle-down`
    - typings.vegaDashTypings.vegaDashTypingsStrings.`triangle-right`
    - typings.vegaDashTypings.vegaDashTypingsStrings.`triangle-left`
    - typings.vegaDashTypings.vegaDashTypingsStrings.arrow
    - typings.vegaDashTypings.vegaDashTypingsStrings.triangle
    - typings.vegaDashTypings.vegaDashTypingsStrings.wedge
    - typings.vegaDashTypings.vegaDashTypingsStrings.stroke
    - java.lang.String
  */
  type SymbolShape = _SymbolShape | String
  type SymbolShapeValueRef = ScaledValueRef[SymbolShape]
  type TextBaselineValueRef = ScaledValueRef[TextBaseline]
}
