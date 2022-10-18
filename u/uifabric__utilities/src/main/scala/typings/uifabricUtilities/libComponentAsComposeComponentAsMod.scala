package typings.uifabricUtilities

import typings.uifabricUtilities.libIcomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentAsComposeComponentAsMod {
  
  @JSImport("@uifabric/utilities/lib/componentAs/composeComponentAs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeComponentAs[TProps](outer: IComponentAs[TProps], inner: IComponentAs[TProps]): IComponentAs[TProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeComponentAs")(outer.asInstanceOf[js.Any], inner.asInstanceOf[js.Any])).asInstanceOf[IComponentAs[TProps]]
}
