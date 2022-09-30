package typings.typestyle

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.typestyle.anon.AutoGenerateTag
import typings.typestyle.anon.TextContent
import typings.typestyle.typesMod.FontFace
import typings.typestyle.typesMod.KeyFrames
import typings.typestyle.typesMod.MediaQuery
import typings.typestyle.typesMod.NestedCSSProperties
import typings.typestyle.typestyleBooleans.`false`
import typings.typestyle.typestyleMod.StylesTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typestyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typestyle", "TypeStyle")
  @js.native
  open class TypeStyle protected ()
    extends typings.typestyle.typestyleMod.TypeStyle {
    def this(hasAutoGenerateTag: AutoGenerateTag) = this()
  }
  
  inline def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classes")(classes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def createTypeStyle(): typings.typestyle.typestyleMod.TypeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeStyle")().asInstanceOf[typings.typestyle.typestyleMod.TypeStyle]
  inline def createTypeStyle(target: TextContent): typings.typestyle.typestyleMod.TypeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeStyle")(target.asInstanceOf[js.Any]).asInstanceOf[typings.typestyle.typestyleMod.TypeStyle]
  
  inline def cssRaw(mustBeValidCSS: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cssRaw")(mustBeValidCSS.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cssRule(selector: String, objects: NestedCSSProperties*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cssRule")(scala.List(selector.asInstanceOf[js.Any]).`++`(objects.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NestedCSSProperties]
  
  inline def fontFace(fontFace: FontFace*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fontFace")(fontFace.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def forceRenderStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceRenderStyles")().asInstanceOf[Unit]
  
  inline def getStyles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")().asInstanceOf[String]
  
  inline def keyframes(frames: KeyFrames): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(frames.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("media")(scala.List(mediaQuery.asInstanceOf[js.Any]).`++`(objects.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NestedCSSProperties]
  
  inline def reinit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reinit")().asInstanceOf[Unit]
  
  inline def setStylesTarget(tag: StylesTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStylesTarget")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def style(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def stylesheet[Classes /* <: String */](classes: Record[Classes, NestedCSSProperties]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ClassName in Classes ]: string}
    */ typings.typestyle.typestyleStrings.stylesheet & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheet")(classes.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ClassName in Classes ]: string}
    */ typings.typestyle.typestyleStrings.stylesheet & TopLevel[Any]]
}
