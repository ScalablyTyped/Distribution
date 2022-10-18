package typings.styledComponents

import typings.styledComponents.nativeDistDistTypesMod.IInlineStyleConstructor
import typings.styledComponents.nativeDistDistTypesMod.StyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistModelsInlineStyleMod {
  
  @JSImport("styled-components/native/dist/dist/models/InlineStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](styleSheet: StyleSheet): IInlineStyleConstructor[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styleSheet.asInstanceOf[js.Any]).asInstanceOf[IInlineStyleConstructor[Props]]
  
  inline def resetStyleCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStyleCache")().asInstanceOf[Unit]
}
