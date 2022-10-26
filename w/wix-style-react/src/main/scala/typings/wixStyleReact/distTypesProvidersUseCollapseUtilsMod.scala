package typings.wixStyleReact

import typings.react.mod.Dispatch
import typings.react.mod.RefObject
import typings.react.mod.SetStateAction
import typings.std.HTMLElement
import typings.wixStyleReact.anon.`20`
import typings.wixStyleReact.distTypesProvidersUseCollapseTypesMod.AssignableRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUseCollapseUtilsMod {
  
  @JSImport("wix-style-react/dist/types/providers/useCollapse/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignRef[RefValueType](ref: Null, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assignRef[RefValueType](ref: Unit, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assignRef[RefValueType](ref: AssignableRef[RefValueType], value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callAll(fns: AnyFunction*): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("callAll")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def getAutoHeightDuration(height: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoHeightDuration")(height.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getAutoHeightDuration(height: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoHeightDuration")(height.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getElementHeight(el: RefObject[HTMLElement]): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementHeight")(el.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def getElementHeight(el: `20`): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementHeight")(el.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def mergeRefs[RefValueType](refs: (js.UndefOr[AssignableRef[RefValueType] | Null])*): (js.Function1[/* node */ Any, Unit]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[(js.Function1[/* node */ Any, Unit]) | Null]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def useControlledState(): js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")().asInstanceOf[js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]]]
  inline def useControlledState(isExpanded: Boolean): js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(isExpanded.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]]]
  inline def useControlledState(isExpanded: Boolean, defaultExpanded: Boolean): js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(isExpanded.asInstanceOf[js.Any], defaultExpanded.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]]]
  inline def useControlledState(isExpanded: Unit, defaultExpanded: Boolean): js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(isExpanded.asInstanceOf[js.Any], defaultExpanded.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Dispatch[SetStateAction[Boolean]]]]
  
  inline def useEffectAfterMount(cb: js.Function0[Unit], dependencies: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffectAfterMount")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useUniqueId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUniqueId")().asInstanceOf[js.UndefOr[String]]
  inline def useUniqueId(idFromProps: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUniqueId")(idFromProps.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
