package typings.winjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides helper functions for defining Classes.
**/
object Class {
  
  //#region Functions
  /**
    * Defines a class using the given constructor and the specified instance members.
    * @param constructor A constructor function that is used to instantiate this type.
    * @param instanceMembers The set of instance fields, properties, and methods made available on the type.
    * @param staticMembers The set of static fields, properties, and methods made available on the type.
    * @returns The newly-defined type.
    **/
  @JSImport("winjs", "Class.define")
  @js.native
  def define(): js.Any = js.native
  @JSImport("winjs", "Class.define")
  @js.native
  def define(
    constructor: js.UndefOr[scala.Nothing],
    instanceMembers: js.UndefOr[scala.Nothing],
    staticMembers: js.Any
  ): js.Any = js.native
  @JSImport("winjs", "Class.define")
  @js.native
  def define(constructor: js.UndefOr[scala.Nothing], instanceMembers: js.Any): js.Any = js.native
  @JSImport("winjs", "Class.define")
  @js.native
  def define(constructor: js.UndefOr[scala.Nothing], instanceMembers: js.Any, staticMembers: js.Any): js.Any = js.native
  @JSImport("winjs", "Class.define")
  @js.native
  def define(constructor: js.Function): js.Any = js.native
  @JSImport("winjs", "Class.define")
  @js.native
  def define(constructor: js.Function, instanceMembers: js.UndefOr[scala.Nothing], staticMembers: js.Any): js.Any = js.native
  @JSImport("winjs", "Class.define")
  @js.native
  def define(constructor: js.Function, instanceMembers: js.Any): js.Any = js.native
  @JSImport("winjs", "Class.define")
  @js.native
  def define(constructor: js.Function, instanceMembers: js.Any, staticMembers: js.Any): js.Any = js.native
  
  /**
    * Creates a sub-class based on the specified baseClass parameter, using prototype inheritance.
    * @param baseClass The type to inherit from.
    * @param constructor A constructor function that is used to instantiate this type.
    * @param instanceMembers The set of instance fields, properties, and methods to be made available on the type.
    * @param staticMembers The set of static fields, properties, and methods to be made available on the type.
    * @returns The newly-defined type.
    **/
  @JSImport("winjs", "Class.derive")
  @js.native
  def derive(baseClass: js.Any, constructor: js.Function): js.Any = js.native
  @JSImport("winjs", "Class.derive")
  @js.native
  def derive(
    baseClass: js.Any,
    constructor: js.Function,
    instanceMembers: js.UndefOr[scala.Nothing],
    staticMembers: js.Any
  ): js.Any = js.native
  @JSImport("winjs", "Class.derive")
  @js.native
  def derive(baseClass: js.Any, constructor: js.Function, instanceMembers: js.Any): js.Any = js.native
  @JSImport("winjs", "Class.derive")
  @js.native
  def derive(baseClass: js.Any, constructor: js.Function, instanceMembers: js.Any, staticMembers: js.Any): js.Any = js.native
  
  /**
    * Defines a class using the given constructor and the union of the set of instance members specified by all the mixin objects. The mixin parameter list is of variable length. For more information, see Adding functionality with WinJS mixins.
    * @param constructor A constructor function that will be used to instantiate this class.
    * @param mixin An object declaring the set of instance members. The mixin parameter list is of variable length.
    * @returns The newly defined class.
    **/
  @JSImport("winjs", "Class.mix")
  @js.native
  def mix(constructor: js.Function, mixin: js.Any*): js.Any = js.native
}
