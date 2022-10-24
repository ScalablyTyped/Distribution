package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsPropTypesMod {
  
  @JSImport("wix-style-react/dist/types/utils/propTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allValidators(validators: Any*): js.Function3[/* props */ Any, /* propName */ Any, /* componentName */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("allValidators")(validators.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function3[/* props */ Any, /* propName */ Any, /* componentName */ Any, Unit]]
  
  inline def extendPropTypes(Component: Any, propTypes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendPropTypes")(Component.asInstanceOf[js.Any], propTypes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
