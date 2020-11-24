package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessKind extends js.Object
@JSImport("tsutils/util/util", "AccessKind")
@js.native
object AccessKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessKind with Double] = js.native
  
  @js.native
  sealed trait Delete extends AccessKind
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Modification extends AccessKind
  /* 6 */ @js.native
  object Modification extends TopLevel[Modification with Double]
  
  @js.native
  sealed trait None extends AccessKind
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Read extends AccessKind
  /* 1 */ @js.native
  object Read extends TopLevel[Read with Double]
  
  @js.native
  sealed trait ReadWrite extends AccessKind
  /* 3 */ @js.native
  object ReadWrite extends TopLevel[ReadWrite with Double]
  
  @js.native
  sealed trait Write extends AccessKind
  /* 2 */ @js.native
  object Write extends TopLevel[Write with Double]
}
