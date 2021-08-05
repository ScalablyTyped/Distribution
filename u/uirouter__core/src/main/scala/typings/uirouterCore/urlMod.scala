package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@uirouter/core/lib/hooks/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerUpdateUrl(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerUpdateUrl")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
