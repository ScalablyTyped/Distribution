package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cache {
  
  @JSImport("three", "Cache")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "Cache.add")
  @js.native
  def add(key: String, file: js.Any): Unit = js.native
  
  @JSImport("three", "Cache.clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("three", "Cache.enabled")
  @js.native
  def enabled: Boolean = js.native
  @scala.inline
  def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  
  @JSImport("three", "Cache.files")
  @js.native
  def files: js.Any = js.native
  @scala.inline
  def files_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("files")(x.asInstanceOf[js.Any])
  
  @JSImport("three", "Cache.get")
  @js.native
  def get(key: String): js.Any = js.native
  
  @JSImport("three", "Cache.remove")
  @js.native
  def remove(key: String): Unit = js.native
}
