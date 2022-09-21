package typings.styledComponents

import typings.styledComponents.distTypesMod.Interpolation
import typings.styledComponents.distTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructorsKeyframesMod {
  
  @JSImport("styled-components/native/dist/dist/constructors/keyframes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typings.styledComponents.modelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.styledComponents.modelsKeyframesMod.default]
}
