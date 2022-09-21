package typings.swaggerParser

import typings.apidevtoolsSwaggerParser.mod.ApiCallback
import typings.apidevtoolsSwaggerParser.mod.Options
import typings.apidevtoolsSwaggerParser.mod.RefsCallback
import typings.openapiTypes.mod.OpenAPI.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This is the default export of Swagger Parser. You can creates instances of this class using new SwaggerParser(), or you can just call its static methods.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html
    */
  @JSImport("swagger-parser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends typings.apidevtoolsSwaggerParser.mod.^
  @JSImport("swagger-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swagger-parser", "$Refs")
  @js.native
  open class Refs ()
    extends typings.apidevtoolsSwaggerParser.mod.Refs
  
  /* static member */
  inline def bundle(api: String): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
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
  /* static member */
  inline def bundle(api: String, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def bundle(api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def bundle(api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bundle(api: Document[js.Object]): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def bundle(api: Document[js.Object], callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bundle(api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def bundle(api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def bundle(baseUrl: String, api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def bundle(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bundle(baseUrl: String, api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def bundle(baseUrl: String, api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def dereference(api: String): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
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
  /* static member */
  inline def dereference(api: String, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def dereference(api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def dereference(api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dereference(api: Document[js.Object]): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def dereference(api: Document[js.Object], callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dereference(api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def dereference(api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def dereference(baseUrl: String, api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def dereference(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dereference(baseUrl: String, api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def dereference(baseUrl: String, api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def parse(api: String): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
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
  /* static member */
  inline def parse(api: String, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def parse(api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def parse(api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(api: Document[js.Object]): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def parse(api: Document[js.Object], callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def parse(api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def parse(baseUrl: String, api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def parse(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(baseUrl: String, api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def parse(baseUrl: String, api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def resolve(api: String): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs]]
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
  /* static member */
  inline def resolve(api: String, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def resolve(api: String, options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs]]
  /* static member */
  inline def resolve(api: String, options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(api: Document[js.Object]): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs]]
  inline def resolve(api: Document[js.Object], callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(api: Document[js.Object], options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs]]
  inline def resolve(api: Document[js.Object], options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def resolve(baseUrl: String, api: String, options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs]]
  /* static member */
  inline def resolve(baseUrl: String, api: String, options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(baseUrl: String, api: Document[js.Object], options: Options): js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.apidevtoolsSwaggerParser.mod.Refs]]
  inline def resolve(baseUrl: String, api: Document[js.Object], options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def validate(api: String): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
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
  /* static member */
  inline def validate(api: String, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def validate(api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def validate(api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(api: Document[js.Object]): js.Promise[Document[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def validate(api: Document[js.Object], callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def validate(api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def validate(baseUrl: String, api: String, options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  /* static member */
  inline def validate(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(baseUrl: String, api: Document[js.Object], options: Options): js.Promise[Document[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document[js.Object]]]
  inline def validate(baseUrl: String, api: Document[js.Object], options: Options, callback: ApiCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(baseUrl.asInstanceOf[js.Any], api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
