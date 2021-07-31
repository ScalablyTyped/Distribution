package typings.uirouterCore

import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.urlConfigMod.UrlConfig
import typings.uirouterCore.urlInterfaceMod.MatchResult
import typings.uirouterCore.urlInterfaceMod.UrlParts
import typings.uirouterCore.urlInterfaceMod.UrlSyncApi
import typings.uirouterCore.urlRulesMod.UrlRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlServiceMod {
  
  @JSImport("@uirouter/core/lib/url/urlService", "UrlService")
  @js.native
  class UrlService protected ()
    extends StObject
       with LocationServices
       with UrlSyncApi {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
    
    /** @internal */ var _stopListeningFn: js.Any = js.native
    
    /**
      * The nested [[UrlConfig]] API to configure the URL and retrieve URL information
      *
      * See: [[UrlConfig]] for details
      */
    var config: UrlConfig = js.native
    
    /** See: [[UrlService.deferIntercept]] */ /* CompleteClass */
    override def deferIntercept(): Unit = js.native
    /* CompleteClass */
    override def deferIntercept(defer: Boolean): Unit = js.native
    /** See: [[UrlService.deferIntercept]] */ /* CompleteClass */
    @JSName("deferIntercept")
    var deferIntercept_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) & (js.Function1[/* defer */ js.UndefOr[Boolean], Unit]) = js.native
    
    /** @internal */ var interceptDeferred: Boolean = js.native
    
    /** See: [[UrlService.listen]] */ /* CompleteClass */
    override def listen(): js.Function = js.native
    /* CompleteClass */
    override def listen(enabled: Boolean): js.Function = js.native
    /** See: [[UrlService.listen]] */ /* CompleteClass */
    @JSName("listen")
    var listen_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) & (js.Function1[/* enabled */ js.UndefOr[Boolean], js.Function]) = js.native
    
    /**
      * Matches a URL
      *
      * Given a URL (as a [[UrlParts]] object), check all rules and determine the best matching rule.
      * Return the result as a [[MatchResult]].
      */
    def `match`(url: UrlParts): MatchResult = js.native
    
    /**
      * Gets the current URL parts
      *
      * This method returns the different parts of the current URL (the [[path]], [[search]], and [[hash]]) as a [[UrlParts]] object.
      */
    def parts(): UrlParts = js.native
    
    var router: js.Any = js.native
    
    /**
      * The nested [[UrlRules]] API for managing URL rules and rewrites
      *
      * See: [[UrlRules]] for details
      */
    var rules: UrlRules = js.native
    
    /** See: [[UrlService.sync]] */ /* CompleteClass */
    override def sync(): Unit = js.native
    /* CompleteClass */
    override def sync(evt: js.Any): Unit = js.native
    /** See: [[UrlService.sync]] */ /* CompleteClass */
    @JSName("sync")
    var sync_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) & (js.Function1[/* evt */ js.UndefOr[js.Any], Unit]) = js.native
  }
}
