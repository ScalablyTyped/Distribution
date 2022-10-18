package typings.typedoc.mod

import typings.std.Set
import typings.typedoc.anon.Kind
import typings.typedoc.anon.Tag
import typings.typedoc.anon.Text
import typings.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Comment")
@js.native
/**
  * Creates a new Comment instance.
  */
open class Comment ()
  extends typings.typedoc.distLibModelsMod.Comment {
  def this(summary: js.Array[CommentDisplayPart]) = this()
  def this(
    summary: js.Array[CommentDisplayPart],
    blockTags: js.Array[typings.typedoc.distLibModelsCommentsCommentMod.CommentTag]
  ) = this()
  def this(summary: Unit, blockTags: js.Array[typings.typedoc.distLibModelsCommentsCommentMod.CommentTag]) = this()
  def this(
    summary: js.Array[CommentDisplayPart],
    blockTags: js.Array[typings.typedoc.distLibModelsCommentsCommentMod.CommentTag],
    modifierTags: Set[String]
  ) = this()
  def this(summary: js.Array[CommentDisplayPart], blockTags: Unit, modifierTags: Set[String]) = this()
  def this(
    summary: Unit,
    blockTags: js.Array[typings.typedoc.distLibModelsCommentsCommentMod.CommentTag],
    modifierTags: Set[String]
  ) = this()
  def this(summary: Unit, blockTags: Unit, modifierTags: Set[String]) = this()
}
/* static members */
object Comment {
  
  @JSImport("typedoc", "Comment")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper utility to clone {@link Comment.summary} or {@link CommentTag.content}
    */
  inline def cloneDisplayParts(parts: js.Array[CommentDisplayPart]): js.Array[Kind | Text | Tag] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDisplayParts")(parts.asInstanceOf[js.Any]).asInstanceOf[js.Array[Kind | Text | Tag]]
  
  /**
    * Debugging utility for combining parts into a simple string. Not suitable for
    * rendering, but can be useful in tests.
    */
  inline def combineDisplayParts(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineDisplayParts")().asInstanceOf[String]
  inline def combineDisplayParts(parts: js.Array[CommentDisplayPart]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineDisplayParts")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
}
