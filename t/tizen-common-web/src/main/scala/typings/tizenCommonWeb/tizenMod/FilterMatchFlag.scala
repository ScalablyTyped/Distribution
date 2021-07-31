package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterMatchFlag extends StObject
@JSImport("tizen-common-web/tizen", "FilterMatchFlag")
@js.native
object FilterMatchFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterMatchFlag & String] = js.native
  
  @js.native
  sealed trait CONTAINS
    extends StObject
       with FilterMatchFlag
  /* "CONTAINS" */ val CONTAINS: typings.tizenCommonWeb.tizenMod.FilterMatchFlag.CONTAINS & String = js.native
  
  @js.native
  sealed trait ENDSWITH
    extends StObject
       with FilterMatchFlag
  /* "ENDSWITH" */ val ENDSWITH: typings.tizenCommonWeb.tizenMod.FilterMatchFlag.ENDSWITH & String = js.native
  
  @js.native
  sealed trait EXACTLY
    extends StObject
       with FilterMatchFlag
  /* "EXACTLY" */ val EXACTLY: typings.tizenCommonWeb.tizenMod.FilterMatchFlag.EXACTLY & String = js.native
  
  @js.native
  sealed trait EXISTS
    extends StObject
       with FilterMatchFlag
  /* "EXISTS" */ val EXISTS: typings.tizenCommonWeb.tizenMod.FilterMatchFlag.EXISTS & String = js.native
  
  @js.native
  sealed trait FULLSTRING
    extends StObject
       with FilterMatchFlag
  /* "FULLSTRING" */ val FULLSTRING: typings.tizenCommonWeb.tizenMod.FilterMatchFlag.FULLSTRING & String = js.native
  
  @js.native
  sealed trait STARTSWITH
    extends StObject
       with FilterMatchFlag
  /* "STARTSWITH" */ val STARTSWITH: typings.tizenCommonWeb.tizenMod.FilterMatchFlag.STARTSWITH & String = js.native
}
