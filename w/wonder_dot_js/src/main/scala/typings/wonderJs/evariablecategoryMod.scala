package typings.wonderJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/variable/EVariableCategory", JSImport.Namespace)
@js.native
object evariablecategoryMod extends js.Object {
  @js.native
  sealed trait EVariableCategory extends js.Object
  
  @js.native
  object EVariableCategory extends js.Object {
    @js.native
    sealed trait CUSTOM extends EVariableCategory
    
    @js.native
    sealed trait ENGINE extends EVariableCategory
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EVariableCategory with Double] = js.native
    /* 1 */ @js.native
    object CUSTOM extends TopLevel[CUSTOM with Double]
    
    /* 0 */ @js.native
    object ENGINE extends TopLevel[ENGINE with Double]
    
  }
  
}

