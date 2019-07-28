package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  sealed trait CodeChange extends CommentType
  
  /**
    * The comment represents a system message.
    */
  @js.native
  sealed trait System extends CommentType
  
  /**
    * This is a regular user comment.
    */
  @js.native
  sealed trait Text extends CommentType
  
  /**
    * The comment type is not known.
    */
  @js.native
  sealed trait Unknown extends CommentType
  
  /* 2 */ val CodeChange: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentType.CodeChange with Double = js.native
  /* 3 */ val System: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentType.System with Double = js.native
  /* 1 */ val Text: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentType.Text with Double = js.native
  /* 0 */ val Unknown: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentType.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentType with Double] = js.native
}

