package typings.yeast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Yeast: A tiny growing id generator.
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  
  @JSImport("yeast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return the integer value specified by the given string.
    */
  inline def decode(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Return a string representing the specified number.
    */
  inline def encode(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(num.asInstanceOf[js.Any]).asInstanceOf[String]
}
