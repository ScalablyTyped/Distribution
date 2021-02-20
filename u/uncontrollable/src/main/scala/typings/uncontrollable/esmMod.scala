package typings.uncontrollable

import typings.std.Omit
import typings.uncontrollable.esmHookMod.ConfigMap
import typings.uncontrollable.esmHookMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("uncontrollable/esm", "useUncontrolled")
  @js.native
  def useUncontrolled[TProps /* <: js.Object */, TDefaults /* <: String */](props: TProps, config: ConfigMap[TProps]): Omit[TProps, TDefaults] = js.native
  
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: js.UndefOr[scala.Nothing], handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/esm", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: js.UndefOr[scala.Nothing], handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
}
