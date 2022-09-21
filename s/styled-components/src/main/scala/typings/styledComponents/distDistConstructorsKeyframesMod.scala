package typings.styledComponents

import typings.styledComponents.distDistTypesMod.Interpolation
import typings.styledComponents.distDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistConstructorsKeyframesMod {
  
  @JSImport("styled-components/primitives/dist/dist/constructors/keyframes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typings.styledComponents.distDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.styledComponents.distDistModelsKeyframesMod.default]
}
