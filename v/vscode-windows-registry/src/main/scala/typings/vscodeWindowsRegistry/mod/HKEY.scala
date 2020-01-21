package typings.vscodeWindowsRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER
  - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE
  - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT
  - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS
  - typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG
*/
trait HKEY extends js.Object

object HKEY {
  @scala.inline
  def HKEY_CLASSES_ROOT: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CLASSES_ROOT = this.cast("HKEY_CLASSES_ROOT")
  @scala.inline
  def HKEY_CURRENT_CONFIG: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_CONFIG = this.cast("HKEY_CURRENT_CONFIG")
  @scala.inline
  def HKEY_CURRENT_USER: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_CURRENT_USER = this.cast("HKEY_CURRENT_USER")
  @scala.inline
  def HKEY_LOCAL_MACHINE: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_LOCAL_MACHINE = this.cast("HKEY_LOCAL_MACHINE")
  @scala.inline
  def HKEY_USERS: typings.vscodeWindowsRegistry.vscodeWindowsRegistryStrings.HKEY_USERS = this.cast("HKEY_USERS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

