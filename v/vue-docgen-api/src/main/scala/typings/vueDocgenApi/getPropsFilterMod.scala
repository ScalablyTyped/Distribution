package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.ObjectProperty_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPropsFilterMod {
  
  @JSImport("vue-docgen-api/dist/utils/getPropsFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(propName: String): js.Function1[/* propPath */ NodePath[ObjectProperty_, js.Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* propPath */ NodePath[ObjectProperty_, js.Any], Boolean]]
}
