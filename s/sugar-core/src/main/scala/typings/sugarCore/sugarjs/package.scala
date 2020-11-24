package typings.sugarCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sugarjs {
  
  type NativeConstructor = typings.std.ArrayConstructor | typings.std.DateConstructor | typings.std.FunctionConstructor | typings.std.NumberConstructor | typings.std.ObjectConstructor | typings.std.RegExpConstructor | typings.std.StringConstructor | typings.std.BooleanConstructor | typings.std.ErrorConstructor
  
  type SugarDefaultChainable[RawValue] = (typings.sugarCore.sugarjs.Array.Chainable[_, RawValue]) with typings.sugarCore.sugarjs.Date.Chainable[RawValue] with typings.sugarCore.sugarjs.Function.Chainable[RawValue] with typings.sugarCore.sugarjs.Number.Chainable[RawValue] with typings.sugarCore.sugarjs.Object.Chainable[RawValue] with typings.sugarCore.sugarjs.RegExp.Chainable[RawValue] with typings.sugarCore.sugarjs.String.Chainable[RawValue]
}
