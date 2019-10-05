package typings.webpackDashEnv

import org.scalablytyped.runtime.TopLevel
import typings.webpackDashEnv.__WebpackModuleApi.RequireLambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The internal chunk loading function
  *
  * @param chunkId The id for the chunk to load.
  * @param callback A callback function called once the chunk is loaded.
  */
@JSGlobal("__webpack_chunk_load__")
@js.native
object __webpack_chunk_load__
  extends TopLevel[
      js.Function2[
        /* chunkId */ js.Any, 
        /* callback */ js.Function1[/* require */ RequireLambda, Unit], 
        Unit
      ]
    ]

