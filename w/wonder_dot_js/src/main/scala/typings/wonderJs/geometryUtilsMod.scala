package typings.wonderJs

import typings.wonderJs.face3Mod.Face3
import typings.wonderJs.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/GeometryUtils", "GeometryUtils")
  @js.native
  class GeometryUtils () extends StObject
  /* static members */
  object GeometryUtils {
    
    @JSImport("wonder.js/dist/es2015/component/geometry/GeometryUtils", "GeometryUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertToFaces(indices: js.Array[Double]): js.Array[Face3] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToFaces")(indices.asInstanceOf[js.Any]).asInstanceOf[js.Array[Face3]]
    inline def convertToFaces(indices: js.Array[Double], normals: js.Array[Double]): js.Array[Face3] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToFaces")(indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Face3]]
    
    inline def getThreeComponent(sourceData: js.Array[Double], index: Double): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getThreeComponent")(sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def hasData(data: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasData")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def iterateThreeComponent(dataArr: js.Array[Double], iterator: js.Function1[/* v */ Vector3, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateThreeComponent")(dataArr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setThreeComponent(targetData: js.Array[Double], sourceData: js.Array[Double], index: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setThreeComponent")(targetData.asInstanceOf[js.Any], sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def setThreeComponent(targetData: js.Array[Double], sourceData: Vector3, index: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setThreeComponent")(targetData.asInstanceOf[js.Any], sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
