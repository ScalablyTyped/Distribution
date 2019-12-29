package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitObjectType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitObjectType")
@js.native
object GitObjectType extends js.Object {
  @js.native
  sealed trait Bad extends GitObjectType
  
  @js.native
  sealed trait Blob extends GitObjectType
  
  @js.native
  sealed trait Commit extends GitObjectType
  
  @js.native
  sealed trait Ext2 extends GitObjectType
  
  @js.native
  sealed trait OfsDelta extends GitObjectType
  
  @js.native
  sealed trait RefDelta extends GitObjectType
  
  @js.native
  sealed trait Tag extends GitObjectType
  
  @js.native
  sealed trait Tree extends GitObjectType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitObjectType with Double] = js.native
  /* 0 */ @js.native
  object Bad extends TopLevel[Bad with Double]
  
  /* 3 */ @js.native
  object Blob extends TopLevel[Blob with Double]
  
  /* 1 */ @js.native
  object Commit extends TopLevel[Commit with Double]
  
  /* 5 */ @js.native
  object Ext2 extends TopLevel[Ext2 with Double]
  
  /* 6 */ @js.native
  object OfsDelta extends TopLevel[OfsDelta with Double]
  
  /* 7 */ @js.native
  object RefDelta extends TopLevel[RefDelta with Double]
  
  /* 4 */ @js.native
  object Tag extends TopLevel[Tag with Double]
  
  /* 2 */ @js.native
  object Tree extends TopLevel[Tree with Double]
  
}

