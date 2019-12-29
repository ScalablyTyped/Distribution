package typings.typestyle

import org.scalablytyped.runtime.StringDictionary
import typings.typestyle.libTypesMod.MediaQuery
import typings.typestyle.libTypesMod.NestedCSSProperties
import typings.typestyle.typestyleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle/lib/internal/utilities", JSImport.Namespace)
@js.native
object libInternalUtilitiesMod extends js.Object {
  @JSName("classes")
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  @JSName("extend")
  def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = js.native
  @JSName("media")
  def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = js.native
  def raf(cb: js.Function0[Unit]): Unit = js.native
}

