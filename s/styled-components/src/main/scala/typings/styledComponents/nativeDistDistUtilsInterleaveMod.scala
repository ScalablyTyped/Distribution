package typings.styledComponents

import typings.std.TemplateStringsArray
import typings.styledComponents.nativeDistDistTypesMod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistUtilsInterleaveMod {
  
  @JSImport("styled-components/native/dist/dist/utils/interleave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: TemplateStringsArray, interpolations: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(strings.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Interpolation[Props]]]
}
