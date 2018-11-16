package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitObjectType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitObjectType")
@js.native
object GitObjectType extends js.Object {
  @js.native
  sealed trait Bad
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  @js.native
  sealed trait Blob
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  @js.native
  sealed trait Commit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  @js.native
  sealed trait Ext2
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  @js.native
  sealed trait OfsDelta
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  @js.native
  sealed trait RefDelta
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  @js.native
  sealed trait Tag
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  @js.native
  sealed trait Tree
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType
  
  /* 0 */ val Bad: Bad with scala.Double = js.native
  /* 3 */ val Blob: Blob with scala.Double = js.native
  /* 1 */ val Commit: Commit with scala.Double = js.native
  /* 5 */ val Ext2: Ext2 with scala.Double = js.native
  /* 6 */ val OfsDelta: OfsDelta with scala.Double = js.native
  /* 7 */ val RefDelta: RefDelta with scala.Double = js.native
  /* 4 */ val Tag: Tag with scala.Double = js.native
  /* 2 */ val Tree: Tree with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitObjectType with scala.Double] = js.native
}

