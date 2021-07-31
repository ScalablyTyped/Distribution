package typings.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Types extends StObject
@JSImport("two.js", "Types")
@js.native
object Types extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types & Double] = js.native
  
  @js.native
  sealed trait canvas
    extends StObject
       with Types
  /* 2 */ val canvas: typings.twoJs.mod.Types.canvas & Double = js.native
  
  @js.native
  sealed trait svg
    extends StObject
       with Types
  /* 0 */ val svg: typings.twoJs.mod.Types.svg & Double = js.native
  
  @js.native
  sealed trait webgl
    extends StObject
       with Types
  /* 1 */ val webgl: typings.twoJs.mod.Types.webgl & Double = js.native
}
