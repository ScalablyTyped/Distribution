package typings.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BaseSeekPosition extends js.Object

@JSImport("tizen-common-web/filesystem", "BaseSeekPosition")
@js.native
object BaseSeekPosition extends js.Object {
  @js.native
  sealed trait BEGIN extends BaseSeekPosition
  
  @js.native
  sealed trait CURRENT extends BaseSeekPosition
  
  @js.native
  sealed trait END extends BaseSeekPosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BaseSeekPosition with String] = js.native
  /* "BEGIN" */ @js.native
  object BEGIN extends TopLevel[BEGIN with String]
  
  /* "CURRENT" */ @js.native
  object CURRENT extends TopLevel[CURRENT with String]
  
  /* "END" */ @js.native
  object END extends TopLevel[END with String]
  
}

