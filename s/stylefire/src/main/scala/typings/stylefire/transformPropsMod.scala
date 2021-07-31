package typings.stylefire

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformPropsMod {
  
  @JSImport("stylefire/lib/css/transform-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isTransformOriginProp(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformOriginProp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTransformProp(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformProp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def sortTransformProps(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortTransformProps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("stylefire/lib/css/transform-props", "transformProps")
  @js.native
  val transformProps: js.Array[String] = js.native
}
