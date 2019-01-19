package typings
package validatorjsLib.validatorjsMod.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorStatic
  extends org.scalablytyped.runtime.Instantiable2[/* data */ js.Object, /* rules */ Rules, Validator[js.Object]]
     with org.scalablytyped.runtime.Instantiable3[
      /* data */ js.Object, 
      /* rules */ Rules, 
      /* customMessages */ ErrorMessages, 
      Validator[js.Object]
    ] {
  def getDefaultLang(): java.lang.String = js.native
  def getMessages(lang: java.lang.String): ErrorMessages = js.native
  def register(name: java.lang.String, fn: RegisterCallback): scala.Unit = js.native
  def register(name: java.lang.String, fn: RegisterCallback, message: java.lang.String): scala.Unit = js.native
  def registerAsync(name: java.lang.String, fn: RegisterAsyncCallback, message: java.lang.String): scala.Unit = js.native
  def setAttributeFormatter(func: AttributeFormatter): scala.Unit = js.native
  def setMessages(lang: java.lang.String, messages: ErrorMessages): js.Any = js.native
  def stopOnError(attributes: js.Array[java.lang.String]): scala.Unit = js.native
  def stopOnError(attributes: scala.Boolean): scala.Unit = js.native
  def useLang(lang: java.lang.String): scala.Unit = js.native
}

