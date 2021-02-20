package typings.stylefire

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformPropsMod {
  
  @JSImport("stylefire/lib/css/transform-props", "isTransformOriginProp")
  @js.native
  def isTransformOriginProp(key: String): Boolean = js.native
  
  @JSImport("stylefire/lib/css/transform-props", "isTransformProp")
  @js.native
  def isTransformProp(key: String): Boolean = js.native
  
  @JSImport("stylefire/lib/css/transform-props", "sortTransformProps")
  @js.native
  def sortTransformProps(a: String, b: String): Double = js.native
  
  @JSImport("stylefire/lib/css/transform-props", "transformProps")
  @js.native
  val transformProps: js.Array[String] = js.native
}
