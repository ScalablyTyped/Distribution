package typings.undici.typesDispatcherMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbortSignal = Any

type DispatchInterceptor = js.Function1[
/* dispatch */ js.Function2[/* options */ DispatchOptions, /* handler */ DispatchHandlers, Boolean], 
js.Function2[/* options */ DispatchOptions, /* handler */ DispatchHandlers, Boolean]]

type PipelineHandler = js.Function1[/* data */ PipelineHandlerData, Readable]

type StreamFactory = js.Function1[/* data */ StreamFactoryData, Writable]
