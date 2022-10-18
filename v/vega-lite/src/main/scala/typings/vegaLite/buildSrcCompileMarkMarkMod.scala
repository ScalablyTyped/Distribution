package typings.vegaLite

import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaTypings.typesSpecMarkMod.Compare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkMarkMod {
  
  @JSImport("vega-lite/build/src/compile/mark/mark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSort(model: UnitModel): Compare = ^.asInstanceOf[js.Dynamic].applyDynamic("getSort")(model.asInstanceOf[js.Any]).asInstanceOf[Compare]
  
  inline def parseMarkGroups(model: UnitModel): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarkGroups")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
