package typings.atUirouterCore

import typings.atUirouterCore.libCommonCommonMod.Obj
import typings.atUirouterCore.libParamsInterfaceMod.ParamTypeDefinition
import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import typings.atUirouterCore.libParamsParamMod.DefType
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typings.atUirouterCore.libUrlMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/params", JSImport.Namespace)
@js.native
object libParamsMod extends js.Object {
  @js.native
  class Param protected ()
    extends typings.atUirouterCore.libParamsParamMod.Param {
    def this(
      id: String,
      `type`: typings.atUirouterCore.libParamsParamTypeMod.ParamType,
      location: DefType,
      urlConfig: UrlConfig,
      state: StateDeclaration
    ) = this()
  }
  
  @js.native
  class ParamType protected ()
    extends typings.atUirouterCore.libParamsParamTypeMod.ParamType {
    /**
      * @param def  A configuration object which contains the custom type definition.  The object's
      *        properties will override the default methods and/or pattern in `ParamType`'s public interface.
      * @returns a new ParamType object
      */
    def this(`def`: ParamTypeDefinition) = this()
  }
  
  @js.native
  /** @internalapi */
  class ParamTypes ()
    extends typings.atUirouterCore.libParamsParamTypesMod.ParamTypes
  
  @js.native
  class StateParams ()
    extends typings.atUirouterCore.libParamsStateParamsMod.StateParams {
    def this(params: Obj) = this()
  }
  
  /** @internalapi */
  @js.native
  object DefType extends js.Object {
    /* 2 */ val CONFIG: typings.atUirouterCore.libParamsParamMod.DefType.CONFIG with Double = js.native
    /* 0 */ val PATH: typings.atUirouterCore.libParamsParamMod.DefType.PATH with Double = js.native
    /* 1 */ val SEARCH: typings.atUirouterCore.libParamsParamMod.DefType.SEARCH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libParamsParamMod.DefType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Param extends js.Object {
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
    def changed(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
    def changed(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values1: RawParams): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
    def changed(
      params: js.Array[typings.atUirouterCore.libParamsParamMod.Param],
      values1: RawParams,
      values2: RawParams
    ): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
    /**
      * Checks if two param value objects are equal (for a set of [[Param]] objects)
      *
      * @param params The list of [[Param]] objects to check
      * @param values1 The first set of param values
      * @param values2 The second set of param values
      *
      * @returns true if the param values in values1 and values2 are equal
      */
    def equals(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): Boolean = js.native
    def equals(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values1: js.Object): Boolean = js.native
    def equals(
      params: js.Array[typings.atUirouterCore.libParamsParamMod.Param],
      values1: js.Object,
      values2: js.Object
    ): Boolean = js.native
    /** Returns true if a the parameter values are valid, according to the Param definitions */
    def validates(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): Boolean = js.native
    def validates(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values: RawParams): Boolean = js.native
    def values(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): RawParams = js.native
    def values(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values: RawParams): RawParams = js.native
  }
  
  /* static members */
  @js.native
  object ParamTypes extends js.Object {
    /**
      * Built-in parameter type: `any`
      *
      * This parameter type is used by default for url-less parameters (parameters that do not appear in the URL).
      * This type does not encode or decode.
      * It is compared using a deep `equals` comparison.
      *
      * #### Example:
      * This example defines a non-url parameter on a [[StateDeclaration]].
      * ```js
      * .state({
      *   name: 'new',
      *   url: '/new',
      *   params: {
      *     inrepyto: null
      *   }
      * });
      * ```
      * ```js
      * $state.go('new', { inreplyto: currentMessage });
      * ```
      */
    var any: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `bool`
      *
      * This parameter type serializes `true`/`false` as `1`/`0`
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'inbox',
      *   url: '/inbox?{unread:bool}'
      * });
      * ```
      * ```js
      * $state.go('inbox', { unread: true });
      * ```
      *
      * The URL will serialize to: `/inbox?unread=1`.
      *
      * Conversely, if the url is `/inbox?unread=0`, the value of the `unread` parameter will be a `false`.
      */
    var bool: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `date`
      *
      * This parameter type can be used to serialize Javascript dates as parameter values.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'search',
      *   url: '/search?{start:date}'
      * });
      * ```
      * ```js
      * $state.go('search', { start: new Date(2000, 0, 1) });
      * ```
      *
      * The URL will serialize to: `/search?start=2000-01-01`.
      *
      * Conversely, if the url is `/search?start=2016-12-25`, the value of the `start` parameter will be a `Date` object where:
      *
      * - `date.getFullYear() === 2016`
      * - `date.getMonth() === 11` (month is 0-based)
      * - `date.getDate() === 25`
      */
    var date: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `hash`
      *
      * This parameter type is used for the `#` parameter (the hash)
      * It behaves the same as the [[string]] parameter type.
      */
    var hash: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `int`
      *
      * This parameter type serializes javascript integers (`number`s which represent an integer) to the URL.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'user',
      *   url: '/user/{id:int}'
      * });
      * ```
      * ```js
      * $state.go('user', { id: 1298547 });
      * ```
      *
      * The URL will serialize to: `/user/1298547`.
      *
      * When the parameter value is read, it will be the `number` `1298547`, not the string `"1298547"`.
      */
    var int: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `json`
      *
      * This parameter type can be used to serialize javascript objects into the URL using JSON serialization.
      *
      * #### Example:
      * This example serializes an plain javascript object to the URL
      * ```js
      * .state({
      *   name: 'map',
      *   url: '/map/{coords:json}'
      * });
      * ```
      * ```js
      * $state.go('map', { coords: { x: 10399.2, y: 49071 });
      * ```
      *
      * The URL will serialize to: `/map/%7B%22x%22%3A10399.2%2C%22y%22%3A49071%7D`
      */
    var json: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `path`
      *
      * This parameter type is the default type for path parameters.
      * A path parameter is any parameter declared in the path portion of a url
      *
      * - `/foo/:param1/:param2`: two path parameters
      *
      * This parameter type behaves exactly like the [[string]] type with one exception.
      * When matching parameter values in the URL, the `path` type does not match forward slashes `/`.
      *
      * #### Angular 1 note:
      * In ng1, this type is overridden with one that pre-encodes slashes as `~2F` instead of `%2F`.
      * For more details about this angular 1 behavior, see: https://github.com/angular-ui/ui-router/issues/2598
      */
    var path: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `query`
      *
      * This parameter type is the default type for query/search parameters.
      * It behaves the same as the [[string]] parameter type.
      *
      * A query parameter is any parameter declared in the query/search portion of a url
      *
      * - `/bar?param2`: a query parameter
      */
    var query: ParamTypeDefinition = js.native
    /**
      * Built-in parameter type: `string`
      *
      * This parameter type coerces values to strings.
      * It matches anything (`new RegExp(".*")`) in the URL
      */
    var string: ParamTypeDefinition = js.native
  }
  
}

