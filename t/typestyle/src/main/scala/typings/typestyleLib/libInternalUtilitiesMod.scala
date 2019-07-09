package typings
package typestyleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle/lib/internal/utilities", JSImport.Namespace)
@js.native
object libInternalUtilitiesMod extends js.Object {
  @JSName("classes")
  def classes_false(
    classes: (js.UndefOr[
      java.lang.String | typestyleLib.typestyleLibNumbers.`false` | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any]
    ])*
  ): java.lang.String = js.native
  @JSName("extend")
  def extend_false(
    objects: (js.UndefOr[
      typestyleLib.libTypesMod.NestedCSSProperties | scala.Null | typestyleLib.typestyleLibNumbers.`false`
    ])*
  ): typestyleLib.libTypesMod.NestedCSSProperties = js.native
  def media(
    mediaQuery: typestyleLib.libTypesMod.MediaQuery,
    objects: typestyleLib.libTypesMod.NestedCSSProperties*
  ): typestyleLib.libTypesMod.NestedCSSProperties = js.native
  def raf(cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

