package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camelize extends js.Object {
  
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
  implicit class CamelizeOps[Self <: Camelize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCamelize(value: String => String): Self = this.set("camelize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHexStringToBinString(value: String => String): Self = this.set("hexStringToBinString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHexStringToNumber(value: String => js.Array[Double]): Self = this.set("hexStringToNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStrToHexString(value: String => String): Self = this.set("strToHexString", js.Any.fromFunction1(value))
  }
}
