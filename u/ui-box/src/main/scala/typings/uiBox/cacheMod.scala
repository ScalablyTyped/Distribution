package typings.uiBox

import typings.uiBox.typesEnhancersMod.BoxPropValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("ui-box/dist/src/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def entries(): js.Array[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[js.Array[js.Tuple2[String, String]]]
  
  inline def get(property: String, value: CacheValue): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def hydrate(newEntries: js.Array[CacheEntry]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(newEntries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def set(property: String, value: js.Object, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(property: String, value: CacheValue, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CacheEntry = js.Tuple2[String, String]
  
  type CacheValue = BoxPropValue
}
