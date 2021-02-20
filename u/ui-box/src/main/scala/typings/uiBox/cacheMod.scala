package typings.uiBox

import typings.uiBox.typesEnhancersMod.BoxPropValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("ui-box/dist/src/cache", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("ui-box/dist/src/cache", "entries")
  @js.native
  def entries(): js.Array[js.Tuple2[String, String]] = js.native
  
  @JSImport("ui-box/dist/src/cache", "get")
  @js.native
  def get(property: String, value: CacheValue): js.UndefOr[String] = js.native
  
  @JSImport("ui-box/dist/src/cache", "hydrate")
  @js.native
  def hydrate(newEntries: js.Array[CacheEntry]): Unit = js.native
  
  @JSImport("ui-box/dist/src/cache", "set")
  @js.native
  def set(property: String, value: js.Object, className: String): Unit = js.native
  @JSImport("ui-box/dist/src/cache", "set")
  @js.native
  def set(property: String, value: CacheValue, className: String): Unit = js.native
  
  type CacheEntry = js.Tuple2[String, String]
  
  type CacheValue = BoxPropValue
}
