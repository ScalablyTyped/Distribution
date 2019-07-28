package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  
  /* 0 */ val Bad: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.Bad with Double = js.native
  /* 3 */ val Blob: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.Blob with Double = js.native
  /* 1 */ val Commit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.Commit with Double = js.native
  /* 5 */ val Ext2: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.Ext2 with Double = js.native
  /* 6 */ val OfsDelta: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.OfsDelta with Double = js.native
  /* 7 */ val RefDelta: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.RefDelta with Double = js.native
  /* 4 */ val Tag: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.Tag with Double = js.native
  /* 2 */ val Tree: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitObjectType.Tree with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitObjectType with Double] = js.native
}

