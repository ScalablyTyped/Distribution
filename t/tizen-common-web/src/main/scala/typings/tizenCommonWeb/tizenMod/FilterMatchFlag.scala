package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterMatchFlag extends js.Object
@JSImport("tizen-common-web/tizen", "FilterMatchFlag")
@js.native
object FilterMatchFlag extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterMatchFlag with String] = js.native
  
  @js.native
  sealed trait CONTAINS extends FilterMatchFlag
  /* "CONTAINS" */ @js.native
  object CONTAINS extends TopLevel[CONTAINS with String]
  
  @js.native
  sealed trait ENDSWITH extends FilterMatchFlag
  /* "ENDSWITH" */ @js.native
  object ENDSWITH extends TopLevel[ENDSWITH with String]
  
  @js.native
  sealed trait EXACTLY extends FilterMatchFlag
  /* "EXACTLY" */ @js.native
  object EXACTLY extends TopLevel[EXACTLY with String]
  
  @js.native
  sealed trait EXISTS extends FilterMatchFlag
  /* "EXISTS" */ @js.native
  object EXISTS extends TopLevel[EXISTS with String]
  
  @js.native
  sealed trait FULLSTRING extends FilterMatchFlag
  /* "FULLSTRING" */ @js.native
  object FULLSTRING extends TopLevel[FULLSTRING with String]
  
  @js.native
  sealed trait STARTSWITH extends FilterMatchFlag
  /* "STARTSWITH" */ @js.native
  object STARTSWITH extends TopLevel[STARTSWITH with String]
}
