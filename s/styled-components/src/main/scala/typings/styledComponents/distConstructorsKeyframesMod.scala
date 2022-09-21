package typings.styledComponents

import typings.styledComponents.primitivesDistTypesMod.Interpolation
import typings.styledComponents.primitivesDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstructorsKeyframesMod {
  
  @JSImport("styled-components/primitives/dist/constructors/keyframes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typings.styledComponents.primitivesDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.styledComponents.primitivesDistModelsKeyframesMod.default]
}
