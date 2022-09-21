package typings.sugar.sugarjs

import typings.std.BooleanConstructor
import typings.std.ErrorConstructor
import typings.std.FunctionConstructor
import typings.sugar.sugarjs.Array.Chainable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.sugar.ArrayConstructor
  - typings.sugar.DateConstructor
  - typings.std.FunctionConstructor
  - typings.sugar.NumberConstructor
  - typings.sugar.ObjectConstructor
  - typings.sugar.RegExpConstructor
  - typings.sugar.StringConstructor
  - typings.std.BooleanConstructor
  - typings.std.ErrorConstructor
*/
type NativeConstructor = _NativeConstructor | FunctionConstructor | BooleanConstructor | ErrorConstructor

type SugarDefaultChainable[RawValue] = (Chainable[Any, RawValue]) & typings.sugar.sugarjs.Date.Chainable[RawValue] & typings.sugar.sugarjs.Function.Chainable[RawValue] & typings.sugar.sugarjs.Number.Chainable[RawValue] & typings.sugar.sugarjs.Object.Chainable[RawValue] & typings.sugar.sugarjs.RegExp.Chainable[RawValue] & typings.sugar.sugarjs.String.Chainable[RawValue]
