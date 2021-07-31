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
  class TypeStyle protected ()
    extends typings.typestyle.typestyleMod.TypeStyle {
    def this(hasAutoGenerateTag: AutoGenerateTag) = this()
  }
  
  @scala.inline
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classes")(classes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def createTypeStyle(): typings.typestyle.typestyleMod.TypeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeStyle")().asInstanceOf[typings.typestyle.typestyleMod.TypeStyle]
  @scala.inline
  def createTypeStyle(target: TextContent): typings.typestyle.typestyleMod.TypeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeStyle")(target.asInstanceOf[js.Any]).asInstanceOf[typings.typestyle.typestyleMod.TypeStyle]
  
  @scala.inline
  def cssRaw(mustBeValidCSS: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cssRaw")(mustBeValidCSS.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def cssRule(selector: String, objects: NestedCSSProperties*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cssRule")(selector.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(objects.asInstanceOf[js.Any]).asInstanceOf[NestedCSSProperties]
  
  @scala.inline
  def fontFace(fontFace: FontFace*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fontFace")(fontFace.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def forceRenderStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceRenderStyles")().asInstanceOf[Unit]
  
  @scala.inline
  def getStyles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")().asInstanceOf[String]
  
  @scala.inline
  def keyframes(frames: KeyFrames): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(frames.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("media")(mediaQuery.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[NestedCSSProperties]
  
  @scala.inline
  def reinit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reinit")().asInstanceOf[Unit]
  
  @scala.inline
  def setStylesTarget(tag: StylesTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStylesTarget")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def style(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(objects.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stylesheet[Classes /* <: Record[String, NestedCSSProperties] */](classes: Classes): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ClassName in keyof Classes ]: string}
    */ typings.typestyle.typestyleStrings.stylesheet & TopLevel[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheet")(classes.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ClassName in keyof Classes ]: string}
    */ typings.typestyle.typestyleStrings.stylesheet & TopLevel[js.Any]]
}
