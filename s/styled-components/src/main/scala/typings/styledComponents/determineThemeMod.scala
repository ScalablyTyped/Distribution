package typings.styledComponents

import typings.styledComponents.distTypesMod.ExtensibleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object determineThemeMod {
  
  @JSImport("styled-components/native/dist/dist/utils/determineTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ExtensibleObject, providedTheme: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], providedTheme.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default(props: ExtensibleObject, providedTheme: Any, defaultProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], providedTheme.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[Any]
}
