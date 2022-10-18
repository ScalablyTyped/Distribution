package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.std.HTMLCollection
import typings.std.Node
import typings.std.NodeList
import typings.std.Record
import typings.std.URL
import typings.std.URLSearchParams
import typings.testcafe.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def fixture: FixtureFn = js.Dynamic.global.selectDynamic("fixture").asInstanceOf[FixtureFn]

inline def t: TestController = js.Dynamic.global.selectDynamic("t").asInstanceOf[TestController]

inline def test: TestFn = js.Dynamic.global.selectDynamic("test").asInstanceOf[TestFn]

inline def userVariables: UserVariables_ = js.Dynamic.global.selectDynamic("userVariables").asInstanceOf[UserVariables_]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.testcafe.mod.global.BrowserConnection
  - typings.testcafe.mod.global.BrowserDescriptor
*/
type BrowserOption = _BrowserOption | String

type BrowserOptions = BrowserOption | js.Array[BrowserOption]

type ClientFunctionFactory = js.Function2[
/* fn */ js.Function1[/* args */ js.Array[Any], Any], 
/* options */ js.UndefOr[ClientFunctionOptions], 
ClientFunction[Any, js.Array[Any]]]

type ClientScriptOptions = ClientScript | js.Array[ClientScript]

type ConcurrencyOption = Double

/**
  * Allows you to select which tests should be run.
  *
  * @param testName - The name of the test.
  * @param fixtureName - The name of the test fixture.
  * @param fixturePath - The path to the test fixture file.
  * @param testMeta - The test metadata.
  * @param fixtureMeta - The fixture metadata.
  */
type FilterFunction = js.Function5[
/* testName */ String, 
/* fixtureName */ String, 
/* fixturePath */ String, 
/* testMeta */ Metadata, 
/* fixtureMeta */ Metadata, 
js.Promise[Boolean] | Boolean]

// // Request API
//----------------------------------------------------------------------------------------------------------------------
type IncomingMessage = typings.node.httpMod.IncomingMessage

type Metadata = Record[String, String]

type Params = URLSearchParams | (StringDictionary[String | Double | Boolean])

type ReporterOption = String | ReporterDescriptor

type ReporterOptions = ReporterOption | js.Array[Any]

type RequestLoggerFactory = js.Function2[
/* filter */ js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* req */ Any, Boolean])], 
/* options */ js.UndefOr[RequestLoggerOptions], 
RequestLogger]

type RequestMockFactory = js.Function0[RequestMock]

type RequestPromise = ResponseAPI | js.Promise[ResponseOptions]

type RequestUrlOpts = String | URL | RequestOptions

type ResponseBody = IncomingMessage | Buffer | js.Object | String

type SelectorFactory = js.Function2[
/* init */ String | (js.Function1[/* repeated */ Any, Node | js.Array[Node] | NodeList | HTMLCollection]) | Selector | NodeSnapshot | SelectorPromise, 
/* options */ js.UndefOr[SelectorOptions], 
Selector]

// // SkipJsErrors API
//----------------------------------------------------------------------------------------------------------------------
type SkipJsErrorsCallback = js.Function1[/* opts */ js.UndefOr[Message], Boolean]

type SourceOption = String

type SourceOptions = SourceOption | js.Array[SourceOption]

type TlsOptions = typings.node.tlsMod.TlsOptions

// User Variables
//----------------------------------------------------------------------------------------------------------------------
type UserVariables_ = /**
  * Custom property
  */
StringDictionary[Any]

type WindowDescriptor = Any

type WindowDescriptorPromise = TestControllerPromise[WindowDescriptor]
