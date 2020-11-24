package typings.vegaTypings

import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.AlignValueRef
import typings.vegaTypings.encodeMod.AnchorValueRef
import typings.vegaTypings.encodeMod.ArrayValueRef
import typings.vegaTypings.encodeMod.BooleanValueRef
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontStyleValueRef
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.encodeMod.FontWeightValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.Orient
import typings.vegaTypings.encodeMod.OrientValueRef
import typings.vegaTypings.encodeMod.StringValueRef
import typings.vegaTypings.encodeMod.StrokeCapValueRef
import typings.vegaTypings.encodeMod.SymbolShape
import typings.vegaTypings.encodeMod.SymbolShapeValueRef
import typings.vegaTypings.encodeMod.TextBaseline
import typings.vegaTypings.encodeMod.TextBaselineValueRef
import typings.vegaTypings.titleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/spec/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  
  type AlignValue = Align | AlignValueRef
  
  type AnchorValue = TitleAnchor | AnchorValueRef
  
  type BooleanValue = Boolean | BooleanValueRef
  
  type ColorValue = Null | Color | ColorValueRef
  
  type DashArrayValue = js.Array[Double] | ArrayValueRef
  
  type FontStyleValue = FontStyle | FontStyleValueRef
  
  type FontWeightValue = FontWeight | FontWeightValueRef
  
  type NumberValue = Double | NumericValueRef
  
  type OrientValue = Orient | OrientValueRef
  
  type StringValue = String | StringValueRef
  
  type StrokeCapValue = StrokeCap | StrokeCapValueRef
  
  type SymbolShapeValue = SymbolShape | SymbolShapeValueRef
  
  type TextBaselineValue = TextBaseline | TextBaselineValueRef
}
