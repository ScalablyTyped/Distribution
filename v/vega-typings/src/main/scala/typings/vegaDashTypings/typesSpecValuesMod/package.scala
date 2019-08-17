package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecValuesMod {
  import typings.vegaDashTypings.typesSpecEncodeMod.Align
  import typings.vegaDashTypings.typesSpecEncodeMod.AlignValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.AnchorValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.ArrayValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.BooleanValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.ColorValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.FontStyle
  import typings.vegaDashTypings.typesSpecEncodeMod.FontStyleValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.FontWeight
  import typings.vegaDashTypings.typesSpecEncodeMod.FontWeightValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.NumericValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.Orient
  import typings.vegaDashTypings.typesSpecEncodeMod.OrientValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.StringValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.SymbolShape
  import typings.vegaDashTypings.typesSpecEncodeMod.SymbolShapeValueRef
  import typings.vegaDashTypings.typesSpecEncodeMod.TextBaseline
  import typings.vegaDashTypings.typesSpecEncodeMod.TextBaselineValueRef
  import typings.vegaDashTypings.typesSpecTitleMod.TitleAnchor

  type AlignValue = Align | AlignValueRef
  type AnchorValue = TitleAnchor | AnchorValueRef
  type BooleanValue = Boolean | BooleanValueRef
  type ColorValue = Null | String | ColorValueRef
  type DashArrayValue = js.Array[Double] | ArrayValueRef
  type FontStyleValue = FontStyle | FontStyleValueRef
  type FontWeightValue = FontWeight | FontWeightValueRef
  type NumberValue = Double | NumericValueRef
  type OrientValue = Orient | OrientValueRef
  type StringValue = String | StringValueRef
  type SymbolShapeValue = SymbolShape | SymbolShapeValueRef
  type TextBaselineValue = TextBaseline | TextBaselineValueRef
}
