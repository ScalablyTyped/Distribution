package typings.three.textGeometryMod

import typings.three.anon.BevelEnabled
import typings.three.extrudeGeometryMod.ExtrudeGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/TextGeometry", "TextGeometry")
@js.native
class TextGeometry protected () extends ExtrudeGeometry {
  def this(text: String, parameters: TextGeometryParameters) = this()
  var parameters: BevelEnabled = js.native
}

