package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ByteOrderMark extends js.Object

@JSGlobal("TypeScript.ByteOrderMark")
@js.native
object ByteOrderMark extends js.Object {
  @js.native
  sealed trait None extends ByteOrderMark
  
  @js.native
  sealed trait Utf16BigEndian extends ByteOrderMark
  
  @js.native
  sealed trait Utf16LittleEndian extends ByteOrderMark
  
  @js.native
  sealed trait Utf8 extends ByteOrderMark
  
  /* 0 */ val None: typings.typescriptDashServices.TypeScriptNs.ByteOrderMark.None with Double = js.native
  /* 2 */ val Utf16BigEndian: typings.typescriptDashServices.TypeScriptNs.ByteOrderMark.Utf16BigEndian with Double = js.native
  /* 3 */ val Utf16LittleEndian: typings.typescriptDashServices.TypeScriptNs.ByteOrderMark.Utf16LittleEndian with Double = js.native
  /* 1 */ val Utf8: typings.typescriptDashServices.TypeScriptNs.ByteOrderMark.Utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ByteOrderMark with Double] = js.native
}

