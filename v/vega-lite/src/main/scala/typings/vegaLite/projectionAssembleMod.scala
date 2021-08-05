package typings.vegaLite

import typings.vegaLite.modelMod.Model
import typings.vegaTypings.projectionMod.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/projection/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleProjectionForModel(model: Model): js.Array[Projection] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleProjectionForModel")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Projection]]
  
  inline def assembleProjections(model: Model): js.Array[Projection] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleProjections")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Projection]]
  
  inline def assembleProjectionsForModelAndChildren(model: Model): js.Array[Projection] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleProjectionsForModelAndChildren")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Projection]]
}
