package typings.typedoc.schemaMod

import typings.typedoc.kindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait __ModelToObject[T] extends StObject
object __ModelToObject {
  
  inline def Comment(summary: js.Array[CommentDisplayPart]): typings.typedoc.schemaMod.Comment = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.Comment]
  }
  
  inline def CommentTag(
    content: js.Array[CommentDisplayPart],
    tag: ToSerialized[/* template literal string: @${string} */ String]
  ): typings.typedoc.schemaMod.CommentTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.CommentTag]
  }
  
  inline def ContainerReflection(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): typings.typedoc.schemaMod.ContainerReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ContainerReflection]
  }
  
  inline def DeclarationReflection(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): typings.typedoc.schemaMod.DeclarationReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.DeclarationReflection]
  }
  
  inline def Kind(text: String): typings.typedoc.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = "text", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.anon.Kind]
  }
  
  inline def ParameterReflection(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): typings.typedoc.schemaMod.ParameterReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ParameterReflection]
  }
  
  inline def ReferenceReflection(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String],
    target: Double
  ): typings.typedoc.schemaMod.ReferenceReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ReferenceReflection]
  }
  
  inline def Reflection(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): typings.typedoc.schemaMod.Reflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.Reflection]
  }
  
  inline def ReflectionCategory(title: ToSerialized[String]): typings.typedoc.schemaMod.ReflectionCategory = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ReflectionCategory]
  }
  
  inline def ReflectionGroup(title: ToSerialized[String]): typings.typedoc.schemaMod.ReflectionGroup = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ReflectionGroup]
  }
  
  inline def SignatureReflection(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): typings.typedoc.schemaMod.SignatureReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.SignatureReflection]
  }
  
  inline def SourceReference(character: ToSerialized[Double], fileName: ToSerialized[String], line: ToSerialized[Double]): typings.typedoc.schemaMod.SourceReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.SourceReference]
  }
  
  inline def Target(tag: /* template literal string: @${string} */ String, text: String): typings.typedoc.anon.Target = {
    val __obj = js.Dynamic.literal(kind = "inline-tag", tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.anon.Target]
  }
  
  inline def Text(text: String): typings.typedoc.anon.Text = {
    val __obj = js.Dynamic.literal(kind = "code", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.anon.Text]
  }
  
  inline def TypeParameterReflection(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): typings.typedoc.schemaMod.TypeParameterReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.TypeParameterReflection]
  }
}
