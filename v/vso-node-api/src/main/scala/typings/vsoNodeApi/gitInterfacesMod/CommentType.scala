package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "CommentType")
@js.native
object CommentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentType with Double] = js.native
  
  /**
    * The comment comes as a result of a code change.
    */
  @js.native
  sealed trait CodeChange extends CommentType
  /* 2 */ val CodeChange: typings.vsoNodeApi.gitInterfacesMod.CommentType.CodeChange with Double = js.native
  
  /**
    * The comment represents a system message.
    */
  @js.native
  sealed trait System extends CommentType
  /* 3 */ val System: typings.vsoNodeApi.gitInterfacesMod.CommentType.System with Double = js.native
  
  /**
    * This is a regular user comment.
    */
  @js.native
  sealed trait Text extends CommentType
  /* 1 */ val Text: typings.vsoNodeApi.gitInterfacesMod.CommentType.Text with Double = js.native
  
  /**
    * The comment type is not known.
    */
  @js.native
  sealed trait Unknown extends CommentType
  /* 0 */ val Unknown: typings.vsoNodeApi.gitInterfacesMod.CommentType.Unknown with Double = js.native
}
