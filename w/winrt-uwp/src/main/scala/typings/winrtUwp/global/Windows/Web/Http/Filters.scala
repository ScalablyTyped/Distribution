package typings.winrtUwp.global.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes to send HTTP requests and an interface to create filters to target HTTP and REST services in Windows Store apps. */
object Filters {
  
  /** The base protocol filter for an HttpClient instance. */
  @JSGlobal("Windows.Web.Http.Filters.HttpBaseProtocolFilter")
  @js.native
  /** Initializes a new instance of the HttpBaseProtocolFilter class. */
  class HttpBaseProtocolFilter ()
    extends typings.winrtUwp.Windows.Web.Http.Filters.HttpBaseProtocolFilter
  
  /** Provides control of the local HTTP cache for responses to HTTP requests by methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCacheControl")
  @js.native
  abstract class HttpCacheControl ()
    extends typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheControl
  
  /** Indicates if read requests by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces use the local HTTP cache for the response. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCacheReadBehavior")
  @js.native
  object HttpCacheReadBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.default with Double = js.native
    
    /* 1 */ val mostRecent: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.mostRecent with Double = js.native
    
    /* 2 */ val onlyFromCache: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.onlyFromCache with Double = js.native
  }
  
  /** Indicates if content returned by requests used by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces is written to the local HTTP cache. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCacheWriteBehavior")
  @js.native
  object HttpCacheWriteBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.default with Double = js.native
    
    /* 1 */ val noCache: typings.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.noCache with Double = js.native
  }
  
  /** Defines the cookie usage behavior that is used in the CookieUsageBehavior property. */
  @JSGlobal("Windows.Web.Http.Filters.HttpCookieUsageBehavior")
  @js.native
  object HttpCookieUsageBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.default with Double = js.native
    
    /* 1 */ val noCookies: typings.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.noCookies with Double = js.native
  }
}
