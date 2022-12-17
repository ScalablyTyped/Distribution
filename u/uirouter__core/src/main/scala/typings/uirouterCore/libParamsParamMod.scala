package typings.uirouterCore

import typings.uirouterCore.anon.DefaultValue
import typings.uirouterCore.anon.From
import typings.uirouterCore.libParamsInterfaceMod.RawParams
import typings.uirouterCore.libParamsParamTypeMod.ParamType
import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import typings.uirouterCore.libUrlMod.UrlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParamsParamMod {
  
  @js.native
  sealed trait DefType extends StObject
  @JSImport("@uirouter/core/lib/params/param", "DefType")
  @js.native
  object DefType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DefType & Double] = js.native
    
    @js.native
    sealed trait CONFIG
      extends StObject
         with DefType
    /* 2 */ val CONFIG: typings.uirouterCore.libParamsParamMod.DefType.CONFIG & Double = js.native
    
    @js.native
    sealed trait PATH
      extends StObject
         with DefType
    /* 0 */ val PATH: typings.uirouterCore.libParamsParamMod.DefType.PATH & Double = js.native
    
    @js.native
    sealed trait SEARCH
      extends StObject
         with DefType
    /* 1 */ val SEARCH: typings.uirouterCore.libParamsParamMod.DefType.SEARCH & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/params/param", "Param")
  @js.native
  open class Param protected () extends StObject {
    def this(id: String, `type`: ParamType, location: DefType, urlConfig: UrlConfig, state: StateDeclaration) = this()
    
    /** Cache the default value if it is a static value */
    var _defaultValueCache: DefaultValue = js.native
    
    var array: Boolean = js.native
    
    var config: Any = js.native
    
    var dynamic: Boolean = js.native
    
    var id: String = js.native
    
    var inherit: Boolean = js.native
    
    def isDefaultValue(value: Any): Boolean = js.native
    
    var isOptional: Boolean = js.native
    
    def isSearch(): Boolean = js.native
    
    var location: DefType = js.native
    
    var raw: Boolean = js.native
    
    var replace: js.Array[From] = js.native
    
    var squash: Boolean | String = js.native
    
    var `type`: ParamType = js.native
    
    def validates(value: Any): Boolean = js.native
    
    /**
      * [Internal] Gets the decoded representation of a value if the value is defined, otherwise, returns the
      * default value, which may be the result of an injectable function.
      */
    def value(): Any = js.native
    def value(value: Any): Any = js.native
  }
  /* static members */
  object Param {
    
    @JSImport("@uirouter/core/lib/params/param", "Param")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def changed(params: js.Array[Param]): js.Array[Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[Param]]
    inline def changed(params: js.Array[Param], values1: Unit, values2: RawParams): js.Array[Param] = (^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Param]]
    inline def changed(params: js.Array[Param], values1: RawParams): js.Array[Param] = (^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any])).asInstanceOf[js.Array[Param]]
    inline def changed(params: js.Array[Param], values1: RawParams, values2: RawParams): js.Array[Param] = (^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Param]]
    
    /**
      * Checks if two param value objects are equal (for a set of [[Param]] objects)
      *
      * @param params The list of [[Param]] objects to check
      * @param values1 The first set of param values
      * @param values2 The second set of param values
      *
      * @returns true if the param values in values1 and values2 are equal
      */
    inline def equals(params: js.Array[Param]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(params: js.Array[Param], values1: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(params: js.Array[Param], values1: js.Object, values2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(params: js.Array[Param], values1: Unit, values2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Returns true if a the parameter values are valid, according to the Param definitions */
    inline def validates(params: js.Array[Param]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validates")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def validates(params: js.Array[Param], values: RawParams): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validates")(params.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def values(params: js.Array[Param]): RawParams = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(params.asInstanceOf[js.Any]).asInstanceOf[RawParams]
    inline def values(params: js.Array[Param], values: RawParams): RawParams = (^.asInstanceOf[js.Dynamic].applyDynamic("values")(params.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[RawParams]
  }
}
