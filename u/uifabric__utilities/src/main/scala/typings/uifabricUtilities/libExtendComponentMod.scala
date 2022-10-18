package typings.uifabricUtilities

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExtendComponentMod {
  
  @JSImport("@uifabric/utilities/lib/extendComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendComponent[T /* <: Component[js.Object, js.Object, Any] */](
    parent: T,
    methods: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]:? T[key]} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendComponent")(parent.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
