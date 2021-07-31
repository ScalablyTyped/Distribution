package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SideEffectOptions extends StObject
@JSImport("tsutils/util/util", "SideEffectOptions")
@js.native
object SideEffectOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideEffectOptions & Double] = js.native
  
  @js.native
  sealed trait Constructor
    extends StObject
       with SideEffectOptions
  /* 2 */ val Constructor: typings.tsutils.utilUtilMod.SideEffectOptions.Constructor & Double = js.native
  
  @js.native
  sealed trait JsxElement
    extends StObject
       with SideEffectOptions
  /* 4 */ val JsxElement: typings.tsutils.utilUtilMod.SideEffectOptions.JsxElement & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SideEffectOptions
  /* 0 */ val None: typings.tsutils.utilUtilMod.SideEffectOptions.None & Double = js.native
  
  @js.native
  sealed trait TaggedTemplate
    extends StObject
       with SideEffectOptions
  /* 1 */ val TaggedTemplate: typings.tsutils.utilUtilMod.SideEffectOptions.TaggedTemplate & Double = js.native
}
