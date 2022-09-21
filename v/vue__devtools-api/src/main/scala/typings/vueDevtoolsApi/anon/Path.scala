package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.hooksMod.EditStatePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends StObject {
  
  var app: typings.vueDevtoolsApi.appMod.App = js.native
  
  var componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance = js.native
  
  var path: js.Array[String] = js.native
  
  def set(`object`: Any): Unit = js.native
  def set(`object`: Any, path: String): Unit = js.native
  def set(`object`: Any, path: String, value: Any): Unit = js.native
  def set(
    `object`: Any,
    path: String,
    value: Any,
    cb: js.Function3[/* object */ Any, /* field */ String, /* value */ Any, Unit]
  ): Unit = js.native
  def set(
    `object`: Any,
    path: String,
    value: Unit,
    cb: js.Function3[/* object */ Any, /* field */ String, /* value */ Any, Unit]
  ): Unit = js.native
  def set(`object`: Any, path: js.Array[String]): Unit = js.native
  def set(`object`: Any, path: js.Array[String], value: Any): Unit = js.native
  def set(
    `object`: Any,
    path: js.Array[String],
    value: Any,
    cb: js.Function3[/* object */ Any, /* field */ String, /* value */ Any, Unit]
  ): Unit = js.native
  def set(
    `object`: Any,
    path: js.Array[String],
    value: Unit,
    cb: js.Function3[/* object */ Any, /* field */ String, /* value */ Any, Unit]
  ): Unit = js.native
  def set(`object`: Any, path: Unit, value: Any): Unit = js.native
  def set(
    `object`: Any,
    path: Unit,
    value: Any,
    cb: js.Function3[/* object */ Any, /* field */ String, /* value */ Any, Unit]
  ): Unit = js.native
  def set(
    `object`: Any,
    path: Unit,
    value: Unit,
    cb: js.Function3[/* object */ Any, /* field */ String, /* value */ Any, Unit]
  ): Unit = js.native
  
  var state: EditStatePayload = js.native
  
  var `type`: String = js.native
}
