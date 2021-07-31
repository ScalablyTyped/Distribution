package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionEdge extends StObject
@JSImport("tizen-common-web/tvinfo", "CaptionEdge")
@js.native
object CaptionEdge extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionEdge & String] = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_DEPRESSED
    extends StObject
       with CaptionEdge
  /* "CAPTION_EDGE_DEPRESSED" */ val CAPTION_EDGE_DEPRESSED: typings.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_DEPRESSED & String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_DROP_SHADOWED
    extends StObject
       with CaptionEdge
  /* "CAPTION_EDGE_DROP_SHADOWED" */ val CAPTION_EDGE_DROP_SHADOWED: typings.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_DROP_SHADOWED & String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_NONE
    extends StObject
       with CaptionEdge
  /* "CAPTION_EDGE_NONE" */ val CAPTION_EDGE_NONE: typings.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_NONE & String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_RAISED
    extends StObject
       with CaptionEdge
  /* "CAPTION_EDGE_RAISED" */ val CAPTION_EDGE_RAISED: typings.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_RAISED & String = js.native
  
  @js.native
  sealed trait CAPTION_EDGE_UNIFORM
    extends StObject
       with CaptionEdge
  /* "CAPTION_EDGE_UNIFORM" */ val CAPTION_EDGE_UNIFORM: typings.tizenCommonWeb.tvinfoMod.CaptionEdge.CAPTION_EDGE_UNIFORM & String = js.native
}
