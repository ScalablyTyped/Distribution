package typings.winjs.global.WinJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides helper functions for defining namespaces. For more information, see Organizing your code with WinJS.Namespace.
**/
object Namespace {
  
  @JSGlobal("WinJS.Namespace")
  @js.native
  val ^ : js.Any = js.native
  
  //#region Functions
  /**
    * Defines a new namespace with the specified name. For more information, see Organizing your code with WinJS.Namespace.
    * @param name The name of the namespace. This could be a dot-separated name for nested namespaces.
    * @param members The members of the new namespace.
    * @returns The newly-defined namespace.
    **/
  @scala.inline
  def define(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[js.Any]
  @scala.inline
  def define(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def define(name: String, members: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(name: Unit, members: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Defines a new namespace with the specified name under the specified parent namespace. For more information, see Organizing your code with WinJS.Namespace.
    * @param parentNamespace The parent namespace.
    * @param name The name of the new namespace.
    * @param members The members of the new namespace.
    * @returns The newly-defined namespace.
    **/
  @scala.inline
  def defineWithParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")().asInstanceOf[js.Any]
  @scala.inline
  def defineWithParent(parentNamespace: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")(parentNamespace.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def defineWithParent(parentNamespace: js.Any, name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")(parentNamespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def defineWithParent(parentNamespace: js.Any, name: String, members: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")(parentNamespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def defineWithParent(parentNamespace: js.Any, name: Unit, members: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")(parentNamespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def defineWithParent(parentNamespace: Unit, name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")(parentNamespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def defineWithParent(parentNamespace: Unit, name: String, members: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")(parentNamespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def defineWithParent(parentNamespace: Unit, name: Unit, members: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineWithParent")(parentNamespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
