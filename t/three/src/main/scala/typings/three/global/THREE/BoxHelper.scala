package typings.three.global.THREE

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.BoxHelper")
@js.native
open class BoxHelper protected ()
  extends typings.three.mod.BoxHelper {
  /**
    * Creates a new wireframe box that bounds the passed object
    * @remarks
    * Internally this uses {@link THREE.Box3.setFromObject | Box3.setFromObject} to calculate the dimensions
    * Note that this includes any children.
    * @param object The object3D to show the world-axis-aligned bounding box.
    * @param color Hexadecimal value that defines the box's color. Default `0xffff00`
    */
  def this(`object`: typings.three.srcCoreObject3DMod.Object3D[Event]) = this()
  def this(`object`: typings.three.srcCoreObject3DMod.Object3D[Event], color: ColorRepresentation) = this()
}
