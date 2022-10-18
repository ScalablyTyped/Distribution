package typings.three

import typings.three.anon.Distance
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLodMod {
  
  @JSImport("three/src/objects/LOD", "LOD")
  @js.native
  open class LOD () extends Object3D[Event] {
    
    def addLevel(`object`: Object3D[Event]): this.type = js.native
    def addLevel(`object`: Object3D[Event], distance: Double): this.type = js.native
    
    var autoUpdate: Boolean = js.native
    
    def getCurrentLevel(): Double = js.native
    
    def getObjectForDistance(distance: Double): Object3D[Event] | Null = js.native
    
    val isLOD: `true` = js.native
    
    var levels: js.Array[Distance] = js.native
    
    /**
      * @deprecated Use {@link LOD#levels .levels} instead.
      */
    var objects: js.Array[Any] = js.native
    
    def toJSON(meta: Any): Any = js.native
    
    @JSName("type")
    var type_LOD: typings.three.threeStrings.LOD = js.native
    
    def update(camera: Camera): Unit = js.native
  }
}
