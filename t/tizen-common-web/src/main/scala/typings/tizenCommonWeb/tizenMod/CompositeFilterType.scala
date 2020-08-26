package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompositeFilterType extends js.Object

@JSImport("tizen-common-web/tizen", "CompositeFilterType")
@js.native
object CompositeFilterType extends js.Object {
  @js.native
  sealed trait INTERSECTION extends CompositeFilterType
  
  @js.native
  sealed trait UNION extends CompositeFilterType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CompositeFilterType with String] = js.native
  /* "INTERSECTION" */ @js.native
  object INTERSECTION extends TopLevel[INTERSECTION with String]
  
  /* "UNION" */ @js.native
  object UNION extends TopLevel[UNION with String]
  
}

