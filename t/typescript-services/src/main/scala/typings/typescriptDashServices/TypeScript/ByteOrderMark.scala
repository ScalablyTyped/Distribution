package typings.typescriptDashServices.TypeScript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ByteOrderMark with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Utf16BigEndian extends TopLevel[Utf16BigEndian with Double]
  
  /* 3 */ @js.native
  object Utf16LittleEndian extends TopLevel[Utf16LittleEndian with Double]
  
  /* 1 */ @js.native
  object Utf8 extends TopLevel[Utf8 with Double]
  
}

