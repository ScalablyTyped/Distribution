package typings.three.threeMod

import typings.three.eventDispatcherMod.Event
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "BoxHelper")
@js.native
open class BoxHelper protected ()
  extends typings.three.boxHelperMod.BoxHelper {
  /**
    * @param object
    * @param [color=0xffff00]
    */
  def this(`object`: typings.three.object3DMod.Object3D[Event]) = this()
  def this(`object`: typings.three.object3DMod.Object3D[Event], color: ColorRepresentation) = this()
}
