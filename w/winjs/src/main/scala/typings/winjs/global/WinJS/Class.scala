package typings.winjs.global.WinJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides helper functions for defining Classes.
**/
@JSGlobal("WinJS.Class")
@js.native
object Class extends js.Object {
  
  //#region Functions
  /**
    * Defines a class using the given constructor and the specified instance members.
    * @param constructor A constructor function that is used to instantiate this type.
    * @param instanceMembers The set of instance fields, properties, and methods made available on the type.
    * @param staticMembers The set of static fields, properties, and methods made available on the type.
    * @returns The newly-defined type.
    **/
  def define(): js.Any = js.native
  def define(
    constructor: js.UndefOr[scala.Nothing],
    instanceMembers: js.UndefOr[scala.Nothing],
    staticMembers: js.Any
  ): js.Any = js.native
  def define(constructor: js.UndefOr[scala.Nothing], instanceMembers: js.Any): js.Any = js.native
  def define(constructor: js.UndefOr[scala.Nothing], instanceMembers: js.Any, staticMembers: js.Any): js.Any = js.native
  def define(constructor: js.Function): js.Any = js.native
  def define(constructor: js.Function, instanceMembers: js.UndefOr[scala.Nothing], staticMembers: js.Any): js.Any = js.native
  def define(constructor: js.Function, instanceMembers: js.Any): js.Any = js.native
  def define(constructor: js.Function, instanceMembers: js.Any, staticMembers: js.Any): js.Any = js.native
  
  /**
    * Creates a sub-class based on the specified baseClass parameter, using prototype inheritance.
    * @param baseClass The type to inherit from.
    * @param constructor A constructor function that is used to instantiate this type.
    * @param instanceMembers The set of instance fields, properties, and methods to be made available on the type.
    * @param staticMembers The set of static fields, properties, and methods to be made available on the type.
    * @returns The newly-defined type.
    **/
  def derive(baseClass: js.Any, constructor: js.Function): js.Any = js.native
  def derive(
    baseClass: js.Any,
    constructor: js.Function,
    instanceMembers: js.UndefOr[scala.Nothing],
    staticMembers: js.Any
  ): js.Any = js.native
  def derive(baseClass: js.Any, constructor: js.Function, instanceMembers: js.Any): js.Any = js.native
  def derive(baseClass: js.Any, constructor: js.Function, instanceMembers: js.Any, staticMembers: js.Any): js.Any = js.native
  
  /**
    * Defines a class using the given constructor and the union of the set of instance members specified by all the mixin objects. The mixin parameter list is of variable length. For more information, see Adding functionality with WinJS mixins.
    * @param constructor A constructor function that will be used to instantiate this class.
    * @param mixin An object declaring the set of instance members. The mixin parameter list is of variable length.
    * @returns The newly defined class.
    **/
  def mix(constructor: js.Function, mixin: js.Any*): js.Any = js.native
}
