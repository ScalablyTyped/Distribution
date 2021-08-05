package typings.stylefire

import typings.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportMod {
  
  @JSImport("stylefire/lib/viewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Styler]
  inline def default(
    hasProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.Props */ js.Any
  ): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Styler]
}
