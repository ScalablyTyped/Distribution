package typings.vanillaSwipe

import typings.vanillaSwipe.anon.IsSwiping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInitialStateMod {
  
  @JSImport("vanilla-swipe/lib/utils/getInitialState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitialState(): IsSwiping = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialState")().asInstanceOf[IsSwiping]
  inline def getInitialState(options: js.Object): IsSwiping = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialState")(options.asInstanceOf[js.Any]).asInstanceOf[IsSwiping]
}
