package typings.three.srcThreeMod

import typings.three.srcCoreEventDispatcherMod.BaseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Object3D")
@js.native
/**
  * This creates a new {@link Object3D} object.
  */
open class Object3D[E /* <: BaseEvent */] ()
  extends typings.three.srcCoreObject3DMod.Object3D[E]
/* static members */
object Object3D {
  
  @JSImport("three/src/Three", "Object3D")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default setting for {@link matrixAutoUpdate} for newly created Object3Ds.
    * @defaultValue `true`
    */
  @JSImport("three/src/Three", "Object3D.DEFAULT_MATRIX_AUTO_UPDATE")
  @js.native
  def DEFAULT_MATRIX_AUTO_UPDATE: Boolean = js.native
  inline def DEFAULT_MATRIX_AUTO_UPDATE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MATRIX_AUTO_UPDATE")(x.asInstanceOf[js.Any])
  
  /**
    * The default setting for {@link matrixWorldAutoUpdate} for newly created Object3Ds.
    * @defaultValue `true`
    */
  @JSImport("three/src/Three", "Object3D.DEFAULT_MATRIX_WORLD_AUTO_UPDATE")
  @js.native
  def DEFAULT_MATRIX_WORLD_AUTO_UPDATE: Boolean = js.native
  inline def DEFAULT_MATRIX_WORLD_AUTO_UPDATE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MATRIX_WORLD_AUTO_UPDATE")(x.asInstanceOf[js.Any])
  
  /**
    * The default {@link up} direction for objects, also used as the default position for {@link THREE.DirectionalLight | DirectionalLight},
    * {@link THREE.HemisphereLight | HemisphereLight} and {@link THREE.Spotlight | Spotlight} (which creates lights shining from the top down).
    * @defaultValue `new THREE.Vector3( 0, 1, 0)`
    */
  @JSImport("three/src/Three", "Object3D.DEFAULT_UP")
  @js.native
  def DEFAULT_UP: typings.three.srcMathVector3Mod.Vector3 = js.native
  inline def DEFAULT_UP_=(x: typings.three.srcMathVector3Mod.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_UP")(x.asInstanceOf[js.Any])
}
