package typings.uncontrollable

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsHookMod {
  
  @JSImport("uncontrollable/lib/cjs/hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps /* <: js.Object */, TDefaults /* <: String */](props: TProps, config: ConfigMap[TProps]): Omit[TProps, TDefaults] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Omit[TProps, TDefaults]]
  
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](): js.Tuple2[js.UndefOr[TProp], THandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")().asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: Unit, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: Unit, defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: Unit, defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: Unit, defaultValue: Unit, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  
  type AllowedNames[Base, Condition] = /* import warning: importer.ImportType#apply Failed type conversion: uncontrollable.uncontrollable/lib/cjs/hook.FilterFlags<Base, Condition>[keyof Base] */ js.Any
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ p in keyof TProps ]:? uncontrollable.uncontrollable/lib/cjs/hook.AllowedNames<TProps, std.Function>}
    }}}
    */
  @js.native
  trait ConfigMap[TProps /* <: js.Object */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof Base ]: std.NonNullable<Base[Key]> extends Condition? Key : never}
    }}}
    */
  @js.native
  trait FilterFlags[Base, Condition] extends StObject
  
  @js.native
  trait Handler extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
