package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "BasicGeometryData")
@js.native
class BasicGeometryData protected ()
  extends typings.wonderJs.basicGeometryDataMod.BasicGeometryData {
  def this(geometry: typings.wonderJs.geometryMod.Geometry) = this()
}
/* static members */
object BasicGeometryData {
  
  @JSImport("wonder.js/dist/es2015", "BasicGeometryData")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(geometry: typings.wonderJs.geometryMod.Geometry): typings.wonderJs.basicGeometryDataMod.BasicGeometryData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.basicGeometryDataMod.BasicGeometryData]
}
