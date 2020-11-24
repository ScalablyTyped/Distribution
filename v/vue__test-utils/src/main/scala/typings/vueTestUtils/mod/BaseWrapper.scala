package typings.vueTestUtils.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class of Wrapper and WrapperArray
  * It has common methods on both Wrapper and WrapperArray
  */
@js.native
trait BaseWrapper extends js.Object {
  
  def attributes(): StringDictionary[String] = js.native
  def attributes(key: String): String | Unit = js.native
  
  def classes(): js.Array[String] = js.native
  def classes(className: String): Boolean = js.native
  
  def contains(selector: Selector): Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def exists(): Boolean = js.native
  
  def is(selector: Selector): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def isVueInstance(): Boolean = js.native
  
  def overview(): Unit = js.native
  
  def props(): StringDictionary[js.Any] = js.native
  def props(key: String): js.Any | Unit = js.native
  
  var selector: Selector | Unit = js.native
  
  def setChecked(): js.Promise[Unit] | Unit = js.native
  def setChecked(checked: Boolean): js.Promise[Unit] | Unit = js.native
  
  def setData(data: js.Object): js.Promise[Unit] | Unit = js.native
  
  def setMethods(data: js.Object): Unit = js.native
  
  def setProps(props: js.Object): js.Promise[Unit] | Unit = js.native
  
  def setSelected(): js.Promise[Unit] | Unit = js.native
  
  def setValue(value: js.Any): js.Promise[Unit] | Unit = js.native
  
  def trigger(eventName: String): js.Promise[Unit] | Unit = js.native
  def trigger(eventName: String, options: js.Object): js.Promise[Unit] | Unit = js.native
}
