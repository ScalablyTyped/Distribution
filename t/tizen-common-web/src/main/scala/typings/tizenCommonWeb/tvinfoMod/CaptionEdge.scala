package typings.tizenCommonWeb.tvinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptionEdge extends js.Object

@JSImport("tizen-common-web/tvinfo", "CaptionEdge")
@js.native
object CaptionEdge extends js.Object {
  @js.native
  sealed trait CAPTION_EDGE_DEPRESSED extends CaptionEdge
  
  @js.native
  sealed trait CAPTION_EDGE_DROP_SHADOWED extends CaptionEdge
  
  @js.native
  sealed trait CAPTION_EDGE_NONE extends CaptionEdge
  
  @js.native
  sealed trait CAPTION_EDGE_RAISED extends CaptionEdge
  
  @js.native
  sealed trait CAPTION_EDGE_UNIFORM extends CaptionEdge
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CaptionEdge with String] = js.native
  /* "CAPTION_EDGE_DEPRESSED" */ @js.native
  object CAPTION_EDGE_DEPRESSED extends TopLevel[CAPTION_EDGE_DEPRESSED with String]
  
  /* "CAPTION_EDGE_DROP_SHADOWED" */ @js.native
  object CAPTION_EDGE_DROP_SHADOWED extends TopLevel[CAPTION_EDGE_DROP_SHADOWED with String]
  
  /* "CAPTION_EDGE_NONE" */ @js.native
  object CAPTION_EDGE_NONE extends TopLevel[CAPTION_EDGE_NONE with String]
  
  /* "CAPTION_EDGE_RAISED" */ @js.native
  object CAPTION_EDGE_RAISED extends TopLevel[CAPTION_EDGE_RAISED with String]
  
  /* "CAPTION_EDGE_UNIFORM" */ @js.native
  object CAPTION_EDGE_UNIFORM extends TopLevel[CAPTION_EDGE_UNIFORM with String]
  
}

