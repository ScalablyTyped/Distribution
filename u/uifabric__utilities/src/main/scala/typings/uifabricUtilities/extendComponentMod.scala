package typings.uifabricUtilities

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendComponentMod {
  
  @JSImport("@uifabric/utilities/lib/extendComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendComponent[T /* <: Component[js.Object, js.Object, js.Any] */](
    parent: T,
    methods: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? T[key]}
    */ typings.uifabricUtilities.uifabricUtilitiesStrings.extendComponent & TopLevel[T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendComponent")(parent.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
