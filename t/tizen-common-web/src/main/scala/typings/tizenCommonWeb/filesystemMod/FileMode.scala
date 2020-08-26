package typings.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileMode extends js.Object

@JSImport("tizen-common-web/filesystem", "FileMode")
@js.native
object FileMode extends js.Object {
  @js.native
  sealed trait a extends FileMode
  
  @js.native
  sealed trait r extends FileMode
  
  @js.native
  sealed trait rw extends FileMode
  
  @js.native
  sealed trait rwo extends FileMode
  
  @js.native
  sealed trait w extends FileMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileMode with String] = js.native
  /* "a" */ @js.native
  object a extends TopLevel[a with String]
  
  /* "r" */ @js.native
  object r extends TopLevel[r with String]
  
  /* "rw" */ @js.native
  object rw extends TopLevel[rw with String]
  
  /* "rwo" */ @js.native
  object rwo extends TopLevel[rwo with String]
  
  /* "w" */ @js.native
  object w extends TopLevel[w with String]
  
}

