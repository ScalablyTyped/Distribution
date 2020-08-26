package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterMatchFlag extends js.Object

@JSImport("tizen-common-web/tizen", "FilterMatchFlag")
@js.native
object FilterMatchFlag extends js.Object {
  @js.native
  sealed trait CONTAINS extends FilterMatchFlag
  
  @js.native
  sealed trait ENDSWITH extends FilterMatchFlag
  
  @js.native
  sealed trait EXACTLY extends FilterMatchFlag
  
  @js.native
  sealed trait EXISTS extends FilterMatchFlag
  
  @js.native
  sealed trait FULLSTRING extends FilterMatchFlag
  
  @js.native
  sealed trait STARTSWITH extends FilterMatchFlag
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterMatchFlag with String] = js.native
  /* "CONTAINS" */ @js.native
  object CONTAINS extends TopLevel[CONTAINS with String]
  
  /* "ENDSWITH" */ @js.native
  object ENDSWITH extends TopLevel[ENDSWITH with String]
  
  /* "EXACTLY" */ @js.native
  object EXACTLY extends TopLevel[EXACTLY with String]
  
  /* "EXISTS" */ @js.native
  object EXISTS extends TopLevel[EXISTS with String]
  
  /* "FULLSTRING" */ @js.native
  object FULLSTRING extends TopLevel[FULLSTRING with String]
  
  /* "STARTSWITH" */ @js.native
  object STARTSWITH extends TopLevel[STARTSWITH with String]
  
}

