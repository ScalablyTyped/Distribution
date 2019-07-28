package typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.swaggerDashNodeDashRunner.Anon_ApiDeclarations
import typings.swaggerDashNodeDashRunner.Anon_Swagger
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends EventEmitter {
  /**
    * Nested Key Value description for _backpipes_ module
    * @see {@link https://github.com/apigee-127/bagpipes#pipes|Github Source}
    */
  var bagpipes: StringDictionary[js.Any] = js.native
  var config: ConfigInternal = js.native
  /**
    * Current OpenAPI Specification (formaly known as Swagger RESTful API Documentation Specification)
    * @see {@link http://swagger.io/specification/|Swagger Specs}
    */
  var swagger: Spec = js.native
  var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.native
  /**
    * References to Swagger Tools Midleware (from _swagger-tools_ module)     *
    * @see {@link https://github.com/apigee-127/swagger-tools|Github Source}
    */
  var swaggerTools: Anon_ApiDeclarations = js.native
  /** Create new Connect middleware */
  def connectMiddleware(): ConnectMiddleware = js.native
  def defaultErrorHandler(): js.Any = js.native
  /** Create new Express middleware */
  def expressMiddleware(): ExpressMiddleware = js.native
  /** Fetch a _bagpipe_ pipe */
  def getPipe(req: Anon_Swagger): js.Any = js.native
  /** Create new Hapi middleware */
  def hapiMiddleware(): HapiMiddleware = js.native
  /** Resolves path (relative to `config.appRoot`) */
  def resolveAppPath(to: js.Any*): String = js.native
  /** Create new Restify middleware */
  def restifyMiddleware(): RestifyMiddleware = js.native
  /** Create new Sails middleware */
  def sailsMiddleware(): SailsMiddleware = js.native
}

