package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ByteOrderMark extends js.Object

@JSGlobal("TypeScript.ByteOrderMark")
@js.native
object ByteOrderMark extends js.Object {
  @js.native
  sealed trait None
    extends typescriptDashServicesLib.TypeScriptNs.ByteOrderMark
  
  @js.native
  sealed trait Utf16BigEndian
    extends typescriptDashServicesLib.TypeScriptNs.ByteOrderMark
  
  @js.native
  sealed trait Utf16LittleEndian
    extends typescriptDashServicesLib.TypeScriptNs.ByteOrderMark
  
  @js.native
  sealed trait Utf8
    extends typescriptDashServicesLib.TypeScriptNs.ByteOrderMark
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Utf16BigEndian: Utf16BigEndian with scala.Double = js.native
  /* 3 */ val Utf16LittleEndian: Utf16LittleEndian with scala.Double = js.native
  /* 1 */ val Utf8: Utf8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.ByteOrderMark with scala.Double] = js.native
}

