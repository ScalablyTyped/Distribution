package typings.vueRouter

import typings.std.ScrollBehavior
import typings.vueRouter.routerMod.Location
import typings.vueRouter.routerMod.Position
import typings.vueRouter.routerMod.Route
import typings.vueRouter.routerMod._PositionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Behavior extends _PositionResult {
    
    var behavior: js.UndefOr[ScrollBehavior] = js.native
    
    var offset: js.UndefOr[Position] = js.native
    
    var selector: String = js.native
  }
  object Behavior {
    
    @scala.inline
    def apply(selector: String): Behavior = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Behavior]
    }
    
    @scala.inline
    implicit class BehaviorMutableBuilder[Self <: Behavior] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: ScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      @scala.inline
      def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Href extends StObject {
    
    var href: String = js.native
    
    var location: Location = js.native
    
    // backwards compat
    var normalizedTo: Location = js.native
    
    var resolved: Route = js.native
    
    var route: Route = js.native
  }
  object Href {
    
    @scala.inline
    def apply(href: String, location: Location, normalizedTo: Location, resolved: Route, route: Route): Href = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], normalizedTo = normalizedTo.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Href]
    }
    
    @scala.inline
    implicit class HrefMutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizedTo(value: Location): Self = StObject.set(x, "normalizedTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: Route): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
