package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chunk extends StObject {
  
  def chunk(arr: js.Array[Any], chunkSize: Double, cache: js.Array[Any]): js.Array[Any] = js.native
  
  def compareVersion(v1: String, v2: String): Double = js.native
  
  def get(`object`: js.Object, pathString: String): Any = js.native
  def get(`object`: js.Object, pathString: String, defaultValue: Any): Any = js.native
  
  def isArray(obj: Any): Boolean = js.native
  
  def isBoolean(obj: Any): Boolean = js.native
  
  def isDate(obj: Any): Boolean = js.native
  
  def isNil(obj: Any): Boolean = js.native
  
  def isNumerical(obj: Any): Boolean = js.native
  
  def isObject(obj: Any): Boolean = js.native
  
  def isRegExp(obj: Any): Boolean = js.native
  
  def isUndefined(obj: Any): Boolean = js.native
  
  def omit(`object`: js.Object, keys: String): js.Object = js.native
  
  def partition(str: String, chunk: Double): js.Array[String] = js.native
  
  def pick(`object`: js.Object, keys: String): js.Object = js.native
  
  def toFilled(str: String, count: Double): String = js.native
  def toFilled(str: Double, count: Double): String = js.native
  
  def toFixed(str: String, count: Double): String = js.native
  def toFixed(str: Double, count: Double): String = js.native
}
