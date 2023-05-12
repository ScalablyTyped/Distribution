package typings.vueRuntimeCore.mod

import typings.std.Omit
import typings.std.Record
import typings.vueRuntimeCore.vueRuntimeCoreStrings.expose
import typings.vueShared.mod.IfAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionalComponent[P, E /* <: EmitsOptions */, S /* <: Record[String, Any] */]
  extends StObject
     with ComponentInternalOptions {
  
  def apply(props: P, ctx: Omit[SetupContext[E, IfAny[S, js.Object, SlotsType[S]]], expose]): Any = js.native
  
  var compatConfig: js.UndefOr[CompatConfig] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var emits: js.UndefOr[E | (js.Array[/* keyof E */ String])] = js.native
  
  var inheritAttrs: js.UndefOr[Boolean] = js.native
  
  var props: js.UndefOr[ComponentPropsOptions[P]] = js.native
  
  var slots: js.UndefOr[IfAny[S, Slots, SlotsType[S]]] = js.native
}
