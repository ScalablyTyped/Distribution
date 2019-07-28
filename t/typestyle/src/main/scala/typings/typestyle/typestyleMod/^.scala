package typings.typestyle.typestyleMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.typestyle.Anon_TextContent
import typings.typestyle.libTypesMod.FontFace
import typings.typestyle.libTypesMod.KeyFrames
import typings.typestyle.libTypesMod.MediaQuery
import typings.typestyle.libTypesMod.NestedCSSProperties
import typings.typestyle.typestyleNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("classes")
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  def createTypeStyle(): typings.typestyle.libInternalTypestyleMod.TypeStyle = js.native
  def createTypeStyle(target: Anon_TextContent): typings.typestyle.libInternalTypestyleMod.TypeStyle = js.native
  def cssRaw(mustBeValidCSS: String): Unit = js.native
  def cssRule(selector: String, objects: NestedCSSProperties*): Unit = js.native
  @JSName("extend")
  def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = js.native
  def fontFace(fontFace: FontFace*): Unit = js.native
  def forceRenderStyles(): Unit = js.native
  def getStyles(): String = js.native
  def keyframes(frames: KeyFrames): String = js.native
  @JSName("media")
  def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = js.native
  def reinit(): Unit = js.native
  def setStylesTarget(tag: Anon_TextContent): Unit = js.native
  def stylesheet[Names /* <: String */](classes: Record[Names, NestedCSSProperties]): Record[Names, String] = js.native
}

