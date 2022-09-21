package typings.typedoc

import typings.std.Record
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.kindMod.ReflectionKind
import typings.typedoc.typedocStrings.anchor
import typings.typedoc.typedocStrings.checkbox
import typings.typedoc.typedocStrings.chevronDown
import typings.typedoc.typedocStrings.chevronSmall
import typings.typedoc.typedocStrings.menu
import typings.typedoc.typedocStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearSeenIconCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSeenIconCache")().asInstanceOf[Unit]
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/icon", "icons")
  @js.native
  val icons: Record[
    ReflectionKind | chevronDown | checkbox | menu | search | chevronSmall | anchor, 
    js.Function0[JsxElement]
  ] = js.native
}
