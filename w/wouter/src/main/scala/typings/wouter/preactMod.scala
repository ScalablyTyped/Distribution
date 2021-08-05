package typings.wouter

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentType
import typings.preact.mod.FunctionComponent
import typings.preact.mod.VNode
import typings.wouter.anon.Children
import typings.wouter.anon.HrefPath
import typings.wouter.anon.HrefTo
import typings.wouter.anon.OmitHTMLAttributesEventTa
import typings.wouter.anon.PartialRouterPropschildreBase
import typings.wouter.preactMatcherMod.DefaultParams
import typings.wouter.preactMatcherMod.Match
import typings.wouter.preactMatcherMod.MatcherFn
import typings.wouter.preactMatcherMod.Params
import typings.wouter.useLocationMod.BaseLocationHook
import typings.wouter.useLocationMod.HookNavigationOptions
import typings.wouter.useLocationMod.HookReturnValue
import typings.wouter.useLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preactMod {
  
  @JSImport("wouter/preact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Link[H /* <: BaseLocationHook */](props: LinkProps[H]): VNode[js.Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any]).asInstanceOf[VNode[js.Any] | Null]
  
  inline def Redirect[H /* <: BaseLocationHook */](props: RedirectProps[H]): VNode[js.Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Redirect")(props.asInstanceOf[js.Any]).asInstanceOf[VNode[js.Any] | Null]
  
  inline def Route[T /* <: DefaultParams */](props: RouteProps[T]): VNode[js.Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(props.asInstanceOf[js.Any]).asInstanceOf[VNode[js.Any] | Null]
  
  @JSImport("wouter/preact", "Router")
  @js.native
  val Router: FunctionComponent[PartialRouterPropschildreBase] = js.native
  
  @JSImport("wouter/preact", "Switch")
  @js.native
  val Switch: FunctionComponent[SwitchProps] = js.native
  
  inline def useLocation[H /* <: BaseLocationHook */](): HookReturnValue[H] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[HookReturnValue[H]]
  
  inline def useRoute[T /* <: DefaultParams */](pattern: Path): Match[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoute")(pattern.asInstanceOf[js.Any]).asInstanceOf[Match[T]]
  
  inline def useRouter(): RouterProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[RouterProps]
  
  type LinkProps[H /* <: BaseLocationHook */] = OmitHTMLAttributesEventTa & NavigationalProps[H]
  
  type NavigationalProps[H /* <: BaseLocationHook */] = (HrefTo | HrefPath) & HookNavigationOptions[H]
  
  type RedirectProps[H /* <: BaseLocationHook */] = NavigationalProps[H] & Children
  
  trait RouteComponentProps[T /* <: DefaultParams */] extends StObject {
    
    var params: T
  }
  object RouteComponentProps {
    
    inline def apply[T /* <: DefaultParams */](params: T): RouteComponentProps[T] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteComponentProps[T]]
    }
    
    extension [Self <: RouteComponentProps[?], T /* <: DefaultParams */](x: Self & RouteComponentProps[T]) {
      
      inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteProps[T /* <: DefaultParams */] extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* params */ Params[T], ComponentChildren]) | ComponentChildren] = js.undefined
    
    var component: js.UndefOr[ComponentType[RouteComponentProps[T]]] = js.undefined
    
    var path: js.UndefOr[Path] = js.undefined
  }
  object RouteProps {
    
    inline def apply[T /* <: DefaultParams */](): RouteProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteProps[T]]
    }
    
    extension [Self <: RouteProps[?], T /* <: DefaultParams */](x: Self & RouteProps[T]) {
      
      inline def setChildren(value: (js.Function1[/* params */ Params[T], ComponentChildren]) | ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* params */ Params[T] => ComponentChildren): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setComponent(value: ComponentType[RouteComponentProps[T]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait RouterProps extends StObject {
    
    var base: Path
    
    var hook: BaseLocationHook
    
    var matcher: MatcherFn
  }
  object RouterProps {
    
    inline def apply(
      base: Path,
      hook: BaseLocationHook,
      matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]
    ): RouterProps = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], matcher = js.Any.fromFunction2(matcher))
      __obj.asInstanceOf[RouterProps]
    }
    
    extension [Self <: RouterProps](x: Self) {
      
      inline def setBase(value: Path): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setHook(value: BaseLocationHook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      inline def setMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
    }
  }
  
  trait SwitchProps extends StObject {
    
    var children: js.Array[VNode[RouteProps[DefaultParams]]]
    
    var location: js.UndefOr[String] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(children: js.Array[VNode[RouteProps[DefaultParams]]]): SwitchProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setChildren(value: js.Array[VNode[RouteProps[DefaultParams]]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: VNode[RouteProps[DefaultParams]]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
