package typings.webcola

import typings.webcola.anon.Cola
import typings.webcola.anon.Links
import typings.webcola.geomMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMod {
  
  @JSImport("webcola/dist/src/batch", "gridify")
  @js.native
  def gridify(pgLayout: js.Any, nudgeGap: Double, margin: Double, groupMargin: Double): js.Array[js.Array[js.Array[Point]]] = js.native
  
  @JSImport("webcola/dist/src/batch", "powerGraphGridLayout")
  @js.native
  def powerGraphGridLayout(graph: Links, size: js.Array[Double], grouppadding: Double): Cola = js.native
}
