package typings.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Types extends StObject
@JSImport("two.js", "Types")
@js.native
object Types extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types with Double] = js.native
  
  @js.native
  sealed trait canvas extends Types
  /* 2 */ val canvas: typings.twoJs.mod.Types.canvas with Double = js.native
  
  @js.native
  sealed trait svg extends Types
  /* 0 */ val svg: typings.twoJs.mod.Types.svg with Double = js.native
  
  @js.native
  sealed trait webgl extends Types
  /* 1 */ val webgl: typings.twoJs.mod.Types.webgl with Double = js.native
}
