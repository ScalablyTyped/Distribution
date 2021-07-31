package typings.vscodeWindowsRegistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vscode-windows-registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def GetStringRegKey(hive: HKEY, path: String, name: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetStringRegKey")(hive.asInstanceOf[js.Any], path.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER
    - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE
    - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT
    - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS
    - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG
  */
  trait HKEY extends StObject
  object HKEY {
    
    @scala.inline
    def HKEY_CLASSES_ROOT: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT = "HKEY_CLASSES_ROOT".asInstanceOf[typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT]
    
    @scala.inline
    def HKEY_CURRENT_CONFIG: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG = "HKEY_CURRENT_CONFIG".asInstanceOf[typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG]
    
    @scala.inline
    def HKEY_CURRENT_USER: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER = "HKEY_CURRENT_USER".asInstanceOf[typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER]
    
    @scala.inline
    def HKEY_LOCAL_MACHINE: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE = "HKEY_LOCAL_MACHINE".asInstanceOf[typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE]
    
    @scala.inline
    def HKEY_USERS: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS = "HKEY_USERS".asInstanceOf[typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS]
  }
}
