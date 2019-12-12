package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import typings.tsutils.utilUtilMod.AccessKind.Delete
import typings.tsutils.utilUtilMod.AccessKind.Modification
import typings.tsutils.utilUtilMod.AccessKind.None
import typings.tsutils.utilUtilMod.AccessKind.Read
import typings.tsutils.utilUtilMod.AccessKind.ReadWrite
import typings.tsutils.utilUtilMod.AccessKind.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessKind extends js.Object

@JSImport("tsutils/util/util", "AccessKind")
@js.native
object AccessKind extends js.Object {
  @js.native
  sealed trait Delete extends AccessKind
  
  @js.native
  sealed trait Modification extends AccessKind
  
  @js.native
  sealed trait None extends AccessKind
  
  @js.native
  sealed trait Read extends AccessKind
  
  @js.native
  sealed trait ReadWrite extends AccessKind
  
  @js.native
  sealed trait Write extends AccessKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessKind with Double] = js.native
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 6 */ @js.native
  object Modification extends TopLevel[Modification with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Read extends TopLevel[Read with Double]
  
  /* 3 */ @js.native
  object ReadWrite extends TopLevel[ReadWrite with Double]
  
  /* 2 */ @js.native
  object Write extends TopLevel[Write with Double]
  
}

