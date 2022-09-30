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
  inline def define(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[Any]
  inline def define(constructor: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def define(constructor: js.Function, instanceMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(constructor: js.Function, instanceMembers: Any, staticMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(constructor: js.Function, instanceMembers: Unit, staticMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(constructor: Unit, instanceMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(constructor: Unit, instanceMembers: Any, staticMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(constructor: Unit, instanceMembers: Unit, staticMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Creates a sub-class based on the specified baseClass parameter, using prototype inheritance.
    * @param baseClass The type to inherit from.
    * @param constructor A constructor function that is used to instantiate this type.
    * @param instanceMembers The set of instance fields, properties, and methods to be made available on the type.
    * @param staticMembers The set of static fields, properties, and methods to be made available on the type.
    * @returns The newly-defined type.
    **/
  inline def derive(baseClass: Any, constructor: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def derive(baseClass: Any, constructor: js.Function, instanceMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def derive(baseClass: Any, constructor: js.Function, instanceMembers: Any, staticMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def derive(baseClass: Any, constructor: js.Function, instanceMembers: Unit, staticMembers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(baseClass.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], instanceMembers.asInstanceOf[js.Any], staticMembers.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Defines a class using the given constructor and the union of the set of instance members specified by all the mixin objects. The mixin parameter list is of variable length. For more information, see Adding functionality with WinJS mixins.
    * @param constructor A constructor function that will be used to instantiate this class.
    * @param mixin An object declaring the set of instance members. The mixin parameter list is of variable length.
    * @returns The newly defined class.
    **/
  inline def mix(constructor: js.Function, mixin: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mix")(scala.List(constructor.asInstanceOf[js.Any]).`++`(mixin.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
