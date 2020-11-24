package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "CommentType")
@js.native
object CommentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentType with Double] = js.native
  
  /**
    * The comment comes as a result of a code change.
    */
  @js.native
  sealed trait CodeChange extends CommentType
  /* 2 */ @js.native
  object CodeChange extends TopLevel[CodeChange with Double]
  
  /**
    * The comment represents a system message.
    */
  @js.native
  sealed trait System extends CommentType
  /* 3 */ @js.native
  object System extends TopLevel[System with Double]
  
  /**
    * This is a regular user comment.
    */
  @js.native
  sealed trait Text extends CommentType
  /* 1 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  /**
    * The comment type is not known.
    */
  @js.native
  sealed trait Unknown extends CommentType
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
