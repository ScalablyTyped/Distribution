package typings.unzalgo

import typings.unzalgo.anon.DetectionThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unzalgo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(string: String, options: DetectionThreshold): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def clean(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def clean(string: String, options: DetectionThreshold): String = (^.asInstanceOf[js.Dynamic].applyDynamic("clean")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def computeScores(string: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeScores")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def isZalgo(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZalgo")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isZalgo(string: String, threshold: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isZalgo")(string.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
