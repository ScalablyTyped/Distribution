package typings.wouter

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.wouter.anon.Children
import typings.wouter.anon.Href
import typings.wouter.anon.OmitAnchorHTMLAttributesH
import typings.wouter.anon.PartialRouterPropschildre
import typings.wouter.anon.To
import typings.wouter.matcherMod.DefaultParams
import typings.wouter.matcherMod.Match
import typings.wouter.matcherMod.MatcherFn
import typings.wouter.matcherMod.Params
import typings.wouter.wouterUseLocationMod.BaseLocationHook
import typings.wouter.wouterUseLocationMod.HookNavigationOptions
import typings.wouter.wouterUseLocationMod.HookReturnValue
import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wouter", "Link")
  @js.native
  def Link[H /* <: BaseLocationHook */](props: PropsWithChildren[LinkProps[H]]): ReactElement | Null = js.native
  @JSImport("wouter", "Link")
  @js.native
  def Link[H /* <: BaseLocationHook */](props: PropsWithChildren[LinkProps[H]], context: js.Any): ReactElement | Null = js.native
  
  @JSImport("wouter", "Redirect")
  @js.native
  def Redirect[H /* <: BaseLocationHook */](props: PropsWithChildren[RedirectProps[H]]): ReactElement | Null = js.native
  @JSImport("wouter", "Redirect")
  @js.native
  def Redirect[H /* <: BaseLocationHook */](props: PropsWithChildren[RedirectProps[H]], context: js.Any): ReactElement | Null = js.native
  
  @JSImport("wouter", "Route")
  @js.native
  def Route[T /* <: DefaultParams */](props: RouteProps[T]): ReactElement | Null = js.native
  
  @JSImport("wouter", "Router")
  @js.native
  val Router: FunctionComponent[PartialRouterPropschildre] = js.native
  
  @JSImport("wouter", "Switch")
  @js.native
  val Switch: FunctionComponent[SwitchProps] = js.native
  
  @JSImport("wouter", "useLocation")
  @js.native
  def useLocation[H /* <: BaseLocationHook */](): HookReturnValue[H] = js.native
  
  @JSImport("wouter", "useRoute")
  @js.native
  def useRoute[T /* <: DefaultParams */](pattern: Path): Match[T] = js.native
  
  @JSImport("wouter", "useRouter")
  @js.native
  def useRouter(): RouterProps = js.native
  
  type LinkProps[H /* <: BaseLocationHook */] = OmitAnchorHTMLAttributesH with NavigationalProps[H]
  
  type NavigationalProps[H /* <: BaseLocationHook */] = (Href | To) with HookNavigationOptions[H]
  
  type RedirectProps[H /* <: BaseLocationHook */] = NavigationalProps[H] with Children
  
  @js.native
  trait RouteComponentProps[T /* <: DefaultParams */] extends StObject {
    
    var params: T = js.native
  }
  object RouteComponentProps {
    
    @scala.inline
    def apply[T /* <: DefaultParams */](params: T): RouteComponentProps[T] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteComponentProps[T]]
    }
    
    @scala.inline
    implicit class RouteComponentPropsMutableBuilder[Self <: RouteComponentProps[_], T /* <: DefaultParams */] (val x: Self with RouteComponentProps[T]) extends AnyVal {
      
      @scala.inline
      def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteProps[T /* <: DefaultParams */] extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* params */ Params[T], ReactNode]) | ReactNode] = js.native
    
    var component: js.UndefOr[ComponentType[RouteComponentProps[T]]] = js.native
    
    var path: js.UndefOr[Path] = js.native
  }
  object RouteProps {
    
    @scala.inline
    def apply[T /* <: DefaultParams */](): RouteProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteProps[T]]
    }
    
    @scala.inline
    implicit class RoutePropsMutableBuilder[Self <: RouteProps[_], T /* <: DefaultParams */] (val x: Self with RouteProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Function1[/* params */ Params[T], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* params */ Params[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: ComponentType[RouteComponentProps[T]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait RouterProps extends StObject {
    
    var base: Path = js.native
    
    var hook: BaseLocationHook = js.native
    
    var matcher: MatcherFn = js.native
  }
  object RouterProps {
    
    @scala.inline
    def apply(
      base: Path,
      hook: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]],
      matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]
    ): RouterProps = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hook = js.Any.fromFunction1(hook), matcher = js.Any.fromFunction2(matcher))
      __obj.asInstanceOf[RouterProps]
    }
    
    @scala.inline
    implicit class RouterPropsMutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: Path): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHook(
        value: /* repeated */ js.Any => js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]]
      ): Self = StObject.set(x, "hook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SwitchProps extends StObject {
    
    var children: js.Array[ReactElement] = js.native
    
    var location: js.UndefOr[String] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(children: js.Array[ReactElement]): SwitchProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
