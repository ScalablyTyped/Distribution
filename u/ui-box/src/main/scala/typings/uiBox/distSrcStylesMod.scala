package typings.uiBox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStylesMod {
  
  @JSImport("ui-box/dist/src/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(styles: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def getAll(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[String]
}
