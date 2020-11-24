package typings.three.textBufferGeometryMod

import typings.three.anon.BevelEnabled
import typings.three.extrudeBufferGeometryMod.ExtrudeBufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/TextBufferGeometry", "TextBufferGeometry")
@js.native
class TextBufferGeometry protected () extends ExtrudeBufferGeometry {
  def this(text: String, parameters: TextGeometryParameters) = this()
  
  var parameters: BevelEnabled = js.native
}
