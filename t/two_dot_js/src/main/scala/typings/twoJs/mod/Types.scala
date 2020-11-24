package typings.twoJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Types extends js.Object
@JSImport("two.js", "Types")
@js.native
object Types extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types with Double] = js.native
  
  @js.native
  sealed trait canvas extends Types
  /* 2 */ @js.native
  object canvas extends TopLevel[canvas with Double]
  
  @js.native
  sealed trait svg extends Types
  /* 0 */ @js.native
  object svg extends TopLevel[svg with Double]
  
  @js.native
  sealed trait webgl extends Types
  /* 1 */ @js.native
  object webgl extends TopLevel[webgl with Double]
}
