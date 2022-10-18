package typings.styledComponents

import org.scalablytyped.runtime.Shortcut
import typings.styledComponents.anon.A
import typings.styledComponents.anon.Attrs
import typings.styledComponents.nativeDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistIndexStandaloneMod extends Shortcut {
  
  @JSImport("styled-components/native/dist/index-standalone", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A = js.native
  
  type _To = (js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A
  
  /* This means you don't have to write `default`, but can instead just say `nativeDistIndexStandaloneMod.foo` */
  override def _to: (js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A = default
}
