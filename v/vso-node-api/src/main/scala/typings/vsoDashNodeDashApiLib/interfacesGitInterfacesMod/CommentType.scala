package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommentType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "CommentType")
@js.native
object CommentType extends js.Object {
  /**
       * The comment comes as a result of a code change.
       */
  @js.native
  sealed trait CodeChange
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentType
  
  /**
       * The comment represents a system message.
       */
  @js.native
  sealed trait System
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentType
  
  /**
       * This is a regular user comment.
       */
  @js.native
  sealed trait Text
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentType
  
  /**
       * The comment type is not known.
       */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentType
  
  /* 2 */ val CodeChange: CodeChange with scala.Double = js.native
  /* 3 */ val System: System with scala.Double = js.native
  /* 1 */ val Text: Text with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentType with scala.Double] = js.native
}

