package typings.yeast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Yeast: A tiny growing id generator.
    */
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  
  @JSImport("yeast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return the integer value specified by the given string.
    */
  @scala.inline
  def decode(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Return a string representing the specified number.
    */
  @scala.inline
  def encode(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(num.asInstanceOf[js.Any]).asInstanceOf[String]
}
