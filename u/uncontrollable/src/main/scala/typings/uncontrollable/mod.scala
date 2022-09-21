package typings.uncontrollable

import typings.std.Omit
import typings.uncontrollable.hookMod.ConfigMap
import typings.uncontrollable.hookMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uncontrollable/lib/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useUncontrolled[TProps /* <: js.Object */, TDefaults /* <: String */](props: TProps, config: ConfigMap[TProps]): Omit[TProps, TDefaults] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolled")(props.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Omit[TProps, TDefaults]]
  
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](): js.Tuple2[js.UndefOr[TProp], THandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")().asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: Unit, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: Unit, defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: Unit, defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
  inline def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: Unit, defaultValue: Unit, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUncontrolledProp")(propValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[TProp], THandler]]
}
