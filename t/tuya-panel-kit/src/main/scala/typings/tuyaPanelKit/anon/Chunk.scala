package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chunk extends js.Object {
  
  def chunk(arr: js.Array[js.Any], chunkSize: Double, cache: js.Array[js.Any]): js.Array[js.Any] = js.native
  
  def compareVersion(v1: String, v2: String): Double = js.native
  
  def get(`object`: js.Object, pathString: String): js.Any = js.native
  def get(`object`: js.Object, pathString: String, defaultValue: js.Any): js.Any = js.native
  
  def isArray(obj: js.Any): Boolean = js.native
  
  def isBoolean(obj: js.Any): Boolean = js.native
  
  def isDate(obj: js.Any): Boolean = js.native
  
  def isNil(obj: js.Any): Boolean = js.native
  
  def isNumerical(obj: js.Any): Boolean = js.native
  
  def isObject(obj: js.Any): Boolean = js.native
  
  def isRegExp(obj: js.Any): Boolean = js.native
  
  def isUndefined(obj: js.Any): Boolean = js.native
  
  def omit(`object`: js.Object, keys: String): js.Object = js.native
  
  def partition(str: String, chunk: Double): js.Array[String] = js.native
  
  def pick(`object`: js.Object, keys: String): js.Object = js.native
  
  def toFilled(str: String, count: Double): String = js.native
  def toFilled(str: Double, count: Double): String = js.native
  
  def toFixed(str: String, count: Double): String = js.native
  def toFixed(str: Double, count: Double): String = js.native
}
