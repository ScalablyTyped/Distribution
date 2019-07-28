package typings.validatorjs.validatorjsMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorStatic
  extends Instantiable2[/* data */ js.Object, /* rules */ Rules, Validator[js.Object]]
     with Instantiable3[
      /* data */ js.Object, 
      /* rules */ Rules, 
      /* customMessages */ ErrorMessages, 
      Validator[js.Object]
    ] {
  def getDefaultLang(): String = js.native
  def getMessages(lang: String): ErrorMessages = js.native
  def register(name: String, fn: RegisterCallback): Unit = js.native
  def register(name: String, fn: RegisterCallback, message: String): Unit = js.native
  def registerAsync(name: String, fn: RegisterAsyncCallback, message: String): Unit = js.native
  def setAttributeFormatter(func: AttributeFormatter): Unit = js.native
  def setMessages(lang: String, messages: ErrorMessages): js.Any = js.native
  def stopOnError(attributes: js.Array[String]): Unit = js.native
  def stopOnError(attributes: Boolean): Unit = js.native
  def useLang(lang: String): Unit = js.native
}

