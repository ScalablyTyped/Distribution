package typings
package swaggerDashParserLib.swaggerDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the default export of Swagger Parser. You can creates instances of this class using new SwaggerParser(), or you can just call its static methods.
  *
  * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/swagger-parser.md
  */
@JSImport("swagger-parser", JSImport.Namespace)
@js.native
class ^ () extends SwaggerParser

@JSImport("swagger-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bundle(api: java.lang.String): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  /**
    * Bundles all referenced files/URLs into a single API definition that only has internal `$ref` pointers. This lets you split-up your API definition however you want while you're building it, but easily combine all those files together when it's time to package or distribute the API definition to other people. The resulting API definition size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
    *
    * This also eliminates the risk of circular references, so the API definition can be safely serialized using `JSON.stringify()`.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/swagger-parser.md#bundleapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the bundled API definition object
    */
  def bundle(api: java.lang.String, callback: ApiCallback): scala.Unit = js.native
  def bundle(api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def bundle(api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def bundle(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def bundle(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, callback: ApiCallback): scala.Unit = js.native
  def bundle(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def bundle(
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
  def bundle(baseUrl: java.lang.String, api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def bundle(baseUrl: java.lang.String, api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def bundle(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options
  ): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def bundle(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
  def dereference(api: java.lang.String): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  /**
    * Dereferences all `$ref` pointers in the OpenAPI definition, replacing each reference with its resolved value. This results in an API definition that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
    *
    * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the API definition using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/swagger-parser.md#dereferenceapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
    */
  def dereference(api: java.lang.String, callback: ApiCallback): scala.Unit = js.native
  def dereference(api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def dereference(api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def dereference(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def dereference(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, callback: ApiCallback): scala.Unit = js.native
  def dereference(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def dereference(
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
  def dereference(baseUrl: java.lang.String, api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def dereference(baseUrl: java.lang.String, api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def dereference(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options
  ): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def dereference(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
  def parse(api: java.lang.String): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Parses the given OpenAPI definition file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/swagger-parser.md#parseapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the parsed OpenAPI definition object, or an error
    */
  def parse(api: java.lang.String, callback: ApiCallback): scala.Unit = js.native
  def parse(api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def parse(api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def parse(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def parse(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, callback: ApiCallback): scala.Unit = js.native
  def parse(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def parse(
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
  def parse(baseUrl: java.lang.String, api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def parse(baseUrl: java.lang.String, api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def parse(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options
  ): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def parse(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
  def resolve(api: java.lang.String): js.Promise[$Refs] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Resolves all JSON references (`$ref` pointers) in the given OpenAPI definition file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/swagger-parser.md#resolveapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive a `$Refs` object
    */
  def resolve(api: java.lang.String, callback: $RefsCallback): scala.Unit = js.native
  def resolve(api: java.lang.String, options: Options): js.Promise[$Refs] = js.native
  def resolve(api: java.lang.String, options: Options, callback: $RefsCallback): scala.Unit = js.native
  def resolve(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document): js.Promise[$Refs] = js.native
  def resolve(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, callback: $RefsCallback): scala.Unit = js.native
  def resolve(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, options: Options): js.Promise[$Refs] = js.native
  def resolve(
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: $RefsCallback
  ): scala.Unit = js.native
  def resolve(baseUrl: java.lang.String, api: java.lang.String, options: Options): js.Promise[$Refs] = js.native
  def resolve(baseUrl: java.lang.String, api: java.lang.String, options: Options, callback: $RefsCallback): scala.Unit = js.native
  def resolve(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options
  ): js.Promise[$Refs] = js.native
  def resolve(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: $RefsCallback
  ): scala.Unit = js.native
  def validate(api: java.lang.String): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  /**
    * Parses, dereferences, and validates the given Swagger API.
    * Depending on the options, validation can include JSON Schema validation and/or Swagger Spec validation.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/swagger-parser.md#validateapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
    */
  def validate(api: java.lang.String, callback: ApiCallback): scala.Unit = js.native
  def validate(api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def validate(api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def validate(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def validate(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, callback: ApiCallback): scala.Unit = js.native
  def validate(api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def validate(
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
  def validate(baseUrl: java.lang.String, api: java.lang.String, options: Options): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def validate(baseUrl: java.lang.String, api: java.lang.String, options: Options, callback: ApiCallback): scala.Unit = js.native
  def validate(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options
  ): js.Promise[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document] = js.native
  def validate(
    baseUrl: java.lang.String,
    api: openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document,
    options: Options,
    callback: ApiCallback
  ): scala.Unit = js.native
}

