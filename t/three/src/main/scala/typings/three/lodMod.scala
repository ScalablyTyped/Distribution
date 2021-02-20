package typings.three

import typings.three.anon.Distance
import typings.three.cameraMod.Camera
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lodMod {
  
  @JSImport("three/src/objects/LOD", "LOD")
  @js.native
  class LOD () extends Object3D {
    
    def addLevel(`object`: Object3D): this.type = js.native
    def addLevel(`object`: Object3D, distance: Double): this.type = js.native
    
    var autoUpdate: Boolean = js.native
    
    def getCurrentLevel(): Double = js.native
    
    def getObjectForDistance(distance: Double): Object3D | Null = js.native
    
    val isLOD: `true` = js.native
    
    var levels: js.Array[Distance] = js.native
    
    /**
    	 * @deprecated Use {@link LOD#levels .levels} instead.
    	 */
    var objects: js.Array[_] = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
    @JSName("type")
    var type_LOD: typings.three.threeStrings.LOD = js.native
    
    def update(camera: Camera): Unit = js.native
  }
}
