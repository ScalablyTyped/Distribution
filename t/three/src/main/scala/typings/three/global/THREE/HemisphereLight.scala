package typings.three.global.THREE

import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.HemisphereLight")
@js.native
/**
  * @param skyColor
  * @param groundColor
  * @param [intensity=1]
  */
open class HemisphereLight ()
  extends typings.three.mod.HemisphereLight {
  def this(skyColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation, intensity: Double) = this()
}
