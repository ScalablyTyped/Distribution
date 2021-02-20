package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "FunctionFactory")
@js.native
class FunctionFactory () extends StObject {
  
  def clear(): Unit = js.native
  
  def getAll(): js.Array[String] = js.native
  
  def hasFunction(name: String): Boolean = js.native
  
  def isAsyncFunction(name: String): Boolean = js.native
  
  def register(name: String, func: js.Function1[/* params */ js.Array[_], _]): Unit = js.native
  def register(name: String, func: js.Function1[/* params */ js.Array[_], _], isAsync: Boolean): Unit = js.native
  
  def run(name: String, params: js.Array[_]): js.Any = js.native
  def run(name: String, params: js.Array[_], properties: HashTable[_]): js.Any = js.native
  
  def unregister(name: String): Unit = js.native
}
/* static members */
object FunctionFactory {
  
  @JSImport("survey-knockout", "FunctionFactory")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "FunctionFactory.Instance")
  @js.native
  def Instance: FunctionFactory = js.native
  @scala.inline
  def Instance_=(x: FunctionFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
