package typings.vanillaSwipe

import typings.vanillaSwipe.anon.Passive
import typings.vanillaSwipe.anon.PassiveUndefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetOptionsMod {
  
  @JSImport("vanilla-swipe/lib/utils/getOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptions(): Passive | PassiveUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[Passive | PassiveUndefined]
  inline def getOptions(isPassiveSupported: Boolean): Passive | PassiveUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(isPassiveSupported.asInstanceOf[js.Any]).asInstanceOf[Passive | PassiveUndefined]
}
