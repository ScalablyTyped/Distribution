package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object escreensizeMod {
  
  @js.native
  sealed trait EScreenSize extends StObject
  @JSImport("wonder.js/dist/es2015/device/EScreenSize", "EScreenSize")
  @js.native
  object EScreenSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EScreenSize & Double] = js.native
    
    @js.native
    sealed trait FULL
      extends StObject
         with EScreenSize
    /* 0 */ val FULL: typings.wonderJs.escreensizeMod.EScreenSize.FULL & Double = js.native
  }
}
