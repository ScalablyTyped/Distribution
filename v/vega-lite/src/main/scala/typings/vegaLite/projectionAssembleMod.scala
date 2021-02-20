package typings.vegaLite

import typings.vegaLite.modelMod.Model
import typings.vegaTypings.projectionMod.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/projection/assemble", "assembleProjectionForModel")
  @js.native
  def assembleProjectionForModel(model: Model): js.Array[Projection] = js.native
  
  @JSImport("vega-lite/build/src/compile/projection/assemble", "assembleProjections")
  @js.native
  def assembleProjections(model: Model): js.Array[Projection] = js.native
  
  @JSImport("vega-lite/build/src/compile/projection/assemble", "assembleProjectionsForModelAndChildren")
  @js.native
  def assembleProjectionsForModelAndChildren(model: Model): js.Array[Projection] = js.native
}
