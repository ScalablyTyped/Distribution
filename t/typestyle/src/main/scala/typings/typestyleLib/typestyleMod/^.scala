package typings
package typestyleLib.typestyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("classes")
  def classes_false(
    classes: (js.UndefOr[
      java.lang.String | typestyleLib.typestyleLibNumbers.`false` | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any]
    ])*
  ): java.lang.String = js.native
  def createTypeStyle(): typestyleLib.libInternalTypestyleMod.TypeStyle = js.native
  def createTypeStyle(target: typestyleLib.Anon_TextContent): typestyleLib.libInternalTypestyleMod.TypeStyle = js.native
  def cssRaw(mustBeValidCSS: java.lang.String): scala.Unit = js.native
  def cssRule(selector: java.lang.String, objects: typestyleLib.libTypesMod.NestedCSSProperties*): scala.Unit = js.native
  @JSName("extend")
  def extend_false(
    objects: (js.UndefOr[
      typestyleLib.libTypesMod.NestedCSSProperties | scala.Null | typestyleLib.typestyleLibNumbers.`false`
    ])*
  ): typestyleLib.libTypesMod.NestedCSSProperties = js.native
  def fontFace(fontFace: typestyleLib.libTypesMod.FontFace*): scala.Unit = js.native
  def forceRenderStyles(): scala.Unit = js.native
  def getStyles(): java.lang.String = js.native
  def keyframes(frames: typestyleLib.libTypesMod.KeyFrames): java.lang.String = js.native
  def media(
    mediaQuery: typestyleLib.libTypesMod.MediaQuery,
    objects: typestyleLib.libTypesMod.NestedCSSProperties*
  ): typestyleLib.libTypesMod.NestedCSSProperties = js.native
  def reinit(): scala.Unit = js.native
  def setStylesTarget(tag: typestyleLib.Anon_TextContent): scala.Unit = js.native
  def stylesheet[Names /* <: java.lang.String */](classes: stdLib.Record[Names, typestyleLib.libTypesMod.NestedCSSProperties]): stdLib.Record[Names, java.lang.String] = js.native
}

