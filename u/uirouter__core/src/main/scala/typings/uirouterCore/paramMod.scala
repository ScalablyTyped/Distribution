package typings.uirouterCore

import typings.uirouterCore.anon.DefaultValue
import typings.uirouterCore.anon.From
import typings.uirouterCore.libUrlMod.UrlConfig
import typings.uirouterCore.paramTypeMod.ParamType
import typings.uirouterCore.paramsInterfaceMod.RawParams
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paramMod {
  
  @js.native
  sealed trait DefType extends StObject
  @JSImport("@uirouter/core/lib/params/param", "DefType")
  @js.native
  object DefType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DefType with Double] = js.native
    
    @js.native
    sealed trait CONFIG extends DefType
    /* 2 */ val CONFIG: typings.uirouterCore.paramMod.DefType.CONFIG with Double = js.native
    
    @js.native
    sealed trait PATH extends DefType
    /* 0 */ val PATH: typings.uirouterCore.paramMod.DefType.PATH with Double = js.native
    
    @js.native
    sealed trait SEARCH extends DefType
    /* 1 */ val SEARCH: typings.uirouterCore.paramMod.DefType.SEARCH with Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/params/param", "Param")
  @js.native
  class Param protected () extends StObject {
    def this(id: String, `type`: ParamType, location: DefType, urlConfig: UrlConfig, state: StateDeclaration) = this()
    
    /** Cache the default value if it is a static value */
    var _defaultValueCache: DefaultValue = js.native
    
    var array: Boolean = js.native
    
    var config: js.Any = js.native
    
    var dynamic: Boolean = js.native
    
    var id: String = js.native
    
    var inherit: Boolean = js.native
    
    def isDefaultValue(value: js.Any): Boolean = js.native
    
    var isOptional: Boolean = js.native
    
    def isSearch(): Boolean = js.native
    
    var location: DefType = js.native
    
    var raw: Boolean = js.native
    
    var replace: js.Array[From] = js.native
    
    var squash: Boolean | String = js.native
    
    var `type`: ParamType = js.native
    
    def validates(value: js.Any): Boolean = js.native
    
    /**
      * [Internal] Gets the decoded representation of a value if the value is defined, otherwise, returns the
      * default value, which may be the result of an injectable function.
      */
    def value(): js.Any = js.native
    def value(value: js.Any): js.Any = js.native
  }
  /* static members */
  object Param {
    
    /**
      * Finds [[Param]] objects which have different param values
      *
      * Filters a list of [[Param]] objects to only those whose parameter values differ in two param value objects
      *
      * @param params: The list of Param objects to filter
      * @param values1: The first set of parameter values
      * @param values2: the second set of parameter values
      *
      * @returns any Param objects whose values were different between values1 and values2
      */
    @JSImport("@uirouter/core/lib/params/param", "Param.changed")
    @js.native
    def changed(params: js.Array[Param]): js.Array[Param] = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.changed")
    @js.native
    def changed(params: js.Array[Param], values1: js.UndefOr[scala.Nothing], values2: RawParams): js.Array[Param] = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.changed")
    @js.native
    def changed(params: js.Array[Param], values1: RawParams): js.Array[Param] = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.changed")
    @js.native
    def changed(params: js.Array[Param], values1: RawParams, values2: RawParams): js.Array[Param] = js.native
    
    /**
      * Checks if two param value objects are equal (for a set of [[Param]] objects)
      *
      * @param params The list of [[Param]] objects to check
      * @param values1 The first set of param values
      * @param values2 The second set of param values
      *
      * @returns true if the param values in values1 and values2 are equal
      */
    @JSImport("@uirouter/core/lib/params/param", "Param.equals")
    @js.native
    def equals(params: js.Array[Param]): Boolean = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.equals")
    @js.native
    def equals(params: js.Array[Param], values1: js.UndefOr[scala.Nothing], values2: js.Object): Boolean = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.equals")
    @js.native
    def equals(params: js.Array[Param], values1: js.Object): Boolean = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.equals")
    @js.native
    def equals(params: js.Array[Param], values1: js.Object, values2: js.Object): Boolean = js.native
    
    /** Returns true if a the parameter values are valid, according to the Param definitions */
    @JSImport("@uirouter/core/lib/params/param", "Param.validates")
    @js.native
    def validates(params: js.Array[Param]): Boolean = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.validates")
    @js.native
    def validates(params: js.Array[Param], values: RawParams): Boolean = js.native
    
    @JSImport("@uirouter/core/lib/params/param", "Param.values")
    @js.native
    def values(params: js.Array[Param]): RawParams = js.native
    @JSImport("@uirouter/core/lib/params/param", "Param.values")
    @js.native
    def values(params: js.Array[Param], values: RawParams): RawParams = js.native
  }
}
