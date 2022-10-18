package typings.vegaTypings.typesSpecEncodeMod

import typings.vegaTypings.anon.Exponent
import typings.vegaTypings.anon.Test
import typings.vegaTypings.anon.exponentnumberNumericValu
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecConfigMod.StrokeCap
import typings.vegaTypings.typesSpecTitleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlignValueRef = ScaledValueRef[Align]

type AnchorValueRef = ScaledValueRef[TitleAnchor]

type ArbitraryValueRef = NumericValueRef | ColorValueRef | ScaledValueRef[Any]

type ArrayValueRef = ScaledValueRef[js.Array[Any]]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - typings.vegaTypings.vegaTypingsStrings.multiply
  - typings.vegaTypings.vegaTypingsStrings.screen
  - typings.vegaTypings.vegaTypingsStrings.overlay
  - typings.vegaTypings.vegaTypingsStrings.darken
  - typings.vegaTypings.vegaTypingsStrings.lighten
  - typings.vegaTypings.vegaTypingsStrings.`color-dodge`
  - typings.vegaTypings.vegaTypingsStrings.`color-burn`
  - typings.vegaTypings.vegaTypingsStrings.`hard-light`
  - typings.vegaTypings.vegaTypingsStrings.`soft-light`
  - typings.vegaTypings.vegaTypingsStrings.difference
  - typings.vegaTypings.vegaTypingsStrings.exclusion
  - typings.vegaTypings.vegaTypingsStrings.hue
  - typings.vegaTypings.vegaTypingsStrings.saturation
  - typings.vegaTypings.vegaTypingsStrings.color
  - typings.vegaTypings.vegaTypingsStrings.luminosity
*/
type Blend = _Blend | Null

type BooleanValueRef = ScaledValueRef[Boolean]

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef[typings.vegaTypings.typesSpecColorMod.Color]
  - typings.vegaTypings.anon.`0`
  - typings.vegaTypings.anon.Count
  - typings.vegaTypings.anon.Color
*/
type ColorValueRef = _ColorValueRef | ScaledValueRef[Color]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.vegaTypings.typesSpecSignalMod.SignalRef
  - typings.vegaTypings.typesSpecEncodeMod.DatumFieldRef
  - typings.vegaTypings.typesSpecEncodeMod.GroupFieldRef
  - typings.vegaTypings.typesSpecEncodeMod.ParentFieldRef
*/
type Field = _Field | String

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.normal
  - typings.vegaTypings.vegaTypingsStrings.italic
  - typings.vegaTypings.vegaTypingsStrings.oblique
  - java.lang.String
*/
type FontStyle = _FontStyle | String

type FontStyleValueRef = ScaledValueRef[FontStyle]

type FontWeightValueRef = ScaledValueRef[FontWeight]

type NumericValueRef = (ScaledValueRef[Double] & Exponent) | exponentnumberNumericValu

type OrientValueRef = ScaledValueRef[Orient]

type ProductionRule[T] = T | (js.Array[Test & T])

type RuleEncodeEntry = EncodeEntry

type StringValueRef = ScaledValueRef[String]

type StrokeCapValueRef = ScaledValueRef[StrokeCap]

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
type SymbolShape = _SymbolShape | String

type SymbolShapeValueRef = ScaledValueRef[SymbolShape]

type Text = String | js.Array[String]

type TextBaselineValueRef = ScaledValueRef[TextBaseline]

type TextValueRef = ScaledValueRef[Text]
