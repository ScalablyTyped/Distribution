package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DebugConfig {
  
  @JSImport("wonder.js/dist/es2015", "DebugConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonder.js/dist/es2015", "DebugConfig.debugCollision")
  @js.native
  def debugCollision: Boolean = js.native
  inline def debugCollision_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugCollision")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder.js/dist/es2015", "DebugConfig.isTest")
  @js.native
  def isTest: Boolean = js.native
  inline def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder.js/dist/es2015", "DebugConfig.showDebugPanel")
  @js.native
  def showDebugPanel: Boolean = js.native
  inline def showDebugPanel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDebugPanel")(x.asInstanceOf[js.Any])
}
