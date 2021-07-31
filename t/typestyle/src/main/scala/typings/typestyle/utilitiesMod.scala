package typings.typestyle

import org.scalablytyped.runtime.StringDictionary
import typings.typestyle.typesMod.MediaQuery
import typings.typestyle.typesMod.NestedCSSProperties
import typings.typestyle.typestyleBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("typestyle/lib/internal/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classes")(classes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(objects.asInstanceOf[js.Any]).asInstanceOf[NestedCSSProperties]
  
  @scala.inline
  def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("media")(mediaQuery.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[NestedCSSProperties]
  
  @scala.inline
  def raf(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("raf")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
