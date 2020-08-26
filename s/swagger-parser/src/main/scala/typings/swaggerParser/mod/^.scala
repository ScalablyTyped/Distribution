package typings.swaggerParser.mod

import typings.apidevtoolsSwaggerParser.mod.ApiCallback
import typings.apidevtoolsSwaggerParser.mod.Options
import typings.apidevtoolsSwaggerParser.mod.RefsCallback
import typings.openapiTypes.mod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the default export of Swagger Parser. You can creates instances of this class using new SwaggerParser(), or you can just call its static methods.
  *
  * See https://apitools.dev/swagger-parser/docs/swagger-parser.html
  */
@JSImport("swagger-parser", JSImport.Namespace)
@js.native
class ^ ()
  extends typings.apidevtoolsSwaggerParser.mod.^

@JSImport("swagger-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bundle(api: String): js.Promise[Document] = js.native
  /**
    * Bundles all referenced files/URLs into a single API definition that only has internal `$ref` pointers. This lets you split-up your API definition however you want while you're building it, but easily combine all those files together when it's time to package or distribute the API definition to other people. The resulting API definition size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
    *
    * This also eliminates the risk of circular references, so the API definition can be safely serialized using `JSON.stringify()`.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#bundleapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the bundled API definition object
    */
  def bundle(api: String, callback: ApiCallback): Unit = js.native
  def bundle(api: String, options: Options): js.Promise[Document] = js.native
  def bundle(api: String, options: Options, callback: ApiCallback): Unit = js.native
  def bundle(api: Document): js.Promise[Document] = js.native
  def bundle(api: Document, callback: ApiCallback): Unit = js.native
  def bundle(api: Document, options: Options): js.Promise[Document] = js.native
  def bundle(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  def bundle(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  def bundle(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  def bundle(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  def bundle(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  def dereference(api: String): js.Promise[Document] = js.native
  /**
    * Dereferences all `$ref` pointers in the OpenAPI definition, replacing each reference with its resolved value. This results in an API definition that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
    *
    * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the API definition using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#dereferenceapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
    */
  def dereference(api: String, callback: ApiCallback): Unit = js.native
  def dereference(api: String, options: Options): js.Promise[Document] = js.native
  def dereference(api: String, options: Options, callback: ApiCallback): Unit = js.native
  def dereference(api: Document): js.Promise[Document] = js.native
  def dereference(api: Document, callback: ApiCallback): Unit = js.native
  def dereference(api: Document, options: Options): js.Promise[Document] = js.native
  def dereference(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  def dereference(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  def dereference(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  def dereference(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  def dereference(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  def parse(api: String): js.Promise[Document] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Parses the given OpenAPI definition file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#parseapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the parsed OpenAPI definition object, or an error
    */
  def parse(api: String, callback: ApiCallback): Unit = js.native
  def parse(api: String, options: Options): js.Promise[Document] = js.native
  def parse(api: String, options: Options, callback: ApiCallback): Unit = js.native
  def parse(api: Document): js.Promise[Document] = js.native
  def parse(api: Document, callback: ApiCallback): Unit = js.native
  def parse(api: Document, options: Options): js.Promise[Document] = js.native
  def parse(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  def parse(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  def parse(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  def parse(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  def parse(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  def resolve(api: String): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Resolves all JSON references (`$ref` pointers) in the given OpenAPI definition file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#resolveapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive a `$Refs` object
    */
  def resolve(api: String, callback: RefsCallback): Unit = js.native
  def resolve(api: String, options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = js.native
  def resolve(api: String, options: Options, callback: RefsCallback): Unit = js.native
  def resolve(api: Document): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = js.native
  def resolve(api: Document, callback: RefsCallback): Unit = js.native
  def resolve(api: Document, options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = js.native
  def resolve(api: Document, options: Options, callback: RefsCallback): Unit = js.native
  def resolve(baseUrl: String, api: String, options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = js.native
  def resolve(baseUrl: String, api: String, options: Options, callback: RefsCallback): Unit = js.native
  def resolve(baseUrl: String, api: Document, options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = js.native
  def resolve(baseUrl: String, api: Document, options: Options, callback: RefsCallback): Unit = js.native
  def validate(api: String): js.Promise[Document] = js.native
  /**
    * Parses, dereferences, and validates the given Swagger API.
    * Depending on the options, validation can include JSON Schema validation and/or Swagger Spec validation.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#validateapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
    */
  def validate(api: String, callback: ApiCallback): Unit = js.native
  def validate(api: String, options: Options): js.Promise[Document] = js.native
  def validate(api: String, options: Options, callback: ApiCallback): Unit = js.native
  def validate(api: Document): js.Promise[Document] = js.native
  def validate(api: Document, callback: ApiCallback): Unit = js.native
  def validate(api: Document, options: Options): js.Promise[Document] = js.native
  def validate(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  def validate(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  def validate(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  def validate(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  def validate(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
}

