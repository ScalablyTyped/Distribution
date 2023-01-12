package typings.typedoc

import typings.std.Set
import typings.typedoc.anon.Kind
import typings.typedoc.anon.Tag
import typings.typedoc.anon.Text
import typings.typedoc.distLibModelsReflectionsMod.Reflection
import typings.typedoc.distLibSerializationMod.Serializer
import typings.typedoc.typedocStrings.`inline-tag`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsCommentsCommentMod {
  
  @JSImport("typedoc/dist/lib/models/comments/comment", "Comment")
  @js.native
  /**
    * Creates a new Comment instance.
    */
  open class Comment () extends StObject {
    def this(summary: js.Array[CommentDisplayPart]) = this()
    def this(summary: js.Array[CommentDisplayPart], blockTags: js.Array[CommentTag]) = this()
    def this(summary: Unit, blockTags: js.Array[CommentTag]) = this()
    def this(summary: js.Array[CommentDisplayPart], blockTags: js.Array[CommentTag], modifierTags: Set[String]) = this()
    def this(summary: js.Array[CommentDisplayPart], blockTags: Unit, modifierTags: Set[String]) = this()
    def this(summary: Unit, blockTags: js.Array[CommentTag], modifierTags: Set[String]) = this()
    def this(summary: Unit, blockTags: Unit, modifierTags: Set[String]) = this()
    
    /**
      * All associated block level tags.
      */
    var blockTags: js.Array[CommentTag] = js.native
    
    def getIdentifiedTag(identifier: String, tagName: /* template literal string: @${string} */ String): js.UndefOr[CommentTag] = js.native
    
    /**
      * Return the first tag with the given name.
      *
      * @param tagName  The name of the tag to look for.
      * @param paramName  An optional parameter name to look for.
      * @returns The found tag or undefined.
      */
    def getTag(tagName: /* template literal string: @${string} */ String): js.UndefOr[CommentTag] = js.native
    
    /**
      * Get all tags with the given tag name.
      */
    def getTags(tagName: /* template literal string: @${string} */ String): js.Array[CommentTag] = js.native
    
    /**
      * Test whether this comment contains a tag with the given name.
      *
      * @param tagName  The name of the tag to look for.
      * @returns TRUE when this comment contains a tag with the given name, otherwise FALSE.
      */
    def hasModifier(tagName: /* template literal string: @${string} */ String): Boolean = js.native
    
    /**
      * Has this comment a visible component?
      *
      * @returns TRUE when this comment has a visible component.
      */
    def hasVisibleComponent(): Boolean = js.native
    
    /**
      * Returns true if this comment is completely empty.
      * @internal
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * All modifier tags present on the comment, e.g. `@alpha`, `@beta`.
      */
    var modifierTags: Set[String] = js.native
    
    def removeModifier(tagName: /* template literal string: @${string} */ String): Unit = js.native
    
    /**
      * Removes all block tags with the given tag name from the comment.
      * @param tagName
      */
    def removeTags(tagName: /* template literal string: @${string} */ String): Unit = js.native
    
    /**
      * The content of the comment which is not associated with a block tag.
      */
    var summary: js.Array[CommentDisplayPart] = js.native
    
    def toObject(serializer: Serializer): typings.typedoc.distLibSerializationSchemaMod.Comment = js.native
  }
  /* static members */
  object Comment {
    
    @JSImport("typedoc/dist/lib/models/comments/comment", "Comment")
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
  
  @JSImport("typedoc/dist/lib/models/comments/comment", "CommentTag")
  @js.native
  open class CommentTag protected () extends StObject {
    /**
      * Create a new CommentTag instance.
      */
    def this(tag: /* template literal string: @${string} */ String, text: js.Array[CommentDisplayPart]) = this()
    
    /**
      * The actual body text of this tag.
      */
    var content: js.Array[CommentDisplayPart] = js.native
    
    /**
      * Some tags, (`@typedef`, `@param`, `@property`, etc.) may have a user defined identifier associated with them.
      * If this tag is one of those, it will be parsed out and included here.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The name of this tag, e.g. `@returns`, `@example`
      */
    var tag: /* template literal string: @${string} */ String = js.native
    
    def toObject(): typings.typedoc.distLibSerializationSchemaMod.CommentTag = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.anon.Kind
    - typings.typedoc.anon.Text
    - typings.typedoc.distLibModelsCommentsCommentMod.InlineTagDisplayPart
  */
  trait CommentDisplayPart extends StObject
  object CommentDisplayPart {
    
    inline def InlineTagDisplayPart(tag: /* template literal string: @${string} */ String, text: String): typings.typedoc.distLibModelsCommentsCommentMod.InlineTagDisplayPart = {
      val __obj = js.Dynamic.literal(kind = "inline-tag", tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.distLibModelsCommentsCommentMod.InlineTagDisplayPart]
    }
    
    inline def Kind(text: String): typings.typedoc.anon.Kind = {
      val __obj = js.Dynamic.literal(kind = "text", text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.anon.Kind]
    }
    
    inline def Text(text: String): typings.typedoc.anon.Text = {
      val __obj = js.Dynamic.literal(kind = "code", text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.anon.Text]
    }
  }
  
  trait InlineTagDisplayPart
    extends StObject
       with CommentDisplayPart {
    
    var kind: `inline-tag`
    
    var tag: /* template literal string: @${string} */ String
    
    var target: js.UndefOr[Reflection | String] = js.undefined
    
    var text: String
  }
  object InlineTagDisplayPart {
    
    inline def apply(tag: /* template literal string: @${string} */ String, text: String): InlineTagDisplayPart = {
      val __obj = js.Dynamic.literal(kind = "inline-tag", tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineTagDisplayPart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineTagDisplayPart] (val x: Self) extends AnyVal {
      
      inline def setKind(value: `inline-tag`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setTag(value: /* template literal string: @${string} */ String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Reflection | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
