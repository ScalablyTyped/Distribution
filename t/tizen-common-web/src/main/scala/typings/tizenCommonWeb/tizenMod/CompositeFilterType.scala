package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompositeFilterType extends StObject
@JSImport("tizen-common-web/tizen", "CompositeFilterType")
@js.native
object CompositeFilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CompositeFilterType & String] = js.native
  
  @js.native
  sealed trait INTERSECTION
    extends StObject
       with CompositeFilterType
  /* "INTERSECTION" */ val INTERSECTION: typings.tizenCommonWeb.tizenMod.CompositeFilterType.INTERSECTION & String = js.native
  
  @js.native
  sealed trait UNION
    extends StObject
       with CompositeFilterType
  /* "UNION" */ val UNION: typings.tizenCommonWeb.tizenMod.CompositeFilterType.UNION & String = js.native
}
