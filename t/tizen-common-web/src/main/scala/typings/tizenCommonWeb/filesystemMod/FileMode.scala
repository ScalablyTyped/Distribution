package typings.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileMode extends js.Object
@JSImport("tizen-common-web/filesystem", "FileMode")
@js.native
object FileMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileMode with String] = js.native
  
  @js.native
  sealed trait a extends FileMode
  /* "a" */ @js.native
  object a extends TopLevel[a with String]
  
  @js.native
  sealed trait r extends FileMode
  /* "r" */ @js.native
  object r extends TopLevel[r with String]
  
  @js.native
  sealed trait rw extends FileMode
  /* "rw" */ @js.native
  object rw extends TopLevel[rw with String]
  
  @js.native
  sealed trait rwo extends FileMode
  /* "rwo" */ @js.native
  object rwo extends TopLevel[rwo with String]
  
  @js.native
  sealed trait w extends FileMode
  /* "w" */ @js.native
  object w extends TopLevel[w with String]
}
