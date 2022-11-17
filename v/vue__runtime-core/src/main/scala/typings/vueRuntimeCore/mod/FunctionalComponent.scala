package typings.vueRuntimeCore.mod

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionalComponent[P, E /* <: EmitsOptions */]
  extends StObject
     with ComponentInternalOptions {
  
  @JSName("<apply>")
  @scala.annotation.targetName("apply_expose")
  def apply(props: P, ctx: Omit[SetupContext[E], "expose"]): Any = js.native
  
  var compatConfig: js.UndefOr[CompatConfig] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var emits: js.UndefOr[E | (js.Array[/* keyof E */ String])] = js.native
  
  var inheritAttrs: js.UndefOr[Boolean] = js.native
  
  var props: js.UndefOr[ComponentPropsOptions[P]] = js.native
}
