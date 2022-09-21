package typings.three.threeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cache {
  
  @JSImport("three/src/Three", "Cache")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(key: String, file: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  /**
    * @default false
    */
  @JSImport("three/src/Three", "Cache.enabled")
  @js.native
  def enabled: Boolean = js.native
  inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  
  /**
    * @default {}
    */
  @JSImport("three/src/Three", "Cache.files")
  @js.native
  def files: Any = js.native
  inline def files_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("files")(x.asInstanceOf[js.Any])
  
  inline def get(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
