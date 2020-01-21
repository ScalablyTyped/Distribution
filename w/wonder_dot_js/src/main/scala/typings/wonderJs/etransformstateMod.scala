package typings.wonderJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/transform/ETransformState", JSImport.Namespace)
@js.native
object etransformstateMod extends js.Object {
  @js.native
  sealed trait ETransformState extends js.Object
  
  @js.native
  object ETransformState extends js.Object {
    @js.native
    sealed trait ISLOCALROTATE extends ETransformState
    
    @js.native
    sealed trait ISLOCALSCALE extends ETransformState
    
    @js.native
    sealed trait ISLOCALTRANSLATE extends ETransformState
    
    @js.native
    sealed trait ISROTATE extends ETransformState
    
    @js.native
    sealed trait ISSCALE extends ETransformState
    
    @js.native
    sealed trait ISTRANSLATE extends ETransformState
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ETransformState with Double] = js.native
    /* 4 */ @js.native
    object ISLOCALROTATE extends TopLevel[ISLOCALROTATE with Double]
    
    /* 5 */ @js.native
    object ISLOCALSCALE extends TopLevel[ISLOCALSCALE with Double]
    
    /* 3 */ @js.native
    object ISLOCALTRANSLATE extends TopLevel[ISLOCALTRANSLATE with Double]
    
    /* 1 */ @js.native
    object ISROTATE extends TopLevel[ISROTATE with Double]
    
    /* 2 */ @js.native
    object ISSCALE extends TopLevel[ISSCALE with Double]
    
    /* 0 */ @js.native
    object ISTRANSLATE extends TopLevel[ISTRANSLATE with Double]
    
  }
  
}

