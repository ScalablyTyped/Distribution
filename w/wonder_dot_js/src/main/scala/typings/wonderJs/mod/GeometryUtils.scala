package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "GeometryUtils")
@js.native
class GeometryUtils ()
  extends typings.wonderJs.geometryUtilsMod.GeometryUtils
/* static members */
object GeometryUtils {
  
  @JSImport("wonder.js/dist/es2015", "GeometryUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertToFaces(indices: js.Array[Double]): js.Array[typings.wonderJs.face3Mod.Face3] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToFaces")(indices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.wonderJs.face3Mod.Face3]]
  @scala.inline
  def convertToFaces(indices: js.Array[Double], normals: js.Array[Double]): js.Array[typings.wonderJs.face3Mod.Face3] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToFaces")(indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.wonderJs.face3Mod.Face3]]
  
  @scala.inline
  def getThreeComponent(sourceData: js.Array[Double], index: Double): typings.wonderJs.vector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getThreeComponent")(sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.vector3Mod.Vector3]
  
  @scala.inline
  def hasData(data: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasData")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def iterateThreeComponent(
    dataArr: js.Array[Double],
    iterator: js.Function1[/* v */ typings.wonderJs.vector3Mod.Vector3, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateThreeComponent")(dataArr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setThreeComponent(targetData: js.Array[Double], sourceData: js.Array[Double], index: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setThreeComponent")(targetData.asInstanceOf[js.Any], sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def setThreeComponent(targetData: js.Array[Double], sourceData: typings.wonderJs.vector3Mod.Vector3, index: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setThreeComponent")(targetData.asInstanceOf[js.Any], sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
