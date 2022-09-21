package typings.three.threeMod

import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "DirectionalLight")
@js.native
open class DirectionalLight ()
  extends typings.three.directionalLightMod.DirectionalLight {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
}
