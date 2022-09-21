package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationDirection extends StObject
@JSImport("vue-router", "NavigationDirection")
@js.native
object NavigationDirection extends StObject {
  
  @js.native
  sealed trait back
    extends StObject
       with NavigationDirection
  
  @js.native
  sealed trait forward
    extends StObject
       with NavigationDirection
  
  @js.native
  sealed trait unknown
    extends StObject
       with NavigationDirection
}
