package typings.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BaseSeekPosition extends js.Object
@JSImport("tizen-common-web/filesystem", "BaseSeekPosition")
@js.native
object BaseSeekPosition extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BaseSeekPosition with String] = js.native
  
  @js.native
  sealed trait BEGIN extends BaseSeekPosition
  /* "BEGIN" */ @js.native
  object BEGIN extends TopLevel[BEGIN with String]
  
  @js.native
  sealed trait CURRENT extends BaseSeekPosition
  /* "CURRENT" */ @js.native
  object CURRENT extends TopLevel[CURRENT with String]
  
  @js.native
  sealed trait END extends BaseSeekPosition
  /* "END" */ @js.native
  object END extends TopLevel[END with String]
}
