package typings.styledComponents

import typings.std.TemplateStringsArray
import typings.styledComponents.nativeDistTypesMod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsInterleaveMod {
  
  @JSImport("styled-components/native/dist/utils/interleave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: TemplateStringsArray, interpolations: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(strings.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Interpolation[Props]]]
}
