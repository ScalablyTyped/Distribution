package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationType extends StObject
@JSImport("vue-router", "NavigationType")
@js.native
object NavigationType extends StObject {
  
  @js.native
  sealed trait pop
    extends StObject
       with NavigationType
  
  @js.native
  sealed trait push
    extends StObject
       with NavigationType
}
