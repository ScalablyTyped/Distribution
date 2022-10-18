package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  [T] extends [null] ? any : [T] extends [{  type :null | true}] ? any : [T] extends [std.ObjectConstructor | {readonly type (): any, readonly type (value : any): any,   type :std.ObjectConstructor}] ? std.Record<string, any> : [T] extends [std.BooleanConstructor | {readonly type <T>(): boolean, readonly type <T>(value : T): boolean,   type :std.BooleanConstructor}] ? boolean : [T] extends [std.DateConstructor | {readonly type (): string,   type :std.DateConstructor}] ? std.Date : [T] extends [std.Array<infer U> | {  type :std.Array<infer U>}] ? U extends std.DateConstructor ? std.Date | @vue/runtime-core.@vue/runtime-core.InferPropType<U> : @vue/runtime-core.@vue/runtime-core.InferPropType<U> : [T] extends [@vue/runtime-core.@vue/runtime-core.Prop<infer V, infer D>] ? unknown extends V ? @vue/shared.@vue/shared.IfAny<V, V, D> : V : T
  }}}
  */
@js.native
trait InferPropType[T] extends StObject
