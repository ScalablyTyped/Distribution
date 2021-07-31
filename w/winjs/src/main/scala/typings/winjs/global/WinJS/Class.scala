package typings.winjs.global.WinJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides helper functions for defining Classes.
**/
object Class {
  
  @JSGlobal("WinJS.Class")
  @js.native
  val ^ : js.Any = js.native
  
  //#region Functions
  /**
    * Defines a class using the given constructor and the specified instance members.
    * @param constructor A constructor function that is used to instantiate this type.
    * @param instanceMembers The set of instance fields, properties, and methods made available on the type.
    * @param staticMembers The set of static fields, properties, and methods made available on the type.
    * @returns The newly-defined type.
    **/
  @scala.inline
  def define(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[js.Any]
  @scala.inline
  def define(constructor: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def define(constructor: js.Function, instanceMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(constructor: js.Function, instanceMembers: js.Any, staticMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(constructor: js.Function, instanceMembers: Unit, staticMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(constructor: Unit, instanceMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(constructor: Unit, instanceMembers: js.Any, staticMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def define(constructor: Unit, instanceMembers: Unit, staticMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Creates a sub-class based on the specified baseClass parameter, using prototype inheritance.
    * @param baseClass The type to inherit from.
    * @param constructor A constructor function that is used to instantiate this type.
    * @param instanceMembers The set of instance fields, properties, and methods to be made available on the type.
    * @param staticMembers The set of static fields, properties, and methods to be made available on the type.
    * @returns The newly-defined type.
    **/
  @scala.inline
  def derive(baseClass: js.Any, constructor: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def derive(baseClass: js.Any, constructor: js.Function, instanceMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def derive(baseClass: js.Any, constructor: js.Function, instanceMembers: js.Any, staticMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def derive(baseClass: js.Any, constructor: js.Function, instanceMembers: Unit, staticMembers: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Defines a class using the given constructor and the union of the set of instance members specified by all the mixin objects. The mixin parameter list is of variable length. For more information, see Adding functionality with WinJS mixins.
    * @param constructor A constructor function that will be used to instantiate this class.
    * @param mixin An object declaring the set of instance members. The mixin parameter list is of variable length.
    * @returns The newly defined class.
    **/
  @scala.inline
  def mix(constructor: js.Function, mixin: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(constructor.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
