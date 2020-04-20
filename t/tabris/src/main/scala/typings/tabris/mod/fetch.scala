package typings.tabris.mod

import org.scalablytyped.runtime.TopLevel
import typings.tabris.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "fetch")
@js.native
object fetch
  extends TopLevel[
      js.Function2[
        /* url */ String | typings.tabris.Request, 
        /* init */ js.UndefOr[RequestInit], 
        js.Promise[typings.tabris.Response]
      ]
    ]

