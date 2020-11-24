package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompositeFilterType extends js.Object
@JSImport("tizen-common-web/tizen", "CompositeFilterType")
@js.native
object CompositeFilterType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CompositeFilterType with String] = js.native
  
  @js.native
  sealed trait INTERSECTION extends CompositeFilterType
  /* "INTERSECTION" */ @js.native
  object INTERSECTION extends TopLevel[INTERSECTION with String]
  
  @js.native
  sealed trait UNION extends CompositeFilterType
  /* "UNION" */ @js.native
  object UNION extends TopLevel[UNION with String]
}
