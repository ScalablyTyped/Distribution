package typings.wordpressBlockLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-library", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerCoreBlocks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCoreBlocks")().asInstanceOf[Unit]
}
