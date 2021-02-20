package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camelize extends StObject {
  
  def camelize(str: String): String = js.native
  
  def hexStringToBinString(str: String): String = js.native
  
  def hexStringToNumber(str: String): js.Array[Double] = js.native
  
  def strToHexString(str: String): String = js.native
}
object Camelize {
  
  @scala.inline
  def apply(
    camelize: String => String,
    hexStringToBinString: String => String,
    hexStringToNumber: String => js.Array[Double],
    strToHexString: String => String
  ): Camelize = {
    val __obj = js.Dynamic.literal(camelize = js.Any.fromFunction1(camelize), hexStringToBinString = js.Any.fromFunction1(hexStringToBinString), hexStringToNumber = js.Any.fromFunction1(hexStringToNumber), strToHexString = js.Any.fromFunction1(strToHexString))
    __obj.asInstanceOf[Camelize]
  }
  
  @scala.inline
  implicit class CamelizeMutableBuilder[Self <: Camelize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamelize(value: String => String): Self = StObject.set(x, "camelize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHexStringToBinString(value: String => String): Self = StObject.set(x, "hexStringToBinString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHexStringToNumber(value: String => js.Array[Double]): Self = StObject.set(x, "hexStringToNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStrToHexString(value: String => String): Self = StObject.set(x, "strToHexString", js.Any.fromFunction1(value))
  }
}
