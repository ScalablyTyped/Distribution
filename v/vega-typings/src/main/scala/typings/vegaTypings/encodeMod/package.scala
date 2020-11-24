package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object encodeMod {
  
  type AlignValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.Align]
  
  type AnchorValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.titleMod.TitleAnchor]
  
  type ArbitraryValueRef = typings.vegaTypings.encodeMod.NumericValueRef | typings.vegaTypings.encodeMod.ColorValueRef | typings.vegaTypings.encodeMod.ScaledValueRef[js.Any]
  
  type ArrayValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[js.Array[js.Any]]
  
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
  type Blend = typings.vegaTypings.encodeMod._Blend | scala.Null
  
  type BooleanValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[scala.Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.colorMod.Color]
    - typings.vegaTypings.anon.`0`
    - typings.vegaTypings.anon.Count
    - typings.vegaTypings.anon.Color
  */
  type ColorValueRef = typings.vegaTypings.encodeMod._ColorValueRef | typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.colorMod.Color]
  
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
  
  type NumericValueRef = (typings.vegaTypings.encodeMod.ScaledValueRef[scala.Double] | js.Object) with typings.vegaTypings.anon.Exponent
  
  type OrientValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.encodeMod.Orient]
  
  type ProductionRule[T] = T | (js.Array[typings.vegaTypings.anon.Test with T])
  
  type RuleEncodeEntry = typings.vegaTypings.encodeMod.EncodeEntry
  
  type StringValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[java.lang.String]
  
  type StrokeCapValueRef = typings.vegaTypings.encodeMod.ScaledValueRef[typings.vegaTypings.configMod.StrokeCap]
  
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
