package typings.wouter

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactPortal
import typings.wouter.anon.Children
import typings.wouter.anon.Href
import typings.wouter.anon.OmitAnchorHTMLAttributesH
import typings.wouter.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Link[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */](props: PropsWithChildren[LinkProps[H]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def Link[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */](props: PropsWithChildren[LinkProps[H]], context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def Redirect[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */](props: PropsWithChildren[RedirectProps[H]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Redirect")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def Redirect[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */](props: PropsWithChildren[RedirectProps[H]], context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("Redirect")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def Route[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */](props: RouteProps[T]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("wouter", "Router")
  @js.native
  val Router: FunctionComponent[RouterProps] = js.native
  
  @JSImport("wouter", "Switch")
  @js.native
  val Switch: FunctionComponent[SwitchProps] = js.native
  
  inline def useLocation[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Any]
  
  inline def useRoute[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoute")(pattern.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useRouter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[Any]
  
  type LinkProps[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */] = OmitAnchorHTMLAttributesH & NavigationalProps[H]
  
  type NavigationalProps[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */] = (Href & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HookNavigationOptions<H> */ Any)) | (To & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HookNavigationOptions<H> */ Any))
  
  // React <18 only: fixes incorrect `ReactNode` declaration that had `{}` in the union.
  // This issue has been fixed in React 18 type declaration.
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/56210
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReactNode = react.react.ReactChild | std.Iterable<wouter.wouter.ReactNode> | react.react.ReactPortal | boolean | null | undefined
  }}}
  to avoid circular code involving: 
  - wouter.wouter.ReactNode
  */
  type ReactNode = js.UndefOr[ReactChild | js.Iterable[Any] | ReactPortal | Boolean | Null]
  
  type RedirectProps[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */] = NavigationalProps[H] & Children
  
  trait RouteComponentProps[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */] extends StObject {
    
    var params: T
  }
  object RouteComponentProps {
    
    inline def apply[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */](params: T): RouteComponentProps[T] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteComponentProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteComponentProps[?], T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */] (val x: Self & RouteComponentProps[T]) extends AnyVal {
      
      inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteProps[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */] extends StObject {
    
    var children: js.UndefOr[
        (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Params<T> */ /* params */ Any, 
          ReactNode
        ]) | ReactNode
      ] = js.undefined
    
    var component: js.UndefOr[ComponentType[RouteComponentProps[T]]] = js.undefined
    
    var path: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.undefined
  }
  object RouteProps {
    
    inline def apply[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */](): RouteProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteProps[?], T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */] (val x: Self & RouteProps[T]) extends AnyVal {
      
      inline def setChildren(
        value: (js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Params<T> */ /* params */ Any, 
              ReactNode
            ]) | ReactNode
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Params<T> */ /* params */ Any => ReactNode
      ): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: ComponentType[RouteComponentProps[T]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setPath(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterOptions * / any */ trait RouterProps extends StObject {
    
    var children: ReactNode
  }
  object RouterProps {
    
    inline def apply(): RouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait SwitchProps extends StObject {
    
    var children: ReactNode
    
    var location: js.UndefOr[String] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
