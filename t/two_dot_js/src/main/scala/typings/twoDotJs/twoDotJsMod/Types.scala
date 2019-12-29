package typings.twoDotJs.twoDotJsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

@JSImport("two.js", "Types")
@js.native
object Types extends js.Object {
  @js.native
  sealed trait canvas extends Types
  
  @js.native
  sealed trait svg extends Types
  
  @js.native
  sealed trait webgl extends Types
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types with Double] = js.native
  /* 2 */ @js.native
  object canvas extends TopLevel[canvas with Double]
  
  /* 0 */ @js.native
  object svg extends TopLevel[svg with Double]
  
  /* 1 */ @js.native
  object webgl extends TopLevel[webgl with Double]
  
}

