package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes[T /* <: typings.tabris.AnonJsxAttributes */] = /* import warning: importer.ImportType#apply Failed type conversion: T['jsxAttributes'] */ js.Any
  type BoxDimensions = scala.Double | java.lang.String | (js.Tuple4[
    scala.Double, 
    js.UndefOr[scala.Double], 
    js.UndefOr[scala.Double], 
    js.UndefOr[scala.Double]
  ]) | typings.tabris.AnonBottom
  type ColorArray = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double])
  /* Rewritten from type alias, can be one of: 
    - typings.tabris.mod.ColorLikeObject
    - typings.tabris.mod.ColorArray
    - java.lang.String
    - typings.tabris.tabrisStrings.initial
    - scala.Null
  */
  type ColorValue = typings.tabris.mod._ColorValue | typings.tabris.mod.ColorArray | java.lang.String | scala.Null
  type ConstraintArray = js.Tuple2[
    typings.tabris.mod.SiblingReferenceValue | typings.tabris.mod.PercentValue, 
    typings.tabris.mod.Offset
  ]
  type ConstraintArrayValue = js.Tuple2[
    typings.tabris.mod.SiblingReference | typings.tabris.mod.PercentValue, 
    typings.tabris.mod.Offset
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.tabris.mod.Constraint
    - typings.tabris.mod.ConstraintArrayValue
    - typings.tabris.mod.ConstraintLikeObject
    - typings.tabris.mod.Offset
    - typings.tabris.mod.PercentValue
    - typings.tabris.mod.SiblingReferenceValue
    - typings.tabris.tabrisBooleans.`true`
  */
  type ConstraintValue = typings.tabris.mod._ConstraintValue | typings.tabris.mod.ConstraintArrayValue | typings.tabris.mod.Offset | typings.tabris.mod.PercentValue | typings.tabris.mod.SiblingReferenceValue
  type Diff[T, U] = T
  type Dimension = scala.Double
  type ExtendedEvent[EventData, Target] = typings.tabris.mod.EventObject[Target] with EventData
  type Flatten[T] = js.UndefOr[T | js.Array[T]]
  /* Rewritten from type alias, can be one of: 
    - typings.tabris.mod.FontLikeObject
    - java.lang.String
    - typings.tabris.tabrisStrings.initial
    - scala.Null
  */
  type FontValue = typings.tabris.mod._FontValue | java.lang.String | scala.Null
  type IfEquals[X, Y, A, B] = B | A
  /* Rewritten from type alias, can be one of: 
    - typings.tabris.mod.ImageLikeObject
    - typings.tabris.mod.Image
    - java.lang.String
    - typings.tabris.mod.ImageBitmap
    - typings.tabris.Blob
    - scala.Null
  */
  type ImageValue = typings.tabris.mod._ImageValue | java.lang.String | scala.Null
  type JSXAttributes[T /* <: typings.tabris.AnonJsxAttributes */, U] = (typings.tabris.mod.Properties[U, typings.tabris.mod.Omit[U, typings.tabris.tabrisStrings.set]]) with typings.tabris.mod.ListenersMap[U] with typings.tabris.mod.JSXShorthands[U]
  type JSXChildren[T /* <: typings.tabris.mod.Widget */] = js.UndefOr[
    T | typings.tabris.mod.WidgetCollection[T] | (js.Array[T | typings.tabris.mod.WidgetCollection[T]])
  ]
  type JSXShorthands[T] = js.Object | typings.tabris.AnonCenter
  /* Rewritten from type alias, can be one of: 
    - typings.tabris.mod.LinearGradientLikeObject
    - java.lang.String
    - typings.tabris.tabrisStrings.initial
    - scala.Null
  */
  type LinearGradientValue = typings.tabris.mod._LinearGradientValue | java.lang.String | scala.Null
  type Listener[T] = js.Function1[/* ev */ typings.tabris.mod.ExtendedEvent[T, js.Object], js.Any]
  type ListenersKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends tabris.tabris.Listeners<any>? K : never}[keyof T] */ js.Any
  type ListenersMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in tabris.tabris.ListenersKeysOf<T> ]:? tabris.tabris.UnpackListeners<T[Key]>}
    */ typings.tabris.tabrisStrings.ListenersMap with org.scalablytyped.runtime.TopLevel[T]
  type ListenersTriggerParam[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in tabris.tabris.Diff<keyof T, keyof tabris.tabris.EventObject<object>> ]: T[P]}
    */ typings.tabris.tabrisStrings.ListenersTriggerParam with org.scalablytyped.runtime.TopLevel[T]
  type MethodKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type ModuleLoader = js.Function5[
    /* module */ typings.tabris.mod.Module, 
    /* exports */ js.Object, 
    /* require */ js.Function1[/* fn */ java.lang.String, js.Object], 
    /* __filename */ java.lang.String, 
    /* __dirname */ java.lang.String, 
    scala.Unit
  ]
  type NextString = typings.tabris.tabrisStrings.nextLeftparenthesisRightparenthesis
  type Offset = scala.Double
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type ParamType[T /* <: js.Function1[/* arg */ js.Any, _] */] = js.Any
  type PercentValue = java.lang.String | typings.tabris.mod.PercentLikeObject
  type PrevString = typings.tabris.tabrisStrings.prevLeftparenthesisRightparenthesis
  type Properties[T /* <: typings.tabris.AnonSet */, U] = (typings.std.Partial[
    typings.tabris.mod.Omit[U, typings.tabris.mod.MethodKeysOf[U] | typings.tabris.mod.ReadOnlyKeysOf[U]]
  ]) with js.Object
  type ReadOnly[T /* <: /* keyof any */ java.lang.String */] = typings.std.Partial[typings.std.Record[T, scala.Nothing]]
  type ReadOnlyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: tabris.tabris.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  type SFC[T] = js.Function2[/* attributes */ js.Object | scala.Null, /* children */ js.Array[js.Any], T]
  type Selector[Candidate /* <: typings.tabris.mod.Widget */, Result /* <: Candidate */] = typings.tabris.mod.SelectorString | typings.tabris.mod.SelectorFunction[Candidate] | typings.tabris.mod.Constructor[Result] | typings.tabris.mod.SFC[Result]
  type SelectorFunction[Candidate /* <: typings.tabris.mod.Widget */] = js.Function3[
    /* widget */ Candidate, 
    /* index */ scala.Double, 
    /* collection */ typings.tabris.mod.WidgetCollection[Candidate], 
    scala.Boolean
  ]
  type SelectorString = java.lang.String
  type SiblingReference = typings.tabris.mod.Widget | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next */ js.Any) | typings.tabris.mod.SelectorString
  type SiblingReferenceValue = typings.tabris.mod.Widget | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next */ js.Any) | typings.tabris.mod.SelectorString
  type TargetType[E /* <: js.Object */] = js.Any
  type UnpackListeners[T] = T | typings.tabris.mod.Listener[js.Any]
}
