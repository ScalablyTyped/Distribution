package typings.typedoc

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.Record
import typings.std.StringConstructor
import typings.typedoc.anon.Dictk
import typings.typedoc.anon.DictkAdditionalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsValidationMod {
  
  @JSImport("typedoc/dist/lib/utils/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/utils/validation", "additionalProperties")
  @js.native
  val additionalProperties: js.Symbol = js.native
  
  inline def isTagString(x: Any): /* is / * template literal string: @${string} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: @${string} * / string */ Boolean]
  
  inline def optional(x: js.Array[String]): Optional_[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[js.Array[String]]]
  inline def optional(x: BooleanConstructor): Optional_[BooleanConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[BooleanConstructor]]
  inline def optional(x: NumberConstructor): Optional_[NumberConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[NumberConstructor]]
  inline def optional(x: StringConstructor): Optional_[StringConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[StringConstructor]]
  inline def optional[T /* <: (js.Tuple2[ArrayConstructor, Schema]) | Dictk | (js.Function1[/* x */ Any, /* is unknown */ Boolean]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in symbol ]: std.StringConstructor} */ js.Any) */](x: T): Optional_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[T]]
  
  inline def validate(schema: js.Array[String], obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.Array<string>> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.Array<string>> */ Boolean]
  inline def validate(schema: BooleanConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.BooleanConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.BooleanConstructor> */ Boolean]
  inline def validate(schema: NumberConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.NumberConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.NumberConstructor> */ Boolean]
  inline def validate(schema: StringConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.StringConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.StringConstructor> */ Boolean]
  inline def validate[T /* <: (js.Tuple2[ArrayConstructor, Schema]) | Dictk | (js.Function1[/* x */ Any, /* is unknown */ Boolean]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in symbol ]: std.StringConstructor} */ js.Any) */](schema: T, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<T> */ Boolean]
  
  type Guard[T] = js.Function1[/* x */ Any, /* is T */ Boolean]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends typedoc.typedoc/dist/lib/utils/validation.Optional<infer U> ? typedoc.typedoc/dist/lib/utils/validation.Infer<U> : T extends typedoc.typedoc/dist/lib/utils/validation.Guard<infer U> ? U : T extends std.StringConstructor ? string : T extends std.NumberConstructor ? number : T extends std.BooleanConstructor ? boolean : T extends std.Array<string> ? T[number] : T extends [std.ArrayConstructor, typedoc.typedoc/dist/lib/utils/validation.Schema] ? std.Array<typedoc.typedoc/dist/lib/utils/validation.Infer<T[1]>> : {-readonly [ K in typedoc.typedoc/dist/lib/utils/validation.OptionalKeys<T> ]:? typedoc.typedoc/dist/lib/utils/validation.Infer<std.Extract<T[K & keyof T], typedoc.typedoc/dist/lib/utils/validation.Schema>>} & {-readonly [ K in std.Exclude<keyof T, typedoc.typedoc/dist/lib/utils/validation.OptionalKeys<T> | symbol> ]: typedoc.typedoc/dist/lib/utils/validation.Infer<std.Extract<T[K], typedoc.typedoc/dist/lib/utils/validation.Schema>>}
    }}}
    */
  type Infer[T /* <: Schema */] = String
  
  type OptionalKeys[T] = /* keyof {[ K in keyof T as T[K] extends typedoc.typedoc/dist/lib/utils/validation.Optional<any>? K : never ]: 1} */ String
  
  type Optional_[T /* <: Schema */] = Record[js.Symbol, T]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Schema = std.StringConstructor | std.NumberConstructor | std.BooleanConstructor | std.Array<string> | [std.ArrayConstructor, typedoc.typedoc/dist/lib/utils/validation.Schema] | {readonly [k: string] : typedoc.typedoc/dist/lib/utils/validation.Schema, [additionalProperties] : boolean | undefined} | typedoc.typedoc/dist/lib/utils/validation.Guard<unknown> | typedoc.typedoc/dist/lib/utils/validation.Optional<std.StringConstructor> | typedoc.typedoc/dist/lib/utils/validation.Optional<std.NumberConstructor> | typedoc.typedoc/dist/lib/utils/validation.Optional<std.BooleanConstructor> | typedoc.typedoc/dist/lib/utils/validation.Optional<std.Array<string>> | typedoc.typedoc/dist/lib/utils/validation.Optional<[std.ArrayConstructor, typedoc.typedoc/dist/lib/utils/validation.Schema]> | typedoc.typedoc/dist/lib/utils/validation.Optional<{readonly [k: string] : typedoc.typedoc/dist/lib/utils/validation.Schema, [additionalProperties] : boolean | undefined}> | typedoc.typedoc/dist/lib/utils/validation.Optional<typedoc.typedoc/dist/lib/utils/validation.Guard<unknown>>
  }}}
  to avoid circular code involving: 
  - typedoc.typedoc/dist/lib/utils/validation.Schema
  */
  type Schema = StringConstructor | NumberConstructor | BooleanConstructor | js.Array[String] | (js.Tuple2[ArrayConstructor, Any]) | DictkAdditionalProperties | Guard[Any] | (Optional_[
    js.Array[String] | BooleanConstructor | DictkAdditionalProperties | Guard[Any] | NumberConstructor | StringConstructor | (js.Tuple2[ArrayConstructor, Any])
  ])
}
