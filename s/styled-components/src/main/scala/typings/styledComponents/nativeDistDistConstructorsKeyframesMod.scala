package typings.styledComponents

import typings.styledComponents.nativeDistDistTypesMod.Interpolation
import typings.styledComponents.nativeDistDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistConstructorsKeyframesMod {
  
  @JSImport("styled-components/native/dist/dist/constructors/keyframes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typings.styledComponents.nativeDistDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.styledComponents.nativeDistDistModelsKeyframesMod.default]
}
