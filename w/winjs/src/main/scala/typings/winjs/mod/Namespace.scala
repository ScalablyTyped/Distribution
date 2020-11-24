package typings.winjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides helper functions for defining namespaces. For more information, see Organizing your code with WinJS.Namespace.
**/
@JSImport("winjs", "Namespace")
@js.native
object Namespace extends js.Object {
  
  //#region Functions
  /**
    * Defines a new namespace with the specified name. For more information, see Organizing your code with WinJS.Namespace.
    * @param name The name of the namespace. This could be a dot-separated name for nested namespaces.
    * @param members The members of the new namespace.
    * @returns The newly-defined namespace.
    **/
  def define(): js.Any = js.native
  def define(name: js.UndefOr[scala.Nothing], members: js.Any): js.Any = js.native
  def define(name: String): js.Any = js.native
  def define(name: String, members: js.Any): js.Any = js.native
  
  /**
    * Defines a new namespace with the specified name under the specified parent namespace. For more information, see Organizing your code with WinJS.Namespace.
    * @param parentNamespace The parent namespace.
    * @param name The name of the new namespace.
    * @param members The members of the new namespace.
    * @returns The newly-defined namespace.
    **/
  def defineWithParent(): js.Any = js.native
  def defineWithParent(parentNamespace: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], members: js.Any): js.Any = js.native
  def defineWithParent(parentNamespace: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
  def defineWithParent(parentNamespace: js.UndefOr[scala.Nothing], name: String, members: js.Any): js.Any = js.native
  def defineWithParent(parentNamespace: js.Any): js.Any = js.native
  def defineWithParent(parentNamespace: js.Any, name: js.UndefOr[scala.Nothing], members: js.Any): js.Any = js.native
  def defineWithParent(parentNamespace: js.Any, name: String): js.Any = js.native
  def defineWithParent(parentNamespace: js.Any, name: String, members: js.Any): js.Any = js.native
}
