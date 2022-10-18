package typings.typedoc

import typings.std.Record
import typings.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart
import typings.typedoc.distLibModelsMod.Comment
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsMod.ReflectionFlags
import typings.typedoc.distLibModelsMod.TypeParameterReflection
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxChildren
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesLibMod {
  
  @JSImport("typedoc/dist/lib/output/themes/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelToTitleCase(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelToTitleCase")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def classNames(names: Record[String, js.UndefOr[Boolean | Null]]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(names.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def classNames(names: Record[String, js.UndefOr[Boolean | Null]], extraCss: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(names.asInstanceOf[js.Any], extraCss.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def displayPartsToMarkdown(
    parts: js.Array[CommentDisplayPart],
    urlTo: js.Function1[/* reflection */ Reflection, js.UndefOr[String]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("displayPartsToMarkdown")(parts.asInstanceOf[js.Any], urlTo.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasTypeParameters(reflection: Reflection): /* is typedoc.anon.ReflectiontypeParametersA */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTypeParameters")(reflection.asInstanceOf[js.Any]).asInstanceOf[/* is typedoc.anon.ReflectiontypeParametersA */ Boolean]
  
  inline def join[T](joiner: JsxChildren, list: js.Array[T], cb: js.Function1[/* x */ T, JsxChildren]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(joiner.asInstanceOf[js.Any], list.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  
  inline def renderFlags(flags: ReflectionFlags): JsxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFlags")(flags.asInstanceOf[js.Any]).asInstanceOf[JsxElement]
  inline def renderFlags(flags: ReflectionFlags, comment: Comment): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFlags")(flags.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  
  inline def renderName(refl: Reflection): JsxElement | (js.Array[String | JsxElement]) = ^.asInstanceOf[js.Dynamic].applyDynamic("renderName")(refl.asInstanceOf[js.Any]).asInstanceOf[JsxElement | (js.Array[String | JsxElement])]
  
  inline def renderTypeParametersSignature(): JsxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTypeParametersSignature")().asInstanceOf[JsxElement]
  inline def renderTypeParametersSignature(typeParameters: js.Array[TypeParameterReflection]): JsxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTypeParametersSignature")(typeParameters.asInstanceOf[js.Any]).asInstanceOf[JsxElement]
  
  inline def stringify(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wbr(str: String): js.Array[String | JsxElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("wbr")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | JsxElement]]
}
