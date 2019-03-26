package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecEncodeMod {
  type AlignValueRef = ScaledValueRef[Align]
  type AnchorValueRef = ScaledValueRef[vegaDashTypingsLib.typesSpecTitleMod.TitleAnchor]
  type ArbitraryValueRef = NumericValueRef | ColorValueRef | ScaledValueRef[js.Any]
  type ArrayValueRef = ScaledValueRef[js.Array[js.Any]]
  type BooleanValueRef = ScaledValueRef[scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - ScaledValueRef[java.lang.String]
    - vegaDashTypingsLib.Anon_Count
    - vegaDashTypingsLib.Anon_Color
  */
  type ColorValueRef = _ColorValueRef | ScaledValueRef[java.lang.String]
  type Encode[T] = stdLib.Partial[stdLib.Record[EncodeEntryName, T]]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    - DatumFieldRef
    - GroupFieldRef
    - ParentFieldRef
  */
  type Field = _Field | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.normal
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.italic
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.oblique
    - java.lang.String
  */
  type FontStyle = _FontStyle | java.lang.String
  type FontStyleValueRef = ScaledValueRef[FontStyle]
  type FontWeightValueRef = ScaledValueRef[FontWeight]
  type NumericValueRef = (ScaledValueRef[scala.Double] | js.Object) with vegaDashTypingsLib.Anon_Exponent
  type OrientValueRef = ScaledValueRef[Orient]
  type ProductionRule[T] = T | (js.Array[vegaDashTypingsLib.Anon_Test with T])
  type RuleEncodeEntry = EncodeEntry
  type StringValueRef = ScaledValueRef[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.circle
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.square
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.cross
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.diamond
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-up`
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-down`
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-right`
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.`triangle-left`
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.arrow
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.triangle
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.wedge
    - vegaDashTypingsLib.vegaDashTypingsLibStrings.stroke
    - java.lang.String
  */
  type SymbolShape = _SymbolShape | java.lang.String
  type SymbolShapeValueRef = ScaledValueRef[SymbolShape]
  type TextBaselineValueRef = ScaledValueRef[TextBaseline]
}
