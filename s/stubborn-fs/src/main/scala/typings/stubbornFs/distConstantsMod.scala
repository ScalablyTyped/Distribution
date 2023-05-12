package typings.stubbornFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstantsMod {
  
  @JSImport("stubborn-fs/dist/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stubborn-fs/dist/constants", "IS_USER_ROOT")
  @js.native
  val IS_USER_ROOT: Boolean = js.native
  
  @JSImport("stubborn-fs/dist/constants", "LIMIT_FILES_DESCRIPTORS")
  @js.native
  val LIMIT_FILES_DESCRIPTORS: /* 10000 */ Double = js.native
  
  inline def NOOP(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("NOOP")().asInstanceOf[Unit]
}
